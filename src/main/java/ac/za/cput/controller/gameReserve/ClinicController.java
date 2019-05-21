package ac.za.cput.controller.gameReserve;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.service.gameReserve.Imp.ClinicServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/gameReserve/clinic")
public class ClinicController {

    @Autowired
    private ClinicServiceImp clinicService;

    @PostMapping("/create")
    @ResponseBody
    public Clinic create(Clinic clinic){
        return clinicService.create(clinic);
    }

    @PutMapping("/update")
    //@PostMapping("/update")
    @ResponseBody
    public Clinic update(Clinic clinic){
        return clinicService.update(clinic);
    }

    @DeleteMapping("/delete/{id}")
    //@GetMapping
    @ResponseBody
    public void delete(@PathVariable int id){
        clinicService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Clinic read(@PathVariable int id){
        return clinicService.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Clinic> getAll(){
        return clinicService.getAll();
    }
}
