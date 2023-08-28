package com.company.app.step_2_create_facade_for_user_service.crud.api;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;

import java.util.List;


public interface UserCreator {

    User oneBy(UserDto userDto);

    List<User> allBy(List<UserDto> userDtoList);

}
