package org.bukkit;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Logger;

import org.bukkit.BanList.Type;
import org.bukkit.Warning.WarningState;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.help.HelpMap;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.map.MapView;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicesManager;
import org.bukkit.plugin.messaging.Messenger;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.ScoreboardManager;
import org.bukkit.util.CachedServerIcon;

import com.mrpowergamerbr.charadreamer.CharaDreamer;

public class Server implements BukkitServer {

	@Override
	public void sendPluginMessage(Plugin source, String channel, byte[] message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<String> getListeningPluginChannels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return CharaDreamer.nukkit.getName();
	}

	@Override
	public String getVersion() {
		return CharaDreamer.nukkit.getVersion();
	}

	@Override
	public String getBukkitVersion() {
		return CharaDreamer.nukkit.getNukkitVersion();
	}

	@Override
	public Player[] _INVALID_getOnlinePlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<? extends Player> getOnlinePlayers() {
		return CharaDreamer.nukkitToBukkitPlayerList(new ArrayList(CharaDreamer.nukkit.getOnlinePlayers().values()));
	}

	@Override
	public int getMaxPlayers() {
		return CharaDreamer.nukkit.getMaxPlayers();
	}

	@Override
	public int getPort() {
		return CharaDreamer.nukkit.getPort();
	}

	@Override
	public int getViewDistance() {
		return CharaDreamer.nukkit.getViewDistance();
	}

	@Override
	public String getIp() {
		return CharaDreamer.nukkit.getIp();
	}

	@Override
	public String getServerName() {
		return CharaDreamer.nukkit.getName();
	}

	@Override
	public String getServerId() {
		return CharaDreamer.nukkit.getServerUniqueId().toString();
	}

	@Override
	public String getWorldType() {
		return CharaDreamer.nukkit.getLevelType();
	}

	@Override
	public boolean getGenerateStructures() {
		return CharaDreamer.nukkit.getGenerateStructures();
	}

	@Override
	public boolean getAllowEnd() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getAllowNether() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasWhitelist() {
		return CharaDreamer.nukkit.hasWhitelist();
	}

	@Override
	public void setWhitelist(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<OfflinePlayer> getWhitelistedPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reloadWhitelist() {
		CharaDreamer.nukkit.reloadWhitelist();
	}

	@Override
	public int broadcastMessage(String message) {
		return CharaDreamer.nukkit.broadcastMessage(message);
	}

	@Override
	public String getUpdateFolder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getUpdateFolderFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getConnectionThrottle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTicksPerAnimalSpawns() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTicksPerMonsterSpawns() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Player getPlayer(String name) {
		return new Player(CharaDreamer.nukkit.getPlayer(name));
	}

	@Override
	public Player getPlayerExact(String name) {
		return new Player(CharaDreamer.nukkit.getPlayerExact(name));
	}

	@Override
	public List<Player> matchPlayer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player getPlayer(UUID id) {
        for (cn.nukkit.Player p : CharaDreamer.nukkit.getOnlinePlayers().values()) {
        	if (p.getUniqueId().equals(id)) {
        		return new Player(p);
        	}
        }
        return null;
	}

	@Override
	public PluginManager getPluginManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BukkitScheduler getScheduler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServicesManager getServicesManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<World> getWorlds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public World createWorld(WorldCreator creator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean unloadWorld(String name, boolean save) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unloadWorld(World world, boolean save) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public World getWorld(String name) {
		return new World(CharaDreamer.nukkit.getLevelByName(name));
	}

	@Override
	public World getWorld(UUID uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MapView getMap(short id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MapView createMap(World world) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reload() {
		CharaDreamer.nukkit.reload();
	}

	@Override
	public Logger getLogger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PluginCommand getPluginCommand(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePlayers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean dispatchCommand(CommandSender sender, String commandLine) throws CommandException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRecipe(Recipe recipe) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Recipe> getRecipesFor(ItemStack result) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Recipe> recipeIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clearRecipes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetRecipes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, String[]> getCommandAliases() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSpawnRadius() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSpawnRadius(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getOnlineMode() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getAllowFlight() {
		return CharaDreamer.nukkit.getAllowFlight();
	}

	@Override
	public boolean isHardcore() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean useExactLoginLocation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void shutdown() {
		CharaDreamer.nukkit.shutdown();
	}

	@Override
	public int broadcast(String message, String permission) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OfflinePlayer getOfflinePlayer(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OfflinePlayer getOfflinePlayer(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getIPBans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void banIP(String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unbanIP(String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<OfflinePlayer> getBannedPlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BanList getBanList(Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<OfflinePlayer> getOperators() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GameMode getDefaultGameMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDefaultGameMode(GameMode mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ConsoleCommandSender getConsoleSender() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getWorldContainer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OfflinePlayer[] getOfflinePlayers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Messenger getMessenger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HelpMap getHelpMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, InventoryType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, InventoryType type, String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, int size) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inventory createInventory(InventoryHolder owner, int size, String title) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMonsterSpawnLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAnimalSpawnLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWaterAnimalSpawnLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getAmbientSpawnLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPrimaryThread() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getMotd() {
		return CharaDreamer.nukkit.getMotd();
	}

	@Override
	public String getShutdownMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WarningState getWarningState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemFactory getItemFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScoreboardManager getScoreboardManager() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CachedServerIcon getServerIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CachedServerIcon loadServerIcon(File file) throws IllegalArgumentException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CachedServerIcon loadServerIcon(BufferedImage image) throws IllegalArgumentException, Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIdleTimeout(int threshold) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getIdleTimeout() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UnsafeValues getUnsafe() {
		// TODO Auto-generated method stub
		return null;
	}

}
