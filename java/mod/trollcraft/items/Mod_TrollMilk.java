package mod.trollcraft.items;

import mod.trollcraft.TrollcraftReborn;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Mod_TrollMilk extends ItemBucketMilk {
	public Mod_TrollMilk(int a, boolean b) {
		super();
    {
        this.setMaxStackSize(1);
        this.setTextureName("minecraft:bucket_milk");
        this.setCreativeTab(CreativeTabs.tabFood);
    }
}

@Override
public ItemStack onEaten(ItemStack itemStack, World world, EntityPlayer player) {

    if (!world.isRemote)
    {
        player.addPotionEffect(new PotionEffect(Potion.hunger.id, 1200, 1));
        player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1200, 1));
        player.addPotionEffect(new PotionEffect(Potion.weakness.id, 1200, 1));
        player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 1200, 1));
        player.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200, 1));
        player.addPotionEffect(new PotionEffect(Potion.blindness.id, 1200, 1));
        
    }
	return itemStack;

}

}

