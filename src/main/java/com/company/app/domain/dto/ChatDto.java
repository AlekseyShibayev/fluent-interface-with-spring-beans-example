package com.company.app.domain.dto;

import com.company.app.domain.entity.History;
import com.company.app.domain.entity.Subscription;
import com.company.app.domain.entity.UserInfo;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatDto {

    private String chatName;
    private boolean enableNotifications;
    private List<History> historyList;
    private UserInfo userInfo;
    private Set<Subscription> subscriptions;

}
