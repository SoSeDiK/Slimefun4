package io.github.thebusybiscuit.slimefun4.testing.tests.items;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import io.github.thebusybiscuit.slimefun4.implementation.setup.PostSetup;
import io.github.thebusybiscuit.slimefun4.implementation.setup.SlimefunItemSetup;
import io.github.thebusybiscuit.slimefun4.testing.TestUtilities;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Objects.Category;

@TestMethodOrder(value = OrderAnnotation.class)
public class TestItemSetup {

    private static SlimefunPlugin plugin;

    @BeforeAll
    public static void load() {
        ServerMock server = MockBukkit.mock();
        plugin = MockBukkit.load(SlimefunPlugin.class);
        TestUtilities.registerDefaultTags(server);
    }

    @AfterAll
    public static void unload() {
        MockBukkit.unmock();
    }

    @Test
    @Order(value = 1)
    public void testForExceptions() {
        // Not really ideal but still important to test.
        // Item amount is variable, so we can't test for that.
        // We are really only concerned about any runtime exceptions here.
        Assertions.assertDoesNotThrow(() -> SlimefunItemSetup.setup(plugin));

        // Running it a second time should NOT be allowed.
        Assertions.assertThrows(UnsupportedOperationException.class, () -> SlimefunItemSetup.setup(plugin));
    }

    @Test
    @Order(value = 2)
    public void testWikiSetup() {
        Assertions.assertDoesNotThrow(() -> PostSetup.setupWiki());
    }

    @Test
    @Order(value = 3)
    public void testCategoryTranslations() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/languages/categories_en.yml"), StandardCharsets.UTF_8))) {
            FileConfiguration config = YamlConfiguration.loadConfiguration(reader);
            
            for (Category category : SlimefunPlugin.getRegistry().getCategories()) {
                String path = category.getKey().getNamespace() + '.' + category.getKey().getKey();
                Assertions.assertTrue(config.contains(path));
            }
        }
    }
}
