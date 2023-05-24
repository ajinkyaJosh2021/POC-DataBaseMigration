package com.hdfc.data.poc.data.migration.postgres.repository;

import com.hdfc.data.poc.data.migration.postgres.entity.AlertTemplatePK;
import com.hdfc.data.poc.data.migration.postgres.entity.AlertsTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlertsTemplateRepo extends JpaRepository<AlertsTemplate, AlertTemplatePK> {
}
