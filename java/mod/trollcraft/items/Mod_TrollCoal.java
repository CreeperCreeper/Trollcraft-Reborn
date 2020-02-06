package mod.trollcraft.items;

import javax.swing.text.html.parser.Entity;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.event.TextureStitchEvent;

public class Mod_TrollCoal extends Item {

	public Mod_TrollCoal() {
		this.setTextureName("minecraft:coal");
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);

	}
}