package ac.za.cput.service.gameReserve;

import ac.za.cput.domain.gameReserve.Clinic;
import ac.za.cput.service.IService;

import java.util.Set;

public interface ClinicService extends IService<Clinic, Integer> {
    Set<Clinic> getAll();
}
