package com.service;

import com.aspect.LoggingAspect;
import com.model.Circle;

public class ShapeServiceProxy extends ShapeService{
	public Circle getCircle() {
new LoggingAspect().loginAdvice();
		return super.getCircle();
	}
}
