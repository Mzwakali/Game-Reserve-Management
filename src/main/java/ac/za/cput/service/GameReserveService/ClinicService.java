package ac.za.cput.service.GameReserveService;

import ac.za.cput.domain.GameReserve.Clinic;
import ac.za.cput.service.IService;

import java.util.Set;

public interface ClinicService extends IService<Clinic, Integer> {
    Set<Clinic> getAll();
}
