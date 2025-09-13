package cn.ksmcbrigade.example;

import cn.ksmcbrigade.example.client.ExampleUI;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

/**
 * &#064;Author: KSmc_brigade
 * &#064;Date: 2025/9/13 上午10:05
 */
public class MenuCompat implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return screen -> {
          return new ExampleUI();
        };
    }
}
