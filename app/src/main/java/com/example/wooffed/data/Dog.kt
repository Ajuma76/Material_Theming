package com.example.wooffed.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.wooffed.R

data class Dog (
    @DrawableRes val imageResource: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes
    val hobbies : Int
)

val dogs = listOf(
    Dog(imageResource = R.drawable.bella, name = R.string.dog_name_1, 4, hobbies = R.string.dog_description_1),
    Dog(imageResource = R.drawable.faye, name = R.string.dog_name_2, age = 8, hobbies = R.string.dog_description_2,),
    Dog(imageResource = R.drawable.frankie, name = R.string.dog_name_3, age = 2, hobbies = R.string.dog_description_3,),
    Dog(imageResource = R.drawable.koda, name = R.string.dog_name_4, age = 12, hobbies = R.string.dog_description_4,),
    Dog(imageResource = R.drawable.leroy, name = R.string.dog_name_5, age = 7, hobbies = R.string.dog_description_5,),
    Dog(imageResource = R.drawable.lola, name = R.string.dog_name_6, age = 16, hobbies = R.string.dog_description_6,),
    Dog(imageResource = R.drawable.moana, name = R.string.dog_name_7, age = 10, hobbies = R.string.dog_description_7,),
    Dog(imageResource = R.drawable.nox, name = R.string.dog_name_8, age = 11, hobbies = R.string.dog_description_8,),
    Dog(imageResource = R.drawable.tzeitel, name = R.string.dog_name_9, age = 3, hobbies = R.string.dog_description_9,),
)