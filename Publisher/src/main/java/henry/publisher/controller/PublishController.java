package henry.publisher.controller;

import henry.publisher.domain.DataMsg;
import henry.publisher.service.KafkaPublishService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
@RequiredArgsConstructor
@Slf4j
public class PublishController {
    private final KafkaPublishService publishService;

    @Value("${kafka.topic}")
    private String topic;

    @PostMapping
    public void publish(@RequestBody DataMsg msg) {
        publishService.publish(topic, msg);
    }
}
