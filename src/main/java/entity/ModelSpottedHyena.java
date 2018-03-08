package entity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * ModelWolf - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelSpottedHyena extends ModelBase {
    public ModelRenderer leg1;
    public ModelRenderer neck;
    public ModelRenderer field_78183_b;
    public ModelRenderer leg4;
    public ModelRenderer leg3;
    public ModelRenderer leg2;
    public ModelRenderer tail;
    public ModelRenderer wolfMane;
    public ModelRenderer head;
    public ModelRenderer field_78185_a3;
    public ModelRenderer field_78185_a2;
    public ModelRenderer field_78185_a1;
	private int state;

    public ModelSpottedHyena() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78185_a2 = new ModelRenderer(this, 16, 14);
        this.field_78185_a2.setRotationPoint(-1.9F, -1.8F, -1.0F);
        this.field_78185_a2.addBox(1.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(field_78185_a2, 0.0F, 0.0F, 0.8651597102135892F);
        this.leg2 = new ModelRenderer(this, 0, 18);
        this.leg2.setRotationPoint(-2.5F, 16.0F, -1.9F);
        this.leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78185_a1 = new ModelRenderer(this, 16, 14);
        this.field_78185_a1.setRotationPoint(-4.3F, 1.1F, -1.0F);
        this.field_78185_a1.addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(field_78185_a1, 0.0F, -0.007853981633974483F, 0.8651597102135892F);
        this.neck = new ModelRenderer(this, 21, 0);
        this.neck.setRotationPoint(0.5F, 13.5F, -3.2F);
        this.neck.addBox(-4.0F, -3.1F, -3.0F, 5, 5, 6, 0.0F);
        this.setRotateAngle(neck, -3.141592653589793F, 0.0F, 0.0F);
        this.field_78183_b = new ModelRenderer(this, 18, 14);
        this.field_78183_b.setRotationPoint(0.0F, 14.5F, -0.4F);
        this.field_78183_b.addBox(-4.0F, -2.0F, -3.0F, 6, 11, 6, 0.0F);
        this.setRotateAngle(field_78183_b, 1.4570008595648662F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 18);
        this.leg1.setRotationPoint(0.5F, 16.0F, -1.5F);
        this.leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.leg3 = new ModelRenderer(this, 0, 18);
        this.leg3.setRotationPoint(-2.6F, 16.0F, 7.4F);
        this.leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.tail = new ModelRenderer(this, 9, 18);
        this.tail.setRotationPoint(-0.9F, 13.2F, 8.5F);
        this.tail.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tail, 0.4553564018453205F, 0.0F, 0.0F);
        this.wolfMane = new ModelRenderer(this, 0, 18);
        this.wolfMane.setRotationPoint(-2.5F, 2.5F, -3.4F);
        this.wolfMane.addBox(0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(wolfMane, 1.5481070465189704F, 0.0F, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 18);
        this.leg4.setRotationPoint(0.8F, 16.0F, 7.4F);
        this.leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.head = new ModelRenderer(this, 44, 1);
        this.head.setRotationPoint(-1.5F, -0.8F, 3.4F);
        this.head.addBox(-3.0F, -3.0F, -2.0F, 6, 5, 4, 0.0F);
        this.setRotateAngle(head, 3.141592653589793F, 0.0F, 0.0F);
        this.field_78185_a3 = new ModelRenderer(this, 42, 11);
        this.field_78185_a3.setRotationPoint(0.0F, -1.3F, 0.3F);
        this.field_78185_a3.addBox(-1.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(field_78185_a3, 0.091106186954104F, 0.0F, 0.0F);
        this.head.addChild(this.field_78185_a2);
        this.head.addChild(this.field_78185_a1);
        this.neck.addChild(this.wolfMane);
        this.neck.addChild(this.head);
        this.head.addChild(this.field_78185_a3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	float scaleFactor = 1.2F;
    	GL11.glPushMatrix();
    	GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
    	GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
        this.leg2.render(f5);
        this.neck.render(f5);
        this.field_78183_b.render(f5);
        this.leg1.render(f5);
        this.leg3.render(f5);
        this.tail.render(f5);
        this.leg4.render(f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPopMatrix();

    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


/*     */   
/*     */   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
/*     */   {
/* 211 */     super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 212 */     this.leg1.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/* 213 */     this.leg2.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 214 */     this.leg3.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 215 */     this.leg4.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/*     */     
/*     */   }
/*     */   
/*     */   public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
/*     */   {
/* 226 */     EntitySpottedHyena entityocelot = (EntitySpottedHyena)entitylivingbaseIn;
/* 227 */     this.leg1.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_);
/* 228 */     this.leg2.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_);
/* 229 */     this.leg3.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_);
/* 230 */     this.leg4.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_);/*     */     
/* 233 */     if (entityocelot.isSneaking())
/*     */     {
    this.head.setRotationPoint(-1.5F, -0.8F, 3.4F);
    this.setRotateAngle(head, 3.050486466635689F, 0.0F, 0.0F);
    this.neck.setRotationPoint(0.5F, 13.5F, -3.2F);
    this.setRotateAngle(neck, -2.8228955321756284F, 0.0F, 0.0F);
/* 237 */       this.tail.setRotationPoint(-1.3F, 13.0F, 8.0F);
/* 238 */       setRotateAngle(this.tail, 0.045553092F, 0.0F, 0.0F);
/* 239 */       this.state = 0;
/*     */     }
/* 241 */     else if (entityocelot.isSprinting())
/*     */     {
    this.neck.setRotationPoint(0.5F, 13.5F, -3.2F);
    this.setRotateAngle(neck, -3.141592653589793F, 0.0F, 0.0F);
/* 243 */       this.tail.rotationPointY = this.tail.rotationPointY;
/* 244 */       this.tail.rotateAngleX = 1.5707964F;
/* 246 */       setRotateAngle(this.wolfMane, 2.6862361F, 0.0F, 0.0F);
this.head.setRotationPoint(-1.5F, -0.8F, 3.4F);
this.setRotateAngle(head, 3.141592653589793F, 0.0F, 0.0F);
/* 247 */       this.state = 2;
/*     */     }
/*     */     else
/*     */     {
/* 253 */       this.tail.setRotationPoint(-1.3F, 13.0F, 8.0F);
/* 254 */       setRotateAngle(this.tail, 0.045553092F, 0.0F, 0.0F);
/* 255 */       this.state = 1;
this.neck.setRotationPoint(0.5F, 13.5F, -3.2F);
this.setRotateAngle(neck, -3.141592653589793F, 0.0F, 0.0F);
this.head.setRotationPoint(-1.5F, -0.8F, 3.4F);
this.setRotateAngle(head, 3.141592653589793F, 0.0F, 0.0F);
/*     */     }
/*     */   }
/*     */
}

/* Location:              C:\Users\jhwol\Downloads\release2 wildebeest-deobf.jar!\entity\ModelSpottedHyena.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */