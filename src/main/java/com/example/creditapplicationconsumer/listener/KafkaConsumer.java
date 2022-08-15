package com.example.creditapplicationconsumer.listener;

import com.example.creditapplicationconsumer.model.Credit;
import com.example.creditapplicationconsumer.repository.CreditRepository;
import lombok.AllArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class KafkaConsumer {

    private final CreditRepository creditRepository;

    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "Kafka_Example_Credit", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(Credit credit) {
        creditRepository.save(credit);
        System.out.println("Consumed JSON Message: " + credit);
    }
}
