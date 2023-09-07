public class Circle extends Figure{
    public Circle(Point p1, Point p2) {
        super(p1, p2);
    }

    @Override
    double surface() {
        double r = p1.distance(p2);
        return Math.PI*r*r;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
