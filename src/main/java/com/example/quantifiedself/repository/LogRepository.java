package com.example.quantifiedself.repository;

import com.example.quantifiedself.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {
    List<Log> findByType(String type);
    List<Log> findByTimestampBefore(LocalDateTime timestamp);
    List<Log> findByTimestampAfter(LocalDateTime timestamp);
    boolean existsByTypeAndTimestampAfter(String type, LocalDateTime timestamp);
}