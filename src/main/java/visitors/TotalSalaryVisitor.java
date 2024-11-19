package visitors;

import elements.Employee;
import elements.Team;

import java.util.StringJoiner;

import static java.lang.StringTemplate.STR;

public class TotalSalaryVisitor implements OrganizationVisitor {
    private double totalSalary = 0;
    private final StringBuilder log = new StringBuilder();

    @Override
    public void visitEmployee(Employee employee) {
        totalSalary += employee.getSalary();
    }

    @Override
    public void visitTeam(Team team) {
        log.append("Calculando salários da equipe: ")
                .append(team.getName())
                .append(" (Líder: ")
                .append(team.getLeader().getName())
                .append(")\n");
        totalSalary += team.getLeader().getSalary();
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public String getLog() {
        return log.toString();
    }
}
