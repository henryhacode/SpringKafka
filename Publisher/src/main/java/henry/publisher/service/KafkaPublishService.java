package henry.publisher.service;

import henry.publisher.domain.DataMsg;

public interface KafkaPublishService {
    void publish(String topic, DataMsg msg);
}
