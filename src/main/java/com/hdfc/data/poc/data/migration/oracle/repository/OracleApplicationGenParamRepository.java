package com.hdfc.data.poc.data.migration.oracle.repository;

import com.hdfc.data.poc.data.migration.oracle.entity.ApplicationGenParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleApplicationGenParamRepository extends JpaRepository<ApplicationGenParam, Long> {

}
