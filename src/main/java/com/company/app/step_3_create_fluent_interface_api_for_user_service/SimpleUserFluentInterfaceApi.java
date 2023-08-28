package com.company.app.step_3_create_fluent_interface_api_for_user_service;

import com.company.app.step_3_create_fluent_interface_api_for_user_service.component.SimpleUserFluentInterfaceApiContextInitializer;
import com.company.app.step_3_create_fluent_interface_api_for_user_service.data.SimpleUserFluentInterfaceApiContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SimpleUserFluentInterfaceApi {

    private final SimpleUserFluentInterfaceApiContextInitializer initializer;

    public SimpleUserFluentInterfaceApiContext api() {
        return initializer.init();
    }

}
