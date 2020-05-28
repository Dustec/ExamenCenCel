package com.dustec.examencencel.models

import com.google.gson.annotations.SerializedName

data class NewsBean (
    @SerializedName("Id")
    val id:Int,
    @SerializedName("Status")
    val status:Int,
    @SerializedName("UrlImagen")
    val urlImagen:String,
    @SerializedName("Titulo")
    val titulo:String,
    @SerializedName("Texto")
    val texto:String,
    @SerializedName("UrlWeb")
    val urlWeb:String,
    @SerializedName("UrlVideo")
    val urlVideo:String,
    @SerializedName("Width")
    val ancho:Int,
    @SerializedName("Height")
    val alto:Int,
    @SerializedName("ExpDate")
    val expDate:String
)