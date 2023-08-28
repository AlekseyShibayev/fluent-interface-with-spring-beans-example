package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.data;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.UserBeansBag;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserUpdateContext {

    private UserBeansBag beansBag;

    public void by(Long id, UserDto userDto) {
        beansBag.getUserUpdateByIdAndUserDto().by(id, userDto);
    }

    public void by(User user) {
        beansBag.getUserUpdateByUser().by(user);
    }

}
