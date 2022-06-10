package com.marcusslover.craftprofile.manager

import java.util.*

class ProfileManager {
    private val profiles: LinkedList<Profile> = LinkedList()

    fun addProfile(profile: Profile) {
        profiles.add(profile)

    }

    fun removeProfile(profile: Profile) {
        profiles.remove(profile)
    }

}
