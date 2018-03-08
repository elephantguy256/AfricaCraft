package entity;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCarrot;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveToBlock;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.pathfinding.Path;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDesert;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityGerenuk extends EntityTopi
{
    public EntityGerenuk(World worldIn) {
		super(worldIn);
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
		// TODO Auto-generated constructor stub
	}
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

	private static final DataParameter<Integer> RABBIT_TYPE = EntityDataManager.<Integer>createKey(EntityGerenuk.class, DataSerializers.VARINT);
    private int jumpTicks;
    private int jumpDuration;
    private boolean wasOnGround;
    private int currentMoveTypeDuration;
    private int carrotTicks;
	private EntityAIBase aiTempt;

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

    protected float getJumpUpwardsMotion()
    {
        if (!this.isCollidedHorizontally && (!this.moveHelper.isUpdating() || this.moveHelper.getY() <= this.posY + 0.5D))
        {
            Path path = this.navigator.getPath();

            if (path != null && path.getCurrentPathIndex() < path.getCurrentPathLength())
            {
                Vec3d vec3d = path.getPosition(this);

                if (vec3d.yCoord > this.posY)
                {
                    return 0.5F;
                }
            }

            return this.moveHelper.getSpeed() <= 0.6D ? 0.2F : 0.3F;
        }
        else
        {
            return 0.5F;
        }
    }

    /**
     * Causes this entity to do an upwards motion (jumping).
     */
    protected void jump()
    {
        super.jump();
        double d0 = this.moveHelper.getSpeed();

        if (d0 > 0.0D)
        {
            double d1 = this.motionX * this.motionX + this.motionZ * this.motionZ;

            if (d1 < 0.010000000000000002D)
            {
                this.moveRelative(0.0F, 1.0F, 0.1F);
            }
        }

        if (!this.worldObj.isRemote)
        {
            this.worldObj.setEntityState(this, (byte)1);
        }
    }

    @SideOnly(Side.CLIENT)
    public float setJumpCompletion(float p_175521_1_)
    {
        return this.jumpDuration == 0 ? 0.0F : ((float)this.jumpTicks + p_175521_1_) / (float)this.jumpDuration;
    }

    public void setMovementSpeed(double newSpeed)
    {
        this.getNavigator().setSpeed(newSpeed);
        this.moveHelper.setMoveTo(this.moveHelper.getX(), this.moveHelper.getY(), this.moveHelper.getZ(), newSpeed);
    }


    public void startJumping()
    {
        this.setJumping(true);
        this.jumpDuration = 10;
        this.jumpTicks = 0;
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(RABBIT_TYPE, Integer.valueOf(0));
    }

    public void updateAITasks()
    {
        if (this.currentMoveTypeDuration > 0)
        {
            --this.currentMoveTypeDuration;
        }

        if (this.carrotTicks > 0)
        {
            this.carrotTicks -= this.rand.nextInt(3);

            if (this.carrotTicks < 0)
            {
                this.carrotTicks = 0;
            }
        }

        if (this.onGround)
        {
            if (!this.wasOnGround)
            {
                this.setJumping(false);
                this.checkLandingDelay();
            }

            if (this.getRabbitType() == 99 && this.currentMoveTypeDuration == 0)
            {
                EntityLivingBase entitylivingbase = this.getAttackTarget();

                if (entitylivingbase != null && this.getDistanceSqToEntity(entitylivingbase) < 16.0D)
                {
                    this.calculateRotationYaw(entitylivingbase.posX, entitylivingbase.posZ);
                    this.moveHelper.setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, this.moveHelper.getSpeed());
                    this.startJumping();
                    this.wasOnGround = true;
                }
            }


        this.wasOnGround = this.onGround;
    }
    }
    /**
     * Attempts to create sprinting particles if the entity is sprinting and not in water.
     */
    public void spawnRunningParticles()
    {
    }

    private void calculateRotationYaw(double x, double z)
    {
        this.rotationYaw = (float)(MathHelper.atan2(z - this.posZ, x - this.posX) * (180D / Math.PI)) - 90.0F;
    }

    private void updateMoveTypeDuration()
    {
        if (this.moveHelper.getSpeed() < 2.2D)
        {
            this.currentMoveTypeDuration = 10;
        }
        else
        {
            this.currentMoveTypeDuration = 1;
        }
    }

    private void checkLandingDelay()
    {
        this.updateMoveTypeDuration();
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.jumpTicks != this.jumpDuration)
        {
            ++this.jumpTicks;
        }
        else if (this.jumpDuration != 0)
        {
            this.jumpTicks = 0;
            this.jumpDuration = 0;
            this.setJumping(false);
        }
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30000001192092896D);
    }

    public static void registerFixesRabbit(DataFixer fixer)
    {
        EntityLiving.registerFixesMob(fixer, "Rabbit");
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("RabbitType", this.getRabbitType());
        compound.setInteger("MoreCarrotTicks", this.carrotTicks);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.setRabbitType(compound.getInteger("RabbitType"));
        this.carrotTicks = compound.getInteger("MoreCarrotTicks");
    }
    
    public boolean attackEntityAsMob(Entity entityIn)
    {
        if (this.getRabbitType() == 99)
        {
            this.playSound(SoundEvents.ENTITY_RABBIT_ATTACK, 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
            return entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), 8.0F);
        }
        else
        {
            return entityIn.attackEntityFrom(DamageSource.causeMobDamage(this), 3.0F);
        }
    }

    public SoundCategory getSoundCategory()
    {
        return this.getRabbitType() == 99 ? SoundCategory.HOSTILE : SoundCategory.NEUTRAL;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
        return this.isEntityInvulnerable(source) ? false : super.attackEntityFrom(source, amount);
    }

    @Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTableList.ENTITIES_RABBIT;
    }

    private boolean isRabbitBreedingItem(Item itemIn)
    {
        return itemIn == Items.WHEAT || itemIn == Items.WHEAT || itemIn == Item.getItemFromBlock(Blocks.YELLOW_FLOWER);
    }

    public EntityGerenuk createChild(EntityAgeable ageable)
    {
        EntityGerenuk entityrabbit = new EntityGerenuk(this.worldObj);
        int i = this.getRandomRabbitType();

        if (this.rand.nextInt(20) != 0)
        {
            if (ageable instanceof EntityGerenuk && this.rand.nextBoolean())
            {
                i = ((EntityGerenuk)ageable).getRabbitType();
            }
            else
            {
                i = this.getRabbitType();
            }
        }

        entityrabbit.setRabbitType(i);
        return entityrabbit;
    }

    /**
     * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
     * the animal type)
     */
    public boolean isBreedingItem(@Nullable ItemStack stack)
    {
        return stack != null && this.isRabbitBreedingItem(stack.getItem());
    }

    public int getRabbitType()
    {
        return ((Integer)this.dataManager.get(RABBIT_TYPE)).intValue();
    }

    public void setRabbitType(int rabbitTypeId)
    {
        if (rabbitTypeId == 99)
        {
            this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(8.0D);
            this.tasks.addTask(4, new EntityGerenuk.AIEvilAttack(this));
            this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new Class[0]));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWolf.class, true));

            if (!this.hasCustomName())
            {
                this.setCustomNameTag(I18n.translateToLocal("entity.KillerBunny.name"));
            }
        }

        this.dataManager.set(RABBIT_TYPE, Integer.valueOf(rabbitTypeId));
    }

    /**
     * Called only once on an entity when first time spawned, via egg, mob spawner, natural spawning etc, but not called
     * when entity is reloaded from nbt. Mainly used for initializing attributes and inventory
     */
    @Nullable
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        int i = this.getRandomRabbitType();
        boolean flag = false;

        this.setRabbitType(i);

        if (flag)
        {
            this.setGrowingAge(-24000);
        }

        return livingdata;
    }

    private int getRandomRabbitType()
    {
        Biome biome = this.worldObj.getBiome(new BlockPos(this));
        int i = this.rand.nextInt(100);
        return biome.isSnowyBiome() ? (i < 80 ? 1 : 3) : (biome instanceof BiomeDesert ? 4 : (i < 50 ? 0 : (i < 90 ? 5 : 2)));
    }

    /**
     * Returns true if {@link net.minecraft.entity.passive.EntityRabbit#carrotTicks carrotTicks} has reached zero
     */
    private boolean isCarrotEaten()
    {
        return this.carrotTicks == 0;
    }

    protected void createEatingParticles()
    {
        BlockCarrot blockcarrot = (BlockCarrot)Blocks.CARROTS;
        IBlockState iblockstate = blockcarrot.withAge(blockcarrot.getMaxAge());
        this.worldObj.spawnParticle(EnumParticleTypes.BLOCK_DUST, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 0.5D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, 0.0D, 0.0D, 0.0D, new int[] {Block.getStateId(iblockstate)});
        this.carrotTicks = 40;
    }

    @SideOnly(Side.CLIENT)
    public void handleStatusUpdate(byte id)
    {
        if (id == 1)
        {
            this.createRunningParticles();
            this.jumpDuration = 10;
            this.jumpTicks = 0;
        }
        else
        {
            super.handleStatusUpdate(id);
        }
    }

    public void notifyDataManagerChange(DataParameter<?> key)
    {
        super.notifyDataManagerChange(key);
    }

    static class AIAvoidEntity<T extends Entity> extends EntityAIAvoidEntity<T>
        {
            private final EntityGerenuk entityInstance;

            public AIAvoidEntity(EntityGerenuk rabbit, Class<T> p_i46403_2_, float p_i46403_3_, double p_i46403_4_, double p_i46403_6_)
            {
                super(rabbit, p_i46403_2_, p_i46403_3_, p_i46403_4_, p_i46403_6_);
                this.entityInstance = rabbit;
            }

            /**
             * Returns whether the EntityAIBase should begin execution.
             */
            public boolean shouldExecute()
            {
                return this.entityInstance.getRabbitType() != 99 && super.shouldExecute();
            }
        }

    static class AIEvilAttack extends EntityAIAttackMelee
        {
            public AIEvilAttack(EntityGerenuk rabbit)
            {
                super(rabbit, 1.4D, true);
            }

            protected double getAttackReachSqr(EntityLivingBase attackTarget)
            {
                return (double)(4.0F + attackTarget.width);
            }
        }

    static class AIPanic extends EntityAIPanic
        {
            private final EntityGerenuk theEntity;

            public AIPanic(EntityGerenuk rabbit, double speedIn)
            {
                super(rabbit, speedIn);
                this.theEntity = rabbit;
            }

            /**
             * Updates the task
             */
            public void updateTask()
            {
                super.updateTask();
                this.theEntity.setMovementSpeed(this.speed);
            }
        }

    static class AIRaidFarm extends EntityAIMoveToBlock
        {
            private final EntityGerenuk rabbit;
            private boolean wantsToRaid;
            private boolean canRaid;

            public AIRaidFarm(EntityGerenuk rabbitIn)
            {
                super(rabbitIn, 0.699999988079071D, 16);
                this.rabbit = rabbitIn;
            }

            /**
             * Returns whether the EntityAIBase should begin execution.
             */
            public boolean shouldExecute()
            {
                if (this.runDelay <= 0)
                {
                    if (!this.rabbit.worldObj.getGameRules().getBoolean("mobGriefing"))
                    {
                        return false;
                    }

                    this.canRaid = false;
                    this.wantsToRaid = this.rabbit.isCarrotEaten();
                    this.wantsToRaid = true;
                }

                return super.shouldExecute();
            }

            /**
             * Returns whether an in-progress EntityAIBase should continue executing
             */
            public boolean continueExecuting()
            {
                return this.canRaid && super.continueExecuting();
            }

            /**
             * Execute a one shot task or start executing a continuous task
             */
            public void startExecuting()
            {
                super.startExecuting();
            }

            /**
             * Resets the task
             */
            public void resetTask()
            {
                super.resetTask();
            }

            /**
             * Updates the task
             */
            public void updateTask()
            {
                super.updateTask();
                this.rabbit.getLookHelper().setLookPosition((double)this.destinationBlock.getX() + 0.5D, (double)(this.destinationBlock.getY() + 1), (double)this.destinationBlock.getZ() + 0.5D, 10.0F, (float)this.rabbit.getVerticalFaceSpeed());

                if (this.getIsAboveDestination())
                {
                    World world = this.rabbit.worldObj;
                    BlockPos blockpos = this.destinationBlock.up();
                    IBlockState iblockstate = world.getBlockState(blockpos);
                    Block block = iblockstate.getBlock();

                    if (this.canRaid && block instanceof BlockCarrot)
                    {
                        Integer integer = (Integer)iblockstate.getValue(BlockCarrot.AGE);

                        if (integer.intValue() == 0)
                        {
                            world.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 2);
                            world.destroyBlock(blockpos, true);
                        }
                        else
                        {
                            world.setBlockState(blockpos, iblockstate.withProperty(BlockCarrot.AGE, Integer.valueOf(integer.intValue() - 1)), 2);
                            world.playEvent(2001, blockpos, Block.getStateId(iblockstate));
                        }

                        this.rabbit.createEatingParticles();
                    }

                    this.canRaid = false;
                    this.runDelay = 10;
                }
            }

            /**
             * Return true to set given position as destination
             */
            protected boolean shouldMoveTo(World worldIn, BlockPos pos)
            {
                Block block = worldIn.getBlockState(pos).getBlock();

                if (block == Blocks.FARMLAND && this.wantsToRaid && !this.canRaid)
                {
                    pos = pos.up();
                    IBlockState iblockstate = worldIn.getBlockState(pos);
                    block = iblockstate.getBlock();

                    if (block instanceof BlockCarrot && ((BlockCarrot)block).isMaxAge(iblockstate))
                    {
                        this.canRaid = true;
                        return true;
                    }
                }

                return false;
            }
        }

  }