package com.company.app.domain.dto;

import com.company.app.domain.entity.Subscription;
import com.company.app.domain.entity.UserActionLog;
import com.company.app.domain.entity.UserInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class UserDto {

    private String number;
    private List<UserActionLog> userActionLogs;
    private UserInfo userInfo;
    private List<Subscription> subscriptions;

}
