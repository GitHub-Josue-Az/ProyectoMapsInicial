package pe.gob.josueproyectomapsandroidxinicial.features.maps

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.MapsAnimationsNavScreen
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.MapsNavScreen
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.generalNavigation.NavigationScreen


fun NavGraphBuilder.maps(navController: NavController) {
    navigation(
        startDestination = MapsNavScreen.InitMapsscreen.route,
        route = NavigationScreen.MapsNavigationScreen.route
    ) {
        composable(MapsNavScreen.InitMapsscreen.route) {
            MapScreen(
                onNavigateToMapAnimations = {
                    navController.navigate(MapsAnimationsNavScreen.InitMapsAnimationsNavScreen.route)
                },
            )
        }
    }
}

