package com.javaex.ex02;

public class Friend {

	
	//Field
    private String name;
    private String hp;
    private String school;

    //Constructor
    
    public Friend() {
    	
    }
    
    public Friend(String name, String hp, String school) {
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    }

    
    //Method - gs

    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getHp() {
    	return hp;
    }
    
    public void setHp(String hp) {
    	this.hp = hp;
    }
    
    public String getSchool() {
    	return school;
    }
    
    public void setSchool(String school) {
    	this.school = school;
    }

    
    //Method - Ordinary

    @Override
    public String toString() {
    	return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
    }
    
    public String output() {
    	return ("이름: " + name + " 핸드폰: " + hp + " 학교: " + school);
    }
    

}
