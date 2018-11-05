//package tuwien.at.sese.hotelreservation.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import tuwien.at.sese.hotelreservation.model.Employee;
//import tuwien.at.sese.hotelreservation.service.EmployeeService;
//
///**
// * Employees
// *
// */
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping({ "/employees" })
//public class EmployeeController {
//
//    @Autowired
//    private EmployeeService EmployeeService;
//
//    /**
//     * @param Employee
//     * @return Employee
//     */
//    @PostMapping
//    public Employee create(@RequestBody Employee Employee) {
//        return EmployeeService.create(Employee);
//    }
//
//    /**
//     * Find one.
//     *
//     * @param id the id
//     * @return the employee
//     */
//    @GetMapping(path = {"/{id}"})
//    public Employee findOne(@PathVariable("id") int id) {
//        return EmployeeService.findById(id);
//    }
//
//    /**
//     * Update.
//     *
//     * @param id the id
//     * @param Employee the employee
//     * @return the employee
//     */
//    @PutMapping(path = {"/{id}"})
//    public Employee update(@PathVariable("id") int id, @RequestBody Employee Employee) {
//        Employee.setId(id);
//        return EmployeeService.update(Employee);
//    }
//
//    /**
//     * Delete.
//     *
//     * @param id the id
//     * @return the employee
//     */
//    @DeleteMapping(path ={"/{id}"})
//    public Employee delete(@PathVariable("id") int id) {
//        return EmployeeService.delete(id);
//    }
//
//    /**
//     * Find all.
//     *
//     * @return the list
//     */
//    @GetMapping
//    public List<Employee> findAll() {
//        return EmployeeService.findAll();
//    }
//}
