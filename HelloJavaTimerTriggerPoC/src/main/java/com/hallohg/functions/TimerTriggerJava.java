package com.hallohg.functions;

import java.time.*;
import java.util.logging.Logger;

import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Timer trigger.
 */
public class TimerTriggerJava {
    /**
     * This function will be invoked periodically according to the specified schedule.
     */
    @FunctionName("TimerTriggerJava")
    public void run(
        @TimerTrigger(name = "timerInfo", schedule = "0 * * * * *") String timerInfo,
        final ExecutionContext context
    ) {
        Logger logger = context.getLogger();

        logger.info("Hello World Timer trigger function executed at: " + LocalDateTime.now());
        logger.info("Hello World!");
        logger.info("Hello World Timer trigger function finished at: " + LocalDateTime.now());

    }
}
