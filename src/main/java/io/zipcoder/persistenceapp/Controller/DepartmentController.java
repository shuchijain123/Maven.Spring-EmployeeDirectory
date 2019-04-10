package io.zipcoder.persistenceapp.Controller;

import io.zipcoder.persistenceapp.Models.DepartmentEntity;
import io.zipcoder.persistenceapp.Models.EmployeeEntity;
import io.zipcoder.persistenceapp.Service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class DepartmentController {

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    private DepartmentService service;





    @GetMapping("/department/{dpt_num}")
    public ResponseEntity<DepartmentEntity> show(@PathVariable Long dpt_num) {

        return new ResponseEntity<>(service.show(dpt_num), HttpStatus.OK);
    }



    @PostMapping("/department/")
    public  ResponseEntity<DepartmentEntity> create(@RequestBody DepartmentEntity department) {

        return new ResponseEntity<>(service.create(department), HttpStatus.CREATED);
    }




    @PutMapping("/department/{deptNum}")
    public  ResponseEntity<DepartmentEntity> update(@PathVariable Long deptNum, @RequestBody DepartmentEntity department) {

        return new ResponseEntity<>(service.update(deptNum, department), HttpStatus.OK);
    }
}
