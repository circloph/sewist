package seven.winds.studio.dto;

public class UserRequestDto {

    private String firstName;
    private String lastName;
    private String patronymic;
    private String email;
    private String phone;

    public UserRequestDto(String firstName, String lastName, String patronymic, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.email = email;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
