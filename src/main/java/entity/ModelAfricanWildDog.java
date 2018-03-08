package entity;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;

/**
 * ModelWildDog - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelAfricanWildDog extends ModelBase {
    public ModelRenderer field_78179_f;
    public ModelRenderer field_78186_h;
    public ModelRenderer field_78183_b;
    public ModelRenderer field_78181_d;
    public ModelRenderer field_78184_c;
    public ModelRenderer field_78182_e;
    public ModelRenderer field_78180_g;
    public ModelRenderer shape15;
    public ModelRenderer field_78185_a0;
    public ModelRenderer field_78185_a3;
    public ModelRenderer field_78185_a2;
    public ModelRenderer field_78185_a1;
	private int state;
	private EntityLivingBase EntityLivingBase;

    public ModelAfricanWildDog() {
        this.textureWidth = 50;
        this.textureHeight = 100;
        this.field_78185_a0 = new ModelRenderer(this, 15, 0);
        this.field_78185_a0.setRotationPoint(-1.5F, 0.2F, 5.6F);
        this.field_78185_a0.addBox(-3.0F, -4.7F, -1.9F, 6, 6, 5, 0.0F);
        this.setRotateAngle(field_78185_a0, 0.5918411493512771F, 0.0F, 0.0F);
        this.field_78183_b = new ModelRenderer(this, 23, 13);
        this.field_78183_b.setRotationPoint(-0.5F, 13.8F, 0.5F);
        this.field_78183_b.addBox(-4.0F, -2.0F, -3.0F, 6, 10, 7, 0.0F);
        this.setRotateAngle(field_78183_b, 1.593485607070823F, 0.0F, 0.0F);
        this.field_78182_e = new ModelRenderer(this, 0, 18);
        this.field_78182_e.setRotationPoint(-3.3F, 15.9F, -3.7F);
        this.field_78182_e.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.setRotateAngle(field_78182_e, 0.0F, -0.091106186954104F, 0.0F);
        this.field_78186_h = new ModelRenderer(this, 21, 37);
        this.field_78186_h.setRotationPoint(0.0F, 11.3F, -3.9F);
        this.field_78186_h.addBox(-4.0F, -3.4F, -3.0F, 5, 5, 9, 0.0F);
        this.setRotateAngle(field_78186_h, 2.5497515042385164F, 0.0F, 0.0F);
        this.field_78185_a3 = new ModelRenderer(this, 0, 35);
        this.field_78185_a3.setRotationPoint(0.1F, -2.1F, 1.1F);
        this.field_78185_a3.addBox(-1.5F, -1.4F, -5.0F, 3, 3, 4, 0.0F);
        this.setRotateAngle(field_78185_a3, 3.141592653589793F, 0.0F, 0.0F);
        this.field_78180_g = new ModelRenderer(this, 9, 18);
        this.field_78180_g.setRotationPoint(-1.3F, 11.7F, 7.5F);
        this.field_78180_g.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(field_78180_g, 0.31869712141416456F, 0.0F, 0.0F);
        this.field_78184_c = new ModelRenderer(this, 0, 18);
        this.field_78184_c.setRotationPoint(-3.3F, 16.0F, 7.0F);
        this.field_78184_c.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.shape15 = new ModelRenderer(this, 23, 19);
        this.shape15.setRotationPoint(-4.9F, 9.6F, -5.9F);
        this.shape15.addBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F);
        this.field_78185_a2 = new ModelRenderer(this, 16, 13);
        this.field_78185_a2.setRotationPoint(2.4F, -0.1F, -0.8F);
        this.field_78185_a2.addBox(-1.4F, -0.6F, -0.5F, 3, 4, 1, 0.0F);
        this.setRotateAngle(field_78185_a2, -0.31869712141416456F, 0.0F, 0.0F);
        this.field_78179_f = new ModelRenderer(this, 0, 18);
        this.field_78179_f.setRotationPoint(0.4F, 16.0F, -3.7F);
        this.field_78179_f.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78185_a1 = new ModelRenderer(this, 16, 13);
        this.field_78185_a1.setRotationPoint(-1.5F, -1.5F, 0.3F);
        this.field_78185_a1.addBox(-2.2F, -4.7F, 0.0F, 3, 4, 1, 0.0F);
        this.setRotateAngle(field_78185_a1, -0.4553564018453205F, 0.045553093477052F, 0.0F);
        this.setRotateAngle(field_78185_a1, 0.045553093477052F, 0.045553093477052F, 0.0F);
        this.field_78181_d = new ModelRenderer(this, 0, 18);
        this.field_78181_d.setRotationPoint(0.4F, 16.0F, 7.0F);
        this.field_78181_d.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
        this.field_78186_h.addChild(this.field_78185_a0);
        this.field_78185_a0.addChild(this.field_78185_a3);
        this.field_78185_a0.addChild(this.field_78185_a2);
        this.field_78185_a3.addChild(this.field_78185_a1);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	this.setRotationAngles(f, f1, f2, f3,f4, f5, entity);
    	float scaleFactor = 0.8F;
    	GL11.glPushMatrix();
    	GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
    	GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
        this.field_78183_b.render(f5);
        this.field_78182_e.render(f5);
        this.field_78186_h.render(f5);
        this.field_78180_g.render(f5);
        this.field_78184_c.render(f5);
        this.shape15.render(f5);
        this.field_78179_f.render(f5);
        this.field_78181_d.render(f5);
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

/*    */ 
/*    */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
/*    */   {
/* 94 */     this.field_78179_f.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 95 */     this.field_78182_e.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/* 96 */     this.field_78184_c.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 97 */     this.field_78181_d.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/*    */   
/*    */ }
/*     */   public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
/*     */   {
	/* 94 */     this.field_78179_f.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_2_);
	/* 95 */     this.field_78182_e.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_2_);
	/* 96 */     this.field_78184_c.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_2_);
	/* 97 */     this.field_78181_d.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_2_);
