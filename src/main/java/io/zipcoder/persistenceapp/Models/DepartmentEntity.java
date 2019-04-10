package io.zipcoder.persistenceapp.Models;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "department_entity")
public class DepartmentEntity {
    @Column(name="departmentName")
    private String departmentName;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="dpt_num")
    private  Long dpt_num;



    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "departmentManager")
    private EmployeeEntity departmentManager;




    @OneToMany(cascade = CascadeType.ALL)
    private List<EmployeeEntity> employees = new ArrayList<>();


    // Setter and Getter methods





    public DepartmentEntity(){

    }
    @Bean(name="departmententity")

    public Long getDpt_num() {
        return dpt_num;
    }

    public void setDpt_num(Long dpt_num) {
        this.dpt_num= dpt_num;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public EmployeeEntity getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(EmployeeEntity departmentManager) {
        this.departmentManager = departmentManager;
    }
}
