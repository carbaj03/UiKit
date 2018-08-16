
package com.fintonic.uikit.dimens

import android.support.annotation.DimenRes
import com.fintonic.uikit.R

sealed class DimensButton(@DimenRes val padding : Int) : Dimens

object PrimaryBlueDimen : DimensButton(R.dimen.button_padding)