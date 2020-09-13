package com.jkys.leeaoyin.demo.Schedule;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleT {

    Logger logger = LoggerFactory.getLogger(ScheduleT.class);

    @Scheduled(cron = "0/5 * * * * *")
    public void testSchedule(){
        logger.info("class SchuduleT");
        System.out.println("time is runing");
    }
}
