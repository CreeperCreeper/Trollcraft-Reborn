package mod.trollcraft.blocks;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Mod_TrollgoldOre extends Block {

	public Mod_TrollgoldOre(Material material) {
		super(material);
		this.setBlockTextureName("minecraft:gold_ore");
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 2); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeStone);
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);

	}
	
}	
