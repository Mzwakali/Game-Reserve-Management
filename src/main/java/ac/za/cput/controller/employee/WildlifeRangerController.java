package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.WildlifeRanger;
import ac.za.cput.service.employee.Imp.WildlifeRangerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

//@RestController
//@RequestMapping("/employee/wildlife")
public class WildlifeRangerController {

   /* @Autowired
    private WildlifeRangerServiceImp wildlifeRangerService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public WildlifeRanger create(WildlifeRanger wildlifeRanger){
        return wildlifeRangerService.create(wildlifeRanger);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public WildlifeRanger read(@PathVariable int id){
        return wildlifeRangerService.read(id);
    }

    @PutMapping("/update")
    @ResponseBody
    public WildlifeRanger update(WildlifeRanger wildlifeRanger){
        return wildlifeRangerService.update(wildlifeRanger);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id){
        wildlifeRangerService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<WildlifeRanger> getAll(){
        return wildlifeRangerService.getAll();
    }*/
}
