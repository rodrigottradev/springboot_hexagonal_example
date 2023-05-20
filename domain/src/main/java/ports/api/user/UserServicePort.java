package ports.api.user;

import java.util.List;

import data.dto.user.UserCreationDto;
import data.dto.user.UserDto;

public interface UserServicePort {

    UserDto add(UserCreationDto creationDto);

    void deleteById(Long id);

    UserDto update(UserCreationDto creationDto);

    List<UserDto> getList();

    UserDto getById(Long id);

}
