package com.hdfc.data.poc.data.migration.postgres.repository;

import com.hdfc.data.poc.data.migration.postgres.entity.TxnTopicMappingMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TxnTopicMappingRepository extends JpaRepository<TxnTopicMappingMaster, Integer> {

    List<TxnTopicMappingMaster> findByTxnIdAndType(String txnId, String type);
}
