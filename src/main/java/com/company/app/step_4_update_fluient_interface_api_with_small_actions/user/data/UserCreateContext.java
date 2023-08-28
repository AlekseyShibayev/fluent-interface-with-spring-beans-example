package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.data;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.UserBeansBag;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserCreateContext {

    private UserBeansBag beansBag;

    public User oneBy(UserDto userDto) {
        return beansBag.getUserCreateOneByUserDto().oneBy(userDto);
    }
    public List<User> allBy(List<UserDto> userDtoList) {
        return beansBag.getUserCreateAllByUserDtoList().allBy(userDtoList);
    }

}
