package org.tejas.SpringCore.Second;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App 
{
	public static void main(String args[])
	{
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Circle circle = (Circle) beanFactory.getBean("circle1");
        circle.display();
	}
}
