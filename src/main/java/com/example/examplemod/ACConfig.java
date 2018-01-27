/*    */ package com.example.examplemod;
/*    */ 
/*    */ import java.io.File;
/*    */ import net.minecraftforge.common.config.Configuration;
/*    */ import net.minecraftforge.common.config.Property;
/*    */ import net.minecraftforge.fml.common.event.FMLInitializationEvent;
/*    */ 
/*    */ public class ACConfig
/*    */ {
/*    */   public static boolean livingAnimation;
/*    */   public static boolean useVarients;
/*    */   public static boolean shoutout;
/*    */   public static boolean canPoop;
/*    */   public static boolean willAnimalsSpawn;
/*    */   
/*    */   public static void init(FMLInitializationEvent event)
/*    */   {
/* 18 */     Configuration config = new Configuration(new File("config/AfricaCraft/zoofarimod.cfg"));
/* 19 */     config.load();
/* 20 */     livingAnimation = config.get("Animals", "Animate species with animations", false).getBoolean();
/* 21 */     useVarients = config.get("Animals", "Enable so that different animals have different variations", true).getBoolean();
/* 22 */     willAnimalsSpawn = config.get("Animals", "Enable so animals spawn naturally in their habitats", true).getBoolean();
/* 23 */     config.save();
/*    */   }
/*    */ }


/* Location:              C:\Users\jhwol\Downloads\release2 wildebeest-deobf.jar!\com\example\examplemod\ACConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */