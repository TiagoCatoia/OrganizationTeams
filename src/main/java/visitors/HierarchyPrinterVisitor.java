package visitors;

import elements.Employee;
import elements.Team;

public class HierarchyPrinterVisitor implements OrganizationVisitor {
    private int level = 0;
    StringBuilder hierarchy = new StringBuilder();

    private void addIndentation() {
        hierarchy.append("  " .repeat(Math.max(0, level)));
    }

    @Override
    public void visitEmployee(Employee employee) {
        addIndentation();
        hierarchy
                .append("Funcionário: ")
                .append(employee.getName())
                .append("\n");;
    }

    @Override
    public void visitTeam(Team team) {
        addIndentation();
        hierarchy
                .append("Equipe: ")
                .append(team.getName())
                .append("\n");
        addIndentation();
        hierarchy
                .append("  Líder: ")
                .append(team.getLeader().getName())
                .append("\n");
        level++;
    }

    public String getHierarchy() {
        return hierarchy.toString();
    }
}
