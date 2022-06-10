package com.marcusslover.craftprofile.window

import com.marcusslover.craftprofile.window.main.MainFrame

class WindowHandler {
    private val mainFrame = MainFrame()

    fun start() {
        mainFrame.isVisible = true
    }
}