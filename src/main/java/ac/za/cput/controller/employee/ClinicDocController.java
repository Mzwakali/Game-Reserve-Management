package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.ClinicDoc;
import ac.za.cput.service.employee.Imp.ClinicDocServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/employee/doc")
public class ClinicDocController {

    @Autowired
    private ClinicDocServiceImp clinicDocService;

    @PostMapping
    @ResponseBody
    public ClinicDoc create(ClinicDoc doc){
        return clinicDocService.create(doc);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ClinicDoc read(@PathVariable int id){
        return clinicDocService.read(id);
    }

    @PutMapping("/update")
    @ResponseBody
    public ClinicDoc update(ClinicDoc doc){
        return clinicDocService.update(doc);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id){
        clinicDocService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<ClinicDoc> getAll(){
        return clinicDocService.getAll();
    }

}
