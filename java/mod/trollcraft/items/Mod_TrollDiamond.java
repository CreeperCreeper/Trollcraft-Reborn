package mod.trollcraft.items;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.TextureStitchEvent;

public class Mod_TrollDiamond extends Item {
	public Mod_TrollDiamond() {
		this.setTextureName("minecraft:diamond");
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);

	}
}