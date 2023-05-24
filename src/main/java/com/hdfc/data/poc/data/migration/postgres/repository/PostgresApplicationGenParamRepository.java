package com.hdfc.data.poc.data.migration.postgres.repository;

import com.hdfc.data.poc.data.migration.postgres.entity.ApplicationGenParam;
import com.hdfc.data.poc.data.migration.postgres.entity.ApplicationGenParamPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostgresApplicationGenParamRepository extends JpaRepository<ApplicationGenParam, ApplicationGenParamPK> {

}
