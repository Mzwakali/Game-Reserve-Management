package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.domain.employee.Employee;
import ac.za.cput.domain.request.NewEmployee;
import ac.za.cput.factory.ResponseObjectFactory;
import ac.za.cput.factory.employee.EmployeeFactory;
import ac.za.cput.service.employee.ClinicDocService;
import ac.za.cput.service.employee.Imp.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game-reserve-management/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;
    private ClinicDocServiceImp docService;
    private ClinicNurseServiceImp nurseService;
    private CaretakerServiceImp caretakerService;
    private SecurityServiceImp securityService;
    private FieldGuideServiceImp fieldGuideService;
    private MarineRangerServiceImp marineRangerService;
    private WildlifeRangerServiceImp wildlifeRangerService;

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome To G.R Management";
    }

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity createEmployee(@RequestBody NewEmployee employee){
        System.out.println(employee);
        ResponseObject responseObj = ResponseObjectFactory.buildGenericResponseObject(HttpStatus.OK.toString(), "Created Successfully");

        if(employee.getFirstName() == null || employee.getLastName() == null){
            responseObj.setResponse(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Please provide First and Last Name:");
        }
        else{
            Employee saveEmp = saveEmployee(employee);
            responseObj.setResponse(saveEmp);
        }

        return ResponseEntity.ok(responseObj);
    }

    private  Employee saveEmployee(NewEmployee employee){
        Employee emp = EmployeeFactory.buildEmployee(employee.getEmpId(), employee.getFirstName(), employee.getLastName(), employee.getPosition(), employee.getAge());
        return employeeService.create(emp);
    }


}
