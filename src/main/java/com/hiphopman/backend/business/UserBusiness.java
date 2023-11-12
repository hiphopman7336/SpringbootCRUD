package com.hiphopman.backend.business;

import com.hiphopman.backend.exception.BaseException;
import com.hiphopman.backend.exception.UserException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserBusiness {
    public String getProductById(String id) throws BaseException {
        if(Objects.equals("1234",id)){
            throw UserException.notFound();
        }
        return id;
    }

}
