package net.catfishyman.brianquotes.item.Custom;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
public class BriBri_bugItem extends Item {

    public BriBri_bugItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult <ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient() && hand == Hand.MAIN_HAND) {
            output(user);
            user.getItemCooldownManager().set(this, 20);
        }

        return null;
    }

    String[] quotes = {"<BriBri_bug> §o I'm not a fem-boy, uwu", "<BriBri_bug> §o Will you gimme a kiss", "<BriBri_bug> §o moan","<BriBri_bug> §o I am going to kiss you",
            "<BriBri_bug>§o Thats Racially motivated"};
    public void output(PlayerEntity player){
        player.sendMessage(Text.literal(quotes[getRandomNumber()]));
    }

    private int getRandomNumber() {
        return Random.createLocal().nextInt(5);

    }



}
