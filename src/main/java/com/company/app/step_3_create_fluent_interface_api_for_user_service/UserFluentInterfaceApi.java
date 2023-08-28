package com.company.app.step_3_create_fluent_interface_api_for_user_service;

import com.company.app.step_3_create_fluent_interface_api_for_user_service.component.UserFluentInterfaceApiContextInitializer;
import com.company.app.step_3_create_fluent_interface_api_for_user_service.data.UserFluentInterfaceApiContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserFluentInterfaceApi {

    private final UserFluentInterfaceApiContextInitializer initializer;

    public UserFluentInterfaceApiContext api() {
        return initializer.init();
    }

}
