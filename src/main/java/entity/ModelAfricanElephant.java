/*     */ package entity;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.client.renderer.GlStateManager;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelAfricanElephant
/*     */   extends ModelBase
/*     */ {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer leg2;
    public ModelRenderer leg1;
    public ModelRenderer leg4;
    public ModelRenderer leg3;
    public ModelRenderer shape14;
    public ModelRenderer shape3;
    public ModelRenderer shape6;
    public ModelRenderer shape6_1;
    public ModelRenderer shape12;
    public ModelRenderer shape12_1;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
/*     */   
/*     */   public ModelAfricanElephant()
/*     */   {
    this.textureWidth = 100;
    this.textureHeight = 100;
    this.shape2 = new ModelRenderer(this, 45, 0);
    this.shape2.setRotationPoint(1.4F, 0.0F, -7.8F);
    this.shape2.addBox(0.0F, 0.0F, 0.0F, 9, 9, 9, 0.0F);
    this.shape14 = new ModelRenderer(this, 0, 0);
    this.shape14.setRotationPoint(5.1F, 1.1F, 20.6F);
    this.shape14.addBox(0.0F, 0.0F, 0.0F, 1, 13, 1, 0.0F);
    this.setRotateAngle(shape14, 0.045553093477052F, 0.0F, 0.0F);
    this.leg1 = new ModelRenderer(this, 61, 30);
    this.leg1.setRotationPoint(6.7F, 7.1F, 0.0F);
    this.leg1.addBox(0.0F, 0.0F, 0.0F, 5, 17, 5, 0.0F);
    this.shape3 = new ModelRenderer(this, 4, 0);
    this.shape3.setRotationPoint(2.4F, 3.0F, -2.0F);
    this.shape3.addBox(0.0F, 0.0F, 0.0F, 4, 10, 4, 0.0F);
    this.leg4 = new ModelRenderer(this, 0, 34);
    this.leg4.setRotationPoint(0.0F, 7.1F, 15.8F);
    this.leg4.addBox(0.0F, 0.0F, 0.0F, 5, 17, 5, 0.0F);
    this.shape12_1 = new ModelRenderer(this, 62, 52);
    this.shape12_1.setRotationPoint(16.5F, -0.4F, 11.4F);
    this.shape12_1.addBox(0.0F, 0.0F, 0.0F, 10, 10, 1, 0.0F);
    this.setRotateAngle(shape12_1, 0.0F, 2.504198410761464F, 0.0F);
    this.shape4 = new ModelRenderer(this, 40, 33);
    this.shape4.setRotationPoint(0.4F, 7.0F, 0.0F);
    this.shape4.addBox(0.0F, 0.0F, 0.0F, 3, 11, 3, 0.0F);
    this.setRotateAngle(shape4, 0.045553093477052F, 0.0F, 0.0F);
    this.shape1 = new ModelRenderer(this, 0, 0);
    this.shape1.setRotationPoint(-5.4F, -0.2F, -9.1F);
    this.shape1.addBox(0.0F, 0.0F, 0.0F, 12, 12, 21, 0.0F);
    this.shape6 = new ModelRenderer(this, 81, 0);
    this.shape6.setRotationPoint(0.0F, 7.8F, 0.0F);
    this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    this.setRotateAngle(shape6, -0.9560913642424937F, 0.0F, 0.0F);
    this.shape6_1 = new ModelRenderer(this, 89, 0);
    this.shape6_1.setRotationPoint(7.0F, 7.8F, 0.0F);
    this.shape6_1.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    this.setRotateAngle(shape6_1, -0.9560913642424937F, 0.0F, 0.0F);
    this.shape5 = new ModelRenderer(this, 45, 0);
    this.shape5.setRotationPoint(0.6F, 9.4F, 0.5F);
    this.shape5.addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
    this.setRotateAngle(shape5, -0.136659280431156F, 0.0F, 0.0F);
    this.leg3 = new ModelRenderer(this, 20, 33);
    this.leg3.setRotationPoint(6.7F, 7.1F, 15.8F);
    this.leg3.addBox(0.0F, 0.0F, 0.0F, 5, 17, 5, 0.0F);
    this.shape12 = new ModelRenderer(this, 40, 51);
    this.shape12.setRotationPoint(-7.8F, -0.4F, 11.4F);
    this.shape12.addBox(0.0F, 0.0F, 0.0F, 10, 10, 1, 0.0F);
    this.setRotateAngle(shape12, 0.0F, 0.6829473363053812F, 0.0F);
    this.leg2 = new ModelRenderer(this, 77, 13);
    this.leg2.setRotationPoint(0.0F, 7.1F, 0.0F);
    this.leg2.addBox(0.0F, 0.0F, 0.0F, 5, 17, 5, 0.0F);
    this.shape1.addChild(this.shape2);
    this.shape1.addChild(this.shape14);
    this.shape1.addChild(this.leg1);
    this.shape2.addChild(this.shape3);
    this.shape1.addChild(this.leg4);
    this.shape2.addChild(this.shape12_1);
    this.shape3.addChild(this.shape4);
    this.shape2.addChild(this.shape6);
    this.shape2.addChild(this.shape6_1);
    this.shape4.addChild(this.shape5);
    this.shape1.addChild(this.leg3);
    this.shape2.addChild(this.shape12);
    this.shape1.addChild(this.leg2);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/* 117 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 119 */     float scaleFactor = 2.4F;
/* 120 */     GL11.glPushMatrix();
/* 121 */     GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
/* 122 */     GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
			this.shape1.render(f5);

/* 138 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 146 */     modelRenderer.rotateAngleX = x;
/* 147 */     modelRenderer.rotateAngleY = y;
/* 148 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*     */   {
/* 154 */     float f6 = 57.295776F;
/* 155 */     this.leg1.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 156 */     this.leg2.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 157 */     this.leg3.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 158 */     this.leg4.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelAfricanElephant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */