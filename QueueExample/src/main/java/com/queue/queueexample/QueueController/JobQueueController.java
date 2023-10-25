package com.queue.queueexample.QueueController;

import com.queue.queueexample.QueueServices.JobQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")
public class JobQueueController {

    @Autowired
    private JobQueueService jobQueueService;

    @PostMapping("/enqueue")
    public void enqueueJob(@RequestBody String jobPayload){
        jobQueueService.enqueueJob(jobPayload);
    }

    @GetMapping("/dequeue")
    public String dequeueJob(){
        return jobQueueService.dequeueJob();
    }

    @GetMapping("/size")
    public long getQueueSize(){
        return jobQueueService.getQueueSize();
    }
}
