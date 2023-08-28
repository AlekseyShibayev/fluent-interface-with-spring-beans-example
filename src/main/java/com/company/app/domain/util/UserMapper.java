package com.company.app.domain.util;

import com.company.app.domain.dto.UserDto;
import com.company.app.domain.entity.User;
import lombok.experimental.UtilityClass;
import org.springframework.beans.BeanUtils;

@UtilityClass
public class UserMapper {

    public static UserDto of(User user) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    public static User of(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return user;
    }
//    public static User of(Long id, UserDto userDto) {
//        User user = new User();
//        BeanUtils.copyProperties(userDto, user);
//        user.setId(id);
//        return user;
//    }
//
//    public static List<UserDto> of(List<User> userList) {
//        List<UserDto> dtoList = userList.stream()
//                .map(UserMapper::of)
//                .collect(Collectors.toList());
//
////        // пока что закостылим
////        dtoList.forEach(chatDto -> chatDto.getHistoryList().forEach(history -> history.setChat(null)));
////        dtoList.forEach(chatDto -> chatDto.getSubscriptions().forEach(subscription -> subscription.setChats(null)));
////        dtoList.forEach(chatDto -> chatDto.getUserInfo().setChat(null));
//
//        return dtoList;
//    }
}
