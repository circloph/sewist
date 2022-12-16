package seven.winds.studio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import seven.winds.studio.dto.UserRequestDto;
import seven.winds.studio.dto.UserResponseDto;
import seven.winds.studio.service.UserService;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class StudioApplicationTests {

	@Autowired
	UserService userService;

	@Test
	void checkGetUserById() {
		UserRequestDto requestDto = new UserRequestDto("seven", "winds", "studio", "sewist2022@mail.ru", "88005553535");
		UserResponseDto responseSave = userService.saveUser(requestDto);
		UserResponseDto responseGet = userService.getUser(responseSave.getId());

		Assertions.assertEquals(responseSave.getFirstName(), responseGet.getFirstName());
		Assertions.assertEquals(responseSave.getLastName(), responseGet.getLastName());
		Assertions.assertEquals(responseSave.getEmail(), responseGet.getEmail());
		Assertions.assertEquals(responseSave.getPhone(), responseGet.getPhone());
		Assertions.assertEquals(responseSave.getId(), responseGet.getId());
	}

}
