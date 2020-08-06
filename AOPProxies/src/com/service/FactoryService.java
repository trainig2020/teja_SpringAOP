package com.service;

import com.model.Circle;
import com.model.Triangle;

public class FactoryService {
	public Object getBean(String beanType) {
		if(beanType.equals("shapeService")) return new ShapeServiceProxy();
		if(beanType.equals("Circle")) return new Circle();
		if(beanType.equals("Triangle")) return new Triangle();
		return null;
	}

}
