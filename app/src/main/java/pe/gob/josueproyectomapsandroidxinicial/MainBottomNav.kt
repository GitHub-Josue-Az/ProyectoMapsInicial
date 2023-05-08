package com.solera.clinicainternacional.session

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.solera.clinicainternacional.ui.theme.NeutralDarkGreyWhite
import com.solera.clinicainternacional.ui.theme.PrimaryBlueDarkest
import com.solera.clinicainternacional.ui.theme.PrimaryPurpleDarkest
import com.solera.clinicainternacional.ui.theme.TypeIndicatorGothamMedium


@Composable
fun MainBottomNav(
    navController: NavController,
    items: List<MainNavBottomScreen>,
    showPopPup: () -> Unit,
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination
    BottomNavigation(
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = NeutralDarkGreyWhite,
        elevation = 0.dp
    ) {
        items.forEach {
            BottomNavigationItem(
                icon = {
                    it.icons?.let {
                        Icon(
                            painter = rememberVectorPainter(image = it) ,
                            contentDescription = "",
                            modifier = Modifier.size(24.dp),
                            //tint = Color.Gray

                        )
                    }
                },
                label = {
                    it.title?.let {
                        Text(
                            text = it,
                            style = TypeIndicatorGothamMedium,
                            color = PrimaryPurpleDarkest,
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 1
                        )
                    }
                },
                selected = (it.route != null) && (currentRoute?.hierarchy?.any { it1 -> it1.route == it.route } == true),
                selectedContentColor = PrimaryBlueDarkest,
                unselectedContentColor = PrimaryPurpleDarkest,
                onClick = {
                    it.route?.let { it1 ->
                        navController.navigate(it1) {

                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }

                            launchSingleTop = true

                             restoreState = true
                        }
                    }
                }
            )
        }
    }
}