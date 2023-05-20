package mapper.user;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import data.dto.user.UserCreationDto;
import data.dto.user.UserDto;
import entity.user.User;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto userToUserDto(User user);

    User userCreationDtoToUser(UserCreationDto userCreationDto);

    List<UserDto> userListToUserDtoList(List<User> userList);

}
