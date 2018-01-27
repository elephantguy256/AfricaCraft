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
/*    */   public static SoundEvent LION_MOAN;
/*    */   public static SoundEvent ZEBRA;
/*    */   public static SoundEvent ZEBRA2;
/*    */   public static SoundEvent ELEPHANT;
/*    */   public static SoundEvent SPOTTED_HYENA;
/*    */   public static SoundEvent SPOTTED_HYENA2;
/*    */   public static SoundEvent LYCAON;
/*    */   public static SoundEvent LYCAON2;
/*    */   public static SoundEvent LIONROAR;
/*    */   public static SoundEvent LEOPARD;
/*    */   public static SoundEvent RATEL;
/*    */   public static SoundEvent RATEL_HURT;
/*    */   public static SoundEvent Rhino;
/*    */   public static SoundEvent GORILLA;
/*    */   public static SoundEvent LEOPARD_DEATH;
/*    */   public static SoundEvent LEOPARD_ATTACK;
/*    */   public static SoundEvent CHEETAH;
/*    */   public static SoundEvent BABOON;
		   public static SoundEvent WILDEBEEST;
/*    */   
/*    */   public static void registerSounds()
/*    */   {
/* 35 */     LION = registerSound("mob.lion.roar");
/* 36 */     LIONROAR = registerSound("mob.lion.roar2");
/* 37 */     LION_MOAN = registerSound("mob.lion.hurt");
/* 38 */     ZEBRA = registerSound("mob.zebra.wat");
/* 39 */     ZEBRA2 = registerSound("mob.zebra.wat2");
/* 40 */     ELEPHANT = registerSound("mob.elephant.trumpet");
/* 41 */     SPOTTED_HYENA = registerSound("mob.hyena.cackle");
/* 42 */     SPOTTED_HYENA2 = registerSound("mob.hyena.cackle2");
/* 43 */     LYCAON = registerSound("mob.africanwilddog.bark");
/* 44 */     LYCAON2 = registerSound("mob.africanwilddog.bark2");
/* 45 */     LEOPARD = registerSound("mob.leopard.growl");
/* 46 */     LEOPARD_DEATH = registerSound("mob.leopard.death");
/* 47 */     LEOPARD_ATTACK = registerSound("mob.leopard.attack");
/* 48 */     RATEL_HURT = registerSound("mob.ratel.hurt");
/* 49 */     RATEL = registerSound("mob.ratel.aggro");
/* 50 */     CHEETAH = registerSound("mob.cheetah.aggro");
/* 51 */     Rhino = registerSound("mob.rhino.grunt");
/* 52 */     GORILLA = registerSound("mob.gorilla.roar");
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