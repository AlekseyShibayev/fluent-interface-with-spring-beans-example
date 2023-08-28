package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.data;

import com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.UserBeansBag;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserContext {

    private UserBeansBag beansBag;

    public UserApiCreateContext create() {
        return new UserApiCreateContext(beansBag);
    }

}
