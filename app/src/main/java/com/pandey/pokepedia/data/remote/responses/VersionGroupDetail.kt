package com.pandey.pokepedia.data.remote.responses


import com.google.gson.annotations.SerializedName
import com.pandey.pokepedia.data.remote.responses.MoveLearnMethod
import com.pandey.pokepedia.data.remote.responses.VersionGroup

data class VersionGroupDetail(
    @SerializedName("level_learned_at")
    val levelLearnedAt: Int,
    @SerializedName("move_learn_method")
    val moveLearnMethod: MoveLearnMethod,
    @SerializedName("version_group")
    val versionGroup: VersionGroup
)