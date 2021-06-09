public class Company
{
    public static void main (String[] args)
    {
        Developer dev1 = new Developer(1, "Krishna  Vamshi", "Software Developer");
        Developer dev2 = new Developer(2, " Rakesh Sharma", "Developer");

        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(3, "Sunitha Williams", "Human Resource Manager");
        Manager man2 = new Manager(4, "Kalpana Chawla ", "Technical Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);


        System.out.println("\n\n Printing Employee  Details");
        directory.showEmployeeDetails();

        System.out.println("\nDeleting employ Details "+dev1);
        engDirectory.removeEmployee(dev1);



        System.out.println("\n\n Printing Employee  Details");
        directory.showEmployeeDetails();


    }
}
