
public class Employee {

    private String firstName;  
    private String lastName;  
    private String age;  
    private String gender;  
    private String role;  
    private boolean hasExperience;  
    private String city;  
    private String state;  


    private Employee(EmployeeBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.role = builder.role;
        this.hasExperience = builder.hasExperience;
        this.city = builder.city;
        this.state = builder.state;

    }

    @Override
    public String toString() {
        return " firstName=" + firstName + "\n lastName=" + lastName + "\n age=" + age + "\n gender=" + gender
                + "\n role=" + role + "\n hasExperience=" + hasExperience + "\n city=" + city + "\n state="
                + state ;
    }

    public static class EmployeeBuilder {

        private String firstName;
        private String lastName;
        private String age;
        private String gender;
        private String role;
        private  boolean hasExperience;
        private String city;
        private String state;

        public EmployeeBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public EmployeeBuilder addAge(String age) {
            this.age = age;
            return this;
        }

        public EmployeeBuilder addGender(String gender) {
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder addrole(String role) {
            this.role = role;
            return this;
        }

        public EmployeeBuilder addHasExperience(boolean hasExperience) {
            this.hasExperience = hasExperience;
            return this;
        }

        public EmployeeBuilder addCity(String city) {
            this.city = city;
            return this;
        }

        public EmployeeBuilder addState(String state) {
            this.state = state;
            return this;
        }



        public Employee build() {
            return new Employee(this);
        }

    }

}