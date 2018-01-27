package entity;

import javax.annotation.Nonnull;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderChacmaBaboon extends RenderLiving<EntityChacmaBaboon> {

    private ResourceLocation mobTexture = new ResourceLocation("wildanimals:textures/entity/primate/chacmababoon.png");

    public static final Factory FACTORY = new Factory();

    public RenderChacmaBaboon(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelChacmaBaboon(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityChacmaBaboon entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityChacmaBaboon> {

        @Override
        public Render<? super EntityChacmaBaboon> createRenderFor(RenderManager manager) {
            return new RenderChacmaBaboon(manager);
        }

    }

}