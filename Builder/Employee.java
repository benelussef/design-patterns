public class Employee {
    private String firstName;
    private String lastName;
    private int birthDate;
    private double salary;

    private Employee(String firstName, String lastName, int birthDate, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int birthDate;
        private double salary;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder birthDate(int birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }
        public Employee build(){
            return new Employee(this.firstName,this.lastName,this.birthDate,this.salary);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}
