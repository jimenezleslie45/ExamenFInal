package com.example.onboardingapp

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
import com.example.onboardingapp.navigation.NavManager
import com.example.onboardingapp.onBoardViews.MainOnBoarding
import com.example.onboardingapp.ui.theme.OnBoardingAppTheme
import com.example.onboardingapp.views.SplashScreen

/*EXAMEN FINAL PROGRAMACION 2 - SECCION B*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnBoardingAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   NavManager()

                }
            }
        }
    }
}

