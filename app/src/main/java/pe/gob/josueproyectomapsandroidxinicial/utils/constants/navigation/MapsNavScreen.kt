package pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation

sealed class MapsNavScreen(val route: String) {

    object InitMapsscreen : MapsNavScreen("maps_init_screen")


    fun witArgs(args: Map<String, String>): String {
        var routeFinal = route
        args.forEach {
            routeFinal = routeFinal.replace(it.key, it.value)
        }
        return routeFinal
    }

}
