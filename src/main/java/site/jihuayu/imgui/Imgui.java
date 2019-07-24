package site.jihuayu.imgui;

import imgui.impl.ImplGL3;
import imgui.impl.ImplGlfw;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import site.jihuayu.imgui.screen.ImguiScreen;

@Mod("imgui")
public class Imgui {
    private static final Logger LOGGER = LogManager.getLogger();
    public Imgui() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event)
    {
        if (InputMappings.isKeyDown(Minecraft.getInstance().mainWindow.getHandle(), 77))
        {
            System.out.println("open the screen");
            Minecraft.getInstance().displayGuiScreen(new ImguiScreen(new StringTextComponent("test")));
        }
    }
}
