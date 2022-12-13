package me.ielijah.ibasics.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmcCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player p){
            if(p.hasPermission("ibasics.commands.gmc")){
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage(ChatColor.GOLD + "Creative-mode enabled!");
            }else{
                p.sendMessage(ChatColor.RED + "No permissions!");
            }
        }
        return true;
    }
}
