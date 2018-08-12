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

import org.zkoss.json.JSONObject;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mario Serrano Leones
 */
public class LazyJSONObject extends JSONObject {

    static void init(LazyJSONObject data) {
        if (data != null) {
            data.init();
        }
    }

    /**
     * Override this method if you need special json initialization. By default it use basic reflection to read all object
     * properties
     */
    public void init() {
        try {
            List<Field> fields = new ArrayList<Field>();
            Class clazz = getClass();
            loadClassFields(fields, clazz);
            for (Field field : fields) {
                field.setAccessible(true);
                Object fieldValue = field.get(this);
                if (fieldValue != null) {
                    if (fieldValue instanceof LazyJSONObject) {
                        ((LazyJSONObject) fieldValue).init();
                    }
                    put(field.getName(), fieldValue);
                }
            }
        } catch (Exception e) {
            throw new ChartjsException("Error initializing JSON Object " + getClass(), e);
        }
    }

    public void loadClassFields(List<Field> fields, Class clazz) {
        if (clazz == LazyJSONObject.class) {
            return;
        }

        if (clazz != null) {
            Field[] classFields = clazz.getDeclaredFields();
            if (classFields != null && classFields.length > 0) {
                fields.addAll(Arrays.asList(classFields));
            }
        }

        if (clazz.getSuperclass() != null) {
            loadClassFields(fields, clazz.getSuperclass());
        }
    }

}
