package com.example.quantifiedself.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.quantifiedself.repository.ActivityRepository;
import com.example.quantifiedself.model.Activity;

import java.util.List;

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;
    
    public Activity saveActivity(Activity activity) {
        return activityRepository.save(activity);
    }
    
    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public List<Activity> getSuggestions(String query) {
        return activityRepository.findByNameContainingIgnoreCase(query);
    }
}
