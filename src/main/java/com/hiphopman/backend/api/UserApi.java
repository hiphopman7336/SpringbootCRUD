package com.hiphopman.backend.api;

import com.hiphopman.backend.business.UserBusiness;
import com.hiphopman.backend.exception.BaseException;
import com.hiphopman.backend.model.MLoginRequest;
import com.hiphopman.backend.model.MRegisterRequest;
import com.hiphopman.backend.model.MRegisterResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserApi {

    private final UserBusiness business;

    public UserApi(UserBusiness business) {
        this.business = business;
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<String> getAllUser() throws BaseException {
        //String response = business.refreshToken();
        return ResponseEntity.ok("");
    }

    @GetMapping("/getByID")
    public ResponseEntity<String> getByID() throws BaseException {
        //String response = business.refreshToken();
        return ResponseEntity.ok("");
    }


    @PostMapping("/query")
    public ResponseEntity<String> query(@RequestBody MLoginRequest request) throws BaseException {
        //String response = business.login(request);
        return ResponseEntity.ok("");
    }

    @PutMapping("/updateUser")
    public ResponseEntity<MRegisterResponse> updateUser(@RequestBody MRegisterRequest request) throws BaseException {
        //MRegisterResponse response = business.register(request);
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestBody MLoginRequest request) throws BaseException {
        //User response = business.getProfile(request.getEmail());
        return ResponseEntity.ok("");
    }

}