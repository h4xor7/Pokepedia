package com.pandey.pokepedia.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.pandey.pokepedia.data.remote.responses.DreamWorld
import com.pandey.pokepedia.data.remote.responses.OfficialArtwork

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorld,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork
)