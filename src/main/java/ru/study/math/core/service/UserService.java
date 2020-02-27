package ru.study.math.core.service;

import org.springframework.stereotype.Service;
import ru.study.math.core.entity.User;

@Service
public interface UserService {

    User save(User user);

    /*UserDto save(UserDto userDto) throws SQLException;

    UserDto update(UserDto userDto);

    UserDto get(UUID id);

    Boolean delete(UUID id);*/
}