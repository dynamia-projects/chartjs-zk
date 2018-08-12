package tools.dynamia.zk.addons.chartjs;

import java.util.ArrayList;
import java.util.List;

/**
 * The linear scale is use to chart numerical data. It can be placed on either the x or y axis.
 * The scatter chart type automatically configures a line chart to use one of these scales for the x axis.
 * As the name suggests, linear interpolation is used to determine where a value lies on the axis.
 */
public class Axe extends LazyJSONObject {

    private Boolean display;
    private String type;
    private String position;
    private boolean offset;
    private String id;
    private List<GridLine> gridLines = new ArrayList<GridLine>();
    private List<Tick> ticks = new ArrayList<Tick>();
    private ScaleLabel scaleLabel;


    public Axe addGridLine(GridLine gridLine) {
        gridLines.add(gridLine);
        return this;
    }

    public Axe addTick(Tick tick) {
        ticks.add(tick);
        return this;
    }

    public Boolean getDisplay() {
        return display;
    }

    public void setDisplay(Boolean display) {
        this.display = display;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isOffset() {
        return offset;
    }

    public void setOffset(boolean offset) {
        this.offset = offset;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<GridLine> getGridLines() {
        return gridLines;
    }

    public void setGridLines(List<GridLine> gridLines) {
        this.gridLines = gridLines;
    }

    public List<Tick> getTicks() {
        return ticks;
    }

    public void setTicks(List<Tick> ticks) {
        this.ticks = ticks;
    }

    public ScaleLabel getScaleLabel() {
        return scaleLabel;
    }

    public void setScaleLabel(ScaleLabel scaleLabel) {
        this.scaleLabel = scaleLabel;
    }

    public static final class Builder {
        private Boolean display;
        private String type;
        private String position;
        private boolean offset;
        private String id;
        private List<GridLine> gridLines = new ArrayList<GridLine>();
        private List<Tick> ticks = new ArrayList<Tick>();
        private ScaleLabel scaleLabel;

        private Builder() {
        }

        public static Builder init() {
            return new Builder();
        }

        public Builder display(Boolean display) {
            this.display = display;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder offset(boolean offset) {
            this.offset = offset;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder gridLines(List<GridLine> gridLines) {
            this.gridLines = gridLines;
            return this;
        }

        public Builder ticks(List<Tick> ticks) {
            this.ticks = ticks;
            return this;
        }

        public Builder scaleLabel(ScaleLabel scaleLabel) {
            this.scaleLabel = scaleLabel;
            return this;
        }

        public Axe build() {
            Axe axe = new Axe();
            axe.setDisplay(display);
            axe.setType(type);
            axe.setPosition(position);
            axe.setOffset(offset);
            axe.setId(id);
            axe.setGridLines(gridLines);
            axe.setTicks(ticks);
            axe.setScaleLabel(scaleLabel);
            return axe;
        }
    }
}

