package com.fintonic.uikit.button.fab

import com.fintonic.uikit.common.Eval
import com.fintonic.uikit.common.Model
import com.fintonic.uikit.common.None
import com.fintonic.uikit.common.Option
import com.fintonic.uikit.text.*

data class ActionButtonModel(
        val style: ActionButtonStyle,
        val f: Option<Eval> = None
) : Model