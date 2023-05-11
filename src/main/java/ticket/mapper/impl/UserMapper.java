package ticket.mapper.impl;

import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import ticket.dto.response.UserResponseDto;
import ticket.mapper.ResponseDtoMapper;
import ticket.model.Role;
import ticket.model.User;

@Component
public class UserMapper implements ResponseDtoMapper<UserResponseDto, User> {
    @Override
    public UserResponseDto mapToDto(User user) {
        UserResponseDto responseDto = new UserResponseDto();
        responseDto.setId(user.getId());
        responseDto.setEmail(user.getEmail());
        responseDto.setRolesId(user.getRoles()
                .stream()
                .map(Role::getId)
                .collect(Collectors.toSet()));
        return responseDto;
    }
}
