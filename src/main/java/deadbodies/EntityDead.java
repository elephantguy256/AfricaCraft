package deadbodies;

import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;


public class EntityDead extends EntityDeath {


    
    public int entitydeathTime = 10000;


	public EntityDead(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
    
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setShort("entitydeathTime", (short)this.entitydeathTime);
            }


	protected void onDeathUpdate()
    {
        ++this.entitydeathTime;

        if (this.entitydeathTime  == 10000)
        {
            if (!this.worldObj.isRemote && (this.isPlayer() || this.recentlyHit > 0 && this.canDropLoot() && this.worldObj.getGameRules().getBoolean("doMobLoot")))
            {
                int i = this.getExperiencePoints(this.attackingPlayer);
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

	public boolean useThinArms() {
		// TODO Auto-generated method stub
		return false;
	}

	public float getRotation() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected void entityInit() {
		// TODO Auto-generated method stub
		
	}
}
