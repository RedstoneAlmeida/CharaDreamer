package org.bukkit;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Item;
import org.bukkit.entity.LightningStrike;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.Vector;

import com.mrpowergamerbr.charadreamer.CharaDreamer;

import cn.nukkit.math.Vector3;

public class World implements BukkitWorld {
	/*
	 * Save the WORLD!
	 */
	public cn.nukkit.level.Level asriel;
	
	public World(cn.nukkit.level.Level asriel) {
		this.asriel = asriel;
	}
	
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
	public void setMetadata(String metadataKey, MetadataValue newMetadataValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MetadataValue> getMetadata(String metadataKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasMetadata(String metadataKey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeMetadata(String metadataKey, Plugin owningPlugin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Block getBlockAt(int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Block getBlockAt(Location location) {
		Vector3 vec3 = new Vector3(location.getX(), location.getY(), location.getZ());
		return new Block(asriel.getBlock(vec3));
	}

	@Override
	public int getBlockTypeIdAt(int x, int y, int z) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBlockTypeIdAt(Location location) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHighestBlockYAt(int x, int z) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHighestBlockYAt(Location location) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Block getHighestBlockAt(int x, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Block getHighestBlockAt(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chunk getChunkAt(int x, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chunk getChunkAt(Location location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chunk getChunkAt(Block block) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isChunkLoaded(Chunk chunk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Chunk[] getLoadedChunks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void loadChunk(Chunk chunk) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isChunkLoaded(int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChunkInUse(int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void loadChunk(int x, int z) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean loadChunk(int x, int z, boolean generate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unloadChunk(Chunk chunk) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unloadChunk(int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unloadChunk(int x, int z, boolean save) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unloadChunk(int x, int z, boolean save, boolean safe) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unloadChunkRequest(int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unloadChunkRequest(int x, int z, boolean safe) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean regenerateChunk(int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean refreshChunk(int x, int z) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Item dropItem(Location location, ItemStack item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item dropItemNaturally(Location location, ItemStack item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Arrow spawnArrow(Location location, Vector direction, float speed, float spread) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean generateTree(Location location, TreeType type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean generateTree(Location loc, TreeType type, BlockChangeDelegate delegate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Entity spawnEntity(Location loc, EntityType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LivingEntity spawnCreature(Location loc, EntityType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LivingEntity spawnCreature(Location loc, CreatureType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LightningStrike strikeLightning(Location loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LightningStrike strikeLightningEffect(Location loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entity> getEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LivingEntity> getLivingEntities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Entity> Collection<T> getEntitiesByClass(Class<T>... classes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Entity> Collection<T> getEntitiesByClass(Class<T> cls) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Entity> getEntitiesByClasses(Class<?>... classes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayers() {
		return CharaDreamer.nukkitToBukkitPlayerList(new ArrayList(asriel.getPlayers().values()));
	}

	@Override
	public String getName() {
		return asriel.getName();
	}

	@Override
	public UUID getUID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getSpawnLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setSpawnLocation(int x, int y, int z) {
		asriel.setSpawnLocation(new Vector3(x, y, z));
		return true;
	}

	@Override
	public long getTime() {
		return asriel.getTime();
	}

	@Override
	public void setTime(long time) {
		asriel.setTime((int) time);
	}

	@Override
	public long getFullTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFullTime(long time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hasStorm() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setStorm(boolean hasStorm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWeatherDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWeatherDuration(int duration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isThundering() {
		return asriel.isThundering();
	}

	@Override
	public void setThundering(boolean thundering) {
		asriel.setThundering(thundering);
	}

	@Override
	public int getThunderDuration() {
		return asriel.getThunderTime();
	}

	@Override
	public void setThunderDuration(int duration) {
		asriel.setThunderTime(duration);
	}

	@Override
	public boolean createExplosion(double x, double y, double z, float power) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createExplosion(double x, double y, double z, float power, boolean setFire) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createExplosion(double x, double y, double z, float power, boolean setFire, boolean breakBlocks) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createExplosion(Location loc, float power) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean createExplosion(Location loc, float power, boolean setFire) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Environment getEnvironment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getSeed() {
		return asriel.getSeed();
	}

	@Override
	public boolean getPVP() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setPVP(boolean pvp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ChunkGenerator getGenerator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save() {
		/*
		 * https://www.youtube.com/watch?v=mZRP7nQkfrM
		 */
		asriel.save();
	}

	@Override
	public List<BlockPopulator> getPopulators() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T extends Entity> T spawn(Location location, Class<T> clazz) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FallingBlock spawnFallingBlock(Location location, Material material, byte data)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FallingBlock spawnFallingBlock(Location location, int blockId, byte blockData)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void playEffect(Location location, Effect effect, int data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playEffect(Location location, Effect effect, int data, int radius) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void playEffect(Location location, Effect effect, T data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void playEffect(Location location, Effect effect, T data, int radius) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ChunkSnapshot getEmptyChunkSnapshot(int x, int z, boolean includeBiome, boolean includeBiomeTempRain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSpawnFlags(boolean allowMonsters, boolean allowAnimals) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getAllowAnimals() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getAllowMonsters() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Biome getBiome(int x, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBiome(int x, int z, Biome bio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getTemperature(int x, int z) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHumidity(int x, int z) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSeaLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getKeepSpawnInMemory() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setKeepSpawnInMemory(boolean keepLoaded) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAutoSave() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setAutoSave(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDifficulty(Difficulty difficulty) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Difficulty getDifficulty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getWorldFolder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WorldType getWorldType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canGenerateStructures() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getTicksPerAnimalSpawns() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTicksPerAnimalSpawns(int ticksPerAnimalSpawns) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getTicksPerMonsterSpawns() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTicksPerMonsterSpawns(int ticksPerMonsterSpawns) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getMonsterSpawnLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setMonsterSpawnLimit(int limit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAnimalSpawnLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAnimalSpawnLimit(int limit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWaterAnimalSpawnLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWaterAnimalSpawnLimit(int limit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAmbientSpawnLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAmbientSpawnLimit(int limit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playSound(Location location, Sound sound, float volume, float pitch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String[] getGameRules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGameRuleValue(String rule) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setGameRuleValue(String rule, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGameRule(String rule) {
		// TODO Auto-generated method stub
		return false;
	}

}
