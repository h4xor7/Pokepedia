package com.pandey.pokepedia.util

import android.content.Context
import androidx.compose.ui.graphics.Color
import coil.ImageLoader
import coil.disk.DiskCache
import coil.memory.MemoryCache
import com.pandey.pokepedia.data.remote.responses.Stat
import com.pandey.pokepedia.data.remote.responses.Type
import com.pandey.pokepedia.ui.theme.AtkColor
import com.pandey.pokepedia.ui.theme.DefColor
import com.pandey.pokepedia.ui.theme.HPColor
import com.pandey.pokepedia.ui.theme.SpAtkColor
import com.pandey.pokepedia.ui.theme.SpDefColor
import com.pandey.pokepedia.ui.theme.SpdColor
import com.pandey.pokepedia.ui.theme.TypeBug
import com.pandey.pokepedia.ui.theme.TypeDark
import com.pandey.pokepedia.ui.theme.TypeDragon
import com.pandey.pokepedia.ui.theme.TypeElectric
import com.pandey.pokepedia.ui.theme.TypeFairy
import com.pandey.pokepedia.ui.theme.TypeFighting
import com.pandey.pokepedia.ui.theme.TypeFire
import com.pandey.pokepedia.ui.theme.TypeFlying
import com.pandey.pokepedia.ui.theme.TypeGhost
import com.pandey.pokepedia.ui.theme.TypeGrass
import com.pandey.pokepedia.ui.theme.TypeGround
import com.pandey.pokepedia.ui.theme.TypeIce
import com.pandey.pokepedia.ui.theme.TypeNormal
import com.pandey.pokepedia.ui.theme.TypePoison
import com.pandey.pokepedia.ui.theme.TypePsychic
import com.pandey.pokepedia.ui.theme.TypeRock
import com.pandey.pokepedia.ui.theme.TypeSteel
import com.pandey.pokepedia.ui.theme.TypeWater
import java.util.Locale

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.toLowerCase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}


fun getImageLoader(context:Context): ImageLoader {
    val imageLoader = ImageLoader.Builder(context)
        .memoryCache {
            MemoryCache.Builder(context)
                .maxSizePercent(0.25)
                .build()
        }
        .diskCache {
            DiskCache.Builder()
                .directory(context.cacheDir.resolve("image_cache"))
                .maxSizePercent(0.02)
                .build()
        }
        .build()

    return imageLoader
}