package com.fintonic.uikit.color

import android.content.Context
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat
import com.fintonic.uikit.R

sealed class Color(
        val name: String,
        @ColorRes val color: Int
) {
    fun getColor(context: Context) =
            ContextCompat.getColor(context, color)

}

object Fucsia : Color("fucsia", R.color.fucsia)

object Blue : Color("blue", R.color.blue)
object Gum : Color("gum", R.color.gum)
object Navy : Color("navy", R.color.navy)
object Yellow : Color("yellow", R.color.yellow)
object Aquamarine : Color("aquamarine", R.color.aquamarine)
object Pink : Color("pink", R.color.pink)
object BabyBlue : Color("baby_blue", R.color.baby_blue)
object White : Color("white", R.color.white)

object CloudyGray : Color("cloudy_gray", R.color.cloudy_gray)
object LightGray : Color("light_gray", R.color.light_gray)
object Gray : Color("gray", R.color.gray)
object DarkGray : Color("dark_gray", R.color.dark_gray)

object Red : Color("red", R.color.red)
object Green : Color("green", R.color.green)
object LightYellow : Color("light_yellow", R.color.light_yellow)

object ClickBlue : Color("click_blue", R.color.click_blue)
object ClickGum : Color("click_gum", R.color.click_gum)
object ClickGreen : Color("click_green", R.color.click_green)
object ClickWhite : Color("click_white", R.color.click_white)