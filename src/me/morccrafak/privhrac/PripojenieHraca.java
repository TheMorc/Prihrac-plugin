package me.morccrafak.privhrac;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PripojenieHraca implements Listener {
	
	public majnka plugin;
	
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player hrac_pred = event.getPlayer();
		Player hrac = event.getPlayer();
		if(hrac_pred.hasPlayedBefore()) {
			hrac.sendMessage("Test pripojenia pre hraca atd erjgorjirhilughgerklgeguiergggggggggggggeril");
			
		}
	}
	

}
