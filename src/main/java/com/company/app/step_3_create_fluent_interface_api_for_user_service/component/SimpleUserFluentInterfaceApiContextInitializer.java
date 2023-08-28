package com.company.app.step_3_create_fluent_interface_api_for_user_service.component;

import com.company.app.step_3_create_fluent_interface_api_for_user_service.data.SimpleUserFluentInterfaceApiContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class SimpleUserFluentInterfaceApiContextInitializer {

    private final SimpleUserFluentInterfaceApiBeansBag beansBag;

    public SimpleUserFluentInterfaceApiContext init() {
        return SimpleUserFluentInterfaceApiContext.builder()
                .beansBag(beansBag)
                .build();
    }

}
