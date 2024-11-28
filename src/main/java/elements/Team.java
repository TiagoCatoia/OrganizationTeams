package elements;

import visitors.OrganizationVisitor;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Team implements OrganizationElement {
    private String name;
    private Employee leader;
    private final LinkedHashSet<OrganizationElement> members = new LinkedHashSet<>();

    public Team(String name, Employee leader) {
        this.name = name;
        this.leader = leader;
    }

    public void addMember(OrganizationElement member) {
        members.add(member);
    }

    public LinkedHashSet<OrganizationElement> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public Employee getLeader() {
        return leader;
    }

    @Override
    public void accept(OrganizationVisitor visitor) {
        visitor.visitTeam(this);
    }
}
