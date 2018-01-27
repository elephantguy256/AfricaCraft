package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderReticulatedGiraffe extends RenderLiving<EntityReticulatedGiraffe> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/preyanimal/reticulatedgiraffe.png");

    public static final Factory FACTORY = new Factory();

    public RenderReticulatedGiraffe(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelReticulatedGiraffe(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityReticulatedGiraffe entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityReticulatedGiraffe> {

        @Override
        public Render<? super EntityReticulatedGiraffe> createRenderFor(RenderManager manager) {
            return new RenderReticulatedGiraffe(manager);
        }

    }

}