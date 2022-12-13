package me.ielijah.ibasics.Commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GmaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            if (p.hasPermission("ibasics.commands.gma")) {
                p.setGameMode(GameMode.ADVENTURE);
                p.sendMessage(ChatColor.GOLD + "Adventure-mode enabled!");
            } else {
                p.sendMessage(ChatColor.RED + "No permissions!");
            }
        }
        return true;
    }
}