package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.domain.employee.ClinicNurse;
import ac.za.cput.service.employee.Imp.ClinicNurseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//@RestController
//@RequestMapping("/game-reserve-management/employee/nurse")
public class ClinicNurseController {

    /*@Autowired
    private ClinicNurseServiceImp clinicNurseService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ClinicNurse create(ClinicNurse doc){
        return clinicNurseService.create(doc);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ClinicNurse read(@PathVariable int id){
        return clinicNurseService.read(id);
    }

    @PutMapping("/update")
    @ResponseBody
    public ClinicNurse update(ClinicNurse doc){
        return clinicNurseService.update(doc);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id){
        clinicNurseService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<ClinicNurse> getAll(){
        return clinicNurseService.getAll();
    }*/
}
