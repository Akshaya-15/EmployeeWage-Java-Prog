import java.util.Scanner;
import java.util.ArrayList;
 public static void main(String arg[]) {

        System.out.println("WELCOME to EMPLOYEE WAGE Computation");

        EmployeeWage emp = new EmployeeWage();



        ArrayList<Companyempwage> company = new ArrayList<Companyempwage>();

        while (true) {

            System.out.println("Please Enter your choice to show Company Monthly Total Wage ");
            System.out.println("1:For Thoughtworks");
            System.out.println("2:For Wipro ");
            System.out.println("3:For Infosys");
            System.out.println("4:For Exit Computation");

            Scanner sobj = new Scanner(System.in);
            int choice = sobj.nextInt();
            switch (choice) {
                case 1:
                    company.add(new Companyempwage("Thoughtworks", 40, 20, 100));
                    emp.wageComputation(company.get(0));
                    System.out.println("Employee Total wage is: " + company.get(0).getTotalEmpWage());
                    System.out.println( );
                    break;

                case 2:
                    company.add(new Companyempwage("Wipro", 30, 22, 120));
                    emp.wageComputation(company.get(1));
                    System.out.println("Employee Total wage is: " + company.get(1).getTotalEmpWage());
                    System.out.println( );
                    break;

                case 3:
                    company.add(new Companyempwage("Infosys", 45, 18, 90));
                    emp.wageComputation(company.get(2));
                    System.out.println("Employee Total wage is: " + company.get(2).getTotalEmpWage());
                    System.out.println( );
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    System.exit(0);
            }

        }
    }
