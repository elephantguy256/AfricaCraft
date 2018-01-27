/*     */ package entity;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelStripedHyena
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer wolfLeg4;
/*     */   public ModelRenderer wolfMane;
/*     */   public ModelRenderer wolfBody;
/*     */   public ModelRenderer wolfLeg2;
/*     */   public ModelRenderer wolfLeg1;
/*     */   public ModelRenderer wolfLeg3;
/*     */   public ModelRenderer wolfTail;
/*     */   public ModelRenderer field_78185_a0;
/*     */   public ModelRenderer field_78185_a3;
/*     */   public ModelRenderer field_78185_a2;
/*     */   public ModelRenderer field_78185_a1;
/*     */   public ModelRenderer shape15;
/*     */   public ModelRenderer shape16;
/*     */   public ModelRenderer shape14;
/*     */   
/*     */   public ModelStripedHyena()
/*     */   {
/*  29 */     this.textureWidth = 50;
/*  30 */     this.textureHeight = 100;
/*  31 */     this.shape14 = new ModelRenderer(this, 6, 62);
/*  32 */     this.shape14.setRotationPoint(0.5F, -0.7F, -1.6F);
/*  33 */     this.shape14.addBox(0.0F, -0.1F, 0.0F, 2, 3, 10, 0.0F);
/*  34 */     setRotateAngle(this.shape14, -0.091106184F, 0.0F, 0.0F);
/*  35 */     this.field_78185_a3 = new ModelRenderer(this, 0, 39);
/*  36 */     this.field_78185_a3.setRotationPoint(-2.0F, -3.7F, 0.5F);
/*  37 */     this.field_78185_a3.addBox(-1.5F, 0.0F, -5.0F, 6, 5, 4, 0.0F);
/*  38 */     setRotateAngle(this.field_78185_a3, 0.27314404F, 0.0F, 0.0F);
/*  39 */     this.wolfLeg1 = new ModelRenderer(this, 0, 18);
/*  40 */     this.wolfLeg1.setRotationPoint(-2.5F, 16.0F, 6.0F);
/*  41 */     this.wolfLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  42 */     this.wolfBody = new ModelRenderer(this, 18, 73);
/*  43 */     this.wolfBody.setRotationPoint(0.0F, 14.2F, 0.1F);
/*  44 */     this.wolfBody.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
/*  45 */     setRotateAngle(this.wolfBody, 1.4114478F, 0.0F, 0.0F);
/*  46 */     this.wolfTail = new ModelRenderer(this, 32, 18);
/*  47 */     this.wolfTail.setRotationPoint(-1.0F, 12.7F, 6.5F);
/*  48 */     this.wolfTail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  49 */     setRotateAngle(this.wolfTail, 0.4553564F, 0.0F, 0.0F);
/*  50 */     this.shape16 = new ModelRenderer(this, 28, 1);
/*  51 */     this.shape16.setRotationPoint(0.0F, 3.1F, -7.4F);
/*  52 */     this.shape16.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
/*  53 */     setRotateAngle(this.shape16, -0.045553092F, 0.0F, 0.0F);
/*  54 */     this.field_78185_a2 = new ModelRenderer(this, 16, 14);
/*  55 */     this.field_78185_a2.setRotationPoint(-0.1F, 1.6F, -0.3F);
/*  56 */     this.field_78185_a2.addBox(1.0F, -5.0F, -2.4F, 2, 3, 1, 0.0F);
/*  57 */     setRotateAngle(this.field_78185_a2, 0.0F, 0.0F, 0.59184116F);
/*  58 */     this.wolfLeg3 = new ModelRenderer(this, 0, 18);
/*  59 */     this.wolfLeg3.setRotationPoint(-2.5F, 15.3F, -3.3F);
/*  60 */     this.wolfLeg3.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
/*  61 */     this.shape15 = new ModelRenderer(this, 28, 0);
/*  62 */     this.shape15.setRotationPoint(0.0F, 1.8F, -7.8F);
/*  63 */     this.shape15.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
/*  64 */     setRotateAngle(this.shape15, 0.13456489F, 0.0F, 0.0F);
/*  65 */     this.wolfLeg2 = new ModelRenderer(this, 0, 18);
/*  66 */     this.wolfLeg2.setRotationPoint(0.5F, 16.0F, 5.8F);
/*  67 */     this.wolfLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  68 */     this.field_78185_a0 = new ModelRenderer(this, 24, 90);
/*  69 */     this.field_78185_a0.setRotationPoint(-0.5F, 13.0F, -7.1F);
/*  70 */     this.field_78185_a0.addBox(-3.0F, -3.0F, -2.0F, 5, 4, 6, 0.0F);
/*  71 */     setRotateAngle(this.field_78185_a0, -0.31869712F, 0.0F, 0.0F);
/*  72 */     this.wolfMane = new ModelRenderer(this, 22, 52);
/*  73 */     this.wolfMane.setRotationPoint(-0.5F, 14.1F, -1.8F);
/*  74 */     this.wolfMane.addBox(-4.0F, -3.0F, -3.0F, 7, 6, 6, 0.0F);
/*  75 */     setRotateAngle(this.wolfMane, 1.5707964F, 0.0F, 0.0F);
/*  76 */     this.field_78185_a1 = new ModelRenderer(this, 16, 14);
/*  77 */     this.field_78185_a1.setRotationPoint(-2.7F, 3.7F, -2.6F);
/*  78 */     this.field_78185_a1.addBox(-3.0F, -5.0F, 0.0F, 3, 2, 1, 0.0F);
/*  79 */     setRotateAngle(this.field_78185_a1, 0.0F, 0.0F, 0.8196066F);
/*  80 */     this.wolfLeg4 = new ModelRenderer(this, 0, 18);
/*  81 */     this.wolfLeg4.setRotationPoint(0.5F, 15.4F, -3.2F);
/*  82 */     this.wolfLeg4.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
/*  83 */     this.field_78185_a3.addChild(this.shape14);
/*  84 */     this.field_78185_a0.addChild(this.field_78185_a3);
/*  85 */     this.field_78185_a3.addChild(this.shape16);
/*  86 */     this.field_78185_a3.addChild(this.field_78185_a2);
/*  87 */     this.field_78185_a3.addChild(this.shape15);
/*  88 */     this.field_78185_a3.addChild(this.field_78185_a1);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/*  93 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/*  94 */     this.wolfLeg1.render(f5);
/*  95 */     this.wolfBody.render(f5);
/*  96 */     this.wolfTail.render(f5);
/*  97 */     this.wolfLeg3.render(f5);
/*  98 */     this.wolfLeg2.render(f5);
/*  99 */     this.field_78185_a0.render(f5);
/* 100 */     this.wolfMane.render(f5);
/* 101 */     this.wolfLeg4.render(f5);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 108 */     modelRenderer.rotateAngleX = x;
/* 109 */     modelRenderer.rotateAngleY = y;
/* 110 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*     */   {
/* 116 */     float f6 = 57.295776F;
/* 117 */     this.wolfLeg4.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 118 */     this.wolfLeg3.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 119 */     this.wolfLeg2.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 120 */     this.wolfLeg1.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelStripedHyena.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */