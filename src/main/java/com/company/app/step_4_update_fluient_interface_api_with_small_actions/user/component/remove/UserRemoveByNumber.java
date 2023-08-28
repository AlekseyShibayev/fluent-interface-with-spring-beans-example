package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.remove;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import com.company.app.domain.repository.UserRepository;
import com.company.app.service.AnyAnnotationForProxy;
import com.company.app.service.HistoryService;
import com.company.app.service.NotificationService;
import com.company.app.step_2_create_facade_for_user_service.crud.api.UserRemover;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserRemoveByNumber {

    private final UserRepository userRepository;
    private final NotificationService notificationService;
    private final HistoryService historyService;

    @AnyAnnotationForProxy
    public void byNumber(String number) {

    }

}
