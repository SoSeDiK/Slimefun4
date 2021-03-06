package io.github.thebusybiscuit.slimefun4.testing.tests.guide;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import be.seeseemelk.mockbukkit.MockBukkit;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideLayout;
import io.github.thebusybiscuit.slimefun4.implementation.guide.BookSlimefunGuide;
import me.mrCookieSlime.Slimefun.SlimefunPlugin;

public class TestBookSlimefunGuide {

    @BeforeAll
    public static void load() {
        MockBukkit.mock();
        MockBukkit.load(SlimefunPlugin.class);
    }

    @AfterAll
    public static void unload() {
        MockBukkit.unmock();
    }

    @Test
    public void testBasicGetters() {
        BookSlimefunGuide guide = new BookSlimefunGuide();

        Assertions.assertEquals(SlimefunGuideLayout.BOOK, guide.getLayout());
        Assertions.assertTrue(guide.isSurvivalMode());
    }

}
