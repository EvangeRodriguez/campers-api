package com.backend.springproject.camper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

//@Document(collection = "camper")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CamperModel {
    @Id
    private String id;
    private String name;
    private Number age;
    private String username;
    private String password;
}
