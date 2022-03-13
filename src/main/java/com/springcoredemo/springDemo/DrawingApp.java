package com.springcoredemo.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp 
{
    public static void main( String[] args )
    {

		/* without using spring, we ourselves create triangle object
			Triangle t = new Triangle();
			t.draw();
		*/
		
    	// with spring
    	//BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	ApplicationContext factory2 = new ClassPathXmlApplicationContext("spring2.xml");
    	
    	//setter injection of one member variable
    	Triangle t = (Triangle) factory.getBean("triangle");
    	t.draw();

    	//constructor injection of one member variable
    	Triangle t2 = (Triangle) factory.getBean("triangle2");
    	t2.draw();
    	
    	//constructor injection of both member variable without specifying type
    	Triangle t3 = (Triangle) factory.getBean("triangle3");
    	t3.draw();
    	
    	//constructor injection of one member variable using type
    	Triangle t4 = (Triangle) factory.getBean("triangle4");
    	t4.draw();
    	
    	//constructor injection of both member variable using index
    	Triangle t5 = (Triangle) factory.getBean("triangle5");
    	t5.draw();
    	
    	//constructor injection of reference objects
    	Triangle2 t6 = (Triangle2) factory.getBean("tri2");
    	t6.draw();
    	
    	//setter injection of reference objects
    	Triangle2 t7 = (Triangle2) factory.getBean("tri3");
    	t7.draw();
    	
    	//inner bean
    	Triangle2 t8 = (Triangle2) factory.getBean("tri4");
    	t8.draw();
    	
    	//alternative name/alias of bean
    	Triangle2 t9 = (Triangle2) factory.getBean("triangle2.2");
    	t9.draw();
    	Triangle t10 = (Triangle) factory.getBean("triangle1");
    	t10.draw();
    	
    	//initializing collections
    	Line l1 = factory.getBean("line1",Line.class);
    	l1.draw();
    	
    	//autowire bean byName
    	Triangle2 t11 = (Triangle2) factory.getBean("tri5");
    	t11.draw();
    	
    	/* autowire bean byType. this will work only if we have 1 bean of type is present in xml
    	Triangle2 tdemo = (Triangle2) factory.getBean("tridemo");
    	tdemo.draw();
    	*/
    	
    	/* wont work either. bytype/constructor autowiring require that the bean should have reference
    	 * of only 1 type and in xml also there should be only 1 bean defined for same type.
    	 * Allows a property to be autowired if exactly one bean of property type exists in the container
    	Square s1 = factory.getBean("square1",Square.class);
    	s1.draw();
    	*/
    	
//    	Circle c1 = factory.getBean("circle1", Circle.class);
//    	c1.draw();
    	
    	//c2 is defined in xml and c3 is defined in component scan. both exist within the container
    	Circle c2 = factory2.getBean("circle2", Circle.class);
    	c2.draw();
    	
    	//we dont have any xml config written for circle 3 and its dependency point3. all are auto configured with help of annotations.
    	Circle c3 = factory2.getBean("circle3", Circle.class);
    	c3.draw();
    }
}
