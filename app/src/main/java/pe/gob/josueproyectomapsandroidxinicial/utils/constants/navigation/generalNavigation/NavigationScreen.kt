package pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation.generalNavigation

sealed class NavigationScreen (val route: String) {

    object MapsNavigationScreen : NavigationScreen("mapsNavigation")
    object AnimationsNavigationNavScreen : NavigationScreen("animationsNavigation")
    object MapsAnimationsNavigationNavScreen : NavigationScreen("mapsAnimationsNavigation")

}