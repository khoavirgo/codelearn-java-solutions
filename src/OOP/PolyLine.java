package OOP;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {
    private List<Point> points;

    public PolyLine() {
        points = new ArrayList<>();
    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point point) {
        this.points.add(point);
    }

    public void appendPoint(int x, int y) {
        Point newPoint = new Point(x, y);
        this.points.add(newPoint);
    }

    public double getLength() {
        double result = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            result += points.get(i).distance(points.get(i + 1));
        }
        return result;
    }
}
