package me.ielijah.ibasics.Events;

import me.ielijah.ibasics.Utils.ColorUtils;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeave implements Listener {
      @EventHandler
      public void onJoin(PlayerJoinEvent e){
          Player p = e.getPlayer();
          if(p.hasPlayedBefore()){
                  e.setJoinMessage(ColorUtils.translateColorCodes("&#2f2f2f[&#08bcff+&#2f2f2f] &f" + p.getDisplayName() + " &#00ff30l&#02e54ao&#05cc64g&#07b27eg&#099898e&#0b7eb1d &#0e65cbi&#104be5n&#1231ff!"));
            }else{
              e.setJoinMessage(ColorUtils.translateColorCodes("&#2f2f2f[&#08bcff+&#2f2f2f] &f" + p.getDisplayName() + " &#00ff30l&#02ed42o&#03db54g&#05c966g&#06b778e&#08a58ad &#09949ci&#0b82aen &#0d70c0f&#0e5ed2o&#104ce4r &#113af6t&#182fffh&#252bffe &#3226fff&#3f22ffi&#4c1effr&#591affs&#6615fft &#7311fft&#7f0dffi&#8c09ffm&#9904ffe&#a600ff! &#ffffffW&#ffbfbfe&#ff8080l&#ff4040c&#ff0000o&#e3403cm&#c88077e &#acbfb3t&#90ffeeo &#ff0000&oM&#ff1800&oa&#ff2f00&op&#ff4700&ol&#ff5f00&oe&#ff7700&oS&#ff8e00&ok&#ffa600&oi&#ffbe00&oe&#ffd500&os&#ffed00&o!"));
          }
      }
      @EventHandler
      public void onLeave(PlayerQuitEvent e){
          Player p = e.getPlayer();
          e.setQuitMessage(ColorUtils.translateColorCodes("&#2f2f2f[&#08bcff+&#2f2f2f] &f" + p.getDisplayName() + " &#fb0000l&#ee001co&#e10039g&#d40055g&#c70071e&#bb008ed &#ae00aao&#a100c6u&#9400e3t&#8700ff!"));
      }
}