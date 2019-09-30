package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.Security;
import ac.za.cput.service.employee.Imp.SecurityServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//@RestController
//@RequestMapping("/employee/security")
public class SecurityController {

    /*@Autowired
    private SecurityServiceImp securityService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Security create(Security security){
        return securityService.create(security);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Security read(@PathVariable int id){
        return securityService.read(id);
    }

    @PutMapping("/update")
    @ResponseBody
    public Security update(Security security){
        return securityService.update(security);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id){
        securityService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Security> getAll(){
        return securityService.getAll();
    }*/
}
