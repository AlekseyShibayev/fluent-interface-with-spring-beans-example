package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.data;

import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.UserBeansBag;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserContext {

    private UserBeansBag beansBag;

    public UserCreateContext create() {
        return new UserCreateContext(beansBag);
    }

    public UserFindContext find() {
        return new UserFindContext(beansBag);
    }

    public UserUpdateContext update() {
        return new UserUpdateContext(beansBag);
    }

    public UserRemoveContext remove() {
        return new UserRemoveContext(beansBag);
    }

}
