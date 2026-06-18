package com.example.entities;

import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class PostTest {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	@Test
	void emptyConstructor () {
		Post post = new Post();
		assertNull (post.getTitle());
	}
	
	@Test
	void ConstructorWithParameters () throws ParseException {
		Post post = new Post(sdf.parse("15/02/2026 12:00:00"), "Happy birthday!", "It's my birthday!", 100);
		assertEquals (sdf.parse("15/02/2026 12:00:00"), post.getMoment());
		assertEquals ("Happy birthday!", post.getTitle());
		assertEquals ("It's my birthday!", post.getContent());
		assertEquals (100, post.getLikes());
	}
	
	@Test
	void setMoment () throws ParseException {
		Post post = new Post();
		post.setMoment(sdf.parse("06/06/2006 19:02:01"));
		assertEquals(sdf.parse("06/06/2006 19:02:01"), post.getMoment());
	}

	@Test
	void setTitle () {
		Post post = new Post();
		post.setTitle("I got my degree!");
		assertEquals("I got my degree!", post.getTitle());
	}
	
	@Test
	void setContent () {
		Post post = new Post();
		post.setContent("Today is the day of my graduation");
		assertEquals("Today is the day of my graduation", post.getContent());
	}
	
	@Test	
	void setLikes () {
		Post post = new Post();
		post.setLikes(81);
		assertEquals(81, post.getLikes());
	}
	
	@Test
	void addComment() throws ParseException {
		Post post = new Post(sdf.parse("15/02/2026 12:00:00"), "Happy birthday!", "It's my birthday!", 100);
		Comment comment = new Comment ("What's up!");
		post.addComment(comment);
		assertEquals(1, post.getComments().size());
	}
	
	@Test
	void removeComment() throws ParseException {
		Post post = new Post(sdf.parse("15/02/2026 12:00:00"), "Happy birthday!", "It's my birthday!", 100);
		Comment comment = new Comment ("What's up!");
		post.addComment(comment);
		post.removeComment(comment);
		assertEquals(0, post.getComments().size());
	}
	
	@Test
    	void toStringWithoutComments() throws ParseException {
		Post post = new Post(sdf.parse("21/03/2026 00:00:00"), "Hello World", "My first post", 10);

		String expected = "Hello World\n10 Likes - 21/03/2026 00:00:00\nMy first post\nComments:\n";
		assertEquals(expected, post.toString());
    	}

    	@Test
    	void toStringWithComments() throws ParseException {
		Post post = new Post(sdf.parse("21/03/2026 00:00:00"), "Hello World", "My first post", 5);
		post.addComment(new Comment("Nice post!"));
		post.addComment(new Comment("Great job!"));

		String expected = "Hello World\n5 Likes - 21/03/2026 00:00:00\nMy first post\nComments:\nNice post!\nGreat job!\n";
		assertEquals(expected, post.toString());
    	}
	
}
