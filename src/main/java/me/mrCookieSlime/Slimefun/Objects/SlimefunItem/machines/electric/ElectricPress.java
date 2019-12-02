package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines.electric;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AContainer;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.RecipeDisplayItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public abstract class ElectricPress extends AContainer implements RecipeDisplayItem {

    public ElectricPress(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }
	
	@Override
	public void registerDefaultRecipes() {
		registerRecipe(new MachineRecipe(4, new ItemStack[] {new CustomItem(SlimefunItems.STONE_CHUNK, 3)}, new ItemStack[] {new ItemStack(Material.COBBLESTONE)}));
		registerRecipe(new MachineRecipe(4, new ItemStack[] {new ItemStack(Material.FLINT, 6)}, new ItemStack[] {new ItemStack(Material.COBBLESTONE)}));
		
		registerRecipe(new MachineRecipe(6, new ItemStack[] {SlimefunItems.COPPER_INGOT}, new ItemStack[] {new CustomItem(SlimefunItems.COPPER_WIRE, 3)}));
		registerRecipe(new MachineRecipe(16, new ItemStack[] {new CustomItem(SlimefunItems.STEEL_INGOT, 8)}, new ItemStack[] {SlimefunItems.STEEL_PLATE}));
		registerRecipe(new MachineRecipe(18, new ItemStack[] {new CustomItem(SlimefunItems.REINFORCED_ALLOY_INGOT, 8)}, new ItemStack[] {SlimefunItems.REINFORCED_PLATE}));
		
		registerRecipe(new MachineRecipe(8, new ItemStack[] {new ItemStack(Material.NETHER_WART)}, new ItemStack[] {new CustomItem(SlimefunItems.MAGIC_LUMP_1, 2)}));
		registerRecipe(new MachineRecipe(10, new ItemStack[] {new CustomItem(SlimefunItems.MAGIC_LUMP_1, 4)}, new ItemStack[] {SlimefunItems.MAGIC_LUMP_2}));
		registerRecipe(new MachineRecipe(12, new ItemStack[] {new CustomItem(SlimefunItems.MAGIC_LUMP_2, 4)}, new ItemStack[] {SlimefunItems.MAGIC_LUMP_3}));
		
		registerRecipe(new MachineRecipe(10, new ItemStack[] {new ItemStack(Material.ENDER_EYE)}, new ItemStack[] {new CustomItem(SlimefunItems.ENDER_LUMP_1, 2)}));
		registerRecipe(new MachineRecipe(12, new ItemStack[] {new CustomItem(SlimefunItems.ENDER_LUMP_1, 4)}, new ItemStack[] {SlimefunItems.ENDER_LUMP_2}));
		registerRecipe(new MachineRecipe(14, new ItemStack[] {new CustomItem(SlimefunItems.ENDER_LUMP_2, 4)}, new ItemStack[] {SlimefunItems.ENDER_LUMP_3}));
		
		registerRecipe(new MachineRecipe(18, new ItemStack[] {new CustomItem(SlimefunItems.TINY_URANIUM, 9)}, new ItemStack[] {SlimefunItems.SMALL_URANIUM}));
		registerRecipe(new MachineRecipe(24, new ItemStack[] {new CustomItem(SlimefunItems.SMALL_URANIUM, 4)}, new ItemStack[] {SlimefunItems.URANIUM}));
	}

    @Override
    public String getInventoryTitle() {
        return "&eЭлектрический пресс";
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.IRON_HOE);
    }

    @Override
    public String getMachineIdentifier() {
        return "ELECTRIC_PRESS";
    }
}
