package com.appweaver.pokepedia.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.plcoding.jetpackcomposepokedex.data.remote.responses.BlackWhite

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)