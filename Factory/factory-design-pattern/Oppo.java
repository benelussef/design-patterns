public class Oppo implements Mobile{
    private int ram;
    private String processor;

    public Oppo(int ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }
    @Override
    public void brandMobile() {
        System.out.println("Oppo");
    }
}
