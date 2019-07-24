package site.jihuayu.imgui.screen;

import imgui.Font;
import imgui.ImGui;
import imgui.ImguiKt;
import imgui.imgui.Context;
import imgui.impl.ImplGL3;
import imgui.impl.ImplGlfw;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.ITextComponent;
import screen.TestGuiKt;
import uno.glfw.GlfwWindow;

public class ImguiScreen extends Screen {
    protected static ImGui imgui = ImGui.INSTANCE;
    private static ImplGL3 implGl3;
    private static ImplGlfw implGlfw;

    static {
        ImguiKt.MINECRAFT_BEHAVIORS = true;
        GlfwWindow window = GlfwWindow.from(Minecraft.getInstance().mainWindow.getHandle());
        window.makeContextCurrent();
        new Context();
        implGlfw = new ImplGlfw(window, false, null);
        implGl3 = new ImplGL3();
        TestGuiKt.loadFont();
    }

    public ImguiScreen(ITextComponent titleIn) {
        super(titleIn);
    }
    @Override
    public void render(int x, int y, float partialTicks) {
        System.out.println("110111111111111111111111111111");

        implGl3.newFrame();
        System.out.println("000111111111111111111111111111");

        implGlfw.newFrame();
        System.out.println("00011111111112222222222222222222222");

        imgui.newFrame();
        System.out.println("220111111111111111111111111111");

        drawGui(x, y, partialTicks);

        imgui.render();
        implGl3.renderDrawData(imgui.getDrawData());

    }

    protected  void drawGui(int x, int y, float partialTicks){
        TestGuiKt.drawGui(x,y,partialTicks);
    }
}
