package me.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static String nome = "§aClose§6PvP";
	
	public static Main instance;
	public static Main getinstance() {
		return instance;	
	}
	
	public void onEnable() {
		RegistrarEventos();
		Bukkit.getConsoleSender().sendMessage("§a§lPlugin Iniciado!");
	}
	
	void RegistrarEventos() {
		PluginManager pm = Bukkit.getPluginManager();
	}
	
	void RegistrarComandos() {
		
	}

}
