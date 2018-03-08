package com.africacraft.item;

import com.example.examplemod.mainRegistry;

import gui.GuiSavannaPedia;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ACItemBook extends Item implements ItemModelProvider{
	 
	 protected String name;
	 
	 public ACItemBook(String name) {
	 this.name = name;
	 setUnlocalizedName(name);
	 setRegistryName(name);
	 //setCreativeTab(TutorialMod.creativeTab); //this is commented out, because we don't have our creative-tab yet.
	 }
	 
	 @Override
	 public void registerItemModel(Item item) {
	 mainRegistry.proxy.registerItemRenderer(this, 0, name);
	 }
	 
	 @Override
	 public ACItemBook setCreativeTab(CreativeTabs tab) {
	 super.setCreativeTab(tab);
	 return this;
	 }

	

	


public ActionResult<ItemStack> onItemRightClick(ItemStack item, World worldIn, EntityPlayer player, EnumHand hand) {
    if (!worldIn.isRemote) {
        player.addChatMessage(new TextComponentString("Right clicked"));
    } else {
        Minecraft.getMinecraft().displayGuiScreen(new GuiSavannaPedia());
    }
    return super.onItemRightClick(item, worldIn, player, hand);
}

public EnumActionResult onItemUse(EntityPlayer playerIn, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
    if (world.getBlockState(pos).getBlock() == Blocks.GRASS) {
        world.setBlockState(pos, Blocks.DIAMOND_BLOCK.getDefaultState());
        return EnumActionResult.SUCCESS;
    }
    return EnumActionResult.PASS;
}
}