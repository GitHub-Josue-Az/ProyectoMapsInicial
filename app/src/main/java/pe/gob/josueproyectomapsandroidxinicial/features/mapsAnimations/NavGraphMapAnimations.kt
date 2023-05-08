package pe.gob.josueproyectomapsandroidxinicial.features.mapsAnimations

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.AnimationsNavScreen
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.MapsAnimationsNavScreen
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.generalNavigation.NavigationScreen


fun NavGraphBuilder.mapAnimations(navController: NavController) {
    navigation(
        startDestination = MapsAnimationsNavScreen.InitMapsAnimationsNavScreen.route,
        route = NavigationScreen.MapsAnimationsNavigationNavScreen.route
    ) {
        composable(MapsAnimationsNavScreen.InitMapsAnimationsNavScreen.route) {
            MapAnimationScreen(
                onNavigateToAnimations = {
                    navController.navigate(AnimationsNavScreen.InitAnimationsNavScreen.route)
                },
            )
        }
    }
}

