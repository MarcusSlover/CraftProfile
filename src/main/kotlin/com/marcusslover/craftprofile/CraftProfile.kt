package com.marcusslover.craftprofile

import com.marcusslover.craftprofile.access.ProfileAccessor
import com.marcusslover.craftprofile.manager.ProfileManager
import com.marcusslover.craftprofile.window.WindowHandler
import javax.swing.SwingUtilities

class CraftProfile {
    private val profileAccessor = ProfileAccessor()
    private val profileManager = ProfileManager()
    private val windowHandler = WindowHandler()

    init {
        SwingUtilities.invokeLater {
            windowHandler.start()
        }

    }

}