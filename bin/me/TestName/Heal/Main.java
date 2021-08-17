package me.TestName.Heal;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	public void onEnable() {
		
	}
	
	public void onDisable() {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(label.equalsIgnoreCase("heal")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("Error while executing command : Not a Player.");
				return true;
			}
			if(!sender.hasPermission("heal.use")) {
				sender.sendMessage(ChatColor.DARK_RED + "Error while executing command : No permission.");
				return true;
			}
			Player p = (Player) sender;
			p.setHealth(20.0);
			p.sendMessage(ChatColor.GREEN + "You have been healed successfully!");
			return true;
		}
		
		if(label.equalsIgnoreCase("feed")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("Error while executing command : Not a Player.");
				return true;
			}
			if(!sender.hasPermission("feed.use")) {
				sender.sendMessage(ChatColor.DARK_RED + "Error while executing command : No permission.");
				return true;
			}
				Player p = (Player) sender;
				p.setFoodLevel(20);
				p.sendMessage(ChatColor.GREEN + "You have been fed successfully!");
				
			}
		return false;
		
	}
	
}
