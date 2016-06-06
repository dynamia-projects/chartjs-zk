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

import java.util.List;

/**
 *
 * @author Mario Serrano Leones
 */
public class XYDataset extends Dataset<Coordinate> {

    public XYDataset() {
    }

    public XYDataset(String label) {
        super(label);
    }

    public XYDataset(String label, List<Coordinate> data) {
        super(label, data);
    }

    public XYDataset(String label, String backgroundColor, List<Coordinate> data) {
        super(label, backgroundColor, data);
    }

    public XYDataset addData(Number x, Number y) {
        super.addData(new Coordinate(x, y));
        return this;
    }

    public XYDataset addData(Number x, Number y, Number r) {
        super.addData(new BubbleCoordinate(x, y, r));
        return this;
    }

}
