package com.fintonic.uikit.label

import com.fintonic.uikit.common.Eval
import com.fintonic.uikit.common.Model
import com.fintonic.uikit.common.None
import com.fintonic.uikit.common.Option

data class LabelModel(
        val style: LabelStyle,
        val value: CharSequence,
        val f: Option<Eval> = None
) : Model