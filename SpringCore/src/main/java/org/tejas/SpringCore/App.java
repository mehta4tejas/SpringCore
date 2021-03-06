package org.tejas.SpringCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Circle circle = (Circle) beanFactory.getBean("circle");
        circle.display();
    }
}
