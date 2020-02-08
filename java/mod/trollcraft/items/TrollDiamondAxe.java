package mod.trollcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class TrollDiamondAxe extends ItemAxe {

	public TrollDiamondAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("minecraft:diamond_axe");
		this.setMaxStackSize(1);
		this.setFull3D();
	}

}
