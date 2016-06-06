/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.dynamia.chartjs;

import java.util.List;

/**
 *
 * @author mario
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
