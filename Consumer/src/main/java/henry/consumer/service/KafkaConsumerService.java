package henry.consumer.service;

import henry.consumer.domain.DataMsg;

public interface KafkaConsumerService {
    void listen(DataMsg msg);
}
