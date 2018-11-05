package tuwien.at.sese.hotelreservation.model;

import javax.persistence.Column;

/**
 * The Class Employee.
 */
public class Employee extends Person {

    /**
     * TODO
     */

    @Column
    private String employeeNumber;
    @Column
    private EmployeeType type;
    @Column
    private String shorthandSymbol;

    @Column
    private String svnr;
    @Column
    private String taskArea;
    @Column
    private Address address;

}
