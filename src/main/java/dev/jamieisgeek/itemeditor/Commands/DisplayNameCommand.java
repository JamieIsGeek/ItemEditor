package dev.jamieisgeek.itemeditor.Commands;

import dev.jamieisgeek.itemeditor.ItemEditorUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DisplayNameCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;
            ItemEditorUtils itemEditorUtils = ItemEditorUtils.getItemEditorUtils();

            if(args[0] != null) {
                itemEditorUtils.ChangeDisplayName(p, args);
            } else {
                p.sendMessage(itemEditorUtils.getPrefix() + ChatColor.RED + "You must provide a new name for the item!");
            }

        } else {
            Bukkit.getLogger().warning("You must run this command in-game!");
        }
        return true;
    }
}
