package mod.trollcraft.blocks;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Mod_TrollStone extends BlockFalling {

	public Mod_TrollStone(Material material) {
		super(material);
		this.setBlockTextureName("minecraft:stone");
		this.setHarvestLevel("pickaxe", 0); // 0 - Wood 1 - Stone / Gold 2 - Iron 3 - Diamond
		this.setStepSound(this.soundTypeStone);
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);
		this.setResistance(30.0f);
		this.setHardness(-1.0F);
	}
	
    public int tickRate() {
        return 10;
    }
}	