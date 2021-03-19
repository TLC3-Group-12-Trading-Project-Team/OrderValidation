package com.example.orderValidation.controllers.webhooks;

import com.example.orderValidation.models.MarketData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/webhooks")
public class MarketDataHook {

    private static Logger logger = LoggerFactory.getLogger(MarketDataHook.class);

    @PostMapping("/market-data")
    public void onMarketDataUpdate(@RequestBody List<MarketData> md) {
        // do something
        logger.info(md.toString());
    }
}
