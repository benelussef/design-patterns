public abstract class Figure implements Cloneable{
    Point p1;
    Point p2;

    public Figure(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    protected Figure clone() throws CloneNotSupportedException {
        return (Figure) super.clone();
    }
    abstract double surface();

    @Override
    public String toString() {
        return "Figure{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
