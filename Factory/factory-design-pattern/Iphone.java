public class Iphone implements Mobile{
    private int ram;
    private String processor;

    public Iphone(int ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public void brandMobile() {
        System.out.println("Iphone");
    }
}
