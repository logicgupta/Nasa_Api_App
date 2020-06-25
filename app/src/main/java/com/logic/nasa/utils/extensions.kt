package com.logic.nasa.utils

import android.content.Context
import android.widget.Toast

fun Context.showToast(text: CharSequence) {
    Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}
