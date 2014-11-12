package me.morccrafak.privhrac;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class majnka extends JavaPlugin {
public final Logger l = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		l.info("[Privitanie Hraca] Nacitavanie!");
		PluginManager pln = this.getServer().getPluginManager();
		pln.registerEvent(null, new PripojenieHraca(), null, null, this);
		
	}

	public void onDisable() {
		l.info("[Zakladne Prikazy] Vypinanie Zakladneho Pluginu!");
	}
	
		

}