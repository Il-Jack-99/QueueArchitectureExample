package com.queue.queueexample.QueueServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class JobQueueService {

    private static final String JOB_QUEUE_KEY = "job_queue";

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    public void enqueueJob(String jobPayload){
        redisTemplate.opsForList().rightPush(JOB_QUEUE_KEY, jobPayload);
    }

    public String dequeueJob(){
        return redisTemplate.opsForList().leftPop(JOB_QUEUE_KEY);
    }

    public long getQueueSize(){
        return redisTemplate.opsForList().size(JOB_QUEUE_KEY);
    }

}
