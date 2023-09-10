public class BuilderApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee.Builder()
                .firstName("youssef")
                .lastName("benelfakir").build();
        System.out.println(emp1.toString());
        Employee emp2 = new Employee.Builder().salary(13000.33).build();
        System.out.println(emp2.toString());
    }
}
