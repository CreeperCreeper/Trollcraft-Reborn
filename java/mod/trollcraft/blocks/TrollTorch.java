package mod.trollcraft.blocks;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TrollTorch extends BlockTorch {

	public TrollTorch(Material material) {
		super();
		this.setHardness(0);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setBlockTextureName("minecraft:torch_on");
		this.setLightLevel(0);
		this.setStepSound(this.soundTypeWood);
	}
}
