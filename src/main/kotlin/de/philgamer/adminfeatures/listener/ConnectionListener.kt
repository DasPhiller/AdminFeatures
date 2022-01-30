package de.philgamer.adminfeatures.listener

import net.axay.kspigot.chat.*
import net.kyori.adventure.text.Component
import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.chat.ClickEvent
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class ConnectionListener : Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        event.joinMessage(Component.text("${KColors.GRAY}[${KColors.GREEN}+${KColors.GRAY}] " + event.player.name))
        if (event.player.isOp) {
            val component = chatComponent {
                text("Open the Admin menu here") {
                    color = ChatColor.GREEN
                    isBold = false
                }
                text("[Open]") {
                    color = ChatColor.GREEN
                    clickEvent(ClickEvent.Action.RUN_COMMAND, "Open the Admin menu")
                    hoverEventText {
                        text("Click here to open the Admin menu!") {color = ChatColor.LIGHT_PURPLE}
                    }
                }
            }
        }
    }

}