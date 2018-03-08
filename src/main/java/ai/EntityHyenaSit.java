/*    */ package ai;
/*    */ 
/*    */ import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
/*    */ import net.minecraft.entity.passive.EntityTameable;
/*    */ import net.minecraft.pathfinding.PathNavigate;
/*    */ 
/*    */ public class EntityHyenaSit extends EntityAIBase
/*    */ {
/*    */   private final EntityTameable theEntity;
/*    */   private boolean isSitting;
/*    */   
/*    */   public EntityHyenaSit(EntityTameable entityIn)
/*    */   {
/* 14 */     this.theEntity = entityIn;
/* 15 */     setMutexBits(5);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean shouldExecute()
/*    */   {
/* 23 */     if (!this.theEntity.isTamed())
/*    */     {
/* 25 */       return false;
/*    */     }
/* 27 */     if (this.theEntity.isInWater())
/*    */     {
/* 29 */       return false;
/*    */     }
/* 31 */     if (!this.theEntity.onGround)
/*    */     {
/* 33 */       return false;
/*    */     }
/*    */     
/*    */ 
/* 37 */     EntityLivingBase entitylivingbase = this.theEntity.getOwner();
/* 38 */     return (this.theEntity.getDistanceSqToEntity(entitylivingbase) < 144.0D) && (entitylivingbase.getAITarget() != null) ? false : entitylivingbase == null ? true : this.isSitting;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public void startExecuting()
/*    */   {
/* 47 */     this.theEntity.getNavigator().clearPathEntity();
/* 48 */     this.theEntity.setSitting(true);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void resetTask()
/*    */   {
/* 56 */     this.theEntity.setSitting(false);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public void setSitting(boolean sitting)
/*    */   {
/* 64 */     this.isSitting = sitting;
/*    */   }
/*    */ }


/* Location:              C:\Users\jhwol\Downloads\release2 wildebeest-deobf.jar!\net\minecraft\entity\ai\EntityHyenaSit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */