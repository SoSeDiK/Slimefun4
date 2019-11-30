package me.mrCookieSlime.Slimefun.Lists;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.cscorelib2.recipes.MinecraftRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunGadget;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunMachine;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.SlimefunRecipes;

public class RecipeType {

	public static final RecipeType MULTIBLOCK = new RecipeType(new CustomItem(Material.BRICKS, "&bПостройка", "", "&a&oСтроится в мире из блоков"));
	public static final RecipeType ARMOR_FORGE = new RecipeType((SlimefunItemStack) SlimefunItems.ARMOR_FORGE, "", "&a&oКрафтится в конструкторе брони");
	public static final RecipeType GRIND_STONE = new RecipeType((SlimefunItemStack) SlimefunItems.GRIND_STONE, "", "&a&oИзмельчите, используя измельчитель вещей");
	public static final RecipeType MOB_DROP = new RecipeType(new CustomItem(Material.IRON_SWORD, "&bДроп из моба", "", "&a&oУбейте указанного моба, чтобы получить этот предмет"));
	public static final RecipeType SMELTERY = new RecipeType((SlimefunItemStack) SlimefunItems.SMELTERY, "", "&a&oРасплавьте, используя плавильню");
	public static final RecipeType ORE_CRUSHER = new RecipeType((SlimefunItemStack) SlimefunItems.ORE_CRUSHER, "", "&a&oРазрушьте, используя разрушитель руд");
	public static final RecipeType GOLD_PAN = new RecipeType((SlimefunItemStack) SlimefunItems.GOLD_PAN, "", "&a&oПросейте гравий, чтобы заполучить этот предмет");
	public static final RecipeType COMPRESSOR = new RecipeType((SlimefunItemStack) SlimefunItems.COMPRESSOR, "", "&a&oСожмите, используя компрессор");
	public static final RecipeType PRESSURE_CHAMBER = new RecipeType((SlimefunItemStack) SlimefunItems.PRESSURE_CHAMBER, "", "&a&oСожмите, используя барокамеру");
	public static final RecipeType MAGIC_WORKBENCH = new RecipeType((SlimefunItemStack) SlimefunItems.MAGIC_WORKBENCH, "", "&a&oКрафтится на магическом верстаке");
	public static final RecipeType ORE_WASHER = new RecipeType((SlimefunItemStack) SlimefunItems.ORE_WASHER, "",  "&a&oОчистите, используя очиститель руд");
	public static final RecipeType ENHANCED_CRAFTING_TABLE = new RecipeType((SlimefunItemStack) SlimefunItems.ENHANCED_CRAFTING_TABLE, "", "&a&oКрафтится на улучшенном верстаке");
	public static final RecipeType JUICER = new RecipeType((SlimefunItemStack) SlimefunItems.JUICER, "", "&a&oВыжмите все соки из предмета");
	public static final RecipeType ANCIENT_ALTAR = new RecipeType((SlimefunItemStack) SlimefunItems.ANCIENT_ALTAR, "", "&dСоздайте предмет, выполнив", "&dритуал на древнем алтаре");
	public static final RecipeType HEATED_PRESSURE_CHAMBER = new RecipeType((SlimefunItemStack) SlimefunItems.HEATED_PRESSURE_CHAMBER, "", "&a&oСожмите, используя обогреваемую барокамеру");

	public static final RecipeType SHAPED_RECIPE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eОбычный рецепт", "", "&a&oПростой рецепт на верстаке…"));
	public static final RecipeType SHAPELESS_RECIPE = new RecipeType(new CustomItem(Material.CRAFTING_TABLE, "&eБесформенный рецепт", "", "&a&oПростой рецепт на верстаке…"));
	public static final RecipeType FURNACE = new RecipeType(new CustomItem(Material.FURNACE, "&eПлавится в печке", "", "&a&oПереплавка в обычной печи"));
	public static final RecipeType NULL = new RecipeType((ItemStack) null);
	
	private final ItemStack item;
	private final String machine;
	
	public RecipeType(ItemStack item, String machine) {
		this.item = item;
		this.machine = machine;
	}
	
	public RecipeType(SlimefunItemStack slimefunItem, String... lore) {
		this.item = new CustomItem(slimefunItem, null, lore);
		this.machine = slimefunItem.getItemID();
	}

	public RecipeType(ItemStack item) {
		this(item, "");
	}

	public RecipeType(MinecraftRecipe<?> recipe) {
		this(new ItemStack(recipe.getMachine()));
	}

	public RecipeType(String machine, int seconds, ItemStack[] input, ItemStack[] output) {
		this.machine = machine;
		this.item = getMachine().getItem();
		
		SlimefunRecipes.registerMachineRecipe(machine, seconds, input, output);
	}
	
	public ItemStack toItem() {
		return this.item;
	}
	
	public SlimefunItem getMachine() {
		return SlimefunItem.getByID(machine);
	}
	
	public static List<ItemStack> getRecipeInputs(SlimefunItem machine) {
		if (machine == null) return new ArrayList<>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack> convertible = new ArrayList<>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertible.add(recipes.get(i)[0]);
		}
		return convertible;
	}
	
	public static List<ItemStack[]> getRecipeInputList(SlimefunItem machine) {
		if (machine == null) return new ArrayList<>();
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		List<ItemStack[]> convertible = new ArrayList<>();
		for (int i = 0; i < recipes.size(); i++) {
			if (i % 2 == 0) convertible.add(recipes.get(i));
		}
		return convertible;
	}
	
	public static ItemStack getRecipeOutput(SlimefunItem machine, ItemStack input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputs(machine).indexOf(input) * 2) + 1))[0].clone();
	}
	
	public static ItemStack getRecipeOutputList(SlimefunItem machine, ItemStack[] input) {
		List<ItemStack[]> recipes = (machine instanceof SlimefunMachine ? ((SlimefunMachine) machine).getRecipes(): ((SlimefunGadget) machine).getRecipes());
		return recipes.get(((getRecipeInputList(machine).indexOf(input) * 2) + 1))[0];
	}
}
