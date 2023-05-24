package com.hdfc.data.poc.data.migration.postgres.entity;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "MST_PUB_SUB_LOGS")
@Data
public class PubSubLogsMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "topic")
    private String topic;

    @Column(name = "eventid")
    private String eventId;

    @Type(type = "json")
    @Column(name = "payload", columnDefinition = "jsonb")
    private Map<String, Object> payload = new HashMap<>();

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "publish_status")
    private String publishStatus;

    @Column(name = "published_id")
    private String publishedId;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @Column(name = "updated_date")
    private Timestamp updatedDate;

    public PubSubLogsMaster() {
    }


}
