package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.data;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.service.AnyAnnotationForProxy;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.UserBeansBag;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserRemoveContext {

    private UserBeansBag beansBag;

    public void byId(Long id) {
        beansBag.getUserRemoveById().byId(id);
    }

    public void byUserNumber(String number) {
        beansBag.getUserRemoveByNumber().byNumber(number);
    }

    public void byUser(User user) {
        beansBag.getUserRemoveByUser().byUser(user);
    }

    public void byUserDto(UserDto userDto) {
        beansBag.getUserRemoveByUserDto().byUserDto(userDto);
    }

}
