package tools.dynamia.zk.addons.chartjs;

import java.util.ArrayList;
import java.util.List;

public class Scales extends LazyJSONObject {

    private List<Axe> xAxes = new ArrayList<Axe>();
    private List<Axe> yAxes = new ArrayList<Axe>();

    public Scales() {
    }

    public Scales(Axe xAxe, Axe yAxe) {
        addX(xAxe);
        addY(yAxe);
    }

    public Scales addY(Axe yAxe) {
        yAxes.add(yAxe);
        return this;
    }

    public Scales addX(Axe xAxe) {
        xAxes.add(xAxe);
        return this;
    }

    @Override
    public void init() {
        if (!xAxes.isEmpty()) {
            for (Axe axe : xAxes){
                axe.init();
            }
            put("xAxes", xAxes);
        }

        if (!yAxes.isEmpty()) {
            for (Axe axe : yAxes){
                axe.init();
            }
            put("yAxes", yAxes);
        }
    }

    public List<Axe> getxAxes() {
        return xAxes;
    }

    public List<Axe> getyAxes() {
        return yAxes;
    }
}
