package net.dolaner.lobby.managers;

import java.io.File;
import java.io.IOException;

import org.bukkit.entity.Player;

import net.dolaner.lobby.Lobby;

public class DatabaseManager 
{
	public static void makePlayerDirectory(Player p) throws IOException
	{
		String name = p.getName();
		File playerDatabase = new File(Lobby.getInstance().getDataFolder() + File.separator + "database/" + name + ".yml");
		if(!(playerDatabase.exists()))
		{
			try
			{
				playerDatabase.mkdir();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
	}

}
