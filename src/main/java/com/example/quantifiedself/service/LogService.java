package com.example.quantifiedself.service;

import com.example.quantifiedself.model.Log;
import com.example.quantifiedself.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

    public Log saveLog(Log log) {
        return logRepository.save(log);
    }

    public List<Log> getAllLogs() {
        return logRepository.findAll();
    }

    public Log getLogById(Long id) {
        return logRepository.findById(id).orElse(null);
    }

    public List<Log> getLogsByType(String type) {
        return logRepository.findByType(type);
    }

    public void deleteLog(Long id) {
        logRepository.deleteById(id);
    }

    public List<Log> findLogsOlderThan(LocalDateTime timestamp) {
        // Implement query to find responses older than the given timestamp
        return logRepository.findByTimestampBefore(timestamp);
    }

    public List<Log> findLogsSince(LocalDateTime timestamp) {
        // Implement query to find responses since the given timestamp
        return logRepository.findByTimestampAfter(timestamp);
    }

    public boolean hasLogSince(LocalDateTime timestamp, String type) {
        // Implement query to check if there are responses of a certain type since the given timestamp
        return logRepository.existsByTypeAndTimestampAfter(type, timestamp);
    }
}