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
 * @author Mario Serrano Leones
 */
public class Dataset<T> extends LazyJSONObject {

    private String type;
    private List<T> data;
    private String label;
    private String backgroundColor;
    private List<String> backgroundColors;

    private String borderColor;
    private Integer borderWidth;
    private String borderCapStyle;
    private String borderJoinStyle;
    private String borderDash;
    private String borderDashOffset;

    private String hoverBackgroundColor;
    private List<String> hoverBackgroundColors;

    private String pointBackgroundColor;
    private String pointBorderColor;
    private Integer pointBorderWidth;
    private String pointStyle;
    private Integer pointHitRadius;
    private String pointHoverBackgroundColor;
    private String pointHoverBorderColor;
    private Integer pointHoverBorderWidth;
    private Integer pointHoverRadius;
    private Integer radius;

    private Integer lineTension;

    private Boolean hidden;
    private Boolean fill;
    private Boolean showLine;
    private Boolean spanGaps;
    private Boolean steppedLine;

    private String xAxisID;
    private String yAxisID;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        String color = colorPalette.nextColor();
        addBackgroundColor(color);
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

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public String getBorderCapStyle() {
        return borderCapStyle;
    }

    public void setBorderCapStyle(String borderCapStyle) {
        this.borderCapStyle = borderCapStyle;
    }

    public String getBorderJoinStyle() {
        return borderJoinStyle;
    }

    public void setBorderJoinStyle(String borderJoinStyle) {
        this.borderJoinStyle = borderJoinStyle;
    }

    public String getBorderDash() {
        return borderDash;
    }

    public void setBorderDash(String borderDash) {
        this.borderDash = borderDash;
    }

    public String getBorderDashOffset() {
        return borderDashOffset;
    }

    public void setBorderDashOffset(String borderDashOffset) {
        this.borderDashOffset = borderDashOffset;
    }

    public void setPointBorderWidth(Integer pointBorderWidth) {
        this.pointBorderWidth = pointBorderWidth;
    }

    public String getPointStyle() {
        return pointStyle;
    }

    public void setPointStyle(String pointStyle) {
        this.pointStyle = pointStyle;
    }

    public Integer getLineTension() {
        return lineTension;
    }

