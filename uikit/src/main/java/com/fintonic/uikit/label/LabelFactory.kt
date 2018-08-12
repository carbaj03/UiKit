package com.fintonic.uikit.label

fun Int.idToStyle() = when (this) {
    DisplayBig.id -> DisplayBig
    Display.id -> Display
    H1Black.id -> H1Black
    H2Black.id -> H2Black
    H3Black.id -> H3Black
    H3Gray.id -> H3Gray
    H3Green.id -> H3Green
    H3Pink.id -> H3Pink
    BodyBlack.id -> BodyBlack
    BodyGray.id -> BodyGray
    LinkBlueBig.id -> LinkBlueBig
    LinkBlueSmall.id -> LinkBlueSmall
    LinkSecondary.id -> LinkSecondary
    LinkDisabled.id -> LinkDisabled
    LinkGreen.id -> LinkGreen
    Micro1BlackRegular.id -> Micro1BlackRegular
    Micro1Black.id -> Micro1Black
    Micro2Gray.id -> Micro2Gray
    Micro2Black.id -> Micro2Black
    Micro2Gray.id -> Micro2Gray
    Micro2GrayRegular.id -> Micro2GrayRegular
    InputError.id -> InputError
    Big50.id -> Big50
    Big33.id -> Big33
    else -> H1Black
}