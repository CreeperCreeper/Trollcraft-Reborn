package mod.trollcraft.blocks;

import java.util.Random;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Mod_TrollDiamondBlock extends Block {

	public Mod_TrollDiamondBlock(Material material) {
		super(material);
		this.setBlockTextureName("minecraft:diamond_block");
		this.setHardness(5);
		this.setHarvestLevel("pickaxe", 2); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeMetal);
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);

	}

@Override
public Item getItemDropped(int metadata, Random rand, int fortune){
	return TrollcraftReborn.TrollDiamond;
  }

@Override
public int quantityDropped(Random rand) {
	return 9;
   }
}
