package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.FieldGuide;
import ac.za.cput.service.employee.Imp.FieldGuideServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//@RestController
//@RequestMapping("/employee/guide")
public class FieldGuideController {

    /*@Autowired
    private FieldGuideServiceImp fieldGuideService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public FieldGuide create(FieldGuide guide){
        return fieldGuideService.create(guide);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public FieldGuide read(@PathVariable int id){
        return fieldGuideService.read(id);
    }

    @PutMapping("/update")
    @ResponseBody
    public FieldGuide update(FieldGuide doc){
        return fieldGuideService.update(doc);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id){
        fieldGuideService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<FieldGuide> getAll(){
        return fieldGuideService.getAll();
    }*/
}
