package mod.trollcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class TrollDiamondSword extends ItemSword {

	public TrollDiamondSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setTextureName("minecraft:diamond_sword");
		this.setMaxStackSize(1);
		this.setFull3D();
	}

}
