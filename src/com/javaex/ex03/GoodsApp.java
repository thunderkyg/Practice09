package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Goods> gList = new ArrayList<Goods>();
		System.out.println("상품을 등록해주세요 (종료 q)");
		
		while (true) {
			String info = input.next();
			if (info.equals("q")) {
				break;
			}
			String[] detail = info.split(",");
			String name = detail[0];
			int price = Integer.parseInt(detail[1]);
			int count = Integer.parseInt(detail[2]);
			
			gList.add(new Goods(name, price, count));
		}
		
		System.out.println("[압력완료]");
		System.out.println("======================");
		for(Goods g : gList) {
			System.out.println(g.Output());
		}
		input.close();
	}

}
