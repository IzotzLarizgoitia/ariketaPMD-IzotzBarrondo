package com.example.gimnasiokudeaketa.data

class Langileak(
    nan:String,
    izenabizen: String,
    generoa: String?,
    val erabiltzailea: String,
    var pasahitza: String,
    var egunekoOrdua: Int,

    ) : Pertsona(
        nan,
        izenabizen,
        generoa
    ) {

}