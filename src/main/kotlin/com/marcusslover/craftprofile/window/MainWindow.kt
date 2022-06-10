package com.marcusslover.craftprofile.window

import java.awt.Dimension
import java.awt.Image
import java.net.URL
import javax.swing.ImageIcon
import javax.swing.JFrame

class MainWindow : JFrame() {
    init {
        defaultCloseOperation = EXIT_ON_CLOSE

        // program icon
        val logo: URL? = javaClass.getResource("/assets/craft_profile.svg")
        if (logo != null) iconImage = ImageIcon(logo).image

        size = Dimension(600, 850)
        setLocationRelativeTo(null)
    }
}