package ac.za.cput.service.gameReserve;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.service.IService;

import java.util.List;

public interface ClinicService extends IService<Clinic, Integer> {
    List<Clinic> getAll();
}
