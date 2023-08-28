package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.data;

import com.company.app.domain.entity.User;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.UserBeansBag;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserFindContext {

    private UserBeansBag beansBag;

    public User byId(Long id) {
        return beansBag.getUserFindById().getById(id);
    }

    public User getByUserNumber(String userNumber) {
        return beansBag.getUserFindByNumber().getByUserNumber(userNumber);
    }

}
