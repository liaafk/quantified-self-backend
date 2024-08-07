package com.example.quantifiedself.service;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.example.quantifiedself.model.Log;

@Service
public class ScheduledPromptService {

    @Autowired
    private LogService logService;

    // Example method to send a daily mood prompt and save the response
    @Scheduled(cron = "0 0 8 * * ?")
    public void sendDailyMoodPrompt() {
        // Logic to send daily mood prompt
        System.out.println("Prompt: How do you feel today?");
        
        // Simulating user input
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.nextLine();

        // Save the user's response
        Log log = new Log("mood", userResponse, LocalDateTime.now());
        logService.saveLog(log);
        System.out.println("User response saved.");
        scanner.close();
    }

    // Example method to send a weekly weight prompt and save the response
    @Scheduled(cron = "0 0 9 ? * MON")
    public void sendWeeklyWeightPrompt() {
        // Logic to send weekly weight prompt
        System.out.println("Prompt: What is your weight?");
        
        // Simulating user input
        Scanner scanner = new Scanner(System.in);
        String userResponse = scanner.nextLine();

        // Save the user's response
        Log log = new Log("weight", userResponse, LocalDateTime.now());
        logService.saveLog(log);
        System.out.println("User response saved.");
        scanner.close();
    }
}
