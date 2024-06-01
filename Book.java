package com.Libraryms.LibraryEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private String author;
	private boolean borrowed;
	
	
	public boolean isBorrowed() {
		return borrowed;
	}


	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}


	@ManyToOne
	@JoinColumn (name= "user_id")
	private User borrowedby;


	public void setBorrowedby(User borrowedby) {
		this.borrowedby = borrowedby;
	}
	


	
}
