package com.company.app.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TargetMessage {

    String chatName;
    String message;

}
