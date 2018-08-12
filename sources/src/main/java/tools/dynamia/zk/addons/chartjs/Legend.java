package tools.dynamia.zk.addons.chartjs;

/**
 * The chart legend displays data about the datasets that area appearing on the chart.
 */
public class Legend extends LazyJSONObject {

    private Boolean display;
    private String position;
    private Boolean fullWidth;
    private Boolean reverse;
    private Labels labels;

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getFullWidth() {
        return fullWidth;
    }

    public void setFullWidth(Boolean fullWidth) {
        this.fullWidth = fullWidth;
    }

    public Boolean getReverse() {
        return reverse;
    }

    public void setReverse(Boolean reverse) {
        this.reverse = reverse;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    public static final class Builder {
        private Boolean display;
        private String position;
        private Boolean fullWidth;
        private Boolean reverse;
        private Labels labels;

        private Builder() {
        }

        public static Builder aLegend() {
            return new Builder();
        }

        public Builder display(Boolean display) {
            this.display = display;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder fullWidth(Boolean fullWidth) {
            this.fullWidth = fullWidth;
            return this;
        }

        public Builder reverse(Boolean reverse) {
            this.reverse = reverse;
            return this;
        }

        public Builder labels(Labels labels) {
            this.labels = labels;
            return this;
        }

        public Legend build() {
            Legend legend = new Legend();
            legend.setDisplay(display);
            legend.setPosition(position);
            legend.setFullWidth(fullWidth);
            legend.setReverse(reverse);
            legend.setLabels(labels);
            return legend;
        }
    }


}
