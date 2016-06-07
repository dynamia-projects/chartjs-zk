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

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario Serrano Leones
 */
public class ChartjsData extends LazyJSONObject {

    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private final List<String> labels = new ArrayList<String>();
    private final List<Dataset> datasets = new ArrayList<Dataset>();

    @Override
    public void init() {
        put("labels", labels);
        put("datasets", datasets);

        for (Dataset dataset : datasets) {
            dataset.init();
        }
    }

    public void addLabel(String label) {
        labels.add(label);
        propertyChangeSupport.firePropertyChange("labels", null, this.labels);
    }

    public void setLabels(String... labels) {
        if (labels != null) {
            for (String label : labels) {
                this.labels.add(label);
            }
            propertyChangeSupport.firePropertyChange("labels", null, this.labels);
        }
    }

    public List<String> getLabels() {
        return labels;
    }

    public void addDataset(Dataset dataset) {
        datasets.add(dataset);
        fireDatasetChange();
    }

    public List<Dataset> getDatasets() {
        return datasets;
    }

    public Dataset getDataset(String label) {
        Dataset result = null;
        if (label != null && datasets != null) {
            for (Dataset dataset : datasets) {
                if (label.equals(dataset.getLabel())) {
                    result = dataset;
                }
            }
        }
        return result;
    }

    public void removeDatasets() {
        if (datasets != null) {
            datasets.clear();
            fireDatasetChange();
        }
    }

    public void removeLabels() {
        if (labels != null) {
            labels.clear();
        }
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public void notifyChange() {
        fireDatasetChange();
    }

    private void fireDatasetChange() {
        propertyChangeSupport.firePropertyChange("dataset", null, this.datasets);
    }

}
