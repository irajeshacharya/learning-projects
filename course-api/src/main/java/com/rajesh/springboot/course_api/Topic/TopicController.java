package com.rajesh.springboot.course_api.Topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rajesh Acharya
 *
 *         Date Jun 14, 2018
 */
@RestController
public class TopicController {
	// Marks this as something needs dependency injection
	@Autowired
	private TopicService topicService;

	// JSON Conversion is done automatically
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
}
