package pe.gob.josueproyectomapsandroidxinicial

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import pe.gob.josueproyectomapsandroidxinicial.features.animations.animations
import pe.gob.josueproyectomapsandroidxinicial.features.maps.maps
import pe.gob.josueproyectomapsandroidxinicial.features.mapsAnimations.mapAnimations
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.generalNavigation.NavigationScreen


@Composable
fun MainNavigation(
    navController: NavController
) {

    NavHost(
        navController = navController as NavHostController,
        startDestination = NavigationScreen.MapsNavigationScreen.route
    ) {
        maps(navController)
        animations(navController)
        mapAnimations(navController)
    }
}

