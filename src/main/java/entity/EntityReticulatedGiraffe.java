/*     */ package entity;
/*     */ import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
/*     */ import net.minecraft.entity.ai.EntityAIFollowParent;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAIWander;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Items;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ public class EntityReticulatedGiraffe extends EntityAnimal
/*     */ {
/*     */   public EntityReticulatedGiraffe(World worldIn)
/*     */   {
/*  37 */     super(worldIn);
/*  38 */     setSize(0.9F, 1.4F);
/*     */   }
/*     */   
/*     */   protected void func_184651_r()
/*     */   {
/*  48 */     this.tasks.addTask(0, new net.minecraft.entity.ai.EntityAISwimming(this));
/*  49 */     this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
/*  50 */     this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
/*  51 */     this.tasks.addTask(3, new net.minecraft.entity.ai.EntityAITempt(this, 1.25D, Items.WHEAT, false));
/*  52 */     this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
/*  53 */     this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
/*  54 */     this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
/*  55 */     this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntitySpottedHyena.class, 8.0F, 2.2D, 2.2D));
/*  56 */     this.tasks.addTask(7, new EntityAILookIdle(this));
/*     */   }
/*     */   
/*     */   protected void applyEntityAttributes()
/*     */   {
/*  61 */     super.applyEntityAttributes();
/*  62 */     getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
/*  63 */     getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
/*     */   }

/*     */   
/*     */   protected void func_180429_a(BlockPos pos, Block blockIn)
/*     */   {
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   protected float getSoundVolume()
/*     */   {
/*  91 */     return 0.4F;
/*     */   }
/*     */
@Override
public EntityAgeable createChild(EntityAgeable ageable) {
	// TODO Auto-generated method stub
	/* 125 */     return new EntityReticulatedGiraffe(this.worldObj);
}
}