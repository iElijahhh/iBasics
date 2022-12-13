package me.ielijah.ibasics.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {
    @EventHandler
    void onPlayerMove(PlayerMoveEvent e){
        Player p = e.getPlayer();
        if(!p.hasPermission("ibasics.play")){
            e.setCancelled(true);
        }
    }
}
