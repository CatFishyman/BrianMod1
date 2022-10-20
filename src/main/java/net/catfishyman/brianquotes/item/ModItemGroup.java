package net.catfishyman.brianquotes.item;

import net.catfishyman.brianquotes.BrianQuotes;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;


public class ModItemGroup {
    public static final ItemGroup BRIAN_MOD = FabricItemGroupBuilder.build(
            new Identifier(BrianQuotes.MOD_ID, "modded"), () -> new ItemStack(ModItems.BRI_BRI_BUG)
    );
}
