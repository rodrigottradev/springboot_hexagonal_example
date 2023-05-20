package adapters.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import data.dto.user.UserCreationDto;
import data.dto.user.UserDto;
import entity.user.User;
import mapper.user.UserMapper;
import ports.spi.user.UserPersistencePort;
import repository.user.UserRepository;

@Service
public class UserJpaAdapter implements UserPersistencePort {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto add(UserCreationDto userCreationDto) {
        User user = UserMapper.INSTANCE.userCreationDtoToUser(userCreationDto);
        User savedUser = userRepository.save(user);
        return UserMapper.INSTANCE.userToUserDto(savedUser);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto update(UserCreationDto userCreationDto) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<UserDto> getList() {
        List<User> userList = userRepository.findAll();
        return UserMapper.INSTANCE.userListToUserDtoList(userList);
    }

    @Override
    public UserDto getById(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);

        if (userOptional.isPresent()) {
            return UserMapper.INSTANCE.userToUserDto(userOptional.get());
        }
        return null;
    }
}
