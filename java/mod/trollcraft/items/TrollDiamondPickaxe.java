package mod.trollcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class TrollDiamondPickaxe extends ItemPickaxe {

	public TrollDiamondPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("minecraft:diamond_pickaxe");
		this.setMaxStackSize(1);
		this.setFull3D();

	}

}
