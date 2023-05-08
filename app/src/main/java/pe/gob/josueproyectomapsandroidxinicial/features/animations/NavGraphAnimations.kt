package pe.gob.josueproyectomapsandroidxinicial.features.animations

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.AnimationsNavScreen
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.MapsNavScreen
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.generalNavigation.NavigationScreen


fun NavGraphBuilder.animations(navController: NavController) {
    navigation(
        startDestination = AnimationsNavScreen.InitAnimationsNavScreen.route,
        route = NavigationScreen.AnimationsNavigationNavScreen.route
    ) {
        composable(AnimationsNavScreen.InitAnimationsNavScreen.route) {
            AnimationScreen(onNavigateToMaps = {
                navController.navigate(MapsNavScreen.InitMapsscreen.route)
            },
            )
        }
    }
}

