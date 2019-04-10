package io.zipcoder.persistenceapp.repositories;

import io.zipcoder.persistenceapp.Models.EmployeeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity , Long> {


    @Async
    @Query(value="SELECT * FROM EmployeeEntity t where t.departmentManager = ?",nativeQuery = true)
    List<EmployeeEntity> findEmployeeByManager(@Param("departmentManager") Long departmentManager);


}