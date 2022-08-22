package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class ARandomBean {

	private int x;
	
	public int getNum()
	{
		x = (int) (Math.random() * 100);
		return x;
	}
}
