package com.example.wooffed.ui.theme


import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.wooffed.R

// Set of Material typography styles to start with

val Emblemaone = FontFamily(
    Font(R.font.emblemaone_regular)
)

val Nunitosans = FontFamily(
    Font(R.font.nunitosans_7pt_condensed_regular),
    Font(R.font.nunitosans_7pt_condensed_bold, FontWeight.Bold)
)


val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Emblemaone,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Nunitosans,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Nunitosans,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Nunitosans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)











