package mod.trollcraft.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class WeakDiamondArmor extends ItemArmor {

	public WeakDiamondArmor(ArmorMaterial armorMaterial, int renderIndex,
			int armorType) {
		super(armorMaterial, renderIndex, armorType);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxStackSize(1);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (this.armorType == 2)
		{
			return "minecraft:textures/models/armor/diamond_layer_2.png";
		}
		return "minecraft:textures/models/armor/diamond_layer_1.png";
	}

@Override
public boolean showDurabilityBar(ItemStack itemStack)
{
	return itemStack.isItemDamaged();
}

}