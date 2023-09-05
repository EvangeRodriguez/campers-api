package com.backend.springproject.signup;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/signup")
public class SignupController {
    @Autowired
    private SignupService signupService;

    @Autowired
    private ModelMapper modelMapper;

    public SignupController() {
    }

    @PostMapping
    public ResponseEntity<SignupDTO> createSignup(@Valid @RequestBody SignupDTO signupRequestDTO) {
        Signup createdSignup = signupService.addSignup(signupRequestDTO);
        SignupDTO responseDTO = modelMapper.map(createdSignup, SignupDTO.class);
        return ResponseEntity.ok().body(responseDTO);
    }
}

