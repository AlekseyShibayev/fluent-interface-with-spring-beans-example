package com.company.app.step_3_create_fluent_interface_api_for_user_service.data;

@FunctionalInterface
public interface UserFluentInterfaceApiAction {

    void doAction(UserFluentInterfaceApiContext context);

}
