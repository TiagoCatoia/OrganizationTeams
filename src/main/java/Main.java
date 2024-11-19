import elements.Employee;
import elements.Team;
import visitors.HierarchyPrinterVisitor;
import visitors.TotalSalaryVisitor;

public class Main {
    public static void main(String[] args) {
        Employee alice = new Employee("Alice", 5000);
        Employee bob = new Employee("Bob", 7000);
        Employee charlie = new Employee("Charlie", 6000);
        Employee pedro = new Employee("Pedro", 1000);
        Employee carlos = new Employee("Carlos", 2000);
        Employee dave = new Employee("Dave", 8000);
        Employee eva = new Employee("Eva", 9000);

        // Dev Team
        Team devTeam = new Team("Equipe de Desenvolvimento", dave);
        devTeam.addMember(alice);
        devTeam.addMember(bob);

        // Design Team
        Team designTeam = new Team("Equipe de Design", eva);
        designTeam.addMember(charlie);

        // Main Team
        Employee frank = new Employee("Frank", 10000);
        Team mainTeam = new Team("Equipe Principal", frank);
        mainTeam.addMember(devTeam);
        mainTeam.addMember(designTeam);

        // Visitors
        TotalSalaryVisitor salaryVisitor = new TotalSalaryVisitor();
        mainTeam.accept(salaryVisitor);
        System.out.print(salaryVisitor.getLog());
        System.out.printf("Salário total: R$%.2f \n\n", salaryVisitor.getTotalSalary());

        HierarchyPrinterVisitor hierarchyVisitor = new HierarchyPrinterVisitor();
        mainTeam.accept(hierarchyVisitor);
        System.out.println(hierarchyVisitor.getHierarchy());
    }
}
