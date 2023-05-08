package pe.gob.josueproyectomapsandroidxinicial.features.mapsAnimations

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun MapAnimationScreen(
    onNavigateToAnimations: () -> Unit,

    ) {

    Button(onClick = onNavigateToAnimations) {
        Text(text = "Ir a Adornos")
    }
}