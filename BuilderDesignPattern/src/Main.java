public class Main {

    public static void main(String[] args) {

        Employee Employee = new Employee.EmployeeBuilder("Krishna Vamshi", "A")
                .addAge("21")
                .addGender("M")
                .addHasExperience(true)
                .addrole("Intern")
                .build();

        System.out.println(Employee);

    }

}