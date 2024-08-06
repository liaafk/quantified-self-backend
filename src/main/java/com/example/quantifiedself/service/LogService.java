package com.example.quantifiedself.service;

import com.example.quantifiedself.model.Log;
import com.example.quantifiedself.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}