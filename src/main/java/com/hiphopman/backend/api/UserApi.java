package com.hiphopman.backend.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiphopman.backend.business.UserBusiness;
import com.hiphopman.backend.exception.BaseException;
import com.hiphopman.backend.model.MLoginRequest;
import com.hiphopman.backend.model.MRegisterResponse;

@RestController
@RequestMapping("/user")
public class UserApi {

    private final UserBusiness business;

    public UserApi(UserBusiness business) {
        this.business = business;
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<String> getAllUser() throws BaseException {
        String response = business.getAllUser();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/getByID/{id}")
    public ResponseEntity<String> getByID(@PathVariable("id") String id) throws BaseException {
        String response = business.getByID(id);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/queryUser")
    public ResponseEntity<MRegisterResponse> queryUser(@RequestBody MLoginRequest request) throws BaseException {
        MRegisterResponse response = business.queryUser(request);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<String> updateUser(@RequestBody String email) throws BaseException {
        String response = business.updateUser(email);
        return ResponseEntity.ok("Update : " + response);
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestBody String email) throws BaseException {
        String response = business.deleteUser(email);
        return ResponseEntity.ok("Delete : " + response);
    }

}