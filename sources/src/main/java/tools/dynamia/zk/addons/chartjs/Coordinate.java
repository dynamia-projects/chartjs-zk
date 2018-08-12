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

import java.io.Serializable;
import org.zkoss.json.JSONObject;

/**
 *
 * @author Mario Serrano Leones
 */
public class Coordinate extends JSONObject implements Serializable {

    public Coordinate() {
    }

    public Coordinate(Number x, Number y) {
        setX(x);
        setY(y);
    }

    public Number getX() {
        return (Number) get("x");
    }

    public void setX(Number x) {
        put("x", x);
    }

    public Number getY() {
        return (Number) get("y");
    }

    public void setY(Number y) {
        put("y", y);
    }

}
