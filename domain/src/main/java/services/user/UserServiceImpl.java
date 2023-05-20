package services.user;

import java.util.List;

import data.dto.user.UserCreationDto;
import data.dto.user.UserDto;
import lombok.RequiredArgsConstructor;
import ports.api.user.UserServicePort;
import ports.spi.user.UserPersistencePort;

@RequiredArgsConstructor
public class UserServiceImpl implements UserServicePort {

    private final UserPersistencePort userPersistencePort;

    @Override
    public UserDto add(final UserCreationDto creationDto) {
        return userPersistencePort.add(creationDto);
    }

    @Override
    public void deleteById(final Long id) {
        userPersistencePort.deleteById(id);
    }

    @Override
    public UserDto update(final UserCreationDto creationDto) {
        return userPersistencePort.update(creationDto);
    }

    @Override
    public List<UserDto> getList() {
        return userPersistencePort.getList();
    }

    @Override
    public UserDto getById(final Long id) {
        return userPersistencePort.getById(id);
    }
}
