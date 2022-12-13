package me.ielijah.ibasics;

import me.ielijah.ibasics.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("gma").setExecutor(new GmaCommand());
        getCommand("gmc").setExecutor(new GmcCommand());
        getCommand("gms").setExecutor(new GmsCommand());
        getCommand("god").setExecutor(new InvincibleCommand());
        getLogger().info("iBasics plugin : ENABLED!");
    }
}
