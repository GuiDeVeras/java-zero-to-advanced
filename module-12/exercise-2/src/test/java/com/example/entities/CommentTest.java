package com.example.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

	@Test
	void emptyConstructor() {
		Comment comment = new Comment();
		assertNull(comment.getText());
	}

    	@Test
    	void constructorWithText() {
        	Comment comment = new Comment("Hi!");
        	assertEquals("Hi!", comment.getText());
    	}	

    	@Test
    	void setText() {
		Comment comment = new Comment();
		comment.setText("Hello!");
		assertEquals("Hello!", comment.getText());
	}

    	@Test
    	void changeTextAfterCreation() {
		Comment comment = new Comment("Good Night!");
		comment.setText("Good Morning!");
		assertEquals("Good Morning!", comment.getText());
	}
}
