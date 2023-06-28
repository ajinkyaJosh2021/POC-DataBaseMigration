package com.hdfc.data.poc.data.migration.postgres.repository;

import com.hdfc.data.poc.data.migration.postgres.entity.PubSubLogsMaster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PubSubLogsRepository extends CrudRepository<PubSubLogsMaster, Integer> {

    List<PubSubLogsMaster> findByPublishStatusOrderById(String publishStatus);
}
