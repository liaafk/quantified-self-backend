package com.example.quantifiedself.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.quantifiedself.model.Activity;
import com.example.quantifiedself.service.ActivityService;
import java.util.List;

@RestController
@RequestMapping("/api/activities")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping
    public List<Activity> getAllActivities() {
        return activityService.getAllActivities();
    }

    @PostMapping
    public Activity createActivity(@RequestBody Activity activity) {
        return activityService.saveActivity(activity);
    }

    @GetMapping("/suggestions")
    public List<Activity> getSuggestions(@RequestParam String query) {
        return activityService.getSuggestions(query);
    }
}

