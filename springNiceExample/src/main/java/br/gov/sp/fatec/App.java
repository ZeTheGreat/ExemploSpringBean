package br.gov.sp.fatec;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext(	"applicationContext.xml");
		
		
		
		Outfit outfit1 = (Outfit) context.getBean("outfit");
		outfit1.setRoupas((ArrayList<PecaRoupa>) context.getBean("roupas"));

		System.out.println("O outfit custa: R$" + outfit1.quantoCusta());
		
		context.close();
	}
}
