package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderLioness extends RenderLiving<EntityLioness> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/lioness.png");

    public static final Factory FACTORY = new Factory();

    public RenderLioness(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelLioness(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityLioness entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityLioness> {

        @Override
        public Render<? super EntityLioness> createRenderFor(RenderManager manager) {
            return new RenderLioness(manager);
        }

    }

}