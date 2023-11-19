package com.cts.student;

public class Student {
	
	private int id;
    private String name;
    private int newScore;
    
 // Constructors, getters, and setters
    
	public Student(int id, String name, int newScore) {
		// TODO Auto-generated constructor stub
		this.id = id;
        this.name = name;
        this.newScore = newScore;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return newScore;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int newScore) {
		this.newScore = newScore;
	}
	
	// toString method for better logging and debugging

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + newScore +
                '}';
    }

}
