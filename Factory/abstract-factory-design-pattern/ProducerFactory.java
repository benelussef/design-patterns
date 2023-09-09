public class ProducerFactory {
    static AbstractFactory getFactory(Boolean isApple){
        if(isApple) {
            return new AppleFactory();
        }
        else{
            return new AndroidFactory();
        }
    }
}
