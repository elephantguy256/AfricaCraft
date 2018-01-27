/*    */ package entity;
/*    */ 
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.model.ModelRenderer;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.util.math.MathHelper;
/*    */ 
/*    */ 
/*    */ public class ModelBlackBackedJackal
/*    */   extends ModelBase
/*    */ {
/*    */   public ModelRenderer wolfLeg4;
/*    */   public ModelRenderer wolfMane;
/*    */   public ModelRenderer wolfBody;
/*    */   public ModelRenderer wolfLeg2;
/*    */   public ModelRenderer wolfLeg1;
/*    */   public ModelRenderer wolfLeg3;
/*    */   public ModelRenderer wolfTail;
/*    */   public ModelRenderer field_78185_a0;
/*    */   public ModelRenderer field_78185_a1;
/*    */   public ModelRenderer field_78185_a2;
/*    */   public ModelRenderer field_78185_a3;
/*    */   
/*    */   public ModelBlackBackedJackal()
/*    */   {
/* 26 */     this.textureWidth = 64;
/* 27 */     this.textureHeight = 32;
/* 28 */     this.wolfBody = new ModelRenderer(this, 18, 14);
/* 29 */     this.wolfBody.setRotationPoint(0.4F, 16.7F, 0.4F);
/* 30 */     this.wolfBody.addBox(-4.0F, -2.0F, -3.0F, 5, 9, 5, 0.0F);
/* 31 */     setRotateAngle(this.wolfBody, 1.5707964F, 0.0F, 0.0F);
/* 32 */     this.wolfLeg4 = new ModelRenderer(this, 0, 18);
/* 33 */     this.wolfLeg4.setRotationPoint(0.3F, 16.0F, -0.4F);
/* 34 */     this.wolfLeg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 35 */     this.wolfMane = new ModelRenderer(this, 21, 0);
/* 36 */     this.wolfMane.setRotationPoint(0.9F, 16.3F, -0.4F);
/* 37 */     this.wolfMane.addBox(-4.0F, -3.0F, -3.0F, 4, 4, 4, 0.0F);
/* 38 */     setRotateAngle(this.wolfMane, 0.91053826F, 0.0F, 0.0F);
/* 39 */     this.wolfTail = new ModelRenderer(this, 9, 18);
/* 40 */     this.wolfTail.setRotationPoint(-1.0F, 15.7F, 6.7F);
/* 41 */     this.wolfTail.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
/* 42 */     setRotateAngle(this.wolfTail, 0.4098033F, 0.0F, 0.0F);
/* 43 */     this.field_78185_a0 = new ModelRenderer(this, 0, 0);
/* 44 */     this.field_78185_a0.setRotationPoint(-1.0F, 16.6F, -3.8F);
/* 45 */     this.field_78185_a0.addBox(-2.6F, -3.0F, -2.0F, 5, 4, 4, 0.0F);
/* 46 */     this.field_78185_a3 = new ModelRenderer(this, 0, 10);
/* 47 */     this.field_78185_a3.setRotationPoint(-0.5F, 15.4F, -2.6F);
/* 48 */     this.field_78185_a3.addBox(-1.5F, 0.0F, -5.0F, 2, 2, 3, 0.0F);
/* 49 */     this.wolfLeg1 = new ModelRenderer(this, 0, 18);
/* 50 */     this.wolfLeg1.setRotationPoint(-2.5F, 16.0F, 6.4F);
/* 51 */     this.wolfLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 52 */     this.field_78185_a2 = new ModelRenderer(this, 16, 14);
/* 53 */     this.field_78185_a2.setRotationPoint(-1.0F, 17.4F, -3.7F);
/* 54 */     this.field_78185_a2.addBox(1.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
/* 55 */     this.field_78185_a1 = new ModelRenderer(this, 16, 14);
/* 56 */     this.field_78185_a1.setRotationPoint(-1.0F, 17.4F, -3.9F);
/* 57 */     this.field_78185_a1.addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
/* 58 */     this.wolfLeg2 = new ModelRenderer(this, 0, 18);
/* 59 */     this.wolfLeg2.setRotationPoint(0.2F, 16.0F, 6.3F);
/* 60 */     this.wolfLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 61 */     this.wolfLeg3 = new ModelRenderer(this, 0, 18);
/* 62 */     this.wolfLeg3.setRotationPoint(-2.5F, 16.0F, -0.5F);
/* 63 */     this.wolfLeg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*    */   }
/*    */   
/*    */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*    */   {
/* 68 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 69 */     this.wolfBody.render(f5);
/* 70 */     this.wolfLeg4.render(f5);
/* 71 */     this.wolfMane.render(f5);
/* 72 */     this.wolfTail.render(f5);
/* 73 */     this.field_78185_a0.render(f5);
/* 74 */     this.field_78185_a3.render(f5);
/* 75 */     this.wolfLeg1.render(f5);
/* 76 */     this.field_78185_a2.render(f5);
/* 77 */     this.field_78185_a1.render(f5);
/* 78 */     this.wolfLeg2.render(f5);
/* 79 */     this.wolfLeg3.render(f5);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*    */   {
/* 86 */     modelRenderer.rotateAngleX = x;
/* 87 */     modelRenderer.rotateAngleY = y;
/* 88 */     modelRenderer.rotateAngleZ = z;
/*    */   }
/*    */   
/*    */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 92 */     this.wolfLeg4.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 93 */     this.wolfLeg1.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/* 94 */     this.wolfLeg2.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 95 */     this.wolfLeg3.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/*    */   }
/*    */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelBlackBackedJackal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */