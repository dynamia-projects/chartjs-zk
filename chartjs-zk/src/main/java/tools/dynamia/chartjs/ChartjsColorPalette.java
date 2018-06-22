/*
 * Copyright 2016 Dynamia Soluciones IT.
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
package tools.dynamia.chartjs;

/**
 *
 * @author Mario Serrano Leones
 */
public class ChartjsColorPalette {

    private int last;
    private String name = "default";
    private String[] colors;

    public ChartjsColorPalette() {
    }

    public ChartjsColorPalette(String name, String[] colors) {
        this.name = name;
        this.colors = colors;
    }

    public String[] getColors() {
        if (colors == null) {
            colors = new String[]{"#4bacc6",
                "#c0504d",
                "#9bbb59",
                "#1f497d",
                "#f79646",
                "#93a9d0",
                "#b9ce96",
                "#d09392"};
        }
        return colors;
    }

    public String getName() {
        return name;
    }

    public String nextColor() {
        if (last >= getColors().length) {
            reset();
        }

        String color = getColors()[last];
        last++;
        return color;
    }

    public void reset() {
        last = 0;
    }
}
