/*    */ package com.hyeanmod.proxy;
/*    */ 
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SoundEvents2
/*    */ {
/*    */   public static SoundEvent LION;
/*    */   public static SoundEvent ZEBRA;
/*    */   public static SoundEvent ELEPHANT;
/*    */   public static SoundEvent SPOTTED_HYENA;
/*    */   public static SoundEvent SPOTTED_HYENA2;
/*    */   public static SoundEvent LYCAON;
/*    */   public static SoundEvent LYCAON2;
/*    */   public static SoundEvent LEOPARD;
/*    */   public static SoundEvent CHEETAH;
/*    */   public static SoundEvent BABOON;
		   public static SoundEvent WILDEBEEST;
		   public static SoundEvent LIONPAIN;
/*    */   
/*    */   public static void registerSounds()
/*    */   {
/* 35 */     LION = registerSound("mob.lion.roar");
/* 35 */     LIONPAIN= registerSound("mob.lion.hurt");
/* 38 */     ZEBRA = registerSound("mob.zebra.wat");
/* 40 */     ELEPHANT = registerSound("mob.elephant.trumpet");
/* 41 */     SPOTTED_HYENA = registerSound("mob.hyena.cackle");
/* 42 */     SPOTTED_HYENA2 = registerSound("mob.hyena.cackle2");
/* 43 */     LYCAON = registerSound("mob.africanwilddog.bark");
/* 44 */     LYCAON2 = registerSound("mob.africanwilddog.bark2");
/* 45 */     LEOPARD = registerSound("mob.leopard.growl");
/* 50 */     CHEETAH = registerSound("mob.cheetah.aggro");
/* 53 */     BABOON = registerSound("mob.baboon.bark");
/* 44 */     WILDEBEEST = registerSound("mob.wildebeest.grunt");
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   private static SoundEvent registerSound(String soundName)
/*    */   {
/* 56 */     ResourceLocation soundID = new ResourceLocation("wildanimals", soundName);
/* 57 */     return (SoundEvent)GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
/*    */   }
/*    */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\SoundEvents2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */