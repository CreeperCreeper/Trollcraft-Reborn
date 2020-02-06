package mod.trollcraft.blocks;

import java.util.Random;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Mod_TrollcoalOre extends Block {

	public Mod_TrollcoalOre(Material material) {
		super(material);
		this.setBlockTextureName("minecraft:coal_ore");
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 1); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeStone);
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);

	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return TrollcraftReborn.TrollCoal;
	  }
	}

