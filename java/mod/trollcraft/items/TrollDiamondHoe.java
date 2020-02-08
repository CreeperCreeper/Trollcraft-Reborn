package mod.trollcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class TrollDiamondHoe extends ItemHoe {

	public TrollDiamondHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("minecraft:diamond_hoe");
		this.setMaxStackSize(1);
		this.setFull3D();
	}

}
