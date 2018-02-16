package com.varunbarad.cardexchange.splashscreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (isUserLoggedIn()) {
            launchMainScreen()
        } else {
            launchLoginScreen()
        }
    }

    fun launchLoginScreen() {
        // ToDo: Launch the login screen
    }

    fun launchMainScreen() {
        // ToDo: Launch the main screen
    }

    fun isUserLoggedIn(): Boolean {
        // ToDo: Check if user is logged in
        return true
    }
}
