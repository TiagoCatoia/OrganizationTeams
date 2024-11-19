package visitors;

import elements.Employee;
import elements.Team;

public interface OrganizationVisitor {
    void visitEmployee(Employee employee);
    void visitTeam(Team team);
}
