/*     */ package entity;
/*     */ import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIAvoidEntity;
/*     */ import net.minecraft.entity.ai.EntityAIFollowParent;
/*     */ import net.minecraft.entity.ai.EntityAILookIdle;
/*     */ import net.minecraft.entity.ai.EntityAIMate;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.ai.EntityAIWander;
/*     */ import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
/*     */ import net.minecraft.util.math.BlockPos;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ public class EntityTopi extends EntityAnimal
/*     */ {
/*     */   public EntityTopi(World worldIn)
/*     */   {
/*  37 */     super(worldIn);
/*  38 */     setSize(0.9F, 1.4F);
/*     */   }

public int entityDeathTime = 100000;
protected boolean dead;
protected int recentlyHit;
protected EntityPlayer attackingPlayer;
private int scoreValue;
private String s;
private boolean isentityDead;
/**
/**
 * Called by the /kill command.
 */


protected void onDeathUpdate()
{
    ++this.deathTime;

    if (this.deathTime == 1000000)
    {
        if (!this.worldObj.isRemote && (this.isPlayer() || this.recentlyHit > 0 && this.canDropLoot() && this.worldObj.getGameRules().getBoolean("doMobLoot")))
        {
            int i = this.getExperiencePoints(this.attackingPlayer);
            i = net.minecraftforge.event.ForgeEventFactory.getExperienceDrop(this, this.attackingPlayer, i);
            while (i > 0)
            {
                int j = EntityXPOrb.getXPSplit(i);
                i -= j;
                this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, j));
            }
        }

        this.setDead();

        for (int k = 0; k < 20; ++k)
        {
            double d2 = this.rand.nextGaussian() * 0.02D;
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d2, d0, d1, new int[0]);
        }
    }
}




public boolean writeToNBTOptional(NBTTagCompound compound)
{
    String s = this.getEntityString();

    if (!this.isentityDead && s != null && !this.isRiding())
    {
        compound.setString("id", s);
        this.writeToNBT(compound);
        return true;
    }
    else
    {
        return false;
    }
}




/**
 * (abstract) Protected helper method to read subclass entity data from NBT.
 *
 
/**
 * Called when the mob's health reaches 0.
 * 
 * 
 */


public void onDeath(DamageSource cause)
{
    if (net.minecraftforge.common.ForgeHooks.onLivingDeath(this, cause)) return;
    if (!this.dead)
    {
        Entity entity = cause.getEntity();
        EntityLivingBase entitylivingbase = this.getAttackingEntity();

        if (this.scoreValue >= 0 && entitylivingbase != null)
        {
            entitylivingbase.addToPlayerScore(this, this.scoreValue);
        }

        if (entity != null)
        {
            entity.onKillEntity(this);
        }

        this.dead = true;
        this.getCombatTracker().reset();

        if (!this.worldObj.isRemote)
        {
            int i = net.minecraftforge.common.ForgeHooks.getLootingLevel(this, entity, cause);

            captureDrops = true;
            capturedDrops.clear();

            if (this.canDropLoot() && this.worldObj.getGameRules().getBoolean("doMobLoot"))
            {
                boolean flag = this.recentlyHit > 0;
                this.dropLoot(flag, i, cause);
            }

            captureDrops = false;

            if (!net.minecraftforge.common.ForgeHooks.onLivingDrops(this, cause, capturedDrops, i, recentlyHit > 0))
            {
                for (EntityItem item : capturedDrops)
                {
                    worldObj.spawnEntityInWorld(item);
                }
            }
        }

        this.worldObj.setEntityState(this, (byte)3);
    }
}
/*     */   
/*     */   protected void func_184651_r()
/*     */   {
/*  48 */     this.tasks.addTask(0, new net.minecraft.entity.ai.EntityAISwimming(this));
/*  49 */     this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
/*  50 */     this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
/*  51 */     this.tasks.addTask(3, new net.minecraft.entity.ai.EntityAITempt(this, 1.25D, Items.WHEAT, false));
/*  52 */     this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
/*  53 */     this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
/*  55 */     this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntitySpottedHyena.class, 8.0F, 2.2D, 2.2D));
/*  55 */     this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityLion.class, 8.0F, 2.2D, 2.2D));
/*  55 */     this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityLioness.class, 8.0F, 2.2D, 2.2D));
/*  55 */     this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityAfricanWildDog.class, 8.0F, 2.2D, 2.2D));
/*  55 */     this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityAfricanLeopard.class, 8.0F, 2.2D, 2.2D));
/*  55 */     this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityCheetah.class, 8.0F, 2.2D, 2.2D));
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
	/* 125 */     return new EntityTopi(this.worldObj);
}
}