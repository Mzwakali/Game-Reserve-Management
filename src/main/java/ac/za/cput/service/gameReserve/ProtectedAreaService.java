package ac.za.cput.service.gameReserve;

import ac.za.cput.domain.gameReserve.ProtectedArea;
import ac.za.cput.service.IService;

import java.util.Set;

public interface ProtectedAreaService extends IService<ProtectedArea, Integer> {
    Set<ProtectedArea> getAll();
}
