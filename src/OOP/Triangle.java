package OOP;

public class Triangle {
    private Point vertice1;
    private Point vertice2;
    private Point vertice3;

    public Triangle(Point vertice1, Point vertice2, Point vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        vertice1 = new Point(x1, y1);
        vertice2 = new Point(x2, y2);
        vertice3 = new Point(x3, y3);
    }

    public Point getVertice1() {
        return vertice1;
    }

    public void setVertice1(Point vertice1) {
        this.vertice1 = vertice1;
    }

    public Point getVertice2() {
        return vertice2;
    }

    public void setVertice2(Point vertice2) {
        this.vertice2 = vertice2;
    }

    public Point getVertice3() {
        return vertice3;
    }

    public void setVertice3(Point vertice3) {
        this.vertice3 = vertice3;
    }

    public double getPerimeter() {
        double edge12 = vertice1.distance(vertice2);
        double edge23 = vertice2.distance(vertice3);
        double edge13 = vertice1.distance(vertice3);
        return edge12 + edge23 + edge13;
    }
}
