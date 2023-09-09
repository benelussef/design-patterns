public class ApplicationClass {
    public static void main(String[] args) {
        AbstractFactory mobileAndroid = ProducerFactory.getFactory(false);
        Phone redmi = mobileAndroid.CreateMobile("RedmiNote");
        redmi.brandMobile();
        Phone oppo = mobileAndroid.CreateMobile("OppoReno");
        oppo.brandMobile();
        AbstractFactory mobileApple = ProducerFactory.getFactory(true);
        Phone apple = mobileApple.CreateMobile("IphoneX");
        apple.brandMobile();
     }
}
