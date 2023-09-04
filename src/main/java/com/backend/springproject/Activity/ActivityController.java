package com.backend.springproject.Activity;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActivityController {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private final ActivityService activityService;
    @Autowired
    private ActivityRepository activityRepositoryRepository;
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }


    @PostMapping("/activity")
    public ResponseEntity<ActivityDTO> registerActivity (@Valid @RequestBody ActivityDTO activityDTO){
        try {

            Activity activityRequest = modelMapper.map(activityDTO, Activity.class);
            Activity _activity = activityService.addActivity(activityRequest);
            ActivityDTO activityResponse = modelMapper.map(_activity, ActivityDTO.class);

            return ResponseEntity.ok().body(activityResponse);
       } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
