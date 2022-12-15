package seven.winds.studio.service;

import seven.winds.studio.dto.UserRequestDto;
import seven.winds.studio.dto.UserResponseDto;

public interface UserService {

    UserResponseDto saveUser(UserRequestDto user);

    UserResponseDto getUser(Long id);

}
