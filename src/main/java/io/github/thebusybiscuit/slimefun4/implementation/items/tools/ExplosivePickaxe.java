package io.github.thebusybiscuit.slimefun4.implementation.items.tools;

import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

/**
 * The {@link ExplosivePickaxe} is a pickaxe which can destroy blocks in a size of 3 by 3.
 * It also creates a explosion animation.
 * 
 * @author TheBusyBiscuit
 * 
 * @see ExplosiveShovel
 *
 */
public class ExplosivePickaxe extends ExplosiveTool {

    public ExplosivePickaxe(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

}
