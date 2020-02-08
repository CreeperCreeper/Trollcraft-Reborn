package mod.trollcraft.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class TrollDiamondShovel extends ItemSpade {

	public TrollDiamondShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setTextureName("minecraft:diamond_shovel");
		this.setMaxStackSize(1);
		this.setFull3D();
	}

}
