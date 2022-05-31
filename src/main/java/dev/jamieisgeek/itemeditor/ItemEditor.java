package dev.jamieisgeek.itemeditor;

import dev.jamieisgeek.itemeditor.Commands.DisplayNameCommand;
import dev.jamieisgeek.itemeditor.Commands.SetLoreCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class ItemEditor extends JavaPlugin {

    Logger logger = Bukkit.getLogger();

    @Override
    public void onEnable() {

        getCommand("rename").setExecutor(new DisplayNameCommand());
        getCommand("setlore").setExecutor(new SetLoreCommand());

        logger.info("");
        logger.info("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        logger.info("ItemEditor has Enabled!");
        logger.info("Version: 1.0");
        logger.info("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        logger.info("");

    }

    @Override
    public void onDisable() {

        logger.info("");
        logger.info("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        logger.info("ItemEditor has Disabled!");
        logger.info("Version: 1.0");
        logger.info("=+=+=+=+=+=+=+=+=+=+=+=+=+=");
        logger.info("");

    }
}
