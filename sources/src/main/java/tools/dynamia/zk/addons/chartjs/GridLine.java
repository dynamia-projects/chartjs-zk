package tools.dynamia.zk.addons.chartjs;

/**
 * Grid Line Configuration.
 * The grid line configuration get nested under the scale configuration in the gridLines property. It defines options
 * for the grid lines that run perpendicular to the axis.
 *
 * Use @{@link Builder} for better api usage
 */
public class GridLine extends LazyJSONObject {

    private Boolean display;
    private String color;
    private String[] colors;
    private Integer[] borderDash;
    private Integer borderDashOffset;
    private Integer lineWidth;
    private Boolean drawBorder;
    private Boolean drawOnChartArea;
    private Boolean drawTicks;
    private Integer tickMarkLength;
    private Integer zeroLineWidth;
    private String zeroLineColor;
    private Integer[] zeroLineBorderDash;
    private Integer zeroLineBorderDashOffset;
    private Boolean offsetGridLines;

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public Integer[] getBorderDash() {
        return borderDash;
    }

    public void setBorderDash(Integer[] borderDash) {
        this.borderDash = borderDash;
    }

    public Integer getBorderDashOffset() {
        return borderDashOffset;
    }

    public void setBorderDashOffset(Integer borderDashOffset) {
        this.borderDashOffset = borderDashOffset;
    }

    public Integer getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(Integer lineWidth) {
        this.lineWidth = lineWidth;
    }

    public Boolean getDrawBorder() {
        return drawBorder;
    }

    public void setDrawBorder(Boolean drawBorder) {
        this.drawBorder = drawBorder;
    }

    public Boolean getDrawOnChartArea() {
        return drawOnChartArea;
    }

    public void setDrawOnChartArea(Boolean drawOnChartArea) {
        this.drawOnChartArea = drawOnChartArea;
    }

    public Boolean getDrawTicks() {
        return drawTicks;
    }

    public void setDrawTicks(Boolean drawTicks) {
        this.drawTicks = drawTicks;
    }

    public Integer getTickMarkLength() {
        return tickMarkLength;
    }

    public void setTickMarkLength(Integer tickMarkLength) {
        this.tickMarkLength = tickMarkLength;
    }

    public Integer getZeroLineWidth() {
        return zeroLineWidth;
    }

    public void setZeroLineWidth(Integer zeroLineWidth) {
        this.zeroLineWidth = zeroLineWidth;
    }

    public String getZeroLineColor() {
        return zeroLineColor;
    }

    public void setZeroLineColor(String zeroLineColor) {
        this.zeroLineColor = zeroLineColor;
    }

    public Integer[] getZeroLineBorderDash() {
        return zeroLineBorderDash;
    }

    public void setZeroLineBorderDash(Integer[] zeroLineBorderDash) {
        this.zeroLineBorderDash = zeroLineBorderDash;
    }

    public Integer getZeroLineBorderDashOffset() {
        return zeroLineBorderDashOffset;
    }

    public void setZeroLineBorderDashOffset(Integer zeroLineBorderDashOffset) {
        this.zeroLineBorderDashOffset = zeroLineBorderDashOffset;
    }

    public Boolean getOffsetGridLines() {
        return offsetGridLines;
    }

    public void setOffsetGridLines(Boolean offsetGridLines) {
        this.offsetGridLines = offsetGridLines;
    }


    public static final class Builder {
        private Boolean display = true;
        private String color;
        private String[] colors;
        private Integer[] borderDash;
        private Integer borderDashOffset;
        private Integer lineWidth;
        private Boolean drawBorder = true;
        private Boolean drawOnChartArea = true;
        private Boolean drawTicks = true;
        private Integer tickMarkLength;
        private Integer zeroLineWidth;
        private String zeroLineColor;
        private Integer[] zeroLineBorderDash;
        private Integer zeroLineBorderDashOffset;
        private Boolean offsetGridLines;

        private Builder() {
        }

        public static Builder init() {
            return new Builder();
        }

        public Builder display(Boolean display) {
            this.display = display;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder colors(String[] colors) {
            this.colors = colors;
            return this;
        }

        public Builder borderDash(Integer[] borderDash) {
            this.borderDash = borderDash;
            return this;
        }

        public Builder borderDashOffset(Integer borderDashOffset) {
            this.borderDashOffset = borderDashOffset;
            return this;
        }

        public Builder lineWidth(Integer lineWidth) {
            this.lineWidth = lineWidth;
            return this;
        }

        public Builder drawBorder(Boolean drawBorder) {
            this.drawBorder = drawBorder;
            return this;
        }

        public Builder drawOnChartArea(Boolean drawOnChartArea) {
            this.drawOnChartArea = drawOnChartArea;
            return this;
        }

        public Builder drawTicks(Boolean drawTicks) {
            this.drawTicks = drawTicks;
            return this;
        }

        public Builder tickMarkLength(Integer tickMarkLength) {
            this.tickMarkLength = tickMarkLength;
            return this;
        }

        public Builder zeroLineWidth(Integer zeroLineWidth) {
            this.zeroLineWidth = zeroLineWidth;
            return this;
        }

        public Builder zeroLineColor(String zeroLineColor) {
            this.zeroLineColor = zeroLineColor;
            return this;
        }

        public Builder zeroLineBorderDash(Integer[] zeroLineBorderDash) {
            this.zeroLineBorderDash = zeroLineBorderDash;
            return this;
        }

        public Builder zeroLineBorderDashOffset(Integer zeroLineBorderDashOffset) {
            this.zeroLineBorderDashOffset = zeroLineBorderDashOffset;
            return this;
        }

        public Builder offsetGridLines(Boolean offsetGridLines) {
            this.offsetGridLines = offsetGridLines;
            return this;
        }

        public GridLine build() {
            GridLine gridLine = new GridLine();
            gridLine.setDisplay(display);
            gridLine.setColor(color);
            gridLine.setColors(colors);
            gridLine.setBorderDash(borderDash);
            gridLine.setBorderDashOffset(borderDashOffset);
            gridLine.setLineWidth(lineWidth);
            gridLine.setDrawBorder(drawBorder);
            gridLine.setDrawOnChartArea(drawOnChartArea);
            gridLine.setDrawTicks(drawTicks);
            gridLine.setTickMarkLength(tickMarkLength);
            gridLine.setZeroLineWidth(zeroLineWidth);
            gridLine.setZeroLineColor(zeroLineColor);
            gridLine.setZeroLineBorderDash(zeroLineBorderDash);
            gridLine.setZeroLineBorderDashOffset(zeroLineBorderDashOffset);
            gridLine.setOffsetGridLines(offsetGridLines);
            return gridLine;
        }
    }
}
