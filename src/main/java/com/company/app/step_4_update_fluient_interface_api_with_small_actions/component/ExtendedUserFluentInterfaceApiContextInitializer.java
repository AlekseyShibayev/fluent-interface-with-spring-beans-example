package com.company.app.step_4_update_fluient_interface_api_with_small_actions.component;

import com.company.app.step_4_update_fluient_interface_api_with_small_actions.data.ExtendedUserFluentInterfaceApiContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExtendedUserFluentInterfaceApiContextInitializer {

    private final ExtendedUserFluentInterfaceApiBeansBag beansBag;

    public ExtendedUserFluentInterfaceApiContext init() {
        return ExtendedUserFluentInterfaceApiContext.builder()
                .beansBag(beansBag)
                .build();
    }

}
