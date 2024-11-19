package elements;

import visitors.OrganizationVisitor;

public interface OrganizationElement {
    void accept(OrganizationVisitor visitor);
}
