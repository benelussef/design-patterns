public class ExecutionClass {
    public static void main(String[] args) {
        Mobile mobile1 = MobileFactory.createMobile("Oppo");
        Mobile mobile2 = MobileFactory.createMobile("Iphone");
        Mobile mobile3 = MobileFactory.createMobile("Redmi");
        mobile1.brandMobile();
        mobile2.brandMobile();
        mobile3.brandMobile();
    }
}
