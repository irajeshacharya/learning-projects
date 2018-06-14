package com.rajesh.springboot.course_api.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author Rajesh Acharya
 *
 *         Date Jun 14, 2018
 */
@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java", "Core Java Description"),
			new Topic("Javascript", "Javascript", "Javascript Description"));

	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		return (Topic) topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
