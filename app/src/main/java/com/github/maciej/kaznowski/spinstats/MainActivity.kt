package com.github.maciej.kaznowski.spinstats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.github.maciej.kaznowski.intervalsicuclient.api.ActivitiesApi
import com.github.maciej.kaznowski.intervalsicuclient.model.Activity
import com.github.maciej.kaznowski.intervalsicuclient.model.ActivityStream
import com.github.maciej.kaznowski.spinstats.ui.theme.SpinStatsForIntervalsicuTheme
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var activitiesApi: ActivitiesApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activitiesApi.listActivities(
            id = "i75876", oldest = "2024-02-01", newest = "2024-03-01"
        ).enqueue(object : Callback<List<Activity>> {
            override fun onResponse(
                call: Call<List<Activity>>, response: Response<List<Activity>>
            ) {
                activitiesApi.getActivityStreams(id = response.body()!![0].id!!)
                    .enqueue(object : Callback<List<ActivityStream>> {
                        override fun onResponse(
                            call: Call<List<ActivityStream>>,
                            response: Response<List<ActivityStream>>
                        ) {
                            TODO("Not yet implemented")
                        }

                        override fun onFailure(call: Call<List<ActivityStream>>, t: Throwable) {
                            TODO("Not yet implemented")
                        }

                    })
            }

            override fun onFailure(call: Call<List<Activity>>, t: Throwable) {
                println()
            }
        })

        setContent {
            SpinStatsForIntervalsicuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SpinStatsForIntervalsicuTheme {
        Greeting("Android")
    }
}