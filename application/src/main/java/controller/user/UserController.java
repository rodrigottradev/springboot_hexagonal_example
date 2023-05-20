package controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.dto.user.UserCreationDto;
import data.dto.user.UserDto;
import ports.api.user.UserServicePort;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServicePort userServicePort;

    @PostMapping("/add")
    public UserDto addUser(@RequestBody UserCreationDto userCreationDto) {
        return userServicePort.add(userCreationDto);
    }

    @PutMapping("/update")
    public UserDto updateUser(@RequestBody UserCreationDto userCreationDto) {
        return userServicePort.update(userCreationDto);
    }

    @GetMapping("/get/{id}")
    public UserDto getUserById(@PathVariable long id) {
        return userServicePort.getById(id);
    }

    @GetMapping("/get")
    public List<UserDto> getAllUsers() {
        return userServicePort.getList();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable long id) {
        userServicePort.deleteById(id);
    }

}
