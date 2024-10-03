package com.felipecoronado.tcsbikepoc.ui.navigation


sealed class Screens(var route: String) {
    data object Login : Screens("login")
    data object Calendar : Screens("calendar")
    data object BikeInfo : Screens("bikeInfo")
}