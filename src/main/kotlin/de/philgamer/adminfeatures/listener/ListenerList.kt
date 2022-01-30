package de.philgamer.adminfeatures.listener

import net.axay.kspigot.extensions.pluginManager
import net.axay.kspigot.main.KSpigotMainInstance
import org.bukkit.event.Listener

class ListenerList {

    val listener = ArrayList<Listener>()

    fun onRegister() {
        listener.add(ConnectionListener())
        for (listener in listener) {
            pluginManager.registerEvents(listener, KSpigotMainInstance)
        }
    }
}