package mod.trollcraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mod.trollcraft.TrollcraftReborn;
import mod.trollcraft.TrollcraftReborn;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.util.IIcon;

public class Mod_TrollTNT extends Block {

	private IIcon topIcon;
	private IIcon bottomIcon;
	
	public Mod_TrollTNT(Material material) {
		super(Material.tnt);
		this.setHardness(0.05f);
		this.setStepSound(this.soundTypeGrass);
		this.setCreativeTab(TrollcraftReborn.TrollcraftTab);
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int wx, int wy, int wz)
	{
	return null;
	}

	@Override

	public IIcon getIcon(int i, int j)

	{

	if(i == 0)

	{

	return bottomIcon;

	}

	if(i == 1)

	{

	return topIcon;

	} else

	{

	return blockIcon;

	}

	}
	@Override

	@SideOnly(Side.CLIENT)

	public void registerBlockIcons(IIconRegister par1IconRegister)

	{

	    blockIcon = par1IconRegister.registerIcon("minecraft:tnt_side");
	    topIcon = par1IconRegister.registerIcon("minecraft:tnt_top");
	    bottomIcon = par1IconRegister.registerIcon("minecraft:tnt_bottom");

	}

	@Override
	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta) {
	world.createExplosion(world.getClosestPlayer(x, y, z, meta), (double)x, (double)y, (double)z, 2, true);
	}

@Override
public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int metadata, float a, float b, float c)
    {
	if(!world.isRemote) 
	{
		world.func_147480_a(x, y, z, true); 
	}
	
	return true;
	
    }

@Override
public boolean renderAsNormalBlock()
{
  return true;
}

}