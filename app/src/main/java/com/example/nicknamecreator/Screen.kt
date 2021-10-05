package com.example.nicknamecreator

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object SecondScreen : Screen("second_screen")

    fun withArgs(vararg args: String): String {

        return buildString {
            append(route)
            if (args.any()) {
                args.forEach {
                    append(it)
                }
            }

        }

    }
}