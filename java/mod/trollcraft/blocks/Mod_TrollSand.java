package mod.trollcraft.blocks;

import java.util.Random;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Mod_TrollSand extends Block {
	
	public Mod_TrollSand(Material material) {
		super(material);
		this.setBlockTextureName("minecraft:sand");
		this.setHardness(3.0f);
		this.setHarvestLevel("shovel", 0); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeSand);
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);

	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int wx, int wy, int wz)
	{
	return null;
	}

@Override
public Item getItemDropped(int metadata, Random rand, int fortune){
	return Blocks.sand.getItemDropped(1, rand, fortune);
  }
}


