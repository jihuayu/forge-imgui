package screen

import imgui.ImGui
import imgui.glyphRanges.chineseSimplifiedCommon

fun drawGui(x: Int, y: Int, partialTicks: Float) {
    print("00000000000000000000000000")
    ImGui.begin("hello")
    ImGui.button("hello")
//    ImGui.button("你好")
    ImGui.end()
//    ImGui.render()
    ImGui.begin("goodbye")
    ImGui.button("good bye")
//    ImGui.button("再见")
    ImGui.end()
    print("11111111111111111111")

}


fun loadFont(){
//    print("11111111111111111111")
    print (ImGui.io.fonts.addFontFromFileTTF("SIMYOU.TTF",16f, glyphRanges = chineseSimplifiedCommon)!=null)
}
