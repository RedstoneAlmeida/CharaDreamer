package org.bukkit.block;

import java.util.Collection;
import java.util.List;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

public class Block implements BukkitBlock {
	cn.nukkit.block.Block asriel;
	
	public Block(cn.nukkit.block.Block asriel) {
		this.asriel = asriel;
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
	public byte getData() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Block getRelative(int modX, int modY, int modZ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Block getRelative(BlockFace face) {
		if (face == BlockFace.NORTH) {
			return new Block(asriel.getSide(cn.nukkit.block.Block.SIDE_NORTH));
		}
		if (face == BlockFace.SOUTH) {
			return new Block(asriel.getSide(cn.nukkit.block.Block.SIDE_SOUTH));
		}
		if (face == BlockFace.EAST) {
			return new Block(asriel.getSide(cn.nukkit.block.Block.SIDE_EAST));
		}
		if (face == BlockFace.WEST) {
			return new Block(asriel.getSide(cn.nukkit.block.Block.SIDE_WEST));
		}
		if (face == BlockFace.DOWN) {
			return new Block(asriel.getSide(cn.nukkit.block.Block.SIDE_DOWN));
		}
		if (face == BlockFace.UP) {
			return new Block(asriel.getSide(cn.nukkit.block.Block.SIDE_UP));
		}
		return null;
	}

	@Override
	public Block getRelative(BlockFace face, int distance) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Material getType() {
		return Material.getMaterial(asriel.getId());
	}

	@Override
	public int getTypeId() {
		return asriel.getId();
	}

	@Override
	public byte getLightLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte getLightFromSky() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte getLightFromBlocks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public World getWorld() {
		return new World(asriel.getLevel());
	}

	@Override
	public int getX() {
		return asriel.getFloorX();
	}

	@Override
	public int getY() {
		return asriel.getFloorY();
	}

	@Override
	public int getZ() {
		return asriel.getFloorZ();
	}

	@Override
	public Location getLocation() {
		return new Location(asriel.getLocation());
	}

	@Override
	public Location getLocation(Location loc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chunk getChunk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setData(byte data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setData(byte data, boolean applyPhysics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setType(Material type) {
		getWorld().asriel.setBlockIdAt(getLocation().getBlockX(), getLocation().getBlockY(), getLocation().getBlockZ(), type.getId());
	}

	@Override
	public boolean setTypeId(int type) {
		getWorld().asriel.setBlockIdAt(getLocation().getBlockX(), getLocation().getBlockY(), getLocation().getBlockZ(), type);
		return true;
	}

	@Override
	public boolean setTypeId(int type, boolean applyPhysics) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setTypeIdAndData(int type, byte data, boolean applyPhysics) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BlockFace getFace(Block block) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BlockState getState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Biome getBiome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBiome(Biome bio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isBlockPowered() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBlockIndirectlyPowered() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBlockFacePowered(BlockFace face) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBlockFaceIndirectlyPowered(BlockFace face) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getBlockPower(BlockFace face) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getBlockPower() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLiquid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHumidity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PistonMoveReaction getPistonMoveReaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean breakNaturally() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean breakNaturally(ItemStack tool) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<ItemStack> getDrops() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ItemStack> getDrops(ItemStack tool) {
		// TODO Auto-generated method stub
		return null;
	}

}
