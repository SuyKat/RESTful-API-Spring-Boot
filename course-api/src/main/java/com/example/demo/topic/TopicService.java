package com.example.demo.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> allTopics = Arrays.asList(
        new Topic("java", "java course", "learn java man"),
        new Topic("nodejs", "node course", "learn node man"),
        new Topic("eth", "ethereum", "learn eth man")
    );
    public List<Topic> getTopicsService(){
        return allTopics;
    }
    public Topic getTopic(String id){
        return allTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }
}
