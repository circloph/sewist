package seven.winds.studio.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seven.winds.studio.dto.UserRequestDto;
import seven.winds.studio.dto.UserResponseDto;
import seven.winds.studio.service.UserService;

@Tag(name = "User", description = "The User API")
@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(@RequestBody UserService userService) {
        this.userService = userService;
    }

//    @Operation(summary = "Get user by id", tags = "user")
    @GetMapping("/users/{id}")
    public UserResponseDto getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

//    @Operation(summary = "Save user", tags = "user")

    @PostMapping("/users")
    public UserResponseDto saveUser(@RequestBody UserRequestDto user) {
        return userService.saveUser(user);
    }




}
