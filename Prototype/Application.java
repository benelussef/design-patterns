public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Figure f1 = new Circle(new Point(5,5),new Point(8,8));
        Figure f2 = new Rectangle(new Point(6,6),new Point(9,9));
        System.out.println("============== Figure 1 et 2 ==============");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println("============================================");
        System.out.println("======== Clone Figure 1 on Figure 3 ========");
        Figure f3 = f1.clone();
        System.out.println(f3);
        System.out.println("Surface de f3: "+f3.surface());
        System.out.println("============================================");
        System.out.println("======== Clone Figure 2 on Figure 4 ========");
        Figure f4 = f2.clone();
        System.out.println(f4);
        System.out.println("Surface de f4: "+f4.surface());
        System.out.println("============================================");


    }
}
