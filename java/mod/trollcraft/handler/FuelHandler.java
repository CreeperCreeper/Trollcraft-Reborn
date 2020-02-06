package mod.trollcraft.handler;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		if(fuel.getItem() == TrollcraftReborn.TrollCoal) return 1;
		
		return 0;
	}

}
