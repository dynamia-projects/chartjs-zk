/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.dynamia.chartjs;

import java.io.Serializable;
import org.zkoss.json.JSONObject;

/**
 *
 * @author mario
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
