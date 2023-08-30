package com.backend.springproject.signup;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
//@Document(collection = "signup")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupModel {
    @Id
    private String id;
    private String name;
    private String email;
}
