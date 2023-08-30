package com.backend.springproject.signup;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/signup")

public class SignupController {
      @GetMapping
      public String getCampers() {
            return "Hui Senior";
      }
}