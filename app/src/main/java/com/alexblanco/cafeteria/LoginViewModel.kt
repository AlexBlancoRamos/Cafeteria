package com.alexblanco.cafeteria

import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    private var _user=""
    val user: String
        get() = _user

    private var _password=""
    val password: String
        get() = _password


    fun login(username: String, password: String): Boolean {
        return LoginProvider.login(username, password)
    }
}