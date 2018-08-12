package tools.dynamia.zk.addons.chartjs;

public class Tooltips extends LazyJSONObject {

    private Boolean enabled;
    private String mode;
    private Boolean intersect;
    private String position;
    private String backgroundColor;
    private String titleFontFamily;
    private Integer titleFontSize;
    private String titleFontStyle;
    private String titleFontColor;
    private Integer titleSpacing;
    private Integer titleMarginBottom;
    private String bodyFontFamily;
    private Integer bodyFontSize;
    private String bodyFontStyle;
    private Integer bodySpacing;
    private String footerFontFamily;
    private Integer footerFontSize;
    private String footerFontStyle;
    private Integer footerSpacing;
    private Integer xPadding;
    private Integer yPadding;
    private Integer caretPadding;
    private Integer caretSize;
    private Integer cornerRadius;
    private String multiKeyBackground;
    private Boolean displayColors;
    private String borderColor;
    private Integer borderWidth;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Boolean getIntersect() {
        return intersect;
    }

    public void setIntersect(Boolean intersect) {
        this.intersect = intersect;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getTitleFontFamily() {
        return titleFontFamily;
    }

    public void setTitleFontFamily(String titleFontFamily) {
        this.titleFontFamily = titleFontFamily;
    }

    public Integer getTitleFontSize() {
        return titleFontSize;
    }

    public void setTitleFontSize(Integer titleFontSize) {
        this.titleFontSize = titleFontSize;
    }

    public String getTitleFontStyle() {
        return titleFontStyle;
    }

    public void setTitleFontStyle(String titleFontStyle) {
        this.titleFontStyle = titleFontStyle;
    }

    public String getTitleFontColor() {
        return titleFontColor;
    }

    public void setTitleFontColor(String titleFontColor) {
        this.titleFontColor = titleFontColor;
    }

    public Integer getTitleSpacing() {
        return titleSpacing;
    }

    public void setTitleSpacing(Integer titleSpacing) {
        this.titleSpacing = titleSpacing;
    }

    public Integer getTitleMarginBottom() {
        return titleMarginBottom;
    }

    public void setTitleMarginBottom(Integer titleMarginBottom) {
        this.titleMarginBottom = titleMarginBottom;
    }

    public String getBodyFontFamily() {
        return bodyFontFamily;
    }

    public void setBodyFontFamily(String bodyFontFamily) {
        this.bodyFontFamily = bodyFontFamily;
    }

    public Integer getBodyFontSize() {
        return bodyFontSize;
    }

    public void setBodyFontSize(Integer bodyFontSize) {
        this.bodyFontSize = bodyFontSize;
    }

    public String getBodyFontStyle() {
        return bodyFontStyle;
    }

    public void setBodyFontStyle(String bodyFontStyle) {
        this.bodyFontStyle = bodyFontStyle;
    }

    public Integer getBodySpacing() {
        return bodySpacing;
    }

    public void setBodySpacing(Integer bodySpacing) {
        this.bodySpacing = bodySpacing;
    }

    public String getFooterFontFamily() {
        return footerFontFamily;
    }

    public void setFooterFontFamily(String footerFontFamily) {
        this.footerFontFamily = footerFontFamily;
    }

    public Integer getFooterFontSize() {
        return footerFontSize;
    }

    public void setFooterFontSize(Integer footerFontSize) {
        this.footerFontSize = footerFontSize;
    }

    public String getFooterFontStyle() {
        return footerFontStyle;
    }

    public void setFooterFontStyle(String footerFontStyle) {
        this.footerFontStyle = footerFontStyle;
    }

    public Integer getFooterSpacing() {
        return footerSpacing;
    }

    public void setFooterSpacing(Integer footerSpacing) {
        this.footerSpacing = footerSpacing;
    }

    public Integer getxPadding() {
        return xPadding;
    }

    public void setxPadding(Integer xPadding) {
        this.xPadding = xPadding;
    }

    public Integer getyPadding() {
        return yPadding;
    }

    public void setyPadding(Integer yPadding) {
        this.yPadding = yPadding;
    }

    public Integer getCaretPadding() {
        return caretPadding;
    }

    public void setCaretPadding(Integer caretPadding) {
        this.caretPadding = caretPadding;
    }

    public Integer getCaretSize() {
        return caretSize;
    }

    public void setCaretSize(Integer caretSize) {
        this.caretSize = caretSize;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public String getMultiKeyBackground() {
        return multiKeyBackground;
    }

    public void setMultiKeyBackground(String multiKeyBackground) {
        this.multiKeyBackground = multiKeyBackground;
    }

    public Boolean getDisplayColors() {
        return displayColors;
    }

    public void setDisplayColors(Boolean displayColors) {
        this.displayColors = displayColors;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public static final class Builder {
        private Boolean enabled;
        private String mode;
        private Boolean intersect;
        private String position;
        private String backgroundColor;
        private String titleFontFamily;
        private Integer titleFontSize;
        private String titleFontStyle;
        private String titleFontColor;
        private Integer titleSpacing;
        private Integer titleMarginBottom;
        private String bodyFontFamily;
        private Integer bodyFontSize;
        private String bodyFontStyle;
        private Integer bodySpacing;
        private String footerFontFamily;
        private Integer footerFontSize;
        private String footerFontStyle;
        private Integer footerSpacing;
        private Integer xPadding;
        private Integer yPadding;
        private Integer caretPadding;
        private Integer caretSize;
        private Integer cornerRadius;
        private String multiKeyBackground;
        private Boolean displayColors;
        private String borderColor;
        private Integer borderWidth;

        private Builder() {
        }

        public static Builder init() {
            return new Builder();
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public Builder intersect(Boolean intersect) {
            this.intersect = intersect;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder backgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Builder titleFontFamily(String titleFontFamily) {
            this.titleFontFamily = titleFontFamily;
            return this;
        }

        public Builder titleFontSize(Integer titleFontSize) {
            this.titleFontSize = titleFontSize;
            return this;
        }

        public Builder titleFontStyle(String titleFontStyle) {
            this.titleFontStyle = titleFontStyle;
            return this;
        }

        public Builder titleFontColor(String titleFontColor) {
            this.titleFontColor = titleFontColor;
            return this;
        }

        public Builder titleSpacing(Integer titleSpacing) {
            this.titleSpacing = titleSpacing;
            return this;
        }

        public Builder titleMarginBottom(Integer titleMarginBottom) {
            this.titleMarginBottom = titleMarginBottom;
            return this;
        }

        public Builder bodyFontFamily(String bodyFontFamily) {
            this.bodyFontFamily = bodyFontFamily;
            return this;
        }

        public Builder bodyFontSize(Integer bodyFontSize) {
            this.bodyFontSize = bodyFontSize;
            return this;
        }

        public Builder bodyFontStyle(String bodyFontStyle) {
            this.bodyFontStyle = bodyFontStyle;
            return this;
        }

        public Builder bodySpacing(Integer bodySpacing) {
            this.bodySpacing = bodySpacing;
            return this;
        }

        public Builder footerFontFamily(String footerFontFamily) {
            this.footerFontFamily = footerFontFamily;
            return this;
        }

        public Builder footerFontSize(Integer footerFontSize) {
            this.footerFontSize = footerFontSize;
            return this;
        }

        public Builder footerFontStyle(String footerFontStyle) {
            this.footerFontStyle = footerFontStyle;
            return this;
        }

        public Builder footerSpacing(Integer footerSpacing) {
            this.footerSpacing = footerSpacing;
            return this;
        }

        public Builder xPadding(Integer xPadding) {
            this.xPadding = xPadding;
            return this;
        }

        public Builder yPadding(Integer yPadding) {
            this.yPadding = yPadding;
            return this;
        }

        public Builder caretPadding(Integer caretPadding) {
            this.caretPadding = caretPadding;
            return this;
        }

        public Builder caretSize(Integer caretSize) {
            this.caretSize = caretSize;
            return this;
        }

        public Builder cornerRadius(Integer cornerRadius) {
            this.cornerRadius = cornerRadius;
            return this;
        }

        public Builder multiKeyBackground(String multiKeyBackground) {
            this.multiKeyBackground = multiKeyBackground;
            return this;
        }

        public Builder displayColors(Boolean displayColors) {
            this.displayColors = displayColors;
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

        public Tooltips build() {
            Tooltips tooltips = new Tooltips();
            tooltips.setEnabled(enabled);
            tooltips.setMode(mode);
            tooltips.setIntersect(intersect);
            tooltips.setPosition(position);
            tooltips.setBackgroundColor(backgroundColor);
            tooltips.setTitleFontFamily(titleFontFamily);
            tooltips.setTitleFontSize(titleFontSize);
            tooltips.setTitleFontStyle(titleFontStyle);
            tooltips.setTitleFontColor(titleFontColor);
            tooltips.setTitleSpacing(titleSpacing);
            tooltips.setTitleMarginBottom(titleMarginBottom);
            tooltips.setBodyFontFamily(bodyFontFamily);
            tooltips.setBodyFontSize(bodyFontSize);
            tooltips.setBodyFontStyle(bodyFontStyle);
            tooltips.setBodySpacing(bodySpacing);
            tooltips.setFooterFontFamily(footerFontFamily);
            tooltips.setFooterFontSize(footerFontSize);
            tooltips.setFooterFontStyle(footerFontStyle);
            tooltips.setFooterSpacing(footerSpacing);
            tooltips.setCaretPadding(caretPadding);
            tooltips.setCaretSize(caretSize);
            tooltips.setCornerRadius(cornerRadius);
            tooltips.setMultiKeyBackground(multiKeyBackground);
            tooltips.setDisplayColors(displayColors);
            tooltips.setBorderColor(borderColor);
            tooltips.setBorderWidth(borderWidth);
            tooltips.yPadding = this.yPadding;
            tooltips.xPadding = this.xPadding;
            return tooltips;
        }
    }
}
