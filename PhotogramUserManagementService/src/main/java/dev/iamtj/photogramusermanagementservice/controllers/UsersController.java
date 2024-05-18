package dev.iamtj.photogramusermanagementservice.controllers;

import dev.iamtj.photogramusermanagementservice.dtos.UserRegisterRequest;
import dev.iamtj.photogramusermanagementservice.dtos.UserRegisterResponse;
import dev.iamtj.photogramusermanagementservice.mappers.UserMapper;
import dev.iamtj.photogramusermanagementservice.models.User;
import dev.iamtj.photogramusermanagementservice.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    private UserMapper userMapper;
    private UserService userService;

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return new ResponseEntity<>("Status: UP", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<UserRegisterResponse> registerUser(@Valid @RequestBody UserRegisterRequest userRegisterRequest) {
        User user = userMapper.toUser(userRegisterRequest);
        User registeredUser = userService.registerUser(user);
        //TODO: Implement token generation from Auth server
        UserRegisterResponse responseDto = userMapper.fromUser(registeredUser);
        //TODO: Add the token based information in header of Response Entity
        return ResponseEntity.status(HttpStatus.CREATED).body(responseDto);
    }

}

/* Operations to work on -

    User Authentication:
    POST /api/users/login - Authenticate a user and generate an access token.
    User Profile:
    GET /api/users/{userId} - Retrieve user profile information.
    PUT /api/users/{userId} - Update user profile information.
    DELETE /api/users/{userId} - Delete user account.

    User Roles and Permissions:
    GET /api/users/{userId}/roles - Retrieve user roles.
    PUT /api/users/{userId}/roles - Update user roles.
    GET /api/roles - Retrieve all available roles.
    POST /api/roles - Create a new role.
    PUT /api/roles/{roleId} - Update an existing role.
    DELETE /api/roles/{roleId} - Delete a role.
*/