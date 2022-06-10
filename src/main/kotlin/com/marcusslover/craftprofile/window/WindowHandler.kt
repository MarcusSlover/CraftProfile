package com.marcusslover.craftprofile.window

import java.awt.Dimension
import javax.swing.WindowConstants.EXIT_ON_CLOSE

class WindowHandler {
    private val mainWindow = MainWindow()

    fun start() {
        mainWindow.isVisible = true
    }
}