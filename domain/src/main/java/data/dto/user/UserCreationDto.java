package data.dto.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCreationDto {

    private String firstName;
    private String lastName;
    private String email;

}
