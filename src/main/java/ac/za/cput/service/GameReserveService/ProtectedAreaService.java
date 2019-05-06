package ac.za.cput.service.GameReserveService;

import ac.za.cput.domain.GameReserve.ProtectedArea;
import ac.za.cput.service.IService;

import java.util.Set;

public interface ProtectedAreaService extends IService<ProtectedArea, Integer> {
    Set<ProtectedArea> getAll();
}
