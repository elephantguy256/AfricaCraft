package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderCheetah extends RenderLiving<EntityCheetah> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/cheetah.png");

    public static final Factory FACTORY = new Factory();

    public RenderCheetah(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelCheetah(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityCheetah entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityCheetah> {

        @Override
        public Render<? super EntityCheetah> createRenderFor(RenderManager manager) {
            return new RenderCheetah(manager);
        }

    }

}