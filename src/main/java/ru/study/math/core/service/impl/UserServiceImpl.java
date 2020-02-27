package ru.study.math.core.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.study.math.core.entity.User;
import ru.study.math.core.repository.UserRepository;
import ru.study.math.core.service.UserService;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {

        userRepository.findAllByFirstName("arman").forEach(arm -> arm.setFirstName("Arman"));

        return userRepository.save(user);
    }
}
