package net.dolaner.lobby;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Lobby extends JavaPlugin
{
	
	private static Lobby instance;
	
	public void onLoad()
	{
		instance = this;
	}
	
	public void onEnable()
	{
		Logger.getLogger("Minecraft").log(Level.SEVERE, "Lobby enabled! (author: dolaner)");
	}
	
	public void onDisable()
	{
		Logger.getLogger("Minecraft").log(Level.SEVERE, "Lobby disabled! (author: dolaner)");
	}
	
	public static Lobby getInstance()
	{
		return instance;
	}
	
}
