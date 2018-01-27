package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderStripedHyena extends RenderLiving<EntityStripedHyena> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/stripedHyena.png");

    public static final Factory FACTORY = new Factory();

    public RenderStripedHyena(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelStripedHyena(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityStripedHyena entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityStripedHyena> {

        @Override
        public Render<? super EntityStripedHyena> createRenderFor(RenderManager manager) {
            return new RenderStripedHyena(manager);
        }

    }

}