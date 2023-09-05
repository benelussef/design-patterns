public class Redmi implements Mobile{
    private int ram;
    private String processor;

    public Redmi(int ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public void brandMobile() {
        System.out.println("Redmi");
    }
}
