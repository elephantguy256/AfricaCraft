package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderAfricanLeopard extends RenderLiving<EntityAfricanLeopard> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/predator/africanleopard.png");

    public static final Factory FACTORY = new Factory();

    public RenderAfricanLeopard(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelAfricanLeopard(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityAfricanLeopard entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityAfricanLeopard> {

        @Override
        public Render<? super EntityAfricanLeopard> createRenderFor(RenderManager manager) {
            return new RenderAfricanLeopard(manager);
        }

    }

}