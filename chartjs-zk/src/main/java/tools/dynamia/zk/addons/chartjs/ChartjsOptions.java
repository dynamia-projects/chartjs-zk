/* 
 * Copyright 2016 Mario Serrano Leones.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tools.dynamia.zk.addons.chartjs;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mario Serrano Leones
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
            Map<String, Object> titleMap = new HashMap<String, Object>();
            titleMap.put("text", title);
            titleMap.put("display", true);
            put("title", titleMap);
        }
        put("responsive", responsive);
    }

}
