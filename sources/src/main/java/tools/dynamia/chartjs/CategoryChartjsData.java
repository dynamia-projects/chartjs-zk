/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.dynamia.chartjs;

/**
 *
 * @author mario
 */
public class CategoryChartjsData extends ChartjsData {

    private Dataset<Number> dataset;

    public CategoryChartjsData() {
        dataset = new Dataset<>("Values");
        addDataset(dataset);
    }

    public void add(String label, Number value, String backgroundColor) {
        addLabel(label);
        dataset.addData(value);
        if (backgroundColor != null && !backgroundColor.isEmpty()) {
            dataset.addBackgroundColor(backgroundColor);
        }
    }

    public void add(String label, Number value) {
        CategoryChartjsData.this.add(label, value, null);
    }

}
