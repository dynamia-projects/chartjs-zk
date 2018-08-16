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

import org.zkoss.lang.Objects;
import org.zkoss.zk.ui.HtmlBasedComponent;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.sys.ContentRenderer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;

/**
 * @author Mario Serrano Leones Serrano
 */
public class Chartjs extends HtmlBasedComponent {

    public static final String TYPE_BAR = "bar";
    public static final String TYPE_HORIZONTAL_BAR = "horizontalBar";
    public static final String TYPE_LINE = "line";
    public static final String TYPE_PIE = "pie";
    public static final String TYPE_SCATTER = "scatter";
    public static final String TYPE_DOUGHNUT = "doughnut";
    public static final String TYPE_RADAR = "radar";
    public static final String TYPE_POLAR_AREA = "polarArea";
    public static final String TYPE_BUBBLE = "bubble";

    public static final String ON_DATA_CHANGE = "onDataChange";

    private String type;
    private ChartjsData data;
    private ChartjsOptions options = new ChartjsOptions();

    public Chartjs() {
    }

    public Chartjs(String type) {
        this.type = type;
    }

    public Chartjs(String type, ChartjsData data) {
        this.type = type;
        this.data = data;
    }

    public Chartjs(String type, ChartjsData data, ChartjsOptions options) {
        this.type = type;
        this.data = data;
        this.options = options;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!Objects.equals(this.type, type)) {
            this.type = type;
            smartUpdate("type", type);
        }
    }

    public ChartjsData getData() {
        return data;
    }

    public void setData(ChartjsData data) {
        LazyJSONObject.init(data);
        if (!Objects.equals(this.data, data)) {
            this.data = data;
            initListener();
            fireDatachange();
        }
    }

    public ChartjsOptions getOptions() {
        if (options == null) {
            options = new ChartjsOptions();
        }
        return options;
    }

    public void setOptions(ChartjsOptions options) {
        LazyJSONObject.init(options);
        if (!Objects.equals(this.options, options)) {
            this.options = options;
            smartUpdate("options", options);
        }
    }

    @Override
    protected void renderProperties(ContentRenderer renderer) throws IOException {
        super.renderProperties(renderer);
        LazyJSONObject.init(options);
        render(renderer, "type", type);
        render(renderer, "data", data);
        render(renderer, "options", options);
    }

    public String getTitle() {
        return getOptions().getTitle();
    }

    public void setTitle(String title) {
        if (!Objects.equals(getOptions().getTitle(), title)) {
            getOptions().setTitle(title);
            smartUpdate("options", getOptions());
        }
    }

    public void setResponsive(boolean responsive) {
        if (!Objects.equals(getOptions().isResponsive(), responsive)) {
            getOptions().setResponsive(responsive);
            smartUpdate("options", getOptions());
        }
    }

    public boolean isReponsive() {
        return getOptions().isResponsive();
    }

    private void fireDatachange() {
        smartUpdate("data", this.data);
        Events.postEvent(ON_DATA_CHANGE, this, this.data);
    }

    private void initListener() {
        if (data != null) {
            data.addPropertyChangeListener(new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {
                    fireDatachange();
                }
            });
        }
    }


    protected void render(ContentRenderer renderer, String name, LazyJSONObject value) throws IOException {
        if (value != null) {
            value.init();
            ;
        }
        super.render(renderer, name, value);
    }


    public static Number randomScallingFactor() {
        return (Math.random() > 0.5 ? 1.0 : -1.0) * Math.round(Math.random() * 100);
    }

    public static int randomColorFactor() {
        return (int) Math.round(Math.random() * 255);
    }

    public static String randomColor() {
        return "rgba(" + randomColorFactor() + ',' + randomColorFactor() + ',' + randomColorFactor() + ",.7)";
    }


}
