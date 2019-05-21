package ac.za.cput.factory.employee;

import ac.za.cput.domain.employee.GeneralWorker;
import ac.za.cput.domain.gameReserve.Department;

import java.util.List;

public class GeneralWorkerFactory {

    public static GeneralWorker getGeneralWorker(int generalWorkerId, List<Department> departments){
        return (GeneralWorker) new GeneralWorker.GeneralWorkerBuilder()
                .generalWorkId(generalWorkerId)
                .departments(departments)
                .build();
    }
}
