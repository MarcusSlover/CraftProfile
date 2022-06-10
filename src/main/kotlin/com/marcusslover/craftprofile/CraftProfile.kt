package com.marcusslover.craftprofile

import com.marcusslover.craftprofile.manager.ProfileManager
import com.marcusslover.craftprofile.access.ProfileAccessor
import com.marcusslover.craftprofile.window.WindowHandler

class CraftProfile {
    private val profileAccessor = ProfileAccessor()
    private val profileManager = ProfileManager()
    private val windowHandler = WindowHandler()

    init {
        windowHandler.start()
    }

}