package AOP;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeMethod implements MethodBeforeAdvice
	{
		public void before(Method method, Object[] args, Object target)
			throws Throwable {
		        System.out.println("HijackBeforeMethod : Before method hijacked!");
		}
	}

