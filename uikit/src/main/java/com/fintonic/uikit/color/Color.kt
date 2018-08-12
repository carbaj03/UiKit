package com.fintonic.uikit.color

import android.content.Context
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat
import com.fintonic.uikit.R

sealed class Color(val name: String, val hex: String, @ColorRes val color: Int) {
    fun getColor(context: Context) =
            ContextCompat.getColor(context, color)
}

object Fucsia : Color("fucsia", "FF44A0", R.color.fucsia)

object Blue : Color("blue", "1F7CFF", R.color.blue)
object Gum : Color("gum", "FE6680", R.color.gum)
object Navy : Color("navy", "133273", R.color.navy)
object Yellow : Color("yellow", "FFC442", R.color.yellow)
object Aquamarine : Color("aquamarine", "BFF3F5", R.color.aquamarine)
object Pink : Color("pink", "FFD5D7", R.color.pink)
object BabyBlue : Color("baby_blue", "BED5FF", R.color.baby_blue)
object White : Color("white", "FFFFFF", R.color.white)

object CloudyGray : Color("cloudy_gray", "F3F6F9", R.color.cloudy_gray)
object LightGray : Color("light_gray", "CFDAE6", R.color.light_gray)
object Gray : Color("gray", "929FAD", R.color.gray)
object DarkGray : Color("dark_gray", "4B5D72", R.color.dark_gray)

object Red : Color("red", "FF0000", R.color.red)
object Green : Color("green", "0CC057", R.color.green)
object LightYellow : Color("light_yellow", "FDEECF", R.color.light_yellow)

object ClickBlue : Color("click_blue", "388BFF", R.color.click_blue)
object ClickGum : Color("click_gum", "FF8095", R.color.click_gum)
object ClickGreen : Color("click_green", "25D366", R.color.click_green)
object ClickWhite : Color("click_white", "30FFFFFF", R.color.click_white)