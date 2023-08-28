package com.company.app.step_2_create_facade_for_user_service.crud.api;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;


public interface UserRemover {

    void byId(Long id);

    void byUserNumber(String number);

    void by(User user);

    void by(UserDto userDto);

}
