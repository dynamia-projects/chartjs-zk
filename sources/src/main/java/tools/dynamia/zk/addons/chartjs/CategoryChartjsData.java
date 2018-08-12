/*
 * Copyright 2016 Mario Serrano Leones.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tools.dynamia.zk.addons.chartjs;

/**
 * Category data model. Use this class has a helper for Bar, Pie and similiar charts types.
 *
 * @author Mario Serrano Leones
 */
public class CategoryChartjsData extends ChartjsData {

    private Dataset<Number> dataset;

    public CategoryChartjsData() {
        dataset = new Dataset<Number>("Values");
        addDataset(dataset);
    }

    public CategoryChartjsData add(String label, Number value, String backgroundColor) {
        addLabel(label);
        dataset.addData(value);
        if (backgroundColor != null && !backgroundColor.isEmpty()) {
            dataset.addBackgroundColor(backgroundColor);
        }
        return this;
    }

    public CategoryChartjsData add(String label, Number value) {
        addLabel(label);
        dataset.addData(value);
        return this;
    }

    public CategoryChartjsData setDatasetLabel(String label) {
        dataset.setLabel(label);
        return this;
    }

    public Dataset<Number> getDataset() {
        return dataset;
    }
}
