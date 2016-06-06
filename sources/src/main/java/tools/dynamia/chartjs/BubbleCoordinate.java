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
public class BubbleCoordinate extends Coordinate {

    public BubbleCoordinate() {
    }

    /**
     * Create bubble coordinate using x, y and radius
     *
     * @param x
     * @param y
     * @param r radius
     */
    public BubbleCoordinate(Number x, Number y, Number r) {
        super(x, y);
        setR(r);
    }

    public Number getR() {
        return (Number) get("r");
    }

    public void setR(Number r) {
        put("r", r);
    }
}
