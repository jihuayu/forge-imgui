package screen

import imgui.ImGui
import imgui.glyphRanges.chineseSimplifiedCommon

fun drawGui(x: Int, y: Int, partialTicks: Float) {

    ImGui.begin("hello")
    ImGui.button("no no no")
    ImGui.button("你好")
    ImGui.end()
}


fun  loadFont(){
    print (ImGui.io.fonts.addFontFromFileTTF("SIMYOU.TTF",16f, glyphRanges = chineseSimplifiedCommon)!=null)
}
