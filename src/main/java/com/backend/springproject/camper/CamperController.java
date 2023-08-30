package com.backend.springproject.camper;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/camper")
public class CamperController {

    @GetMapping
    public String getCampers(){
        return "Hector Senior";
    }


}