package com.sanathcoding.bottomnavigationanimation.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val title: String,
    val activeIcon: ImageVector,
    val inactiveIcon: ImageVector
) {
    object Home: Screen("Home", Icons.Filled.Home, Icons.Outlined.Home)
    object Create: Screen("Create", Icons.Filled.Create, Icons.Outlined.Create)
    object Profile: Screen("Profile", Icons.Filled.Person, Icons.Outlined.Person)
    object Settings: Screen("Settings", Icons.Filled.Settings, Icons.Outlined.Settings)
}
