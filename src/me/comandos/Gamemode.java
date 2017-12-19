package me.comandos;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.main.Main;

public class Gamemode implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] Args) {
		if(!(sender instanceof Player)) {
			return true;
		}
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("gm")) {
			if(Args.length == 0) {
				p.sendMessage(Main.nome + " §a§lUtilize /gm 1 / 0");
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("1")) {
			if(p.hasPermission("kitpvp.gm")) {
				p.setGameMode(GameMode.CREATIVE);
				p.sendMessage(Main.nome + " §a§lGamemode §7§lAlterado");
				return true;
			}
		}
		if(Args[0].equalsIgnoreCase("0")) {
			if(p.hasPermission("kitpvp.gm")) {
				p.setGameMode(GameMode.SURVIVAL);
				p.sendMessage(Main.nome + " §a§lGamemode §7§lAlterado");
				return true;
			}
		}
		return false;
	}

}
