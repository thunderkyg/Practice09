package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	List<Friend> fList = new ArrayList<Friend>();
    	System.out.println("친구를 3명 등록해주세요");
    	
    	
    	for(int i = 0; i < 3; i++) {
    		String info = input.nextLine();
    		String[] details = info.split(" ");
    		String name = details[0];
    		String hp = details[1];
    		String school = details[2];
    		fList.add(new Friend(name, hp, school));
    	}
    	
    	
    	for(Friend list : fList) {
    		System.out.println(list.output());
    	}
    	
    	input.close();
    	
    	
    	//String Split 사용 칸을 나눠서 출력
    }

}
