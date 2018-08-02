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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mario Serrano Leones
 */
public class Dataset<T> extends LazyJSONObject {

    private List<T> data;
    private String label;
    private String backgroundColor;
    private List<String> backgroundColors;

    private String borderColor;
    private int borderWidth;
    private String hoverBackgroundColor;
    private List<String> hoverBackgroundColors;

    private String pointBackgroundColor;
    private String pointBorderColor;
    private int pointBorderWidth;

    private boolean hidden;
    private boolean fill = true;
    private ChartjsColorPalette colorPalette = new ChartjsColorPalette();

    public Dataset() {
    }

    public Dataset(String label) {
        this.label = label;
    }

    public Dataset(String label, List<T> data) {
        this.label = label;
        this.data = data;
        for (T t : data) {
            addBackgroundColor(colorPalette.nextColor());
        }
    }

    public Dataset(String label, String backgroundColor, List<T> data) {
        this.label = label;
        this.backgroundColor = backgroundColor;
        this.data = data;
    }

    public String getLabel() {
        return label;
    }

    public Dataset<T> setLabel(String label) {
        this.label = label;
        return this;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public Dataset<T> setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public List<T> getData() {
        return data;
    }

    public Dataset<T> setData(List<T> data) {
        this.data = data;
        return this;
    }

    public Dataset<T> setData(T... data) {
        this.data = Arrays.asList(data);
        return this;
    }

    public Dataset<T> addData(T data) {
        if (this.data == null) {
            this.data = new ArrayList<T>();
        }
        this.data.add(data);
        addBackgroundColor(colorPalette.nextColor());
        return this;
    }

    public List<String> getBackgroundColors() {
        return backgroundColors;
    }

    public Dataset<T> setBackgroundColors(List<String> backgroundColors) {
        this.backgroundColors = backgroundColors;
        return this;
    }

    public Dataset<T> setBackgroundColors(String... colors) {
        this.backgroundColors = Arrays.asList(colors);
        return this;
    }

    public int getBorderWidth() {
        return borderWidth;
    }

    public Dataset<T> setBorderWidth(int borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public Dataset<T> setHoverBackgroundColor(String hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
        return this;
    }

    public List<String> getHoverBackgroundColors() {
        return hoverBackgroundColors;
    }

    public Dataset<T> setHoverBackgroundColors(List<String> hoverBackgroundColors) {
        this.hoverBackgroundColors = hoverBackgroundColors;
        return this;
    }

    public Dataset<T> setHoverBackgroundColors(String... colors) {
        this.hoverBackgroundColors = Arrays.asList(colors);

        return this;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public boolean isFill() {
        return fill;
    }

    public Dataset<T> setFill(boolean fill) {
        this.fill = fill;
        return this;
    }

    public String getBorderColor() {
        return borderColor;

    }

    public Dataset<T> setBorderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public String getPointBackgroundColor() {
        return pointBackgroundColor;
    }

    public Dataset<T> setPointBackgroundColor(String pointBackgroundColor) {
        this.pointBackgroundColor = pointBackgroundColor;
        return this;
    }

    public String getPointBorderColor() {
        return pointBorderColor;
    }

    public Dataset<T> setPointBorderColor(String pointBorderColor) {
        this.pointBorderColor = pointBorderColor;
        return this;
    }

    public int getPointBorderWidth() {
        return pointBorderWidth;
    }

    public Dataset<T> setPointBorderWidth(int pointBorderWidth) {
        this.pointBorderWidth = pointBorderWidth;
        return this;
    }

    public ChartjsColorPalette getColorPalette() {
        return colorPalette;
    }

    public void setColorPalette(ChartjsColorPalette colorPalette) {
        if (colorPalette != null) {
            this.colorPalette = colorPalette;
        }
    }

    @Override
    public void init() {
        if (label != null) {
            put("label", label);
        }
        if (backgroundColor != null) {
            put("backgroundColor", backgroundColor);
        } else if (backgroundColors != null && !backgroundColors.isEmpty()) {
            put("backgroundColor", backgroundColors);
        }

        if (hoverBackgroundColor != null) {
            put("hoverBackgroundColor", hoverBackgroundColor);
        } else if (hoverBackgroundColors != null && !hoverBackgroundColors.isEmpty()) {
            put("hoverBackgroundColor", hoverBackgroundColors);
        }

        if (borderColor != null) {
            put("borderColor", borderColor);
        }

        if (borderWidth > 0) {
            put("borderWidth", borderWidth);
        }

        if (pointBackgroundColor != null) {
            put("pointBackgroundColor", pointBackgroundColor);
        }

        if (pointBorderColor != null) {
            put("pointBorderColor", pointBorderColor);
        }
        if (pointBorderWidth > 0) {
            put("pointBorderWith", pointBorderWidth);
        }
        put("hidden", hidden);
        put("data", data);
        put("fill", fill);
    }

    public void addBackgroundColor(String color) {
        if (backgroundColors == null) {
            backgroundColors = new ArrayList<String>();
        }
        backgroundColors.add(color);
    }

}
