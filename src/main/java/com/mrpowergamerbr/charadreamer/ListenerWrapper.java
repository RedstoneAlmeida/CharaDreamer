package com.mrpowergamerbr.charadreamer;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockBreakEvent;

public class ListenerWrapper implements Listener {
	CharaDreamer m;
	
	public ListenerWrapper(CharaDreamer m) {
		m.getServer().getPluginManager().registerEvents(this, m);
		this.m = m;
	}
	
	@EventHandler
	public void bukkitBlockBreak(BlockBreakEvent e) {
		/*
		 * How can I implement this?
		 */
	}
}
