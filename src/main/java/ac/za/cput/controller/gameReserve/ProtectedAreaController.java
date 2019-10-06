package ac.za.cput.controller.gameReserve;

import ac.za.cput.domain.gameReserve.ProtectedArea;
import ac.za.cput.service.gameReserve.Imp.ProtectedAreaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/game/protectedArea")
public class ProtectedAreaController {

    @Autowired
    private ProtectedAreaServiceImp protectedAreaService;

    @PostMapping("/create")
    @ResponseBody
    public ProtectedArea create(ProtectedArea protectedArea){
        return protectedAreaService.create(protectedArea);
    }

    @PutMapping("/update")
    //@PostMapping("/update")
    @ResponseBody
    public ProtectedArea update(ProtectedArea protectedArea){
        return protectedAreaService.update(protectedArea);
    }

    @DeleteMapping("/delete/{id}")
    //@GetMapping
    @ResponseBody
    public void delete(@PathVariable int id){
        protectedAreaService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public ProtectedArea read(@PathVariable int id){
        return protectedAreaService.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public List<ProtectedArea> getAll(){
        return protectedAreaService.getAll();
    }
}
