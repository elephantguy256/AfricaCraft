/*     */ package entity;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ 
/*     */ 
/*     */ public class ModelBrownHyena
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
private int state;
/*     */   
/*     */   public ModelBrownHyena()
/*     */   {
/*  28 */     this.textureWidth = 50;
/*  29 */     this.textureHeight = 100;
/*  30 */     this.wolfBody = new ModelRenderer(this, 18, 73);
/*  31 */     this.wolfBody.setRotationPoint(0.0F, 14.2F, 0.6F);
/*  32 */     this.wolfBody.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
/*  33 */     setRotateAngle(this.wolfBody, 1.4114478F, 0.0F, 0.0F);
/*  34 */     this.shape15 = new ModelRenderer(this, 28, 0);
/*  35 */     this.shape15.setRotationPoint(0.0F, 1.8F, -7.8F);
/*  36 */     this.shape15.addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
/*  37 */     setRotateAngle(this.shape15, 0.13456489F, 0.0F, 0.0F);
/*  38 */     this.wolfTail = new ModelRenderer(this, 32, 18);
/*  39 */     this.wolfTail.setRotationPoint(-0.8F, 12.7F, 7.2F);
/*  40 */     this.wolfTail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  41 */     setRotateAngle(this.wolfTail, 0.4553564F, 0.0F, 0.0F);
/*  42 */     this.shape16 = new ModelRenderer(this, 28, 1);
/*  43 */     this.shape16.setRotationPoint(0.0F, 3.1F, -7.4F);
/*  44 */     this.shape16.addBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F);
/*  45 */     setRotateAngle(this.shape16, -0.045553092F, 0.0F, 0.0F);
/*  46 */     this.wolfLeg2 = new ModelRenderer(this, 0, 18);
/*  47 */     this.wolfLeg2.setRotationPoint(0.5F, 16.0F, 5.8F);
/*  48 */     this.wolfLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  49 */     this.wolfLeg1 = new ModelRenderer(this, 0, 18);
/*  50 */     this.wolfLeg1.setRotationPoint(-2.5F, 16.0F, 6.0F);
/*  51 */     this.wolfLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  52 */     this.wolfLeg4 = new ModelRenderer(this, 0, 18);
/*  53 */     this.wolfLeg4.setRotationPoint(0.5F, 15.4F, -2.6F);
/*  54 */     this.wolfLeg4.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
/*  55 */     this.field_78185_a1 = new ModelRenderer(this, 16, 14);
/*  56 */     this.field_78185_a1.setRotationPoint(-3.5F, 3.0F, -2.6F);
/*  57 */     this.field_78185_a1.addBox(-3.0F, -5.0F, 0.0F, 3, 2, 1, 0.0F);
/*  58 */     setRotateAngle(this.field_78185_a1, 0.0F, 0.0F, 1.0471976F);
/*  59 */     this.field_78185_a0 = new ModelRenderer(this, 24, 90);
/*  60 */     this.field_78185_a0.setRotationPoint(-0.5F, 13.1F, -6.3F);
/*  61 */     this.field_78185_a0.addBox(-3.0F, -3.0F, -2.0F, 5, 4, 6, 0.0F);
/*  62 */     setRotateAngle(this.field_78185_a0, -0.27314404F, 0.0F, 0.0F);
/*  63 */     this.field_78185_a3 = new ModelRenderer(this, 0, 39);
/*  64 */     this.field_78185_a3.setRotationPoint(-2.0F, -3.7F, -0.2F);
/*  65 */     this.field_78185_a3.addBox(-1.5F, 0.0F, -5.0F, 6, 5, 4, 0.0F);
/*  66 */     setRotateAngle(this.field_78185_a3, 0.27314404F, 0.0F, 0.0F);
/*  67 */     this.wolfMane = new ModelRenderer(this, 22, 52);
/*  68 */     this.wolfMane.setRotationPoint(-0.5F, 14.1F, -1.5F);
/*  69 */     this.wolfMane.addBox(-4.0F, -3.0F, -3.0F, 7, 6, 6, 0.0F);
/*  70 */     setRotateAngle(this.wolfMane, 1.5707964F, 0.0F, 0.0F);
/*  71 */     this.wolfLeg3 = new ModelRenderer(this, 0, 18);
/*  72 */     this.wolfLeg3.setRotationPoint(-2.5F, 15.3F, -2.6F);
/*  73 */     this.wolfLeg3.addBox(-1.0F, 0.0F, -1.0F, 2, 9, 2, 0.0F);
/*  74 */     this.field_78185_a2 = new ModelRenderer(this, 16, 14);
/*  75 */     this.field_78185_a2.setRotationPoint(0.1F, 1.5F, -0.3F);
/*  76 */     this.field_78185_a2.addBox(1.0F, -5.0F, -2.4F, 2, 3, 1, 0.0F);
/*  77 */     setRotateAngle(this.field_78185_a2, 0.0F, 0.0F, 0.59184116F);
/*  78 */     this.field_78185_a3.addChild(this.shape15);
/*  79 */     this.field_78185_a3.addChild(this.shape16);
/*  80 */     this.field_78185_a3.addChild(this.field_78185_a1);
/*  81 */     this.field_78185_a0.addChild(this.field_78185_a3);
/*  82 */     this.field_78185_a3.addChild(this.field_78185_a2);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/*  87 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/*  88 */     this.wolfBody.render(f5);
/*  89 */     this.wolfTail.render(f5);
/*  90 */     this.wolfLeg2.render(f5);
/*  91 */     this.wolfLeg1.render(f5);
/*  92 */     this.wolfLeg4.render(f5);
/*  93 */     this.field_78185_a0.render(f5);
/*  94 */     this.wolfMane.render(f5);
/*  95 */     this.wolfLeg3.render(f5);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 102 */     modelRenderer.rotateAngleX = x;
/* 103 */     modelRenderer.rotateAngleY = y;
/* 104 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */ 
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
/*     */   {
/* 110 */     this.wolfLeg4.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 111 */     this.wolfLeg1.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/* 112 */     this.wolfLeg2.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 113 */     this.wolfLeg3.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/*     */   }
/*     */ 

