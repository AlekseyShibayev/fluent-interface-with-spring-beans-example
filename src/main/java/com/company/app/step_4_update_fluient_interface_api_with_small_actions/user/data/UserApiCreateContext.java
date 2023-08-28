package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.data;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.UserBeansBag;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserApiCreateContext {

    private UserBeansBag beansBag;

    public User oneBy(UserDto userDto) {
        return beansBag.getExtendedUserFluentInterfaceApiCreateOneByUserDto().oneBy(userDto);
    }
    public List<User> allBy(List<UserDto> userDtoList) {
        return beansBag.getExtendedUserFluentInterfaceApiCreateAllByUserDtoList().allBy(userDtoList);
    }

}
