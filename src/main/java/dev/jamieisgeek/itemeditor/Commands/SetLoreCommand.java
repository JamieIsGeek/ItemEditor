package dev.jamieisgeek.itemeditor.Commands;

import dev.jamieisgeek.itemeditor.ItemEditorUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetLoreCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;
            ItemEditorUtils itemEditorUtils = ItemEditorUtils.getItemEditorUtils();
            itemEditorUtils.ChangeLore(p, args);

        } else {
            Bukkit.getLogger().warning("You must run this command in-game!");
        }

        return true;
    }
}
