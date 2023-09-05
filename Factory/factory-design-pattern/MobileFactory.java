public class MobileFactory {
    public static Mobile createMobile(String brand){
        switch (brand){
            case Mobile.IPHONE:
                return new Iphone(128,"A16");
            case Mobile.REDMI:
                return new Redmi(32,"A12");
            case Mobile.OPPO:
                return new Oppo(64,"A14");
            default:
                return null;
        }
    }
}
