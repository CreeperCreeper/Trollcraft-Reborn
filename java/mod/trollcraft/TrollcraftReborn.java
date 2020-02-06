package mod.trollcraft;

import java.util.Collections;
import java.util.Comparator;

import mod.trollcraft.blocks.Mod_TrollDiamondBlock;
import mod.trollcraft.blocks.Mod_TrollSand;
import mod.trollcraft.blocks.Mod_TrollStone;
import mod.trollcraft.blocks.Mod_TrollTNT;
import mod.trollcraft.blocks.Mod_TrollcoalOre;
import mod.trollcraft.blocks.Mod_TrolldiamondOre;
import mod.trollcraft.blocks.Mod_TrollgoldOre;
import mod.trollcraft.blocks.Mod_TrollironOre;
import mod.trollcraft.blocks.Mod_TrolllapisOre;
import mod.trollcraft.blocks.Mod_TrollredstoneOre;
import mod.trollcraft.handler.FuelHandler;
import mod.trollcraft.items.Mod_TrollCoal;
import mod.trollcraft.items.Mod_TrollDiamond;
import mod.trollcraft.items.Mod_TrollMilk;
import mod.trollcraft.items.Mod_TrollSeeds;
import mod.trollcraft.items.Mod_TrollSoul;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//Port of Raptorking94's Trollcraft Mod 1.6.4

	@Mod(modid = TrollcraftReborn.MODID, name = TrollcraftReborn.MODNAME, version = TrollcraftReborn.VERSION)
	public class TrollcraftReborn {

	    public static final String MODID = "trollcraft";
	    public static final String MODNAME = "Trollcraft Reborn";
	    public static final String VERSION = "r1.0";

	    public static Item TrollSoul;
	    public static Item TrollCoal;
	    public static Item TrollDiamond;
	    public static Item TrollMilk;
	    public static Item TrollSeeds;
	    
	    public static Block TrollStone;
	    public static Block TrollIronOre;
	    public static Block TrollCoalOre;
	    public static Block TrollRedstoneOre;
	    public static Block TrollGoldOre;
	    public static Block TrollDiamondOre;
	    public static Block TrollSand;
	    public static Block TrollTNT;
	    public static Block TrollLapisOre;
	    public static Block TrollDiamondBlock;
	    
	    ItemStack boneMeal = new ItemStack(Items.dye, 1, 15);
	    ItemStack lightGrayDye = new ItemStack(Items.dye, 1, 7);
	    ItemStack redDye = new ItemStack(Items.dye, 1, 1);
	    ItemStack yellowDye = new ItemStack(Items.dye, 1, 11);
	    ItemStack lightBlueDye = new ItemStack(Items.dye, 1, 12);
	    ItemStack lapisDye = new ItemStack(Items.dye, 1, 4);
	    
	    public static CreativeTabs TrollcraftTab = new mod.trollcraft.tabs.TrollcraftTab();
	    
		@EventHandler
		public void preInit(FMLPreInitializationEvent e){
			TrollSoul = new Mod_TrollSoul().setUnlocalizedName("TrollSoul");
			TrollCoal = new Mod_TrollCoal().setUnlocalizedName("TrollCoal");
			TrollDiamond = new Mod_TrollDiamond().setUnlocalizedName("TrollDiamond");
			TrollMilk = new Mod_TrollMilk(0, false).setUnlocalizedName("TrollMilk");
			TrollSeeds = new Mod_TrollSeeds().setUnlocalizedName("TrollSeeds");
			
			TrollStone = new Mod_TrollStone(Material.rock).setBlockName("TrollStone");
			TrollIronOre = new Mod_TrollironOre(Material.rock).setBlockName("TrollironOre");
			TrollCoalOre = new Mod_TrollcoalOre(Material.rock).setBlockName("TrollcoalOre");
			TrollRedstoneOre = new Mod_TrollredstoneOre(Material.rock).setBlockName("TrollredstoneOre");
			TrollGoldOre = new Mod_TrollgoldOre(Material.rock).setBlockName("TrollgoldOre");
			TrollDiamondOre = new Mod_TrolldiamondOre(Material.rock).setBlockName("TrolldiamondOre");
			TrollSand = new Mod_TrollSand(Material.sand).setBlockName("TrollSand");
			TrollTNT = new Mod_TrollTNT(Material.tnt).setBlockName("TrollTNT");
			TrollLapisOre = new Mod_TrolllapisOre(Material.rock).setBlockName("TrolllapisOre");
			TrollDiamondBlock = new Mod_TrollDiamondBlock(Material.iron).setBlockName("TrollDiamondBlock");
			
			GameRegistry.registerItem(TrollSoul, TrollSoul.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollCoal, TrollCoal.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollDiamond, TrollDiamond.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollMilk, TrollMilk.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollSeeds, TrollSeeds.getUnlocalizedName().substring(5));
			
			GameRegistry.registerBlock(TrollStone, TrollStone.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(TrollIronOre, TrollIronOre.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(TrollCoalOre, TrollCoalOre.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(TrollRedstoneOre, TrollRedstoneOre.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(TrollGoldOre, TrollGoldOre.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(TrollDiamondOre, TrollDiamondOre.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(TrollSand, TrollSand.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(TrollTNT, TrollTNT.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(TrollLapisOre, TrollLapisOre.getUnlocalizedName().substring(5));
			GameRegistry.registerBlock(TrollDiamondBlock, TrollDiamondBlock.getUnlocalizedName().substring(5));
			
		}
		
		@EventHandler
		public void Init(FMLInitializationEvent e){
			
			GameRegistry.addRecipe(new ItemStack(TrollSoul, 4), "I", "S", "B", 'I', Items.dye, 'S', Blocks.soul_sand, 'B', boneMeal);
			GameRegistry.addRecipe(new ItemStack(TrollIronOre, 1), "L", "S", "T", 'T', TrollSoul, 'S', Blocks.stone, 'L', lightGrayDye);
			GameRegistry.addRecipe(new ItemStack(TrollCoalOre, 1), "I", "S", "T", 'T', TrollSoul, 'S', Blocks.stone, 'I', Items.dye);
			GameRegistry.addRecipe(new ItemStack(TrollRedstoneOre, 1), "ORO", " S ", " T ", 'T', TrollSoul, 'S', Blocks.stone, 'O', Blocks.red_flower, 'R', redDye);
			GameRegistry.addRecipe(new ItemStack(TrollGoldOre, 1), "Y", "S", "T", 'T', TrollSoul, 'S', Blocks.stone, 'Y', yellowDye);
			GameRegistry.addRecipe(new ItemStack(TrollDiamondOre, 1), "B", "S", "T", 'T', TrollSoul, 'S', Blocks.stone, 'B', lightBlueDye);
			GameRegistry.addRecipe(new ItemStack(TrollTNT, 1), "N", "T", 'T', TrollSoul, 'N', Blocks.tnt);
			GameRegistry.addRecipe(new ItemStack(TrollLapisOre, 5), "L", "S", "T", 'T', TrollSoul, 'S', Blocks.stone, 'L', lapisDye);
			GameRegistry.addRecipe(new ItemStack(TrollStone, 1), "T", "S", 'T', TrollSoul, 'S', Blocks.stone);
			GameRegistry.addRecipe(new ItemStack(TrollMilk, 1), "T", "B", "W", 'T', TrollSoul, 'W', Items.water_bucket, 'B', boneMeal);
			GameRegistry.addRecipe(new ItemStack(TrollDiamondBlock, 1), "DDD", "DDD", "DDD", 'D', TrollDiamond);
			GameRegistry.addRecipe(new ItemStack(TrollSeeds, 5), " R ", "STS", "SSS", 'R', Items.rotten_flesh, 'S', Items.wheat_seeds, 'T', TrollSoul);
			
			GameRegistry.addSmelting(TrollIronOre, new ItemStack(Blocks.dirt), 0);
			GameRegistry.addSmelting(TrollGoldOre, new ItemStack(Blocks.sand), 0);
			
			GameRegistry.registerFuelHandler(new FuelHandler());
		}
	}
