package com.backend.springproject.Activity;

import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
  @Autowired
  private ActivityRepository activityRepository;
  @Autowired
  private ModelMapper modelMapper;

  public Activity addActivity(@Valid Activity activity){
    return activityRepository.save(activity);
     }
}
