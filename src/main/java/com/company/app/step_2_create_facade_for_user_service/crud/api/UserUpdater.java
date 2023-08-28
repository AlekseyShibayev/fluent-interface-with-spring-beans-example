package com.company.app.step_2_create_facade_for_user_service.crud.api;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;

public interface UserUpdater {

    void by(Long id, UserDto userDto);

    void by(User user);

}
