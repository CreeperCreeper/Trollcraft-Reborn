package mod.trollcraft.blocks;

import java.util.Random;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class Mod_TrolllapisOre extends Block {

	public Mod_TrolllapisOre(Material material) {
		super(material);
		this.setBlockTextureName("minecraft:lapis_ore");
		this.setHardness(3);
		this.setHarvestLevel("pickaxe", 1); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeStone);
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);

	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune){
		return Item.getItemFromBlock(Blocks.brown_mushroom);
	  }
	
@Override
public int quantityDropped(Random rand) {
	return 3;
   }
}