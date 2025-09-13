package cn.ksmcbrigade.example.client;

import meteordevelopment.meteorclient.gui.GuiThemes;
import meteordevelopment.meteorclient.gui.WindowScreen;
import meteordevelopment.meteorclient.gui.renderer.packer.GuiTexture;
import meteordevelopment.meteorclient.gui.themes.meteor.widgets.*;
import meteordevelopment.meteorclient.gui.themes.meteor.widgets.input.WMeteorTextBox;
import meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorButton;
import meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorCheckbox;
import meteordevelopment.meteorclient.gui.themes.meteor.widgets.pressable.WMeteorPlus;
import meteordevelopment.meteorclient.gui.utils.StarscriptTextBoxRenderer;
import meteordevelopment.meteorclient.gui.widgets.WWidget;
import meteordevelopment.meteorclient.gui.widgets.containers.WHorizontalList;
import meteordevelopment.meteorclient.gui.widgets.containers.WVerticalList;
import meteordevelopment.meteorclient.gui.widgets.pressable.WButton;

/**
 * &#064;Author: KSmc_brigade
 * &#064;Date: 2025/9/13 上午10:07
 */
public class ExampleUI extends WindowScreen {
    public ExampleUI() {
        super(GuiThemes.get(), "exampleUI");
    }

    @Override
    public void initWidgets() {
        WMeteorView list = new WMeteorView();
        list.theme = this.theme;

        WButton button = new WMeteorButton("TEST", new GuiTexture());
        button.theme = this.theme;
        button.action = () -> System.out.println(button.theme.name);

        this.addTo(list,new WMeteorLabel("TestThings:",true));

        this.addTo(list,new WMeteorLabel("TestCheckbox: ",false),new WMeteorCheckbox(false));
        this.addTo(list,new WMeteorLabel("TestTextBox: ",false),new WMeteorTextBox("0.1", "test_placer", (s, c) -> true,StarscriptTextBoxRenderer.class));
        this.addTo(list,new WMeteorLabel("TestButton: ",false),button);
        this.addTo(list,new WMeteorLabel("TestPlusButton: ",false),new WMeteorPlus());

        this.addTo(list,new WMeteorLabel("TestEnd",true));
        this.add(list);
    }

    public void addTo(WVerticalList list, WWidget... widgets){
        WHorizontalList horizontalList = new WHorizontalList();
        horizontalList.width = 200;
        horizontalList.theme = list.theme;
        for (WWidget widget : widgets) {
            horizontalList.add(widget);
        }
        list.add(horizontalList);
    }
}
