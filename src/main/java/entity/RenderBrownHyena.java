package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBrownHyena extends RenderLiving<EntityBrownHyena> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/brownhyena.png");

    public static final Factory FACTORY = new Factory();

    public RenderBrownHyena(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelBrownHyena(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityBrownHyena entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityBrownHyena> {

        @Override
        public Render<? super EntityBrownHyena> createRenderFor(RenderManager manager) {
            return new RenderBrownHyena(manager);
        }

    }

}