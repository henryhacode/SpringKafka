package henry.consumer.service.impl;

import henry.consumer.domain.DataMsg;
import henry.consumer.service.KafkaConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerServiceImpl implements KafkaConsumerService {
    @Override
    @KafkaListener(id = "data-listerner", topics = "${kafka.topic}")
    public void listen(DataMsg msg) {
        log.info("Consumer received msg " + msg);
    }
}
