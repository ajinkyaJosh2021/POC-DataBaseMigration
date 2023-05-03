package com.hdfc.data.poc.data.migration.postgres.repository;

import com.hdfc.data.poc.data.migration.postgres.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