    public void setLineTension(Integer lineTension) {
        this.lineTension = lineTension;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    public Integer getPointHitRadius() {
        return pointHitRadius;
    }

    public void setPointHitRadius(Integer pointHitRadius) {
        this.pointHitRadius = pointHitRadius;
    }

    public String getPointHoverBackgroundColor() {
        return pointHoverBackgroundColor;
    }

    public void setPointHoverBackgroundColor(String pointHoverBackgroundColor) {
        this.pointHoverBackgroundColor = pointHoverBackgroundColor;
    }

    public String getPointHoverBorderColor() {
        return pointHoverBorderColor;
    }

    public void setPointHoverBorderColor(String pointHoverBorderColor) {
        this.pointHoverBorderColor = pointHoverBorderColor;
    }

    public Integer getPointHoverBorderWidth() {
        return pointHoverBorderWidth;
    }

    public void setPointHoverBorderWidth(Integer pointHoverBorderWidth) {
        this.pointHoverBorderWidth = pointHoverBorderWidth;
    }

    public Integer getPointHoverRadius() {
        return pointHoverRadius;
    }

    public void setPointHoverRadius(Integer pointHoverRadius) {
        this.pointHoverRadius = pointHoverRadius;
    }

    public Boolean getShowLine() {
        return showLine;
    }

    public void setShowLine(Boolean showLine) {
        this.showLine = showLine;
    }

    public Boolean getSpanGaps() {
        return spanGaps;
    }

    public void setSpanGaps(Boolean spanGaps) {
        this.spanGaps = spanGaps;
    }

    public Boolean getSteppedLine() {
        return steppedLine;
    }

    public void setSteppedLine(Boolean steppedLine) {
        this.steppedLine = steppedLine;
    }

    @Override
    public void init() {
        super.init();
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

        put("data", data);

    }

    public void addBackgroundColor(String color) {
        if (backgroundColors == null) {
            backgroundColors = new ArrayList<String>();
        }
        backgroundColors.add(color);
    }

    public String getxAxisID() {
        return xAxisID;
    }

    public void setxAxisID(String xAxisID) {
        this.xAxisID = xAxisID;
    }

    public String getyAxisID() {
        return yAxisID;
    }

    public void setyAxisID(String yAxisID) {
        this.yAxisID = yAxisID;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public static final class Builder {
        private List data;
        private String label;
        private String backgroundColor;
        private List<String> backgroundColors;
        private String borderColor;
        private Integer borderWidth;
        private String borderCapStyle;
        private String borderJoinStyle;
        private String borderDash;
        private String borderDashOffset;
        private String hoverBackgroundColor;
        private List<String> hoverBackgroundColors;
        private String pointBackgroundColor;
        private String pointBorderColor;
        private Integer pointBorderWidth;
        private String pointStyle;
        private Integer pointHitRadius;
        private String pointHoverBackgroundColor;
        private String pointHoverBorderColor;
        private Integer pointHoverBorderWidth;
        private Integer pointHoverRadius;
        private Integer lineTension;
        private Boolean hidden;
        private Boolean fill;
        private Boolean showLine;
        private Boolean spanGaps;
        private Boolean steppedLine;
        private String xAxisID;
        private String yAxisID;
        private Integer radius;

        private Builder() {
        }

        public static Builder init() {
            return new Builder();
        }

        public Builder data(List data) {
            this.data = data;
            return this;
        }

        public Builder label(String label) {
            this.label = label;
            return this;
        }

        public Builder backgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Builder backgroundColors(List<String> backgroundColors) {
            this.backgroundColors = backgroundColors;
            return this;
        }

        public Builder borderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Builder borderWidth(Integer borderWidth) {
            this.borderWidth = borderWidth;
            return this;
        }

        public Builder borderCapStyle(String borderCapStyle) {
            this.borderCapStyle = borderCapStyle;
            return this;
        }

        public Builder borderJoinStyle(String borderJoinStyle) {
            this.borderJoinStyle = borderJoinStyle;
            return this;
        }

        public Builder borderDash(String borderDash) {
            this.borderDash = borderDash;
            return this;
        }

        public Builder borderDashOffset(String borderDashOffset) {
            this.borderDashOffset = borderDashOffset;
            return this;
        }

        public Builder hoverBackgroundColor(String hoverBackgroundColor) {
            this.hoverBackgroundColor = hoverBackgroundColor;
            return this;
        }

        public Builder hoverBackgroundColors(List<String> hoverBackgroundColors) {
            this.hoverBackgroundColors = hoverBackgroundColors;
            return this;
        }

        public Builder pointBackgroundColor(String pointBackgroundColor) {
            this.pointBackgroundColor = pointBackgroundColor;
            return this;
        }

        public Builder pointBorderColor(String pointBorderColor) {
            this.pointBorderColor = pointBorderColor;
            return this;
        }

        public Builder pointBorderWidth(Integer pointBorderWidth) {
            this.pointBorderWidth = pointBorderWidth;
            return this;
        }

        public Builder pointStyle(String pointStyle) {
            this.pointStyle = pointStyle;
            return this;
        }

        public Builder pointHitRadius(Integer pointHitRadius) {
            this.pointHitRadius = pointHitRadius;
            return this;
        }

        public Builder pointHoverBackgroundColor(String pointHoverBackgroundColor) {
            this.pointHoverBackgroundColor = pointHoverBackgroundColor;
            return this;
        }

        public Builder pointHoverBorderColor(String pointHoverBorderColor) {
            this.pointHoverBorderColor = pointHoverBorderColor;
            return this;
        }

        public Builder pointHoverBorderWidth(Integer pointHoverBorderWidth) {
            this.pointHoverBorderWidth = pointHoverBorderWidth;
            return this;
        }

        public Builder pointHoverRadius(Integer pointHoverRadius) {
            this.pointHoverRadius = pointHoverRadius;
            return this;
        }

        public Builder lineTension(Integer lineTension) {
            this.lineTension = lineTension;
            return this;
        }

        public Builder hidden(Boolean hidden) {
            this.hidden = hidden;
            return this;
        }

        public Builder fill(Boolean fill) {
            this.fill = fill;
            return this;
        }

        public Builder showLine(Boolean showLine) {
            this.showLine = showLine;
            return this;
        }

        public Builder spanGaps(Boolean spanGaps) {
            this.spanGaps = spanGaps;
            return this;
        }

        public Builder steppedLine(Boolean steppedLine) {
            this.steppedLine = steppedLine;
            return this;
        }

        public Builder xAxisID(String xAxisID) {
            this.xAxisID = xAxisID;
            return this;
        }

        public Builder yAxisID(String yAxisID) {
            this.yAxisID = yAxisID;
            return this;
        }

        public Builder radius(Integer radius) {
            this.radius = radius;
            return this;
        }

        public Dataset build() {
            Dataset dataset = new Dataset();
            dataset.setData(data);
            dataset.setLabel(label);
            dataset.setBackgroundColor(backgroundColor);
            dataset.setBackgroundColors(backgroundColors);
            dataset.setBorderColor(borderColor);
            dataset.setBorderWidth(borderWidth);
            dataset.setBorderCapStyle(borderCapStyle);
            dataset.setBorderJoinStyle(borderJoinStyle);
            dataset.setBorderDash(borderDash);
            dataset.setBorderDashOffset(borderDashOffset);
            dataset.setHoverBackgroundColor(hoverBackgroundColor);
            dataset.setHoverBackgroundColors(hoverBackgroundColors);
            dataset.setPointBackgroundColor(pointBackgroundColor);
            dataset.setPointBorderColor(pointBorderColor);
            dataset.setPointBorderWidth(pointBorderWidth);
            dataset.setPointStyle(pointStyle);
            dataset.setPointHitRadius(pointHitRadius);
            dataset.setPointHoverBackgroundColor(pointHoverBackgroundColor);
            dataset.setPointHoverBorderColor(pointHoverBorderColor);
            dataset.setPointHoverBorderWidth(pointHoverBorderWidth);
            dataset.setPointHoverRadius(pointHoverRadius);
            dataset.setLineTension(lineTension);
            dataset.setHidden(hidden);
            dataset.setFill(fill);
            dataset.setShowLine(showLine);
            dataset.setSpanGaps(spanGaps);
            dataset.setSteppedLine(steppedLine);
            dataset.xAxisID = this.xAxisID;
            dataset.yAxisID = this.yAxisID;
            dataset.setRadius(radius);
            return dataset;
        }
    }
}
