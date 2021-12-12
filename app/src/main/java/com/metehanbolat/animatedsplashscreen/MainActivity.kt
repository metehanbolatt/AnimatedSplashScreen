package com.metehanbolat.animatedsplashscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.metehanbolat.animatedsplashscreen.navigation.SetupNavGraph
import com.metehanbolat.animatedsplashscreen.ui.theme.AnimatedSplashScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimatedSplashScreenTheme {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            }
        }
    }
}
