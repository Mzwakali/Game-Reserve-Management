package ac.za.cput.repository.VisitorRepository;

import ac.za.cput.domain.Visitor.CarePackage;
import ac.za.cput.repository.InterfaceRepository;

import java.util.Set;

public interface CarePackageRepository extends InterfaceRepository<CarePackage, String> {

    Set<CarePackage> getAll();
}
