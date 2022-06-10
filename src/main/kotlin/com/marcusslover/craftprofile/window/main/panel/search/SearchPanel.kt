package com.marcusslover.craftprofile.window.main.panel.search

import java.awt.Color
import java.awt.FlowLayout
import javax.swing.BorderFactory
import javax.swing.JPanel
import javax.swing.JTextArea

class SearchPanel : JPanel() {

    init {
        background = Color(68, 110, 138)
        layout = FlowLayout(FlowLayout.CENTER, 20, 20)

        // add search bar
        val search = JTextArea()
        //add(search, BorderLayout.NORTH)
    }

}