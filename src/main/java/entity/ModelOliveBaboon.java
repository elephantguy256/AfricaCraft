/*     */ package entity;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelOliveBaboon
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer WolfHead;
/*     */   public ModelRenderer Body;
/*     */   public ModelRenderer Mane;
/*     */   public ModelRenderer Leg1;
/*     */   public ModelRenderer Leg2;
/*     */   public ModelRenderer Leg3;
/*     */   public ModelRenderer Leg4;
/*     */   public ModelRenderer Tail;
/*     */   public ModelRenderer Nose;
/*     */   public ModelRenderer Mane_1;
/*     */   public ModelRenderer Tail2;
/*     */   public ModelRenderer LegHind3;
/*     */   public ModelRenderer Foot2;
/*     */   public ModelRenderer LegHind2;
/*     */   public ModelRenderer Foot1;
/*     */   public ModelRenderer Foot4;
/*     */   public ModelRenderer Foot3;
/*     */   
/*     */   public ModelOliveBaboon()
/*     */   {
/*  32 */     this.textureWidth = 64;
/*  33 */     this.textureHeight = 32;
/*  34 */     this.Leg2 = new ModelRenderer(this, 0, 18);
/*  35 */     this.Leg2.setRotationPoint(0.5F, 16.0F, 7.0F);
/*  36 */     this.Leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
/*  37 */     setRotateAngle(this.Leg2, -0.13665928F, -0.0F, 0.0F);
/*  38 */     this.Tail2 = new ModelRenderer(this, 9, 18);
/*  39 */     this.Tail2.setRotationPoint(-1.9333333F, 11.466666F, 13.666667F);
/*  40 */     this.Tail2.addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
/*  41 */     setRotateAngle(this.Tail2, 1.1672479F, -0.0F, 0.0F);
/*  42 */     this.Foot3 = new ModelRenderer(this, 47, 20);
/*  43 */     this.Foot3.setRotationPoint(-1.03F, 7.1F, -2.5F);
/*  44 */     this.Foot3.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
/*  45 */     this.Mane = new ModelRenderer(this, 21, 0);
/*  46 */     this.Mane.setRotationPoint(-1.0F, 14.533334F, -3.0F);
/*  47 */     this.Mane.addBox(-4.0F, -3.0F, -3.0F, 8, 6, 8, 0.0F);
/*  48 */     setRotateAngle(this.Mane, 1.4592605F, -0.0F, 0.0F);
/*  49 */     this.Foot2 = new ModelRenderer(this, 46, 20);
/*  50 */     this.Foot2.setRotationPoint(0.1F, 2.9F, -2.27F);
/*  51 */     this.Foot2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
/*  52 */     this.LegHind2 = new ModelRenderer(this, 0, 18);
/*  53 */     this.LegHind2.setRotationPoint(-0.93F, 3.37F, -1.07F);
/*  54 */     this.LegHind2.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
/*  55 */     setRotateAngle(this.LegHind2, 0.22305308F, -0.0F, -0.0F);
/*  56 */     this.Foot4 = new ModelRenderer(this, 47, 20);
/*  57 */     this.Foot4.setRotationPoint(-1.07F, 7.1F, -2.4F);
/*  58 */     this.Foot4.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
/*  59 */     this.Leg3 = new ModelRenderer(this, 0, 18);
/*  60 */     this.Leg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
/*  61 */     this.Leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  62 */     this.Leg4 = new ModelRenderer(this, 0, 18);
/*  63 */     this.Leg4.setRotationPoint(0.5F, 16.0F, -4.0F);
/*  64 */     this.Leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  65 */     setRotateAngle(this.Leg4, 0.045553092F, -0.0F, 0.0F);
/*  66 */     this.LegHind3 = new ModelRenderer(this, 0, 18);
/*  67 */     this.LegHind3.setRotationPoint(-0.97F, 3.9F, -0.97F);
/*  68 */     this.LegHind3.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
/*  69 */     setRotateAngle(this.LegHind3, 0.22305308F, -0.0F, -0.0F);
/*  70 */     this.Tail = new ModelRenderer(this, 9, 18);
/*  71 */     this.Tail.setRotationPoint(-1.0F, 12.666667F, 6.9333334F);
/*  72 */     this.Tail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  73 */     setRotateAngle(this.Tail, 1.8364629F, -0.0F, 0.0F);
/*  74 */     this.Nose = new ModelRenderer(this, 44, 18);
/*  75 */     this.Nose.setRotationPoint(-0.5F, 10.5F, -7.0F);
/*  76 */     this.Nose.addBox(-2.0F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
/*  77 */     setRotateAngle(this.Nose, 0.3346075F, -0.0F, 0.0F);
/*  78 */     this.Mane_1 = new ModelRenderer(this, 21, 0);
/*  79 */     this.Mane_1.setRotationPoint(-4.3333335F, 17.666666F, -2.0F);
/*  80 */     this.Mane_1.addBox(0.0F, 0.0F, 0.0F, 7, 6, 7, 0.0F);
/*  81 */     setRotateAngle(this.Mane_1, 1.5707964F, -0.0F, 0.0F);
/*  82 */     this.Body = new ModelRenderer(this, 18, 14);
/*  83 */     this.Body.setRotationPoint(0.0F, 13.533334F, 1.0F);
/*  84 */     this.Body.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 5, 0.0F);
/*  85 */     setRotateAngle(this.Body, 1.607975F, -0.0F, 0.0F);
/*  86 */     this.WolfHead = new ModelRenderer(this, 0, 0);
/*  87 */     this.WolfHead.setRotationPoint(-1.0F, 12.166667F, -7.0F);
/*  88 */     this.WolfHead.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
/*  89 */     this.Foot1 = new ModelRenderer(this, 46, 19);
/*  90 */     this.Foot1.setRotationPoint(-0.03F, 3.9F, -1.0F);
/*  91 */     this.Foot1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F);
/*  92 */     this.Leg1 = new ModelRenderer(this, 0, 18);
/*  93 */     this.Leg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
/*  94 */     this.Leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
/*  95 */     setRotateAngle(this.Leg1, -0.045553092F, -0.0F, 0.0F);
/*  96 */     this.Leg4.addChild(this.Foot3);
/*  97 */     this.LegHind3.addChild(this.Foot2);
/*  98 */     this.Leg2.addChild(this.LegHind2);
/*  99 */     this.Leg3.addChild(this.Foot4);
/* 100 */     this.Leg1.addChild(this.LegHind3);
/* 101 */     this.LegHind2.addChild(this.Foot1);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/* 106 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 107 */     this.Leg2.render(f5);
/* 108 */     this.Tail2.render(f5);
/* 109 */     this.Mane.render(f5);
/* 110 */     this.Leg3.render(f5);
/* 111 */     this.Leg4.render(f5);
/* 112 */     this.Tail.render(f5);
/* 113 */     this.Nose.render(f5);
/* 114 */     this.Mane_1.render(f5);
/* 115 */     this.Body.render(f5);
/* 116 */     this.WolfHead.render(f5);
/* 117 */     this.Leg1.render(f5);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 124 */     modelRenderer.rotateAngleX = x;
/* 125 */     modelRenderer.rotateAngleY = y;
/* 126 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
/*     */   {
/* 132 */     float f6 = 57.295776F;
/* 133 */     this.Leg1.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/* 134 */     this.Leg2.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 135 */     this.Leg4.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F + 3.1415927F) * 1.4F * p_78087_2_);
/* 136 */     this.Leg3.rotateAngleX = (MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelOliveBaboon.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */