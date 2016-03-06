# CharaDreamer
Bukkit API implementation for Nukkit... No, it isn't related to Undertale, but I like Undertale, so that's a bonus, right?

# What does work?
Nothing is 100% complete, most of the times when using a method there is a 99% chance that you are going to recieve a null/0/false value, or, if the method is void, you are going to recieve... nothing! And the code won't do anything! Fun!

*"Ok, but what DOES work?"*

Player, Location, BukkitRunnable, Bukkit static class and World, that's it.

You can get this code to compile tho:
```
@Override
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(new MoveListener(this), this);
		
		Bukkit.broadcastMessage("§a§bHello!");
		
		Bukkit.getPlayer("MrPowerGamerBR").sendMessage("Pequeno Olá");
		
		List<Player> bukkitList = Bukkit.getWorld("world").getPlayers();
		
		for (Player b : bukkitList) {
			b.sendMessage("§c§lHello to everyone in \"world\"!");
		}
		
		new BukkitRunnable() {
			public void run() {
				Player me = Bukkit.getPlayer("MrPowerGamerBR");
				
				me.setDisplayName("Asriel Dreemurr");
				
				Bukkit.broadcastMessage("§l" + me.getDisplayName());
				
				Location l = new Location(Bukkit.getWorld("world"), 0, 90, 0);
				
				me.teleport(l);
			}
		}.runTaskLater(this, 100L);		
	}
}
	```
	
And... that's it.
