package pe.gob.josueproyectomapsandroidxinicial

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.rememberNavController
import com.solera.clinicainternacional.session.MainBottomNav
import com.solera.clinicainternacional.session.MainNavBottomScreen
import com.solera.clinicainternacional.ui.component.toolbar.AppToolbar
import com.solera.clinicainternacional.ui.component.toolbar.AppToolbarState
import com.solera.clinicainternacional.ui.theme.MapslAppTheme
import com.solera.clinicainternacional.ui.theme.NeutralDarkGreyWhite
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleDarkest
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleLightestWhite
import pe.gob.josueproyectomapsandroidxinicial.presentation.components.PresentationComponent
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.AnimationsNavScreen
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.MapsAnimationsNavScreen
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.MapsNavScreen
import pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.generalNavigation.NavigationScreen

class MainActivity : AppCompatActivity() {

    lateinit var myComponent: PresentationComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*AppHost()*/
            AppMaps()
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AppMaps(){

        val navController = rememberNavController()
        val context = LocalContext.current

       /* var visibleDialog by remember {
            mutableStateOf(false)
        }*/

        var visibleBottomBar by remember {
            mutableStateOf(true)
        }

        navController.addOnDestinationChangedListener { _, _, _ ->

            when (navController.currentDestination?.route) {
                MapsNavScreen.InitMapsscreen.route,
                AnimationsNavScreen.InitAnimationsNavScreen.route,
                MapsAnimationsNavScreen.InitMapsAnimationsNavScreen.route,
                    -> Log.e("AEa", "aea")
            }
        }

        MapslAppTheme {
            Surface(
                color = MaterialTheme.colors.background
            ) {
                Scaffold(
                    bottomBar = {
                        AnimatedVisibility(
                            visible = visibleBottomBar,
                            enter = fadeIn() + slideInVertically(),
                            exit = fadeOut() + slideOutVertically()
                        ) {
                            BottomAppBar(
                                modifier = Modifier
                                    .height(64.dp),
                                backgroundColor = NeutralDarkGreyWhite,
                                elevation = 0.dp,
                            ) {
                                MainBottomNav(
                                    navController = navController,
                                    items = listOf(
                                        MainNavBottomScreen.Appointment,
                                        MainNavBottomScreen.Result,
                                        MainNavBottomScreen.Schedule
                                    )
                                ) {
                                    /*visibleDialog = true*/
                                }
                            }
                        }
                    },
                    floatingActionButtonPosition = FabPosition.Center,
                    isFloatingActionButtonDocked = true
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {

                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.TopStart
                        ) {

                            MainNavigation(navController)

                        }
                    }
                }
            }
        }

}








