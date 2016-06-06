/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.dynamia.chartjs;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mario
 */
public class ChartjsOptions extends LazyJSONObject {

    private String title;
    private boolean responsive = true;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public boolean isResponsive() {
        return responsive;
    }

    public void setResponsive(boolean responsive) {
        this.responsive = responsive;
    }

    @Override
    public void init() {
        if (title != null) {
            Map<String, Object> titleMap = new HashMap<>();
            titleMap.put("text", title);
            titleMap.put("display", true);
            put("title", titleMap);
        }
        put("responsive", responsive);
    }

}
