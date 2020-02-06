package mod.trollcraft.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.trollcraft.TrollcraftReborn;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.TextureStitchEvent;

public class Mod_TrollSoul extends Item {
	public Mod_TrollSoul() {
		this.setTextureName("minecraft:skull_skeleton");
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);

	}
	@SideOnly(Side.CLIENT)

    public boolean hasEffect(ItemStack par1ItemStack)

    {

        return true;

    }
}