package com.backend.springproject.signup;

import com.backend.springproject.Activity.Activity;
import com.backend.springproject.camper.Camper;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data

public class Signup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "camper_id")
    private Camper camper;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    private Integer time;


    public Signup() {
    }
    public Signup(Long id, Camper camper, Activity activity, Integer time) {
        this.id = id;
        this.camper = camper;
        this.activity = activity;
        this.time = time;

    }


}