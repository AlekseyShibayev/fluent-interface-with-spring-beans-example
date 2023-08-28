package com.company.app.step_4_update_fluient_interface_api_with_small_actions.component;

import com.company.app.step_2_create_facade_for_user_service.crud.api.UserCreator;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserFinder;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserRemover;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserUpdater;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Getter
@Service
@RequiredArgsConstructor
public class ExtendedUserFluentInterfaceApiBeansBag {

    private final UserCreator userCreator;
    private final UserFinder userFinder;
    private final UserUpdater userUpdater;
    private final UserRemover userRemover;

}
