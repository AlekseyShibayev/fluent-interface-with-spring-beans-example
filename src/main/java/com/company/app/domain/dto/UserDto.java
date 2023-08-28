package com.company.app.domain.dto;

import com.company.app.domain.entity.Subscription;
import com.company.app.domain.entity.UserActionLog;
import com.company.app.domain.entity.UserInfo;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private String userNumber;
    private List<UserActionLog> userActionLogs;
    private UserInfo userInfo;
    private List<Subscription> subscriptions;

}
