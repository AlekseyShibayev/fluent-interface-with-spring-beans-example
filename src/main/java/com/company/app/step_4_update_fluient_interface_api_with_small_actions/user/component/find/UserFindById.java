package com.company.app.step_4_update_fluient_interface_api_with_small_actions.user.component.find;

import com.company.app.domain.entity.User;
import com.company.app.domain.repository.UserRepository;
import com.company.app.service.AnyAnnotationForProxy;
import com.company.app.service.HistoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserFindById {

    private final UserRepository userRepository;
    private final HistoryService historyService;

    @AnyAnnotationForProxy
    public User getById(Long id) {
        historyService.writeHistory();
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("can't find user by [%s]".formatted(id)));
    }

}
