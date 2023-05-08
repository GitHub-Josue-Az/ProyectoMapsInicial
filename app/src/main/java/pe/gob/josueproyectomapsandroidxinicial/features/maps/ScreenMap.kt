package pe.gob.josueproyectomapsandroidxinicial.features.maps

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun MapScreen(
    onNavigateToMapAnimations: () -> Unit,

    ) {

    Button(onClick = onNavigateToMapAnimations) {
        Text(text = "Ir a Visitas")
    }


    Text(text = "Ir a VisitasVisitasVisitasVisitasVisitasVisitasVisitas" +
            "VisitasVisitasVisitasVisitasVisitasVisitasVisitasVisitasVisitasVisitasVisitasVisitas" +
            "VisitasVisitasVisitasVisitasVisitas" +
            "VisitasVisitasVisitasVisitasVisitasVisitasVisitasVisitasVisitas")


}






















