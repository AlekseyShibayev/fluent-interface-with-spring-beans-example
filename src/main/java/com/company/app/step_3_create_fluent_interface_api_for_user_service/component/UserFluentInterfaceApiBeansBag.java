package com.company.app.step_3_create_fluent_interface_api_for_user_service.component;

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
public class UserFluentInterfaceApiBeansBag {

    private final UserCreator userCreator;
    private final UserFinder userFinder;
    private final UserUpdater userUpdater;
    private final UserRemover userRemover;

}
