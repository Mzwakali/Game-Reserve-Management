package ac.za.cput.controller.employee;

import ac.za.cput.domain.employee.MarineRanger;
import ac.za.cput.service.employee.Imp.MarineRangerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/employee/marine")
public class MarineRangerController {

    @Autowired
    private MarineRangerServiceImp marineRangerService;

    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public MarineRanger create(MarineRanger ranger){
        return marineRangerService.create(ranger);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public MarineRanger read(@PathVariable int id){
        return marineRangerService.read(id);
    }

    @PutMapping("/update")
    @ResponseBody
    public MarineRanger update(MarineRanger ranger){
        return marineRangerService.update(ranger);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable int id){
        marineRangerService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<MarineRanger> getAll(){
        return marineRangerService.getAll();
    }
}
