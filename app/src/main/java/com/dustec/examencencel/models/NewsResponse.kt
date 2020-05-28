package com.dustec.examencencel.models

import com.google.gson.annotations.SerializedName


class NewsResponse (
    @SerializedName("ListaNoticias")
    var news:List<NewsBean>,
    @SerializedName("Path")
    val path:String,
    @SerializedName("CodRet")
    val codret:String,
    @SerializedName("Message")
    val message:String
)/*{
    val news:List<NewsBean>? = null
    val path:String = ""
    val codret:String = ""
    val message:String = ""

    init{
        this.news = news
        this.path = path
        this.codret = codret
        this.message = message
    }
}*/