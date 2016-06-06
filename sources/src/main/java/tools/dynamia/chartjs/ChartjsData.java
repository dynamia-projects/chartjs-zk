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
package tools.dynamia.chartjs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario Serrano Leones
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
