package com.solera.clinicainternacional.session

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.generalNavigation.NavigationScreen

sealed class MainNavBottomScreen(val route: String?, val title: String?, val icons: ImageVector?) {
    object Appointment : MainNavBottomScreen(
        NavigationScreen.MapsNavigationScreen.route,
        "Descubrir",
        Icons.Filled.LocationOn
    )

    object Result :
        MainNavBottomScreen(
            NavigationScreen.AnimationsNavigationNavScreen.route,
            "Recuerdos",
          Icons.Filled.Favorite
        )

    object Schedule : MainNavBottomScreen(
        NavigationScreen.MapsAnimationsNavigationNavScreen.route,
        "Visitas",
        Icons.Filled.Star
    )

}
