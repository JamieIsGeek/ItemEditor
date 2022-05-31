package dev.jamieisgeek.itemeditor;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemEditorUtils {

    public static ItemEditorUtils itemEditorUtils;
    private String prefix = ChatColor.WHITE + "[" + ChatColor.BLUE + "ItemEditor" + ChatColor.WHITE + "] ";

    public void ChangeDisplayName(Player p, String[] args) {

        ItemStack currentItem = p.getInventory().getItemInMainHand();

        if(currentItem == null) {
            p.sendMessage(prefix + ChatColor.RED + "You must hold an item to rename!");
            return;
        } else {
            ItemMeta currentItemMeta = currentItem.getItemMeta();

            String preColour = args.toString();
            String newName = colourize(preColour);

            currentItemMeta.setDisplayName(newName);
            currentItem.setItemMeta(currentItemMeta);

            p.getInventory().setItemInMainHand(currentItem);
            p.sendMessage(prefix + "Changed name successfully!");
        }
    }

    public void ChangeLore(Player p, String[] args) {
        ItemStack currentItem = p.getInventory().getItemInMainHand();

        if(currentItem == null) {
            p.sendMessage(prefix + ChatColor.RED + "You must hold an item to change the lore of!");
            return;
        } else {
            ItemMeta currentItemMeta = currentItem.getItemMeta();

            String preColour = args.toString();
            String newLore = colourize(preColour);

            ArrayList<String> lore = new ArrayList<>();
            lore.add(newLore);
            currentItemMeta.setLore(lore);
            currentItem.setItemMeta(currentItemMeta);

            p.getInventory().setItemInMainHand(currentItem);
            p.sendMessage(prefix + "Applied lore successfully!");
        }
    }


    private String colourize(String preColour) {
        return ChatColor.translateAlternateColorCodes('&', preColour);
    }

    public String getPrefix() {
        return prefix;
    }

    public ItemEditorUtils() {
        itemEditorUtils = this;
    }

    public static ItemEditorUtils getItemEditorUtils() {
        return itemEditorUtils;
    }
}