/* 226 */     EntityAfricanWildDog entityocelot = (EntityAfricanWildDog)entitylivingbaseIn;
/*     */     
/* 233 */     if (entityocelot.isSneaking())
/*     */     {
	/* 94 */     this.field_78179_f.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_2_);
	/* 95 */     this.field_78182_e.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_2_);
	/* 96 */     this.field_78184_c.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_2_);
	/* 97 */     this.field_78181_d.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_2_);
    this.field_78185_a0.setRotationPoint(-1.5F, 0.2F, 5.6F);
    this.setRotateAngle(field_78185_a0, 0.40980330836826856F, 0.0F, 0.0F);
    this.field_78186_h.setRotationPoint(0.0F, 11.3F, -3.9F);
    this.setRotateAngle(field_78186_h, -3.096039560112741F, 0.0F, 0.0F);
    this.field_78185_a2.setRotationPoint(2.4F, -0.1F, -0.8F);
    this.setRotateAngle(field_78185_a2, -1.0016444577195458F, 0.0F, 0.0F);
    this.field_78185_a1.setRotationPoint(-1.8F, -2.0F, 0.2F);
    this.setRotateAngle(field_78185_a1, -1.0927506446736497F, 0.045553093477052F, 0.0F);
    this.field_78180_g.setRotationPoint(-1.3F, 11.7F, 7.5F);
    this.setRotateAngle(field_78180_g, 0.31869712141416456F, 0.0F, 0.0F);
/* 239 */       this.state = 0;
/*     */     }
/* 241 */     else if (entityocelot.isSprinting())
/*     */     {
	this.field_78186_h.setRotationPoint(0.0F, 11.3F, -3.9F);
	this.field_78186_h.addBox(-4.0F, -3.4F, -3.0F, 5, 5, 9, 0.0F);
      this.field_78186_h.setRotationPoint(0.0F, 11.3F, -3.9F);
      this.setRotateAngle(field_78186_h, 2.9140017191297325F, 0.0F, 0.0F);
this.setRotateAngle(field_78186_h, 3.141592653589793F, 0.0F, 0.0F);
this.field_78185_a0.setRotationPoint(-1.5F, 0.2F, 5.6F);
this.setRotateAngle(field_78185_a0, 0.36425021489121656F, 0.0F, 0.0F);
this.field_78185_a2.setRotationPoint(2.4F, -0.1F, -0.8F);
this.setRotateAngle(field_78185_a2, -0.9105382707654417F, 0.0F, 0.0F);
this.field_78185_a1.setRotationPoint(-1.8F, -1.6F, 0.2F);
this.setRotateAngle(field_78185_a1, -0.7198171965418932F, 0.045553093477052F, 0.0F);
this.field_78180_g.setRotationPoint(-1.3F, 11.7F, 7.5F);
this.setRotateAngle(field_78180_g, 1.5481070465189704F, 0.0F, 0.0F);
/* 247 */       this.state = 2;
/*     */     }
/*     */     else
/*     */     {
	/* 94 */     this.field_78179_f.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_2_);
	/* 95 */     this.field_78182_e.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_2_);
	/* 96 */     this.field_78184_c.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_2_);
	/* 97 */     this.field_78181_d.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_2_);
    this.field_78185_a2.setRotationPoint(0.9F, 6.2F, -1.3F);
    this.field_78185_a1.setRotationPoint(-1.5F, -1.5F, 0.3F);
    this.setRotateAngle(field_78185_a1, -0.4553564018453205F, 0.045553093477052F, 0.0F);
    this.field_78185_a2.setRotationPoint(2.4F, -0.1F, -0.8F);
    this.setRotateAngle(field_78185_a2, -0.31869712141416456F, 0.0F, 0.0F);
    this.field_78186_h.setRotationPoint(0.0F, 11.3F, -3.9F);
    this.field_78185_a0.setRotationPoint(-1.5F, 0.2F, 5.6F);
    this.field_78180_g.setRotationPoint(-1.3F, 11.7F, 7.5F);
    this.setRotateAngle(field_78180_g, 0.31869712141416456F, 0.0F, 0.0F);


/* 255 */       this.state = 1;
/*     */     }
/*     */   }
}
/*     */


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelAfricanWildDog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */