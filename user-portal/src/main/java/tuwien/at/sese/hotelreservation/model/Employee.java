package tuwien.at.sese.hotelreservation.model;

import javax.persistence.Column;

public class Employee extends Person {

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
