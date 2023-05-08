package pe.gob.josueproyectomapsandroidxinicial.utils.navigationHost

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector
import pe.gob.josueproyectomapsandroidxinicial.R

sealed class Screen(val route: String, @StringRes val resourceId: Int, val icons: ImageVector) {
    object mapsScree : Screen("mapsHost", R.string.mapScree, Icons.Filled.LocationOn)
    object animationScree : Screen("animationHost", R.string.animationScree,Icons.Filled.Favorite)
    object mapAnimationScree : Screen("mapAnimationHost", R.string.mapAnimationScree,Icons.Filled.Star)
}

val items = listOf(
    Screen.mapsScree,
    Screen.animationScree,
    Screen.mapAnimationScree,
)