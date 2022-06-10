package com.marcusslover.craftprofile.window.main.panel

import com.marcusslover.craftprofile.window.main.panel.search.SearchPanel
import java.awt.*
import javax.swing.JPanel

class MainPanel : JPanel() {
    init {
        background = Color(112, 163, 180)
        layout = BorderLayout()

        // search panel
        val searchPanel = SearchPanel()
        add(searchPanel, BorderLayout.NORTH)

    }
}