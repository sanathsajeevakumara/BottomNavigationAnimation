package com.sanathcoding.bottomnavigationanimation

import BottomNavNoAnimation
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sanathcoding.bottomnavigationanimation.ui.theme.BottomNavigationAnimationTheme
import com.sanathcoding.bottomnavigationanimation.presentation.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val screen = listOf(
                Screen.Home,
                Screen.Create,
                Screen.Profile,
                Screen.Settings
            )
            BottomNavigationAnimationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Row(
                        verticalAlignment = Alignment.Bottom
                    ) {
                        BottomNavNoAnimation(screens = screen)
                    }
                }
            }
        }
    }
}