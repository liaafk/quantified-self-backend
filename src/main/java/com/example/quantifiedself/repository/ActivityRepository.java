package com.example.quantifiedself.repository;

import com.example.quantifiedself.model.Activity;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
    List<Activity> findByNameContainingIgnoreCase(String query);
}