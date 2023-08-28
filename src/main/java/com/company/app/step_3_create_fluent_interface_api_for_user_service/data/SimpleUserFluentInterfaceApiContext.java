package com.company.app.step_3_create_fluent_interface_api_for_user_service.data;

import com.company.app.step_2_create_facade_for_user_service.crud.api.UserCreator;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserFinder;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserRemover;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserUpdater;
import com.company.app.step_3_create_fluent_interface_api_for_user_service.component.SimpleUserFluentInterfaceApiBeansBag;
import lombok.Builder;

@Builder
public class SimpleUserFluentInterfaceApiContext {

    private SimpleUserFluentInterfaceApiBeansBag beansBag;

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
