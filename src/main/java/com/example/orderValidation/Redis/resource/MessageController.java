package com.example.orderValidation.Redis.resource;

import com.example.orderValidation.Redis.service.OrderMessagePublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/messages")
@RestController
public class MessageController {
    private final OrderMessagePublisher messagePublisher;

    public MessageController(OrderMessagePublisher messagePublisher){
        this.messagePublisher = messagePublisher;
    }


    @PostMapping
    public ResponseEntity<String> createMessage(@RequestBody String message){
        this.messagePublisher.publish(message);

        return ResponseEntity.ok(message);
    }
}

@RequestMapping("/trademessages")
@RestController
class TradeMessageController {
    private final OrderMessagePublisher messagePublisher;

    public TradeMessageController(OrderMessagePublisher messagePublisher){
        this.messagePublisher = messagePublisher;
    }


    @PostMapping
    public ResponseEntity<String> createMessage(@RequestBody String message){
        this.messagePublisher.publishTrade(message);

        return ResponseEntity.ok(message);
    }

}

