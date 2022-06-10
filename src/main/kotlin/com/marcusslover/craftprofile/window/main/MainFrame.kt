package com.marcusslover.craftprofile.window.main

import com.marcusslover.craftprofile.window.main.panel.MainPanel
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.FlowLayout
import java.awt.GraphicsEnvironment
import java.awt.Rectangle
import java.net.URL
import javax.swing.ImageIcon
import javax.swing.JFrame


class MainFrame : JFrame() {
    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = BorderLayout()

        // program icon
        val logo: URL? = javaClass.getResource("/assets/logo.png")
        if (logo != null) iconImage = ImageIcon(logo).image

        // add all components
        val mainPanel = MainPanel()
        add(mainPanel)
        pack()

        // frame size
        val gd = GraphicsEnvironment.getLocalGraphicsEnvironment().defaultScreenDevice
        val width: Int = (gd.displayMode.width * 0.45).toInt()
        val height: Int = (gd.displayMode.height * 0.9).toInt()
        size = Dimension(width, height)
        setLocationRelativeTo(null)
    }
}