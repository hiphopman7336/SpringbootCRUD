package com.hiphopman.backend.business;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.hiphopman.backend.exception.BaseException;
import com.hiphopman.backend.exception.UserException;
import com.hiphopman.backend.model.MLoginRequest;
import com.hiphopman.backend.model.MRegisterResponse;

@Service
public class UserBusiness {
    public String getProductById(String id) throws BaseException {
        if(Objects.equals("1234",id)){
            throw UserException.notFound();
        }
        return id;
    }
    public String getAllUser() throws BaseException{

        return "request";
    }

    public String getByID(String id) throws BaseException{
        if (Objects.isNull(id)) {
            throw UserException.requestNull();
        }
        return id;
    }

    public MRegisterResponse queryUser(MLoginRequest request) throws BaseException{
        if (Objects.isNull(request)) {
            throw UserException.requestNull();
        }
        MRegisterResponse response = new MRegisterResponse();
        response.setEmail(request.getEmail());
        response.setName(request.getEmail());
        return response;
    }

    public String updateUser(String email) throws BaseException{
        if (Objects.isNull(email)) {
            throw UserException.requestNull();
        }
        return email;
    }

    public String deleteUser(String email) throws BaseException{
        if (Objects.isNull(email)) {
            throw UserException.requestNull();
        }
        return email;
    }

}
