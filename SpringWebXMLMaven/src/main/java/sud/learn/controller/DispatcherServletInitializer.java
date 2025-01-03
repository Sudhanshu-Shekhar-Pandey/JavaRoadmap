package sud.learn.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import sud.learn.config.MySpringConfig;



public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {MySpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/myapp/*"};
	}
	
	

}
