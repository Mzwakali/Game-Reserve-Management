package ac.za.cput.service;

public interface IService <Type, ID>{
    //CRUD operations
    Type create(Type t);
    Type update(Type t);
    void delete(ID id);
    Type read(int id);
}
