package com.rakesh.springboot;

import com.rakesh.springboot.model.Alien;
import com.rakesh.springboot.model.Laptop;
import com.rakesh.springboot.service.LpstopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBootDemoApplication.class, args);

//		Alien obj=context.getBean(Alien.class);
//		System.out.println(obj.getAge());
//		obj.code();


		LpstopService service = context.getBean(LpstopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);

	}

}


/*

@Component : anotation where spring boot make the bean and object to handle it

@Componet nad @Service is same


3 layer we have

1. CONTROLLER: WHICH ROUTES ALL THE REQUEST
2. Service : which do all the bussiness logic part 2+2 =4
3. repository : DA? --> THIS IS WILL TALK WITH db and get he result

 */