package com.solera.clinicainternacional.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import pe.gob.josueproyectomapsandroidxinicial.R


//Set fonts
val Gotham = FontFamily(
    Font(R.font.gotham_thin, weight = FontWeight.Thin),
    Font(R.font.gotham_xlight, weight = FontWeight.ExtraLight),
    Font(R.font.gotham_light, weight = FontWeight.Light),
    Font(R.font.gotham_book, weight = FontWeight.Normal),
    Font(R.font.gotham_medium, weight = FontWeight.Medium),
    Font(R.font.gotham_bold, weight = FontWeight.Bold),
    Font(R.font.gotham_black, weight = FontWeight.Black),

    )

// Set of Material typography styles to start with
val Typography = Typography(


    FontFamily(Font(R.font.gotham_bold)),
    h1 = TextStyle(
        fontFamily = Gotham,
        fontWeight = FontWeight.Medium,
        fontSize = 40.sp,
        lineHeight = 40.sp,
    ),
    h2 = TextStyle(
        fontFamily = Gotham,
        fontWeight = FontWeight.Medium,
        fontSize = 32.sp,
        lineHeight = 40.sp,
    ),
    h3 = TextStyle(
        fontFamily = Gotham,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        lineHeight = 32.sp,
    ),
    h4 = TextStyle(
        fontFamily = Gotham,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 16.sp,
    ),
    h5 = TextStyle(
        fontFamily = Gotham,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
    ),
    button = TextStyle(
        fontFamily = Gotham,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        lineHeight = 24.sp,
    ),
    subtitle1 = TextStyle(
        fontFamily = Gotham,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
    ),
    caption = TextStyle(
        fontFamily = Gotham,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
    ),
)


val TypeXLHeadline4GothamMedium = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 20.sp,
    lineHeight = 28.sp
)

val TypeXLCaption1GothamMedium = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp,
    lineHeight = 16.sp
)

val TypeXLCaption2GothamMedium = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 16.sp
)

val TypeXLIndicatorGothamMedium = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 10.sp,
    lineHeight = 12.sp
)

val TypeHeadlineGothamLight32px = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Light,
    fontSize = 32.sp,
    lineHeight = 40.sp
)

val TypeHeadlineGothamLight40px = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Light,
    fontSize = 40.sp,
    lineHeight = 48.sp
)

val TypeIndicatorGothamMedium = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 10.sp,
    lineHeight = 12.sp
)

val TypeIndicatorGothamMedium8px = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 8.sp,
    lineHeight = 8.sp
)


val TypeIndicatorGothamBook8px = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Normal,
    fontSize = 8.sp,
    lineHeight = 8.sp
)

val TypeIndicatorGothamBook10px = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Normal,
    fontSize = 10.sp,
    lineHeight = 12.sp
)



val TypeCaption2 = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 16.sp
)
val TypeCaptionBook = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Light,
    fontSize = 12.sp,
    lineHeight = 16.sp
)

val TypeTitle = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 20.sp,
    lineHeight = 28.sp,
    color = PrimaryPurpleDarkest
)

val TypeTitle1 = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 22.sp,
    lineHeight = 30.sp,
    color = PrimaryPurpleDarkest
)

val TypeXLSubtitleGothamMedium = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    color = PrimaryPurpleDarkest
)

val TypeXLSubtitleGothamMediumCenter = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    color = PrimaryPurpleDarkest,
    textAlign = TextAlign.Center
)

val TypeDescription = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp,
    lineHeight = 16.sp,
    color = PrimaryBlueDarkest
)

val TypeDescription2 = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp,
    lineHeight = 16.sp,
    color = NeutralDarkGreyDark
)

val TypeDescription3 = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 18.sp,
    color = PrimaryPurpleDark
)

val TypeDescription1 = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 18.sp,
    color = PrimaryBlueDarkest
)

val TypeDescription4 = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 18.sp,
    color = NeutralDarkGreyDark
)

val TypeDescription6 = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Bold,
    fontSize = 14.sp,
    lineHeight = 18.sp,
    color = NeutralDarkGreyDark
)

val TypeDescription5 = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 18.sp,
    color = PrimaryPurpleDarkest
)

val TypeParagraphGothamMedium = TextStyle(
    fontFamily = Gotham,
    fontWeight = FontWeight.Medium,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    color = PrimaryBlueDarkest
)