/*     */   public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
/*     */   {
	/* 110 */     this.wolfLeg4.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_);
	/* 111 */     this.wolfLeg1.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_);
	/* 112 */     this.wolfLeg2.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_);
	/* 113 */     this.wolfLeg3.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_);
/* 226 */     EntityBrownHyena entityocelot = (EntityBrownHyena)entitylivingbaseIn;
/*     */     
/* 233 */     if (entityocelot.isSneaking())
/*     */     {
    this.field_78185_a0.setRotationPoint(-0.5F, 15.0F, -7.1F);
    this.setRotateAngle(field_78185_a0, 0.091106186954104F, 0.0F, 0.0F);
/* 239 */       this.state = 0;
/*     */     }
/* 241 */    else if (entityocelot.isSprinting())
/*     */     {
	/*  60 */     this.field_78185_a0.setRotationPoint(-0.5F, 13.1F, -6.3F);
	/*  62 */     setRotateAngle(this.field_78185_a0, -0.27314404F, 0.0F, 0.0F);
	/* 253 */       this.wolfTail.setRotationPoint(-1.3F, 13.0F, 8.0F);
	/* 254 */       setRotateAngle(this.wolfTail, 0.045553092F, 0.0F, 0.0F);
      /* 239 */       this.state = 2;
}
      else
      {
    		/*  60 */     this.field_78185_a0.setRotationPoint(-0.5F, 13.1F, -6.3F);
    		/*  62 */     setRotateAngle(this.field_78185_a0, -0.27314404F, 0.0F, 0.0F);
            this.wolfTail.setRotationPoint(-1.0F, 12.699999809265137F, 6.5F);
            this.setRotateAngle(wolfTail, 0.4553563892841339F, 0.0F, 0.0F);
      }
}
}
/*     */


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelAfricanWildDog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */