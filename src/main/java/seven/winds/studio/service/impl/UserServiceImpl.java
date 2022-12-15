package seven.winds.studio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import seven.winds.studio.dto.UserRequestDto;
import seven.winds.studio.dto.UserResponseDto;
import seven.winds.studio.model.User;
import seven.winds.studio.repository.UserRepository;
import seven.winds.studio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public UserResponseDto saveUser(UserRequestDto userRequest) {
        User user = new User(userRequest.getFirstName(), userRequest.getLastName(), userRequest.getPatronymic(), userRequest.getEmail(), userRequest.getPhone());
        User returnedUser = repository.save(user);
        return new UserResponseDto(returnedUser.getId(), returnedUser.getFirstName(), returnedUser.getLastName(),
                returnedUser.getPatronymic(), returnedUser.getEmail(), returnedUser.getPhone());
    }

    @Override
    @Transactional
    public UserResponseDto getUser(Long id) {
        User returnedUser = repository.getReferenceById(id);
        return new UserResponseDto(returnedUser.getId(), returnedUser.getFirstName(), returnedUser.getLastName(),
                returnedUser.getPatronymic(), returnedUser.getEmail(), returnedUser.getPhone());
    }
}
