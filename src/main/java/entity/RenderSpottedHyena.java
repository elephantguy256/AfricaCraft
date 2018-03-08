package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderSpottedHyena extends RenderLiving<EntitySpottedHyena> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/hyena/spottedhyena.png");

    public static final Factory FACTORY = new Factory();

    public RenderSpottedHyena(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelSpottedHyena(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntitySpottedHyena entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntitySpottedHyena> {

        @Override
        public Render<? super EntitySpottedHyena> createRenderFor(RenderManager manager) {
            return new RenderSpottedHyena(manager);
        }

    }

}