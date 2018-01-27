/*    */ package com.hyeanmod.proxy;
import com.example.examplemod.mainRegistry;

import entity.EntityAardwolf;
import entity.EntityAfricanElephant;
import entity.EntityAfricanLeopard;
import entity.EntityAfricanWildDog;
import entity.EntityBlackBackedJackal;
import entity.EntityBrownHyena;
import entity.EntityChacmaBaboon;
import entity.EntityCheetah;
import entity.EntityLion;
import entity.EntityLioness;
import entity.EntityReticulatedGiraffe;
/*    */ 
/*    */ import entity.EntitySpottedHyena;
import entity.EntityStripedHyena;
import entity.EntityTopi;
/*    */ import entity.EntityWildebeest;
import entity.ModelAardwolf;
import entity.ModelAfricanElephant;
import entity.ModelAfricanLeopard;
import entity.ModelAfricanWildDog;
import entity.ModelBlackBackedJackal;
import entity.ModelBrownHyena;
import entity.ModelChacmaBaboon;
import entity.ModelCheetah;
import entity.ModelLion;
import entity.ModelLioness;
import entity.ModelReticulatedGiraffe;
/*    */ import entity.ModelSpottedHyena;
import entity.ModelStripedHyena;
import entity.ModelTopi;
/*    */ import entity.ModelWildebeest;
import entity.RenderAardwolf;
import entity.RenderAfricanElephant;
import entity.RenderAfricanLeopard;
import entity.RenderAfricanWildDog;
import entity.RenderBlackBackedJackal;
import entity.RenderBrownHyena;
import entity.RenderChacmaBaboon;
import entity.RenderCheetah;
import entity.RenderLion;
import entity.RenderLioness;
import entity.RenderReticulatedGiraffe;
/*    */ import entity.RenderSpottedHyena;
import entity.RenderStripedHyena;
import entity.RenderTopi;
/*    */ import entity.RenderWildebeest;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.renderer.block.model.ModelResourceLocation;
/*    */ import net.minecraft.client.renderer.entity.RenderManager;
/*    */ import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
/*    */ import net.minecraftforge.client.model.ModelLoader;
/*    */ import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ 
/*    */ public class ClientProxy
/*    */   extends CommonProxy
/*    */ {
		public void registerItemRenderer(Item item, int meta, String id) {
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(mainRegistry.MODID + ":" + id, "inventory"));
}	
/*    */ 
/*    */ 
/*    */    @SubscribeEvent
public static void registerModels(ModelRegistryEvent event) {
}
/*    */ }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 


/* Location:              C:\Users\jhwol\Downloads\release2 wildebeest-deobf.jar!\com\hyeanmod\proxy\ClientProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */