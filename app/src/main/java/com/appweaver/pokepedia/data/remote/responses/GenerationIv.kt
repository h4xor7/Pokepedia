package com.appweaver.pokepedia.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.plcoding.jetpackcomposepokedex.data.remote.responses.DiamondPearl

data class GenerationIv(
    @SerializedName("diamond-pearl")
    val diamondPearl: DiamondPearl,
    @SerializedName("heartgold-soulsilver")
    val heartgoldSoulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)