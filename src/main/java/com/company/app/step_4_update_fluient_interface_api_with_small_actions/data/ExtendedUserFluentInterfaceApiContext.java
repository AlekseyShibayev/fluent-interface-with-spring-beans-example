package com.company.app.step_4_update_fluient_interface_api_with_small_actions.data;

import com.company.app.step_2_create_facade_for_user_service.crud.api.UserCreator;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserFinder;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserRemover;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserUpdater;
import com.company.app.step_4_update_fluient_interface_api_with_small_actions.component.ExtendedUserFluentInterfaceApiBeansBag;
import lombok.Builder;

@Builder
public class ExtendedUserFluentInterfaceApiContext {

    private ExtendedUserFluentInterfaceApiBeansBag beansBag;

    public UserCreator create() {
        return beansBag.getUserCreator();
    }

    public UserFinder find() {
        return beansBag.getUserFinder();
    }

    public UserUpdater update() {
        return beansBag.getUserUpdater();
    }

    public UserRemover remove() {
        return beansBag.getUserRemover();
    }

}
