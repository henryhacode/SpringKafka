package henry.publisher.service.impl;

import henry.publisher.domain.DataMsg;
import henry.publisher.service.KafkaPublishService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaPublishServiceImpl implements KafkaPublishService {
    private final KafkaTemplate<String, DataMsg> kafkaTemplate;

    @Override
    public void publish(String topic, DataMsg msg) {
        kafkaTemplate.send(topic, msg);
        log.info("Sent msg to kafka: topic: " + topic + "; msg: " + msg);
    }
}
