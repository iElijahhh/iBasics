package me.ielijah.ibasics.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player p){
            if(args.length == 0){
                if(p.isFlying()){
                    p.setFlying(false);
                    p.sendMessage(ChatColor.GOLD + "Your flight has been disabled!");
                }else{
                    p.setFlying(true);
                    p.sendMessage(ChatColor.GOLD + "Your flight has been enabled!");
                }
            }else{
                String pName = args[0];
                Player tGet = Bukkit.getServer().getPlayerExact(pName);
                if(tGet == null){
                    p.sendMessage(ChatColor.DARK_RED + "This player isn't online!");
                }else if(tGet.isFlying()){
                    p.sendMessage(ChatColor.RED + "You've set, " + ChatColor.WHITE + tGet.getDisplayName(), "'s" + ChatColor.GREEN + " flight off!");
                    tGet.setFlying(false);
                    tGet.sendMessage(ChatColor.WHITE + p.getDisplayName() + ChatColor.RED + " has set your flight off!");
                    }else{
                        p.sendMessage(ChatColor.GREEN + "You've set, " + ChatColor.WHITE + tGet.getDisplayName(), "'s" + ChatColor.GREEN + " invincibility on!");
                        tGet.setFlying(true);
                        tGet.sendMessage(ChatColor.WHITE + p.getDisplayName() + ChatColor.GREEN + " has set your invincibility on!");
                    }
                }
            }
        return true;
    }
}