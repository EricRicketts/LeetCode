package org.example;

import java.util.HashMap;
import java.util.Map;

public class FindNearestPoint {
    private final Map<String, Object> currentPoint = new HashMap<>();

    public FindNearestPoint() {
        this.currentPoint.put("coords", new Integer[]{0, 0});
        this.currentPoint.put("distance", 0);
        this.currentPoint.put("index", 0);
    }

    private Map<String, Object> getCurrentPoint() { return this.currentPoint; }

    public int nearestValidPoint(int x, int y, int[][] points) {
        int numberOfPoints = points.length;
        for (int index = 0; index < numberOfPoints; index++) {
            int[] coords = points[index];
            int xCoord = coords[0];
            int yCoord = coords[1];
            if ((x == xCoord || y == yCoord)) {
                int distance = this.calculateDistance(x, y, xCoord, yCoord);
                if (this.checkForNoPoint()) {
                    this.setNewPoint(xCoord, yCoord, distance, index);
                } else {
                    if ((Integer)this.getCurrentPoint().get("distance") > distance) {
                        this.setNewPoint(xCoord, yCoord, distance, index);
                    }
                }
            }
        }
        return this.checkForNoPoint() ? -1 : (int) this.getCurrentPoint().get("index");
    }

    private int calculateDistance(int x, int y, int xCoord, int yCoord) {
        return (int)(Math.abs(xCoord - x) + Math.abs(yCoord - y));
    }

    private boolean checkForNoPoint() {
        Integer[] coords = (Integer[]) this.getCurrentPoint().get("coords");
        return coords[0] == 0 && coords[1] == 0;
    }

    private void setNewPoint(int xCoord, int yCoord, int distance, int index) {
        this.getCurrentPoint().put("coords", new Integer[]{xCoord, yCoord});
        this.getCurrentPoint().put("distance", distance);
        this.getCurrentPoint().put("index", index);
    }
}
