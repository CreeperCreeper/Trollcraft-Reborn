package mod.trollcraft.blocks;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Mod_TrollironOre extends Block {

	public Mod_TrollironOre(Material material) {
		super(material);
		this.setBlockTextureName("minecraft:iron_ore");
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 1); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeStone);
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);

	}
	
}	