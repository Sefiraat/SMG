package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.waleks.simplematerialgenerators.items.BrokenGenerator;
import me.waleks.simplematerialgenerators.items.GeneratorMultiblock;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class SMGItemSetup {

    private SMGItemSetup() {}

    public static void setup(@Nonnull SimpleMaterialGenerators plugin) {
        new GeneratorMultiblock(SMGItems.SMG_ITEM_CATEGORY, SMGItems.SMG_GENERATOR_MULTIBLOCK).register(plugin);

		/*	Template for adding more items
		new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
			SMGItems.SMG_GENERATOR_,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				null, null, null,
				null, null, null,
		 		null, null, null
		 	})
		.setItem(Material.)
		.setRate(1)
		.register(plugin);
		*/

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_COBBLESTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE),
                new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.IRON_PICKAXE), new ItemStack(Material.WATER_BUCKET),
                new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE)
            }, 4)
            .setItem(Material.COBBLESTONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.STONE), SlimefunItems.SOLDER_INGOT, new ItemStack(Material.STONE),
                SlimefunItems.SOLDER_INGOT, SMGItems.SMG_GENERATOR_STONE_BROKEN, SlimefunItems.SOLDER_INGOT,
                new ItemStack(Material.STONE), SlimefunItems.SOLDER_INGOT, new ItemStack(Material.STONE)
            }, 8)
            .setItem(Material.STONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_STONE, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE,
            RecipeType.SMELTERY,
            new ItemStack[] {
                new ItemStack(Material.SMOOTH_STONE), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SMOOTH_STONE),
                new ItemStack(Material.IRON_BARS), SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN, new ItemStack(Material.IRON_BARS),
                new ItemStack(Material.SMOOTH_STONE), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SMOOTH_STONE)
            }, 12)
            .setItem(Material.SMOOTH_STONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL_BROKEN,
            RecipeType.GRIND_STONE,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.STONE_BRICKS), SlimefunItems.BILLON_INGOT, new ItemStack(Material.STONE_BRICKS),
                SlimefunItems.BILLON_INGOT, SMGItems.SMG_GENERATOR_GRAVEL_BROKEN, SlimefunItems.BILLON_INGOT,
                new ItemStack(Material.STONE_BRICKS), SlimefunItems.BILLON_INGOT, new ItemStack(Material.STONE_BRICKS)
            }, 6)
            .setItem(Material.GRAVEL)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_GRAVEL, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.SANDSTONE), SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.SANDSTONE),
                SlimefunItems.DURALUMIN_INGOT, SMGItems.SMG_GENERATOR_SAND_BROKEN, SlimefunItems.DURALUMIN_INGOT,
                new ItemStack(Material.SANDSTONE), SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.SANDSTONE)
            }, 8)
            .setItem(Material.SAND)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GLASS,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SlimefunItems.BRONZE_INGOT, SlimefunItems.GOLD_8K, SlimefunItems.BRONZE_INGOT,
                SlimefunItems.BRASS_INGOT, SMGItems.SMG_GENERATOR_SAND, SlimefunItems.BRASS_INGOT,
                null, null, null
            }, 12)
            .setItem(Material.GLASS)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_NETHERRACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT,
                SMGItems.SMG_GENERATOR_STONE, new ItemStack(Material.LAVA_BUCKET), SMGItems.SMG_GENERATOR_STONE,
                SMGItems.SMG_GENERATOR_STONE, SlimefunItems.COMPOSTER, SMGItems.SMG_GENERATOR_STONE
            }, 6)
            .setItem(Material.NETHERRACK)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SOUL_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.STEEL_INGOT, new ItemStack(Material.SPIDER_EYE), SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.BONE),
                SMGItems.SMG_GENERATOR_SAND, SlimefunItems.COMPOSTER, SMGItems.SMG_GENERATOR_SAND
            }, 8)
            .setItem(Material.SOUL_SAND)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_REDSTONE_BADLY_FORMED,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                    SMGItems.SMG_GENERATOR_SAND, new ItemStack(Material.REDSTONE), SMGItems.SMG_GENERATOR_GRAVEL,
                    null, null, null,
                    null, null, null
                })
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                RecipeType.ORE_CRUSHER,
                new ItemStack[] {
                    SMGItems.SMG_GENERATOR_REDSTONE_BADLY_FORMED, null, null,
                    null, null, null,
                    null, null, null
                })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_REDSTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, new ItemStack(Material.REDSTONE_ORE), SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
            }, 24)
            .setItem(Material.REDSTONE)
            .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_DEEPSLATE_REDSTONE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, new ItemStack(Material.DEEPSLATE_REDSTONE_ORE), SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                        SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                        SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
                }, 24)
                .setItem(Material.REDSTONE)
                .register(plugin);

        new BrokenGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_LAPIS_BADLY_FORMED,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_SAND, new ItemStack(Material.LAPIS_LAZULI), SMGItems.SMG_GENERATOR_GRAVEL,
                        null, null, null,
                        null, null, null
                })
                .register(plugin);

        new BrokenGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
                RecipeType.ORE_CRUSHER,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_LAPIS_BADLY_FORMED, null, null,
                        null, null, null,
                        null, null, null
                })
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_LAPIS,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_LAPIS_BROKEN, new ItemStack(Material.LAPIS_ORE), SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
                        SMGItems.SMG_GENERATOR_LAPIS_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
                        SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
                }, 24)
                .setItem(Material.LAPIS_LAZULI)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_DEEPSLATE_LAPIS,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_LAPIS_BROKEN, new ItemStack(Material.DEEPSLATE_LAPIS_ORE), SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
                        SMGItems.SMG_GENERATOR_LAPIS_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_LAPIS_BROKEN,
                        SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
                }, 24)
                .setItem(Material.LAPIS_LAZULI)
                .register(plugin);

        new BrokenGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_COAL_BADLY_FORMED,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                    SMGItems.SMG_GENERATOR_STONE, null, SMGItems.SMG_GENERATOR_NETHERRACK,
                        null, null, null,
                        null, null, null
                })
                .register(plugin);

        new BrokenGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_COAL_BROKEN,
                RecipeType.ORE_CRUSHER,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_COAL_BADLY_FORMED, null, null,
                        null, null, null,
                        null, null, null
                })
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_COAL,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_COAL_BROKEN, new ItemStack(Material.COAL_ORE), SMGItems.SMG_GENERATOR_COAL_BROKEN,
                        SMGItems.SMG_GENERATOR_COAL_BROKEN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_COAL_BROKEN,
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.COMPRESSED_CARBON
                }, 24)
                .setItem(Material.COAL)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_DEEPSLATE_COAL,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_COAL_BROKEN, new ItemStack(Material.DEEPSLATE_COAL_ORE), SMGItems.SMG_GENERATOR_COAL_BROKEN,
                        SMGItems.SMG_GENERATOR_COAL_BROKEN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_COAL_BROKEN,
                        SlimefunItems.COMPRESSED_CARBON, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.COMPRESSED_CARBON
                }, 24)
                .setItem(Material.COAL)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_AMETHYST,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_OBSIDIAN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_GLASS,
                        null, null, null,
                        null, null, null
                }, 18)
                .setItem(Material.AMETHYST_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_DIORITE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.DIORITE), null,
                        null, null, null,
                        null, null, null
                }, 4)
                .setItem(Material.DIORITE)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_ANDESITE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.ANDESITE), null,
                        null, null, null,
                        null, null, null
                }, 4)
                .setItem(Material.ANDESITE)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_GRANITE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_COBBLESTONE, new ItemStack(Material.GRANITE), null,
                        null, null, null,
                        null, null, null
                }, 4)
                .setItem(Material.GRANITE)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_BLACKSTONE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_NETHERRACK, new ItemStack(Material.BLACKSTONE), null,
                        null, null, null,
                        null, null, null
                }, 4)
                .setItem(Material.BLACKSTONE)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_DEEPSLATE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_STONE, new ItemStack(Material.COBBLED_DEEPSLATE), null,
                        null, null, null,
                        null, null, null
                }, 4)
                .setItem(Material.COBBLED_DEEPSLATE)
                .register(plugin);

        new BrokenGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_CLAY_BROKEN,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_SAND, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_SAND,
                        SMGItems.SMG_GENERATOR_GRAVEL, new ItemStack(Material.WATER_BUCKET), SMGItems.SMG_GENERATOR_GRAVEL,
                        SMGItems.SMG_GENERATOR_SAND, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_SAND
                })
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_CLAY,
                RecipeType.SMELTERY,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_CLAY_BROKEN, null, null,
                        null, null, null,
                        null, null, null
                }, 8)
                .setItem(Material.CLAY)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_TERRACOTTA,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[]{
                        SMGItems.SMG_GENERATOR_CLAY, new ItemStack(Material.TERRACOTTA), SMGItems.SMG_GENERATOR_CLAY,
                        new ItemStack(Material.TERRACOTTA), new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.TERRACOTTA),
                    SMGItems.SMG_GENERATOR_CLAY, new ItemStack(Material.TERRACOTTA), SMGItems.SMG_GENERATOR_CLAY
                }, 10)
                .setItem(Material.TERRACOTTA)
                .register(plugin);


        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN_BADLY_FORMED,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, SMGItems.SMG_GENERATOR_STONE,
                null, SlimefunItems.COBALT_PICKAXE, null,
                SMGItems.SMG_GENERATOR_SMOOTH_STONE, null, SMGItems.SMG_GENERATOR_NETHERRACK
            })
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_OBSIDIAN_BADLY_FORMED, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.WATER_BUCKET), SlimefunItems.REINFORCED_ALLOY_INGOT,
                SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN,
                SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN, new ItemStack(Material.LAVA_BUCKET), SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN
            }, 128)
            .setItem(Material.OBSIDIAN)
            .register(plugin);
    }
}
