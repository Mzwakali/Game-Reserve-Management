package ac.za.cput.repository;

public interface InterfaceRepository <T, ID>{
    //CRUD operations
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(int id);
}
