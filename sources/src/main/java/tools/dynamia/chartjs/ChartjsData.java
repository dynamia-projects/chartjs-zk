/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.dynamia.chartjs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mario
 */
public class ChartjsData extends LazyJSONObject {

    private List<String> labels = new ArrayList<>();
    private List<Dataset> datasets = new ArrayList<>();

    public void addLabel(String label) {
        labels.add(label);
    }

    public void setLabels(String... labels) {
        if (labels != null) {
            for (String label : labels) {
                addLabel(label);
            }
        }
    }

    public List<String> getLabels() {
        return labels;
    }

    public void addDataset(Dataset dataset) {
        datasets.add(dataset);
    }

    public List<Dataset> getDatasets() {
        return datasets;
    }

    @Override
    public void init() {
        put("labels", labels);
        put("datasets", datasets);

        datasets.forEach(d -> d.init());
    }
}
