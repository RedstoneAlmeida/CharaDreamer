package com.mrpowergamerbr.charadreamer;

import java.util.ArrayList;

import org.bukkit.entity.Player;

import cn.nukkit.Server;
import cn.nukkit.plugin.PluginBase;

public class CharaDreamer extends PluginBase {
	public static Server nukkit;
	
	@Override
	public void onEnable(){
		nukkit = getServer();
		
		new ListenerWrapper(this);
	}

	@Override
	public void onDisable() {

	}
	
	public static ArrayList<Player> nukkitToBukkitPlayerList(ArrayList<cn.nukkit.Player> list) {
		ArrayList<Player> bukkitPlayers = new ArrayList<Player>();
		
		for (cn.nukkit.Player p : list) {
			bukkitPlayers.add(new Player(p));
		}
		
		return bukkitPlayers;
	}
}