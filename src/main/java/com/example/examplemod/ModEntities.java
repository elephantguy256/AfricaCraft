package com.example.examplemod;

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
import entity.EntitySpottedHyena;
import entity.EntityStripedHyena;
import entity.EntityTopi;
import entity.EntityWildebeest;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities
{
  public static void registerEntity()
  {
    int id = 1;
    EntityRegistry.registerModEntity(EntityChacmaBaboon.class, "chacmababoon", id++, mainRegistry.instance, 64, 3, true, 0x63431d, 0xdfb37d);
    EntityRegistry.registerModEntity(EntityBlackBackedJackal.class, "blackbackedjackal", id++, mainRegistry.instance, 64, 3, true, 0x63431d, 0xdfb37d);
    EntityRegistry.registerModEntity(EntitySpottedHyena.class, "spottedHyena", id++, mainRegistry.instance, 64, 3, true, 0xffcc66, 0x7e4e41);
    EntityRegistry.registerModEntity(EntityLion.class, "africanLionMale", id++, mainRegistry.instance, 64, 3, true, 0xe3bd60, 0x63482e);
    EntityRegistry.registerModEntity(EntityLioness.class, "africanLionFemale", id++, mainRegistry.instance, 64, 3, true, 0xe3bd60, 0x63482e);
    EntityRegistry.registerModEntity(EntityAfricanElephant.class, "africanElephant", id++, mainRegistry.instance, 64, 3, true, 0x606060, 0x363535);
    EntityRegistry.registerModEntity(EntityReticulatedGiraffe.class, "reticulatedGiraffe", id++, mainRegistry.instance, 64, 3, true, 0xffb870, 0x662d10);
    EntityRegistry.registerModEntity(EntityAfricanWildDog.class, "africanWildDog", id++, mainRegistry.instance, 64, 3, true, 0xff7129, 0x2f2e2e);
    EntityRegistry.registerModEntity(EntityWildebeest.class, "wildebeest", id++, mainRegistry.instance, 64, 3, true, 0xbf9367, 0x383533);
    EntityRegistry.registerModEntity(EntityStripedHyena.class, "stripedhyena", id++, mainRegistry.instance, 64, 3, true, 0xfbfbfb, 0x313131);
    EntityRegistry.registerModEntity(EntityAfricanLeopard.class, "africanLeopard", id++, mainRegistry.instance, 64, 3, true, 0xd4b793, 0x3e3e3e);
    EntityRegistry.registerModEntity(EntityBrownHyena.class, "brownhyena", id++, mainRegistry.instance, 64, 3, true, 0xfbfbfb, 0x313131);
    EntityRegistry.registerModEntity(EntityTopi.class, "topi", id++, mainRegistry.instance, 64, 3, true, 0xf4cb97, 0xd4d4d4);
    EntityRegistry.registerModEntity(EntityAardwolf.class, "aardwolf", id++, mainRegistry.instance, 64, 3, true, 0xf4cb97, 0xd4d4d4);
    EntityRegistry.registerModEntity(EntityCheetah.class, "cheetah", id++, mainRegistry.instance, 64, 3, true, 0x63431d, 0xdfb37d);
    
    addNaturalSpawns();
  }
  
  public static void addNaturalSpawns()
  {
    EntityRegistry.addSpawn(EntitySpottedHyena.class, 1, 2, 5, EnumCreatureType.AMBIENT, new Biome[] { Biomes.SAVANNA_PLATEAU, Biomes.SAVANNA });
  }
}
