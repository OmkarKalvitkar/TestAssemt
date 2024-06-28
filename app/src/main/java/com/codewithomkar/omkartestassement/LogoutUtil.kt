package com.codewithomkar.omkartestassement

import android.content.Context
import android.content.Intent

object LogoutUtil {
    fun logoutAndNavigateToMain(context: Context) {
        val intent = Intent(context, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        context.startActivity(intent)
    }
}