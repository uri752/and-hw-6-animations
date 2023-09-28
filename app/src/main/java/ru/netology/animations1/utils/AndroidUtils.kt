package ru.netology.animations1.utils

import android.content.Context
import kotlin.math.ceil

object AndroidUtils {

    fun dp(context: Context, dp: Int): Int = ceil(context.resources.displayMetrics.density * dp).toInt()

}