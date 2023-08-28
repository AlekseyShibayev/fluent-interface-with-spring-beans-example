package com.company.app.step_3_create_fluent_interface_api_for_user_service.component;

import com.company.app.step_3_create_fluent_interface_api_for_user_service.data.UserFluentInterfaceApiContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserFluentInterfaceApiContextInitializer {

    private final UserFluentInterfaceApiBeansBag beansBag;

    public UserFluentInterfaceApiContext init() {
        return UserFluentInterfaceApiContext.builder()
                .beansBag(beansBag)
                .build();
    }

}
