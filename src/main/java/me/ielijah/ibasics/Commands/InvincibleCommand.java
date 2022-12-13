package me.ielijah.ibasics.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class InvincibleCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p){
            if(args.length == 0){
                if(p.isInvulnerable()){
                    p.setInvulnerable(false);
                    p.sendMessage(ChatColor.RED + "You're no longer invincible!");
                }else{
                    p.setInvulnerable(true);
                    p.sendMessage(ChatColor.GREEN + "You're now invincible!");
                }
            }else{
                String pName = args[0];
                Player tGet = Bukkit.getServer().getPlayerExact(pName);
                if(tGet == null){
                    p.sendMessage(ChatColor.DARK_RED + "This player isn't online!");
                }else if(tGet.isInvulnerable()){
                    p.sendMessage(ChatColor.RED + "You've set, " + ChatColor.WHITE + tGet.getDisplayName(), "'s" + ChatColor.RED + " invincibility off!");
                    tGet.setInvulnerable(false);
                    tGet.sendMessage(ChatColor.WHITE + p.getDisplayName() + ChatColor.RED + " has set your invincibility off!");
                    }else{
                        p.sendMessage(ChatColor.GREEN + "You've set, " + ChatColor.WHITE + tGet.getDisplayName(), "'s" + ChatColor.GREEN + " invincibility on!");
                        tGet.setInvulnerable(true);
                        tGet.sendMessage(ChatColor.WHITE + p.getDisplayName() + ChatColor.GREEN + " has set your invincibility on!");
                    }
                }
            }
        return true;
    }
}