package pe.gob.josueproyectomapsandroidxinicial.features.animations

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.compose.*
import kotlinx.coroutines.launch

@Composable
fun AnimationScreen(
    onNavigateToMaps: () -> Unit,

    ) {


    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(pe.gob.josueproyectomapsandroidxinicial.R.raw.llavero))
    val progress by animateLottieCompositionAsState(composition)
    Column(Modifier.fillMaxSize()) {
        LottieAnimation(
            composition,
            iterations = LottieConstants.IterateForever,
        )

    }

}


