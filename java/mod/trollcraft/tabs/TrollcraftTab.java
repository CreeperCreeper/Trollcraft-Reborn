package mod.trollcraft.tabs;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.trollcraft.TrollcraftReborn;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
	
public class TrollcraftTab extends CreativeTabs{

	public TrollcraftTab(){
		super(getNextID(), "TrollcraftTab");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem(){
		return new ItemStack(Items.skull).getItem();
	}
}