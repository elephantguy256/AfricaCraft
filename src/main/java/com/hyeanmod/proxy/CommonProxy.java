/*    */ package com.hyeanmod.proxy;
/*    */ 
/*    */ import com.example.examplemod.ACConfig;

import deadbodies.EntityDeath;
import deadbodies.RenderDead;
import entity.EntityAardwolf;
import entity.EntityAfricanElephant;
import entity.EntityAfricanLeopard;
import entity.EntityAfricanWildDog;
import entity.EntityBlackBackedJackal;
import entity.EntityBrownHyena;
import entity.EntityChacmaBaboon;
import entity.EntityCheetah;
import entity.EntityGerenuk;
import entity.EntityLion;
import entity.EntityLioness;
import entity.EntityReticulatedGiraffe;
import entity.EntitySpottedHyena;
import entity.EntityStripedHyena;
import entity.EntityTopi;
import entity.EntityWildebeest;
import entity.RenderAardwolf;
import entity.RenderAfricanElephant;
import entity.RenderAfricanLeopard;
import entity.RenderAfricanWildDog;
import entity.RenderBlackBackedJackal;
import entity.RenderBrownHyena;
import entity.RenderChacmaBaboon;
import entity.RenderCheetah;
import entity.RenderGerenuk;
import entity.RenderLion;
import entity.RenderLioness;
import entity.RenderReticulatedGiraffe;
import entity.RenderSpottedHyena;
import entity.RenderStripedHyena;
import entity.RenderTopi;
import entity.RenderWildebeest;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
/*    */ import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CommonProxy

/*    */ {
	public static boolean displayNameTag = true;
    public static boolean addBonesToCorpse = true;
    public static boolean useLocalSkin = false;
	public static long ticksPerItemDecay = 10 * 60 * 20; // -1 to disable
	public static boolean hurtByEnvironment = false;
	public static boolean hurtByAttacks = false;
	public static boolean hurtByMisc = false;
	public static boolean completelyInvulnerable = false;
	public static float corpseHP = 20;
    
    public static boolean allowCorpseDecay = true;
    public static boolean decayOnlyWhenEmpty = true;
    public static long corpseDecayTime = 3600*20; // in game ticks
	private Configuration config;
/*    */
	private FMLPreInitializationEvent event;   public void preInit(FMLPreInitializationEvent e) {
	}
			
/*    */   
/*    */   public void init(FMLInitializationEvent e)
/*    */   {
/* 17 */     ACConfig.init(e);
/*    */   }

@SubscribeEvent
public static void registerBlocks(RegistryEvent.Register<Block> event) {
}


/*    */   
/*    */   
public void registerRenders() 
{
    // the float parameter passed to the Render class is the shadow size for the entity
//The code below is deprecated, don't have time rn, but it needs to be changed to IRenderFactory instead of RenderingRegistery
    RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
    // RenderingRegistry.registerEntityRenderingHandler(EntityGoldenGoose.class, new RenderGoldenGoose(renderManager, new ModelGoldenGoose(), 0.5F)); // 0.5F is shadow size 
    RenderingRegistry.registerEntityRenderingHandler(EntitySpottedHyena.class, RenderSpottedHyena.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityAfricanElephant.class, RenderAfricanElephant.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityLion.class, RenderLion.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityLioness.class, RenderLioness.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityAfricanLeopard.class, RenderAfricanLeopard.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityCheetah.class, RenderCheetah.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityWildebeest.class, RenderWildebeest.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityStripedHyena.class, RenderStripedHyena.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityAardwolf.class, RenderAardwolf.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityBrownHyena.class, RenderBrownHyena.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityReticulatedGiraffe.class, RenderReticulatedGiraffe.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityTopi.class, RenderTopi.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityAfricanWildDog.class, RenderAfricanWildDog.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityChacmaBaboon.class, RenderChacmaBaboon.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityBlackBackedJackal.class, RenderBlackBackedJackal.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityGerenuk.class, RenderGerenuk.FACTORY);
    RenderingRegistry.registerEntityRenderingHandler(EntityDeath.class, RenderDead.FACTORY);
    }
    
// Mark this method for receiving an FMLEvent (in this case, it's the FMLPreInitializationEvent)
	  
	  public void registerItemRenderer(Item item, int meta, String id) {}

	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}
	}
