package tools.dynamia.zk.addons.chartjs;

import org.zkoss.zul.Grid;

public class BarchartOptions extends ChartjsOptions {

    private Double barPercentage;
    private Double categoryPercentage;
    private Integer barThickness;
    private Integer maxBarThickness;


    public Double getBarPercentage() {

        return barPercentage;
    }

    public void setBarPercentage(Double barPercentage) {
        this.barPercentage = barPercentage;
    }

    public Double getCategoryPercentage() {
        return categoryPercentage;
    }

    public void setCategoryPercentage(Double categoryPercentage) {
        this.categoryPercentage = categoryPercentage;
    }

    public Integer getBarThickness() {
        return barThickness;
    }

    public void setBarThickness(Integer barThickness) {
        this.barThickness = barThickness;
    }

    public Integer getMaxBarThickness() {
        return maxBarThickness;
    }

    public void setMaxBarThickness(Integer maxBarThickness) {
        this.maxBarThickness = maxBarThickness;
    }


    public static final class Builder {
        private Double barPercentage;
        private Double categoryPercentage;
        private Integer barThickness;
        private Integer maxBarThickness;
        private String title;
        private boolean responsive = true;
        private Scales scales;


        private Builder() {
        }

        public static Builder init() {
            return new Builder();
        }

        public Builder barPercentage(Double barPercentage) {
            this.barPercentage = barPercentage;
            return this;
        }

        public Builder categoryPercentage(Double categoryPercentage) {
            this.categoryPercentage = categoryPercentage;
            return this;
        }

        public Builder barThickness(Integer barThickness) {
            this.barThickness = barThickness;
            return this;
        }

        public Builder maxBarThickness(Integer maxBarThickness) {
            this.maxBarThickness = maxBarThickness;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder responsive(boolean responsive) {
            this.responsive = responsive;
            return this;
        }

        public Builder scales(Scales scales) {
            this.scales = scales;
            return this;
        }

        public BarchartOptions build() {
            BarchartOptions barchartOptions = new BarchartOptions();
            barchartOptions.setBarPercentage(barPercentage);
            barchartOptions.setCategoryPercentage(categoryPercentage);
            barchartOptions.setBarThickness(barThickness);
            barchartOptions.setMaxBarThickness(maxBarThickness);
            barchartOptions.setTitle(title);
            barchartOptions.setResponsive(responsive);
            barchartOptions.setScales(scales);
            return barchartOptions;
        }
    }
}
