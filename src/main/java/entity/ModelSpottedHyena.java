/*     */ package entity;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ import org.lwjgl.opengl.GL11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ModelSpottedHyena
/*     */   extends ModelBase
/*     */ {
/*     */   public ModelRenderer leg2;
/*     */   public ModelRenderer wolfMane;
/*     */   public ModelRenderer wolfBody;
/*     */   public ModelRenderer leg3;
/*     */   public ModelRenderer leg4;
/*     */   public ModelRenderer leg1;
/*     */   public ModelRenderer wolfTail;
/*     */   public ModelRenderer shape15;
/*     */   public ModelRenderer field_78185_a0;
/*     */   public ModelRenderer shape13;
/*     */   public ModelRenderer field_78185_a3;
/*     */   public ModelRenderer field_78185_a2;
/*     */   public ModelRenderer field_78185_a1;
/*     */   public ModelRenderer shape14;
/*     */   public ModelRenderer field_78179_fbaby;
/*     */   public ModelRenderer field_78186_hbaby;
/*     */   public ModelRenderer field_78183_baby;
/*     */   public ModelRenderer field_78181_dbaby;
/*     */   public ModelRenderer field_78184_cbaby;
/*     */   public ModelRenderer field_78182_ebaby;
/*     */   public ModelRenderer field_78180_gbaby;
/*     */   public ModelRenderer shape15baby;
/*     */   public ModelRenderer field_78185_a0baby;
/*     */   public ModelRenderer field_78185_a3baby;
/*     */   public ModelRenderer field_78185_a2baby;
/*     */   public ModelRenderer field_78185_a1baby;
/*     */   private int state;
/*     */   
/*     */   public ModelSpottedHyena()
/*     */   {
/*  49 */     this.textureWidth = 50;
/*  50 */     this.textureHeight = 100;
/*  51 */     this.field_78185_a2 = new ModelRenderer(this, 16, 14);
/*  52 */     this.field_78185_a2.setRotationPoint(4.8F, 6.2F, -1.2F);
/*  53 */     this.field_78185_a2.addBox(1.0F, -6.1F, 0.0F, 3, 3, 1, 0.0F);
/*  54 */     setRotateAngle(this.field_78185_a2, 0.045553092F, -0.05009095F, -0.8196066F);
/*  55 */     this.shape13 = new ModelRenderer(this, 0, 0);
/*  56 */     this.shape13.setRotationPoint(-1.9F, 3.0F, -2.8F);
/*  57 */     this.shape13.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
/*  58 */     setRotateAngle(this.shape13, 1.6390387F, 0.0F, 0.0F);
/*  59 */     this.shape15 = new ModelRenderer(this, 23, 19);
/*  60 */     this.shape15.setRotationPoint(-4.9F, 9.6F, -5.9F);
/*  61 */     this.shape15.addBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F);
/*  62 */     this.leg2 = new ModelRenderer(this, 0, 18);
/*  63 */     this.leg2.setRotationPoint(0.4F, 16.0F, -3.7F);
/*  64 */     this.leg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  65 */     this.wolfBody = new ModelRenderer(this, 23, 13);
/*  66 */     this.wolfBody.setRotationPoint(-0.5F, 13.8F, 0.5F);
/*  67 */     this.wolfBody.addBox(-4.0F, -2.0F, -3.0F, 6, 10, 7, 0.0F);
/*  68 */     setRotateAngle(this.wolfBody, 1.4114478F, 0.0F, 0.0F);
/*  69 */     this.field_78185_a0 = new ModelRenderer(this, 15, 0);
/*  70 */     this.field_78185_a0.setRotationPoint(-1.5F, -0.3F, 5.9F);
/*  71 */     this.field_78185_a0.addBox(-3.0F, -4.7F, -1.9F, 6, 6, 5, 0.0F);
/*  72 */     setRotateAngle(this.field_78185_a0, 0.4553564F, 0.0F, 0.0F);
/*  73 */     this.leg1 = new ModelRenderer(this, 0, 18);
/*  74 */     this.leg1.setRotationPoint(-3.3F, 15.9F, -3.7F);
/*  75 */     this.leg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  76 */     setRotateAngle(this.leg1, 0.0F, -0.091106184F, 0.0F);
/*  77 */     this.leg3 = new ModelRenderer(this, 0, 18);
/*  78 */     this.leg3.setRotationPoint(0.4F, 16.0F, 7.0F);
/*  79 */     this.leg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  80 */     this.field_78185_a1 = new ModelRenderer(this, 16, 14);
/*  81 */     this.field_78185_a1.setRotationPoint(0.3F, -1.6F, 1.2F);
/*  82 */     this.field_78185_a1.addBox(-3.0F, -4.7F, 0.0F, 3, 3, 1, 0.0F);
/*  83 */     setRotateAngle(this.field_78185_a1, 0.045553092F, 0.045553092F, -0.57770395F);
/*  84 */     this.leg4 = new ModelRenderer(this, 0, 18);
/*  85 */     this.leg4.setRotationPoint(-3.3F, 16.0F, 7.0F);
/*  86 */     this.leg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/*  87 */     this.field_78185_a3 = new ModelRenderer(this, 0, 35);
/*  88 */     this.field_78185_a3.setRotationPoint(0.1F, -2.1F, 1.1F);
/*  89 */     this.field_78185_a3.addBox(-1.5F, -1.4F, -5.0F, 3, 3, 4, 0.0F);
/*  90 */     setRotateAngle(this.field_78185_a3, 3.1415927F, 0.0F, 0.0F);
/*  91 */     this.wolfMane = new ModelRenderer(this, 21, 37);
/*  92 */     this.wolfMane.setRotationPoint(0.0F, 11.3F, -3.9F);
/*  93 */     this.wolfMane.addBox(-4.0F, -3.4F, -3.0F, 5, 5, 9, 0.0F);
/*  94 */     setRotateAngle(this.wolfMane, 2.6862361F, 0.0F, 0.0F);
/*  95 */     this.wolfTail = new ModelRenderer(this, 9, 18);
/*  96 */     this.wolfTail.setRotationPoint(-1.3F, 13.0F, 8.0F);
/*  97 */     this.wolfTail.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
/*  98 */     setRotateAngle(this.wolfTail, 0.045553092F, 0.0F, 0.0F);
/*  99 */     this.shape14 = new ModelRenderer(this, 0, 0);
/* 100 */     this.shape14.setRotationPoint(0.0F, 5.9F, -0.1F);
/* 101 */     this.shape14.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
/* 102 */     setRotateAngle(this.shape14, 0.3642502F, 0.0F, 0.0F);
/* 103 */     this.field_78185_a0.addChild(this.field_78185_a2);
/* 104 */     this.wolfMane.addChild(this.shape13);
/* 105 */     this.wolfMane.addChild(this.field_78185_a0);
/* 106 */     this.field_78185_a3.addChild(this.field_78185_a1);
/* 107 */     this.field_78185_a0.addChild(this.field_78185_a3);
/* 108 */     this.shape13.addChild(this.shape14);
/*     */     
/*     */ 
/* 111 */     this.textureWidth = 50;
/* 112 */     this.textureHeight = 100;
/* 113 */     this.field_78185_a0baby = new ModelRenderer(this, 15, 0);
/* 114 */     this.field_78185_a0baby.setRotationPoint(-1.5F, 0.2F, 5.9F);
/* 115 */     this.field_78185_a0baby.addBox(-3.0F, -4.7F, -1.9F, 6, 6, 5, 0.0F);
/* 116 */     setRotateAngle(this.field_78185_a0baby, 0.4553564F, 0.0F, 0.0F);
/* 117 */     this.field_78184_cbaby = new ModelRenderer(this, 0, 18);
/* 118 */     this.field_78184_cbaby.setRotationPoint(-3.3F, 16.0F, 7.0F);
/* 119 */     this.field_78184_cbaby.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 120 */     this.field_78180_gbaby = new ModelRenderer(this, 9, 18);
/* 121 */     this.field_78180_gbaby.setRotationPoint(-1.3F, 13.0F, 8.0F);
/* 122 */     this.field_78180_gbaby.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
/* 123 */     setRotateAngle(this.field_78180_gbaby, 0.045553092F, 0.0F, 0.0F);
/* 124 */     this.field_78185_a2baby = new ModelRenderer(this, 16, 14);
/* 125 */     this.field_78185_a2baby.setRotationPoint(4.8F, 6.2F, -1.2F);
/* 126 */     this.field_78185_a2baby.addBox(1.0F, -6.1F, 0.0F, 3, 3, 1, 0.0F);
/* 127 */     setRotateAngle(this.field_78185_a2baby, 0.045553092F, -0.05009095F, -0.8196066F);
/* 128 */     this.field_78186_hbaby = new ModelRenderer(this, 25, 37);
/* 129 */     this.field_78186_hbaby.setRotationPoint(0.0F, 11.3F, -3.9F);
/* 130 */     this.field_78186_hbaby.addBox(-4.0F, -3.4F, -3.0F, 5, 5, 9, 0.0F);
/* 131 */     setRotateAngle(this.field_78186_hbaby, 2.6862361F, 0.0F, 0.0F);
/* 132 */     this.field_78181_dbaby = new ModelRenderer(this, 0, 18);
/* 133 */     this.field_78181_dbaby.setRotationPoint(0.4F, 16.0F, 7.0F);
/* 134 */     this.field_78181_dbaby.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 135 */     this.field_78183_baby = new ModelRenderer(this, 23, 13);
/* 136 */     this.field_78183_baby.setRotationPoint(-0.5F, 13.8F, 0.5F);
/* 137 */     this.field_78183_baby.addBox(-4.0F, -2.0F, -3.0F, 6, 10, 7, 0.0F);
/* 138 */     setRotateAngle(this.field_78183_baby, 1.4114478F, 0.0F, 0.0F);
/* 139 */     this.shape15baby = new ModelRenderer(this, 23, 19);
/* 140 */     this.shape15baby.setRotationPoint(-4.9F, 9.6F, -5.9F);
/* 141 */     this.shape15baby.addBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F);
/* 142 */     this.field_78179_fbaby = new ModelRenderer(this, 0, 18);
/* 143 */     this.field_78179_fbaby.setRotationPoint(0.4F, 16.0F, -3.7F);
/* 144 */     this.field_78179_fbaby.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 145 */     this.field_78185_a1baby = new ModelRenderer(this, 16, 14);
/* 146 */     this.field_78185_a1baby.setRotationPoint(0.3F, -1.6F, 1.2F);
/* 147 */     this.field_78185_a1baby.addBox(-3.0F, -4.7F, 0.0F, 3, 3, 1, 0.0F);
/* 148 */     setRotateAngle(this.field_78185_a1baby, 0.045553092F, 0.045553092F, -0.57770395F);
/* 149 */     this.field_78182_ebaby = new ModelRenderer(this, 0, 18);
/* 150 */     this.field_78182_ebaby.setRotationPoint(-3.3F, 15.9F, -3.7F);
/* 151 */     this.field_78182_ebaby.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, 0.0F);
/* 152 */     setRotateAngle(this.field_78182_ebaby, 0.0F, -0.091106184F, 0.0F);
/* 153 */     this.field_78185_a3baby = new ModelRenderer(this, 0, 35);
/* 154 */     this.field_78185_a3baby.setRotationPoint(0.1F, -2.1F, 1.1F);
/* 155 */     this.field_78185_a3baby.addBox(-1.5F, -1.4F, -5.0F, 3, 3, 4, 0.0F);
/* 156 */     setRotateAngle(this.field_78185_a3baby, 3.1415927F, 0.0F, 0.0F);
/* 157 */     this.field_78186_hbaby.addChild(this.field_78185_a0baby);
/* 158 */     this.field_78185_a0baby.addChild(this.field_78185_a2baby);
/* 159 */     this.field_78185_a3baby.addChild(this.field_78185_a1baby);
/* 160 */     this.field_78185_a0baby.addChild(this.field_78185_a3baby);
/*     */   }
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
/*     */   {
/* 165 */     super.render(entity, f, f1, f2, f3, f4, f5);
/* 166 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 167 */     if (this.isChild)
/*     */     {
/* 169 */       float scaleFactor = 0.4F;
/* 170 */       GL11.glPushMatrix();
/* 171 */       GL11.glTranslatef(0.0F, 1.5F - 1.5F * scaleFactor, 0.0F);
/* 172 */       GL11.glScalef(scaleFactor, scaleFactor, scaleFactor);
/* 173 */       setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 174 */       setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 175 */       this.field_78184_cbaby.render(f5);
/* 176 */       this.field_78180_gbaby.render(f5);
/* 177 */       this.field_78186_hbaby.render(f5);
/* 178 */       this.field_78181_dbaby.render(f5);
/* 179 */       this.field_78183_baby.render(f5);
/* 180 */       this.shape15baby.render(f5);
/* 181 */       this.field_78179_fbaby.render(f5);
/* 182 */       this.field_78182_ebaby.render(f5);
/* 183 */       GL11.glPopMatrix();
/*     */ 
/*     */     }
/*     */     else
/*     */     {
/* 188 */       setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 189 */       this.shape15.render(f5);
/* 190 */       this.leg2.render(f5);
/* 191 */       this.wolfBody.render(f5);
/* 192 */       this.leg1.render(f5);
/* 193 */       this.leg3.render(f5);
/* 194 */       this.leg4.render(f5);
/* 195 */       this.wolfMane.render(f5);
/* 196 */       this.wolfTail.render(f5);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
/*     */   {
/* 204 */     modelRenderer.rotateAngleX = x;
/* 205 */     modelRenderer.rotateAngleY = y;
/* 206 */     modelRenderer.rotateAngleZ = z;
/*     */   }
/*     */   
/*     */   public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
/*     */   {
/* 211 */     super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/* 212 */     this.leg1.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/* 213 */     this.leg2.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 214 */     this.leg3.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 215 */     this.leg4.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/*     */     
/* 217 */     this.field_78179_fbaby.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/* 218 */     this.field_78182_ebaby.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 219 */     this.field_78181_dbaby.rotateAngleX = (MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.4F * f1);
/* 220 */     this.field_78184_cbaby.rotateAngleX = (MathHelper.cos(f * 0.6662F) * 1.4F * f1);
/* 221 */     this.field_78186_hbaby.rotateAngleY = (f4 * 0.017453292F);
/*     */   }
/*     */   
/*     */   public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_, float partialTickTime)
/*     */   {
/* 226 */     EntitySpottedHyena entityocelot = (EntitySpottedHyena)entitylivingbaseIn;
/* 227 */     this.leg1.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_);
/* 228 */     this.leg2.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_);
/* 229 */     this.leg3.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F + 3.1415927F) * 1.4F * p_78086_3_);
/* 230 */     this.leg4.rotateAngleX = (MathHelper.cos(p_78086_2_ * 0.6662F) * 1.4F * p_78086_3_);
/* 231 */     this.wolfMane.rotateAngleY = (partialTickTime * 0.017453292F);
/*     */     
/* 233 */     if (entityocelot.isSneaking())
/*     */     {
/* 235 */       this.wolfMane.setRotationPoint(0.0F, 11.3F, -3.9F);
/* 236 */       setRotateAngle(this.wolfMane, 3.0504866F, 0.0F, 0.0F);
/* 237 */       this.wolfTail.setRotationPoint(-1.3F, 13.0F, 8.0F);
/* 238 */       setRotateAngle(this.wolfTail, 0.045553092F, 0.0F, 0.0F);
/* 239 */       this.state = 0;
/*     */     }
/* 241 */     else if (entityocelot.isSprinting())
/*     */     {
/* 243 */       this.wolfTail.rotationPointY = this.wolfTail.rotationPointY;
/* 244 */       this.wolfTail.rotateAngleX = 1.5707964F;
/* 245 */       this.wolfMane.setRotationPoint(0.0F, 11.3F, -3.9F);
/* 246 */       setRotateAngle(this.wolfMane, 2.6862361F, 0.0F, 0.0F);
/* 247 */       this.state = 2;
/*     */     }
/*     */     else
/*     */     {
/* 251 */       this.wolfMane.setRotationPoint(0.0F, 11.3F, -3.9F);
/* 252 */       setRotateAngle(this.wolfMane, 2.6862361F, 0.0F, 0.0F);
/* 253 */       this.wolfTail.setRotationPoint(-1.3F, 13.0F, 8.0F);
/* 254 */       setRotateAngle(this.wolfTail, 0.045553092F, 0.0F, 0.0F);
/* 255 */       this.state = 1;
/*     */     }
/*     */   }
/*     */
public void func_178686_a(Object func_177087_b) {
	// TODO Auto-generated method stub
	
} }


/* Location:              C:\Users\jhwol\Downloads\release2 wildebeest-deobf.jar!\entity\ModelSpottedHyena.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */