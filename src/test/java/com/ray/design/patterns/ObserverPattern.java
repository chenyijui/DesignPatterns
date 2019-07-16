package com.ray.design.patterns;

import com.ray.design.patterns.observer.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObserverPattern {

	@Test
	public void Observer() {
		IObserverable podcast = new PodcastA();
		IObserver student = new Student(podcast);
		podcast.add(student);

		//預設節目是英文廣播
		podcast.notifyObservers();

		//節目變為今年流行歌
		((PodcastA) podcast).setName("今年太極高手");

		podcast.notifyObservers();

	}

}
