package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Slime;

public final class SMGItems {

    private SMGItems() {}

    public static final ItemGroup SMG_ITEM_CATEGORY = new ItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "simplematerialgenerators"),
        new CustomItemStack(Material.SMOOTH_STONE, "&9Simple Material Generators")
    );

    public static final SlimefunItemStack SMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
        "SMG_GENERATOR_MULTIBLOCK",
        Material.BEDROCK,
        "&9Generator multiblock",
        "",
        "&dBuild any of this addon's",
        "&dgenerators like this.",
        "&aThey will only output to a chest",
        "&adirectly above it."
    );
	
	/*	Template for adding more generator items
	public static final SlimefunItemStack SMG_GENERATOR_ = new SlimefunItemStack(
		"SMG_GENERATOR_",
		Material.,
		"& generator",
		"&6Rate: &e ticks",
		"",
		"&9&oSimpleMaterialGenerators"
	);
	*/

    public static final SlimefunItemStack SMG_GENERATOR_COBBLESTONE = new SlimefunItemStack(
        "SMG_GENERATOR_COBBLESTONE",
        Material.COBBLESTONE,
        "&7Cobblestone generator",
        "&6Rate: &e4 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_STONE_BROKEN",
        Material.STONE,
        "&7Stone generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_STONE",
        Material.STONE,
        "&7Stone generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE_BROKEN",
        Material.SMOOTH_STONE,
        "&7Smooth stone generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE",
        Material.SMOOTH_STONE,
        "&7Smooth stone generator",
        "&6Rate: &e12 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DIORITE = new SlimefunItemStack(
            "SMG_GENERATOR_DIORITE",
            Material.DIORITE,
            "&7Diorite generator",
            "&6Rate: &e4 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ANDESITE = new SlimefunItemStack(
            "SMG_GENERATOR_ANDESITE",
            Material.ANDESITE,
            "&7Andesite generator",
            "&6Rate: &e4 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRANITE = new SlimefunItemStack(
            "SMG_GENERATOR_GRANITE",
            Material.GRANITE,
            "&7Granite generator",
            "&6Rate: &e4 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_BLACKSTONE = new SlimefunItemStack(
            "SMG_GENERATOR_BLACKSTONE",
            Material.BLACKSTONE,
            "&7Blackstone generator",
            "&6Rate: &e4 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DEEPSLATE = new SlimefunItemStack(
            "SMG_GENERATOR_DEEPSLATE",
            Material.COBBLED_DEEPSLATE,
            "&7Cobbled deepslate generator",
            "&6Rate: &e4 ticks",
            "",
            "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_CLAY_BROKEN = new SlimefunItemStack(
            "SMG_GENERATOR_CLAY_BROKEN",
            Material.CLAY,
            "&7Clay generator &8(Broken)",
            "&8Needs to be repaired",
            "",
            "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_CLAY = new SlimefunItemStack(
            "SMG_GENERATOR_CLAY",
            Material.CLAY,
            "&7Clay generator",
            "&6Rate: &e8 ticks",
            "",
            "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_TERRACOTTA = new SlimefunItemStack(
            "SMG_GENERATOR_TERRACOTTA",
            Material.TERRACOTTA,
            "&7Terracotta generator",
            "&6Rate: &e10 ticks",
            "",
            "&9&oSimpleMaterialsGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL_BROKEN",
        Material.GRAVEL,
        "&7Gravel generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL",
        Material.ANDESITE,
        "&7Gravel generator",
        "&6Rate: &e6 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SAND_BROKEN",
        Material.SAND,
        "&eSand generator &8(Broken)",
        "&8Needs to be repaired",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SAND",
        Material.SANDSTONE,
        "&eSand generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GLASS = new SlimefunItemStack(
        "SMG_GENERATOR_GLASS",
        Material.GLASS,
        "&fGlass generator",
        "&6Rate: &e12 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_NETHERRACK = new SlimefunItemStack(
        "SMG_GENERATOR_NETHERRACK",
        Material.NETHERRACK,
        "&cNetherrack generator",
        "&6Rate: &e6 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SOUL_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SOUL_SAND",
        Material.SOUL_SAND,
        "&8Soul sand generator",
        "&6Rate: &e8 ticks",
        "",
        "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BADLY_FORMED = new SlimefunItemStack(
            "SMG_GENERATOR_REDSTONE_BADLY_FORMED",
            Material.REDSTONE_BLOCK,
            "&cRedstone generator &8(Badly Formed)",
            "&8Needs to be reformed",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BROKEN = new SlimefunItemStack(
            "SMG_GENERATOR_REDSTONE_BROKEN",
            Material.REDSTONE_BLOCK,
            "&cRedstone generator &8(Broken)",
            "&8Needs to be repaired",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE = new SlimefunItemStack(
            "SMG_GENERATOR_REDSTONE",
            Material.REDSTONE_BLOCK,
            "&cRedstone generator",
            "&6Rate: &e24 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DEEPSLATE_REDSTONE = new SlimefunItemStack(
            "SMG_GENERATOR_DEEPSLATE_REDSTONE",
            Material.REDSTONE_BLOCK,
            "&cDeepslate redstone generator",
            "&6Rate: &e24 ticks",
            "&4Same as redstone generator but made with deepslate ore",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_LAPIS_BADLY_FORMED = new SlimefunItemStack(
            "SMG_GENERATOR_LAPIS_BADLY_FORMED",
            Material.LAPIS_BLOCK,
            "&9Lapis generator &8(Badly formed)",
            "&8Needs to be reformed",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_LAPIS_BROKEN = new SlimefunItemStack(
            "SMG_GERNERATOR_LAPIS_BROKEN",
            Material.LAPIS_BLOCK,
            "&9Lapis generator &8(Broken)",
            "&8Needs to be repaired",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_LAPIS = new SlimefunItemStack(
            "SMG_GENERATOR_LAPIS",
            Material.LAPIS_BLOCK,
            "&9Lapis generator",
            "&6Rate: &e24 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DEEPSLATE_LAPIS = new SlimefunItemStack(
            "SMG_GENERATOR_DEEPSLATE_LAPIS",
            Material.LAPIS_BLOCK,
            "&9Deepslate lapis generator",
            "&6Rate: &e24 ticks",
            "&4Same as lapis generator but made with deepslate ore",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_COAL_BADLY_FORMED = new SlimefunItemStack(
            "SMG_GENERATOR_COAL_BADLY_FORMED",
            Material.COAL_BLOCK,
            "&8Coal generator (Badly formed)",
            "&8Needs to be reformed",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_COAL_BROKEN = new SlimefunItemStack(
            "SMG_GENERATOR_COAL_BROKEN",
            Material.COAL_BLOCK,
            "&8Coal generator (Broken)",
            "&8Needs to be repaired",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_COAL = new SlimefunItemStack(
            "SMG_GENERATOR_COAL",
            Material.COAL_BLOCK,
            "&8Coal generator",
            "&6Rate: &e24 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DEEPSLATE_COAL = new SlimefunItemStack(
            "SMG_GENERATOR_DEEPSLATE_COAL",
            Material.COAL_BLOCK,
            "&8Deepslate coal generator",
            "&6Rate: &e24 ticks",
            "&4Same as coal generator but made with deepslate ore",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_AMETHYST = new SlimefunItemStack(
            "SMG_GENERATOR_AMETHYST",
            Material.AMETHYST_BLOCK,
            "&dAmethyst generator",
            "&6Rate: &e18 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BADLY_FORMED = new SlimefunItemStack(
            "SMG_GENERATOR_OBSIDIAN_BADLY_FORMED",
            Material.OBSIDIAN,
            "&5Obsidian generator &8(Badly Formed)",
            "&8Needs to be reformed",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BROKEN = new SlimefunItemStack(
            "SMG_GENERATOR_OBSIDIAN_BROKEN",
            Material.OBSIDIAN,
            "&5Obsidian generator &8(Broken)",
            "&8Needs to be repaired",
            "",
            "&9&oSimpleMaterialGenerators"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN = new SlimefunItemStack(
            "SMG_GENERATOR_OBSIDIAN",
            Material.OBSIDIAN,
            "&5Obsidian generator",
            "&6Rate: &e128 ticks",
            "",
            "&9&oSimpleMaterialGenerators"
    );
}