package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderLion extends RenderLiving<EntityLion> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/lion.png");

    public static final Factory FACTORY = new Factory();

    public RenderLion(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelLion(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityLion entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityLion> {

        @Override
        public Render<? super EntityLion> createRenderFor(RenderManager manager) {
            return new RenderLion(manager);
        }

    }

}