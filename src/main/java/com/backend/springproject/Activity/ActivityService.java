package com.backend.springproject.Activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

 private final ActivityInterface activityInterface;

 @Autowired
    public ActivityService(ActivityInterface activityInterface){
     this.activityInterface = activityInterface;
      }

      public Activity create(Activity activity){
     return activityInterface.save(activity);
      };
}
