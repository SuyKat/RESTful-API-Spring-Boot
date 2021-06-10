package com.example.course.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> allTopics = new ArrayList<>( Arrays.asList(
        new Topic("java", "java course", "learn java man"),
        new Topic("nodejs", "node course", "learn node man"),
        new Topic("eth", "ethereum", "learn eth man")
    ));
    public List<Topic> getTopicsService(){
        return allTopics;
    }
    public Topic getTopic(String id){
        return allTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }
    public void addTopic(Topic topic){
        allTopics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for (int i = 0; i < allTopics.size(); i++) {
            if (allTopics.get(i).getId().equals(id)){
                allTopics.set(i, topic);
                return;
            }
        }

    }

    public void deleteTopic( String id) {
        allTopics.removeIf(topic1 -> topic1.getId().equals(id));
    }
}
