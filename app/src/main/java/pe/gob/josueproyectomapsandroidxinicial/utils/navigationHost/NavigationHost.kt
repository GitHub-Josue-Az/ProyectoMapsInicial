package pe.gob.josueproyectomapsandroidxinicial.utils.navigationHost

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import pe.gob.josueproyectomapsandroidxinicial.features.animations.animations
import pe.gob.josueproyectomapsandroidxinicial.features.maps.maps
import pe.gob.josueproyectomapsandroidxinicial.features.mapsAnimations.mapAnimations

@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "mapsHost"
) {
    /*NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("mapsHost") {
            maps(navController)
        }
        composable("animationHost") {
            animations(navController)
        }
        composable("mapAnimationHost") {
            mapAnimations(navController)
        }
    }*/
}



















