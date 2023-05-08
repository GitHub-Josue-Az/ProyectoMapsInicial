package com.solera.clinicainternacional.ui.component.toolbar

sealed class AppToolbarState(var state: String) {
    object CloseLight : AppToolbarState("CloseLight")
    object CloseDark : AppToolbarState("CloseDark")
    object OnlyLogo : AppToolbarState("OnlyLogo")
    object LogoAndBack : AppToolbarState("LogoAndBack")
    object LogoAndExit : AppToolbarState("LogoAndExit")
    object LogoAndClose : AppToolbarState("LogoAndClose")
    object Main : AppToolbarState("Main")
    object Back : AppToolbarState("Back")
    object OnlyClose : AppToolbarState("OnlyClose")
}