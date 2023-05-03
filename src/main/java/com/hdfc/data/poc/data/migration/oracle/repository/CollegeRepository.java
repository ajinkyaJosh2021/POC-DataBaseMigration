package com.hdfc.data.poc.data.migration.oracle.repository;


import com.hdfc.data.poc.data.migration.oracle.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College,Long> {
}
