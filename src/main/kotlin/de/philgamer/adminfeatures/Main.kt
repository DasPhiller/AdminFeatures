package de.philgamer.adminfeatures

import de.philgamer.adminfeatures.listener.ListenerList
import net.axay.kspigot.chat.KColors
import net.axay.kspigot.main.KSpigot

class Main : KSpigot() {

    override fun startup() {
        logger.info("${KColors.GREEN}The Plugin was enabled!")
        ListenerList().onRegister()
    }

    override fun shutdown() {
        logger.info("${KColors.RED}The Plugin was disabled!")
    }

}
