package ac.za.cput.controller.gameReserve;

import ac.za.cput.domain.gameReserve.Equipment;
import ac.za.cput.service.gameReserve.Imp.EquipmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/gameReserve/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentServiceImp equipmentService;

    @PostMapping("/update")
    @ResponseBody
    public Equipment update(Equipment equipment){
        return equipmentService.update(equipment);
    }

    @DeleteMapping("/delete/{id}")
    //@GetMapping
    @ResponseBody
    public void delete(@PathVariable int id){
        equipmentService.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Equipment read(@PathVariable int id){
        return equipmentService.read(id);
    }

    @GetMapping("/getAll")
    @ResponseBody
    public Set<Equipment> getAll(){
        return equipmentService.getAll();
    }
}
