package mod.trollcraft;

import mod.trollcraft.armor.WeakDiamondArmor;
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
import mod.trollcraft.blocks.TrollTorch;
import mod.trollcraft.handler.FuelHandler;
import mod.trollcraft.items.Mod_TrollCoal;
import mod.trollcraft.items.Mod_TrollDiamond;
import mod.trollcraft.items.Mod_TrollMilk;
import mod.trollcraft.items.Mod_TrollSeeds;
import mod.trollcraft.items.Mod_TrollSoul;
import mod.trollcraft.items.TrollDiamondAxe;
import mod.trollcraft.items.TrollDiamondHoe;
import mod.trollcraft.items.TrollDiamondPickaxe;
import mod.trollcraft.items.TrollDiamondShovel;
import mod.trollcraft.items.TrollDiamondSword;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

//Port of Raptorking94's Trollcraft Mod 1.6.4

	@Mod(modid = TrollcraftReborn.MODID, name = TrollcraftReborn.MODNAME, version = TrollcraftReborn.VERSION)
	public class TrollcraftReborn {

	    public static final String MODID = "trollcraft";
	    public static final String MODNAME = "Trollcraft Reborn";
	    public static final String VERSION = "2.0";

	    public static Item TrollSoul;
	    public static Item TrollCoal;
	    public static Item TrollDiamond;
	    public static Item TrollMilk;
	    public static Item TrollSeeds;
	    
	    public static Item weakDiamondHelmet;
	    public static Item weakDiamondChestplate;
	    public static Item weakDiamondLeggings;
	    public static Item weakDiamondBoots;
	    
	    public static Item TrollDiamondPickaxe;
	    public static Item TrollDiamondAxe;
	    public static Item TrollDiamondShovel;
	    public static Item TrollDiamondHoe;
	    public static Item TrollDiamondSword;
	    
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
	    
	    public static Block TrollTorch;
	    
	    public static Achievement Trollach;
	    
	    public static final Item.ToolMaterial trollToolsMaterial = EnumHelper.addToolMaterial("TrollMaterial", 1, 1, 1.0f, 1.0f, 2);
	    public static final ItemArmor.ArmorMaterial weakDiamondMaterial = EnumHelper.addArmorMaterial("TrollDiamondArmor", 1, new int[]{1,1,1,1}, 9);
	    
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
			
			TrollDiamondPickaxe = new TrollDiamondPickaxe(trollToolsMaterial).setUnlocalizedName("TrollDiamondPickaxe").setMaxDamage(2);
			TrollDiamondAxe = new TrollDiamondAxe(trollToolsMaterial).setUnlocalizedName("TrollDiamondAxe").setMaxDamage(4);
			TrollDiamondShovel = new TrollDiamondShovel(trollToolsMaterial).setUnlocalizedName("TrollDiamondShovel").setMaxDamage(2);
			TrollDiamondHoe = new TrollDiamondHoe(trollToolsMaterial).setUnlocalizedName("TrollDiamondHoe");
			TrollDiamondSword = new TrollDiamondSword(trollToolsMaterial).setUnlocalizedName("TrollDiamondSword").setMaxDamage(5);
			
			weakDiamondHelmet = new WeakDiamondArmor(weakDiamondMaterial, 0, 0).setTextureName("minecraft:diamond_helmet").setUnlocalizedName("weakDiamondHelmet");
			weakDiamondChestplate = new WeakDiamondArmor(weakDiamondMaterial, 0, 1).setTextureName("minecraft:diamond_chestplate").setUnlocalizedName("weakDiamondChestplate");
			weakDiamondLeggings = new WeakDiamondArmor(weakDiamondMaterial, 0, 2).setTextureName("minecraft:diamond_leggings").setUnlocalizedName("weakDiamondLeggings");
			weakDiamondBoots = new WeakDiamondArmor(weakDiamondMaterial, 0, 3).setTextureName("minecraft:diamond_boots").setUnlocalizedName("weakDiamondBoots");
			
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
			TrollTorch = new TrollTorch(Material.circuits).setBlockName("TrollTorch");
			
			GameRegistry.registerItem(TrollSoul, TrollSoul.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollCoal, TrollCoal.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollDiamond, TrollDiamond.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollMilk, TrollMilk.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollSeeds, TrollSeeds.getUnlocalizedName().substring(5));
			
			GameRegistry.registerItem(TrollDiamondPickaxe, TrollDiamondPickaxe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollDiamondAxe, TrollDiamondAxe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollDiamondShovel, TrollDiamondShovel.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollDiamondHoe, TrollDiamondHoe.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(TrollDiamondSword, TrollDiamondSword.getUnlocalizedName().substring(5));
			
			GameRegistry.registerItem(weakDiamondHelmet, weakDiamondHelmet.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(weakDiamondChestplate, weakDiamondChestplate.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(weakDiamondLeggings, weakDiamondLeggings.getUnlocalizedName().substring(5));
			GameRegistry.registerItem(weakDiamondBoots, weakDiamondBoots.getUnlocalizedName().substring(5));
			
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
			
			GameRegistry.registerBlock(TrollTorch, TrollTorch.getUnlocalizedName().substring(5));
			
		}
		
		@EventHandler
		public void Init(FMLInitializationEvent e){
			
			GameRegistry.addRecipe(new ItemStack(TrollSoul, 4), " I ", " S ", " B ", 'I', Items.dye, 'S', Blocks.soul_sand, 'B', boneMeal);
			GameRegistry.addRecipe(new ItemStack(TrollIronOre, 1), " L ", " S ", " T ", 'T', TrollSoul, 'S', Blocks.stone, 'L', lightGrayDye);
			GameRegistry.addRecipe(new ItemStack(TrollCoalOre, 1), " I ", " S ", " T ", 'T', TrollSoul, 'S', Blocks.stone, 'I', Items.dye);
			GameRegistry.addRecipe(new ItemStack(TrollRedstoneOre, 1), "ORO", " S ", " T ", 'T', TrollSoul, 'S', Blocks.stone, 'O', Blocks.red_flower, 'R', redDye);
			GameRegistry.addRecipe(new ItemStack(TrollGoldOre, 1), " Y ", " S ", " T ", 'T', TrollSoul, 'S', Blocks.stone, 'Y', yellowDye);
			GameRegistry.addRecipe(new ItemStack(TrollDiamondOre, 1), " B ", " S ", " T ", 'T', TrollSoul, 'S', Blocks.stone, 'B', lightBlueDye);
			GameRegistry.addRecipe(new ItemStack(TrollTNT, 1), " N ", " T ", 'T', TrollSoul, 'N', Blocks.tnt);
			GameRegistry.addRecipe(new ItemStack(TrollLapisOre, 5), " L ", " S ", " T ", 'T', TrollSoul, 'S', Blocks.stone, 'L', lapisDye);
			GameRegistry.addRecipe(new ItemStack(TrollStone, 1), " T ", " S ", 'T', TrollSoul, 'S', Blocks.stone);
			GameRegistry.addRecipe(new ItemStack(TrollMilk, 1), " T ", " B ", " W ", 'T', TrollSoul, 'W', Items.water_bucket, 'B', boneMeal);
			GameRegistry.addRecipe(new ItemStack(TrollDiamondBlock, 1), "DDD", "DDD", "DDD", 'D', TrollDiamond);
			GameRegistry.addRecipe(new ItemStack(TrollSeeds, 5), " R ", "STS", "SSS", 'R', Items.rotten_flesh, 'S', Items.wheat_seeds, 'T', TrollSoul);
			GameRegistry.addRecipe(new ItemStack(TrollSand, 1), " S ", " T ", 'S', Blocks.sand, 'T', TrollSoul);
			GameRegistry.addRecipe(new ItemStack(TrollTorch, 4), " C ", " S ", 'S', Items.stick, 'C', TrollCoal);
			
			GameRegistry.addRecipe(new ItemStack(weakDiamondHelmet), "DDD", "D D", 'D', TrollDiamond);
			GameRegistry.addRecipe(new ItemStack(weakDiamondChestplate), "D D", "DDD", "DDD", 'D', TrollDiamond);
			GameRegistry.addRecipe(new ItemStack(weakDiamondLeggings), "DDD", "D D", "D D", 'D', TrollDiamond);
			GameRegistry.addRecipe(new ItemStack(weakDiamondBoots), "D D", "D D", 'D', TrollDiamond);
			
			GameRegistry.addRecipe(new ItemStack(TrollDiamondPickaxe), "DDD", " S ", " S ", 'D', TrollDiamond, 'S', Items.stick);
			GameRegistry.addRecipe(new ItemStack(TrollDiamondAxe), "DD ", "DS ", " S ", 'D', TrollDiamond, 'S', Items.stick);
			GameRegistry.addRecipe(new ItemStack(TrollDiamondShovel), " D ", " S ", " S ", 'D', TrollDiamond, 'S', Items.stick);
			GameRegistry.addRecipe(new ItemStack(TrollDiamondHoe), "DD ", " S ", " S ", 'D', TrollDiamond, 'S', Items.stick);
			GameRegistry.addRecipe(new ItemStack(TrollDiamondSword), " D ", " D ", " S ", 'D', TrollDiamond, 'S', Items.stick);
			
			GameRegistry.addSmelting(TrollIronOre, new ItemStack(Blocks.dirt), 0);
			GameRegistry.addSmelting(TrollGoldOre, new ItemStack(Blocks.sand), 0);
			
			GameRegistry.registerFuelHandler(new FuelHandler());
		}	
}