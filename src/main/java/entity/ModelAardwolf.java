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
/*     */ public class ModelAardwolf
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
/*     */   public ModelRenderer field_78185_a1;
/*     */   public ModelRenderer field_78185_a2;
/*     */   public ModelRenderer field_78185_a3;
/*     */   public ModelRenderer field_78183_b_1;
/*     */   
/*     */   public ModelAardwolf()
/*     */   {
/*  30 */     this.textureWidth = 64;
/*  31 */     this.textureHeight = 32;
/*  32 */     this.wolfLeg3 = new ModelRenderer(this, 0, 18);
/*  33 */     this.wolfLeg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
/*  34 */     this.wolfLeg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  35 */     this.field_78185_a3 = new ModelRenderer(this, 0, 10);
/*  36 */     this.field_78185_a3.setRotationPoint(-1.0F, 11.2F, -7.5F);
/*  37 */     this.field_78185_a3.addBox(-1.5F, 0.0F, -5.0F, 3, 3, 4, 0.0F);
/*  38 */     this.field_78183_b_1 = new ModelRenderer(this, 18, 14);
/*  39 */     this.field_78183_b_1.setRotationPoint(-3.0F, 13.0F, -9.0F);
/*  40 */     this.field_78183_b_1.addBox(0.0F, 0.0F, 0.0F, 4, 7, 5, 0.0F);
/*  41 */     setRotateAngle(this.field_78183_b_1, 1.0016445F, 0.0F, 0.0F);
/*  42 */     this.wolfTail = new ModelRenderer(this, 9, 18);
/*  43 */     this.wolfTail.setRotationPoint(-1.0F, 12.0F, 6.0F);
/*  44 */     this.wolfTail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  45 */     setRotateAngle(this.wolfTail, 0.4553564F, 0.0F, 0.0F);
/*  46 */     this.wolfBody = new ModelRenderer(this, 18, 14);
/*  47 */     this.wolfBody.setRotationPoint(0.0F, 14.1F, 0.0F);
/*  48 */     this.wolfBody.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6, 0.0F);
/*  49 */     setRotateAngle(this.wolfBody, 1.548107F, 0.0F, 0.0F);
/*  50 */     this.field_78185_a0 = new ModelRenderer(this, 0, 0);
/*  51 */     this.field_78185_a0.setRotationPoint(-1.0F, 11.5F, -8.0F);
/*  52 */     this.field_78185_a0.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4, 0.0F);
/*  53 */     this.wolfLeg2 = new ModelRenderer(this, 0, 18);
/*  54 */     this.wolfLeg2.setRotationPoint(0.5F, 16.0F, 6.0F);
/*  55 */     this.wolfLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  56 */     this.field_78185_a1 = new ModelRenderer(this, 16, 14);
/*  57 */     this.field_78185_a1.setRotationPoint(-1.0F, 11.5F, -7.0F);
/*  58 */     this.field_78185_a1.addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
/*  59 */     this.field_78185_a2 = new ModelRenderer(this, 16, 14);
/*  60 */     this.field_78185_a2.setRotationPoint(-1.0F, 11.5F, -7.0F);
/*  61 */     this.field_78185_a2.addBox(1.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F);
/*  62 */     this.wolfLeg4 = new ModelRenderer(this, 0, 18);
/*  63 */     this.wolfLeg4.setRotationPoint(0.5F, 16.0F, -4.0F);
/*  64 */     this.wolfLeg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  65 */     this.wolfLeg1 = new ModelRenderer(this, 0, 18);
/*  66 */     this.wolfLeg1.setRotationPoint(-2.5F, 16.0F, 6.0F);
/*  67 */     this.wolfLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  68 */     this.wolfMane = new ModelRenderer(this, 21, 0);
/*  69 */     this.wolfMane.setRotationPoint(-1.0F, 13.9F, -1.2F);
/*  70 */     this.wolfMane.addBox(-4.0F, -3.0F, -3.0F, 8, 6, 6, 0.0F);
/*  71 */     setRotateAngle(this.wolfMane, 1.4570009F, 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/*  76 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/*  77 */     float scaleFactor = 0.9F;
/*  78 */     GL11.glPushMatrix();
/*  79 */     GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
/*  80 */     GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
/*  81 */     this.wolfLeg3.render(f5);
/*  82 */     this.field_78185_a3.render(f5);
/*  83 */     this.field_78183_b_1.render(f5);
/*  84 */     this.wolfTail.render(f5);
/*  85 */     this.wolfBody.render(f5);
/*  86 */     this.field_78185_a0.render(f5);
/*  87 */     this.wolfLeg2.render(f5);
/*  88 */     this.field_78185_a1.render(f5);
/*  89 */     this.field_78185_a2.render(f5);
/*  90 */     this.wolfLeg4.render(f5);
/*  91 */     this.wolfLeg1.render(f5);
/*  98 */     this.wolfMane.render(f5);
/* 100 */     GL11.glPopMatrix();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 107 */     modelRenderer.rotateAngleX = x;
/* 108 */     modelRenderer.rotateAngleY = y;
/* 109 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
/*     */   {
/* 114 */     this.wolfLeg4.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 115 */     this.wolfLeg1.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/* 116 */     this.wolfLeg2.rotateAngleX = (MathHelper.cos(par1 * 0.6662F) * 1.4F * par2);
/* 117 */     this.wolfLeg3.rotateAngleX = (MathHelper.cos(par1 * 0.6662F + 3.1415927F) * 1.4F * par2);
/*     */   }
/*     */ }


/* Location:              C:\Users\jhwol\Downloads\big update-deobf.jar!\com\africacraft\mob\ModelAardwolf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */