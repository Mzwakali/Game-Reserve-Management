package ac.za.cput.factory;

import ac.za.cput.controller.employee.ResponseObject;

public class ResponseObjectFactory {
    public static ResponseObject buildGenericResponseObject(String responseCode, String responseDescription){
        return new ResponseObject(responseCode,responseDescription);
    }
}
