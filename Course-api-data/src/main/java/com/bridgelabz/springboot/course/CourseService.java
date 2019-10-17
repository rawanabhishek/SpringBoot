package com.bridgelabz.springboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	
	@Autowired
	private CourseRepository courseRepository;

//	private List<Course> courses = new ArrayList<> (Arrays.asList(new Course("Spring", "SpringFrameWork", "SpringFrameWorkDescription"),
//			new Course("Java", "javaFrameWork", "javaFrameWorkDescription"),
//			new Course("JavaScript", "JavaScriptFrameWork", "JavaScriptFrameWorkDescription")));

	public List<Course> getAllCourses(String topicId) {
		//return topics;
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;

	}

	public Course getCourse(String id) {
		
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get() ;
	return	courseRepository.findById(id).orElse(null);
	}
	
	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
		
	}

	public void updateCourse(Course topic) {
//		for(int i=0;i<topics.size();i++) {
//			Topic t =topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		courseRepository.save(topic);
		
		
	}

	public void deleteCourse(String id) {
		//topics.removeIf(t ->t.getId().equals(id));
		
		courseRepository.deleteById(id);
		
	}

}
