package net.catfishyman.brianquotes.item.Custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;


public class DayquilItem extends Item {

    public DayquilItem(Settings settings) {
        super(settings);
    }
    int popped = 1;
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
        if (popped >= 17){
            user.sendMessage(Text.literal("I am high on " + popped + " DayQuils"));
        }
        else {
            user.sendMessage(Text.literal("I have had " + popped + " DayQuils"));
        }
        popped++;
        user.getItemCooldownManager().set(this, 20);

    }
     return super.use(world, user, hand);
}}
