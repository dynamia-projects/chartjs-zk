package tools.dynamia.zk.addons.chartjs;

public class Labels extends LazyJSONObject {
    private Integer boxWidth;
    private Integer fontSize;
    private String fontStyle;
    private String fontColor;
    private String fontFamily;
    private Integer padding;
    private Boolean usePointStyle;

    public Integer getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(Integer boxWidth) {
        this.boxWidth = boxWidth;
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

    public Integer getPadding() {
        return padding;
    }

    public void setPadding(Integer padding) {
        this.padding = padding;
    }

    public Boolean getUsePointStyle() {
        return usePointStyle;
    }

    public void setUsePointStyle(Boolean usePointStyle) {
        this.usePointStyle = usePointStyle;
    }


    public static final class Builder {
        private Integer boxWidth;
        private Integer fontSize;
        private String fontStyle;
        private String fontColor;
        private String fontFamily;
        private Integer padding;
        private Boolean usePointStyle;

        private Builder() {
        }

        public static Builder init() {
            return new Builder();
        }

        public Builder boxWidth(Integer boxWidth) {
            this.boxWidth = boxWidth;
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

        public Builder fontColor(String fontColor) {
            this.fontColor = fontColor;
            return this;
        }

        public Builder fontFamily(String fontFamily) {
            this.fontFamily = fontFamily;
            return this;
        }

        public Builder padding(Integer padding) {
            this.padding = padding;
            return this;
        }

        public Builder usePointStyle(Boolean usePointStyle) {
            this.usePointStyle = usePointStyle;
            return this;
        }

        public Labels build() {
            Labels labels = new Labels();
            labels.setBoxWidth(boxWidth);
            labels.setFontSize(fontSize);
            labels.setFontStyle(fontStyle);
            labels.setFontColor(fontColor);
            labels.setFontFamily(fontFamily);
            labels.setPadding(padding);
            labels.setUsePointStyle(usePointStyle);
            return labels;
        }
    }
}
