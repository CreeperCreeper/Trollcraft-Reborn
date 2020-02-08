package mod.trollcraft.items;

import java.util.List;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.block.BlockGrass;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Mod_TrollSeeds extends Item {

	public Mod_TrollSeeds() {
		this.setTextureName("minecraft:seeds_wheat");
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);
	}

@Override
public boolean onItemUse(ItemStack parItemStack, EntityPlayer parPlayer, 
      World parWorld, int parX, int parY, int parZ, int par7, float par8, 
      float par9, float par10)
      {   
	if (!parWorld.isRemote){
		EntityMob entity1 = new EntityZombie(parWorld);
		entity1.setPosition(parX, parY, parZ);
		parWorld.spawnEntityInWorld(entity1);
	}
	
	--parItemStack.stackSize;
	return true;
      }
}