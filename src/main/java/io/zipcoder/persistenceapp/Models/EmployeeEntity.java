package io.zipcoder.persistenceapp.Models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity

public class EmployeeEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="EMPLOYEE_ID")
    private Long id;
    @Column (name="firstName")
  private String firstName;
    @Column (name="lastName")
  private String lastName;
    @Column (name="title")
  private String title;
    @Column  (name="phoneNumber")
  private String phoneNumber;
    @Column (name="email")
  private String email;
    @Column (name="hireDate")
   private String hireDate;
    @Column (name="departmentManager")
   private Long departmentManager;

//
//    @ManyToOne (cascade = CascadeType.ALL)
//    @JoinColumn(name = "dpt_num")
    private Long dpt_num;

    //@OneToOne (cascade=CascadeType.ALL)
    //@JoinColumn(name = "departmentManager")
   // private EmployeeEntity departmentManager;

    //@OneToOne(mappedBy = "departmentManager")
    //private DepartmentEntity departmentManager;


    public EmployeeEntity(){

    }





//    public EmployeeEntity (String firstName, String lastName, String title, String phoneNumber, String email, String hireDate, EmployeeEntity departmentManager, DepartmentEntity dpt_num) {
//        super();
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.title = title;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//        this.hireDate = hireDate;
//        this.departmentManager = departmentManager;
//        this.dpt_num = dpt_num;
//        this.id=null;
//    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getdpt_num() {
        return dpt_num;
    }

    public void setdpt_num(Long dpt_num) {
        this.dpt_num = dpt_num;
    }

    public Long getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Long departmentManager) {
        this.departmentManager = departmentManager;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


}
