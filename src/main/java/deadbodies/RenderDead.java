package deadbodies;

import entity.ModelAfricanElephant;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderDead extends Render<EntityDeath> {

    public static final Factory FACTORY = new Factory();

    public RenderDead(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn);
    }


    public static class Factory implements IRenderFactory<EntityDeath> {

        @Override
        public RenderDead createRenderFor(RenderManager manager) {
            return new RenderDead(manager);
        }

    }


	@Override
	protected ResourceLocation getEntityTexture(EntityDeath entity) {
		// TODO Auto-generated method stub
		return null;
	}

}