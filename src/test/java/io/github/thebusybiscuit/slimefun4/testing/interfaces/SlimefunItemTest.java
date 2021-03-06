package io.github.thebusybiscuit.slimefun4.testing.interfaces;

import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.EquipmentSlot;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemConsumptionHandler;
import me.mrCookieSlime.Slimefun.Objects.handlers.ItemUseHandler;

@FunctionalInterface
public interface SlimefunItemTest<T extends SlimefunItem> {

    /**
     * This method should construct a new {@link SlimefunItem} of type T.
     * 
     * 
     * @param plugin
     *            The current instance of {@link SlimefunPlugin}
     * @param id
     *            An id for this {@link SlimefunItem}
     * 
     * @return A newly constructed {@link SlimefunItem}
     */
    T registerSlimefunItem(SlimefunPlugin plugin, String id);

    default void simulateRightClick(Player player, T item) {
        PlayerInteractEvent e = new PlayerInteractEvent(player, Action.RIGHT_CLICK_AIR, item.getItem().clone(), null, null, EquipmentSlot.HAND);
        PlayerRightClickEvent event = new PlayerRightClickEvent(e);
        item.callItemHandler(ItemUseHandler.class, handler -> handler.onRightClick(event));
    }

    default void simulateConsumption(Player player, T item) {
        PlayerItemConsumeEvent event = new PlayerItemConsumeEvent(player, item.getItem().clone());
        item.callItemHandler(ItemConsumptionHandler.class, handler -> handler.onConsume(event, player, event.getItem()));
    }

}
