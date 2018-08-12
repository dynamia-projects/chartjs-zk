package tools.dynamia.zk.addons.chartjs;

/**
 * The scale label configuration is nested under the scale configuration in the scaleLabel property.
 * It defines options for the scale title. Note that this only applies to cartesian axes.
 */
public class ScaleLabel extends LazyJSONObject {

    private Boolean display;
    private String labelString;
    private String lineHeight;
    private String fontColor;
    private String fontFamily;
    private Integer fontSize;
    private String fontStyle;
    private String padding;

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public String getLabelString() {
        return labelString;
    }

    public void setLabelString(String labelString) {
        this.labelString = labelString;
    }

    public String getLineHeight() {
        return lineHeight;
    }

    public void setLineHeight(String lineHeight) {
        this.lineHeight = lineHeight;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontStyle() {
        return fontStyle;
    }

    public void setFontStyle(String fontStyle) {
        this.fontStyle = fontStyle;
    }

    public String getPadding() {
        return padding;
    }

    public void setPadding(String padding) {
        this.padding = padding;
    }


    public static final class Builder {
        private Boolean display;
        private String labelString;
        private String lineHeight;
        private String fontColor;
        private String fontFamily;
        private Integer fontSize;
        private String fontStyle;
        private String padding;

        private Builder() {
        }

        public static Builder init() {
            return new Builder();
        }

        public Builder display(Boolean display) {
            this.display = display;
            return this;
        }

        public Builder labelString(String labelString) {
            this.labelString = labelString;
            return this;
        }

        public Builder lineHeight(String lineHeight) {
            this.lineHeight = lineHeight;
            return this;
        }

        public Builder fontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }

        public Builder fontFamily(String fontFamily) {
            this.fontFamily = fontFamily;
            return this;
        }

        public Builder fontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Builder fontStyle(String fontStyle) {
            this.fontStyle = fontStyle;
            return this;
        }

        public Builder padding(String padding) {
            this.padding = padding;
            return this;
        }

        public ScaleLabel build() {
            ScaleLabel scaleLabel = new ScaleLabel();
            scaleLabel.setDisplay(display);
            scaleLabel.setLabelString(labelString);
            scaleLabel.setLineHeight(lineHeight);
            scaleLabel.setFontColor(fontColor);
            scaleLabel.setFontFamily(fontFamily);
            scaleLabel.setFontSize(fontSize);
            scaleLabel.setFontStyle(fontStyle);
            scaleLabel.setPadding(padding);
            return scaleLabel;
        }
    }
}
