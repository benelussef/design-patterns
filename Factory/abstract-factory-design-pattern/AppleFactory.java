public class AppleFactory extends AbstractFactory{
    @Override
    Phone CreateMobile(String model) {
        if(model.equals(Phone.IPHONE))
            return new IphoneX();
        return null;
    }
}
