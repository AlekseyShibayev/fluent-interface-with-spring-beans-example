package com.company.app.step_1_create_classical_user_service;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;

import java.util.Collection;
import java.util.List;

public interface ClassicalUserService {

    User create(UserDto userDto);

    List<User> createAll(List<UserDto> userDtoList);


    User findById(Long id);

    User findByUserNumber(String userNumber);

    List<User> findAll();

    List<User> findAllByIds(Collection<Long> ids);

    List<User> findAllByNumbers(Collection<String> numbers);


    void update(Long id, UserDto userDto);

    void update(User user);


    void remove(Long id);

    void remove(String number);

    void remove(User user);

    void remove(UserDto userDto);

}
