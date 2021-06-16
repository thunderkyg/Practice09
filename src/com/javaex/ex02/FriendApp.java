package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	List<Friend> fList = new ArrayList<Friend>();
    	System.out.println("친구를 3명 등록해주세요");
    	
    	Friend f01 = new Friend(input.next(), input.next(), input.next());
    	Friend f02 = new Friend(input.next(), input.next(), input.next());
    	Friend f03 = new Friend(input.next(), input.next(), input.next());
    	
    	fList.add(f01);
    	fList.add(f02);
    	fList.add(f03);
    	
    	for(Friend list : fList) {
    		System.out.println(list.output());
    	}
    	
    	input.close();
    	
    }

}
