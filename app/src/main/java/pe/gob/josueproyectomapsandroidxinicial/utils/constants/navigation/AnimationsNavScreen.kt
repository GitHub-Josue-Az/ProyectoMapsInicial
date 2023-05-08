package pe.gob.josueproyectomapsandroidxinicial.utils.constants.navigation

sealed class AnimationsNavScreen(val route: String) {

    object InitAnimationsNavScreen : AnimationsNavScreen("animations_init_screen")


    fun witArgs(args: Map<String, String>): String {
        var routeFinal = route
        args.forEach {
            routeFinal = routeFinal.replace(it.key, it.value)
        }
        return routeFinal
    }

}
