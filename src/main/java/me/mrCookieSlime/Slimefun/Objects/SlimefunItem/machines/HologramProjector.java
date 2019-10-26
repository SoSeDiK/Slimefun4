package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.machines;

import org.bukkit.ChatColor;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunBlockHandler;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SimpleSlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.UnregisterReason;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemInteractionHandler;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.holograms.HologramProjectorHologram;

public class HologramProjector extends SimpleSlimefunItem<ItemInteractionHandler> {

	public HologramProjector(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, ItemStack recipeOutput) {
		super(category, item, recipeType, recipe, recipeOutput);
		
		SlimefunItem.registerBlockHandler(getID(), new SlimefunBlockHandler() {

			@Override
			public void onPlace(Player p, Block b, SlimefunItem item) {
				BlockStorage.addBlockInfo(b, "text", ChatColor.translateAlternateColorCodes('&', "&bПривет! Я — Голограмма, &3настрой меня при помощи проектора снизу."));
				BlockStorage.addBlockInfo(b, "offset", "0.5");
				BlockStorage.addBlockInfo(b, "owner", p.getUniqueId().toString());

				HologramProjectorHologram.getArmorStand(b, true);
			}

			@Override
			public boolean onBreak(Player p, Block b, SlimefunItem item, UnregisterReason reason) {
				HologramProjectorHologram.remove(b);
				return true;
			}
		});
	}
	
	@Override
	protected boolean areItemHandlersPrivate() {
		return false;
	}

	@Override
	public ItemInteractionHandler getItemHandler() {
		return (e, p, item) -> {
			if (e.getClickedBlock() == null) return false;
			
			String id = BlockStorage.checkID(e.getClickedBlock());
			if (id != null && id.equals(getID())) {
				e.setCancelled(true);

				if (BlockStorage.getLocationInfo(e.getClickedBlock().getLocation(), "owner").equals(p.getUniqueId().toString())) {
					HologramProjectorHologram.openEditor(p, e.getClickedBlock());
				}

				return true;
			}
			
			return false;
		};
	}
}
