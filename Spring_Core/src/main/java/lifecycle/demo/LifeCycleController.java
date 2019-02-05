package lifecycle.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component(value = "lifeCycleController")
public class LifeCycleController implements BeanNameAware,ApplicationContextAware,BeanFactoryAware,BeanClassLoaderAware,BeanPostProcessor{

	@Autowired
	private Test test;
	
	Logger logger = LoggerFactory.getLogger(LifeCycleController.class);

	public LifeCycleController() {
		logger.info("bean creration");
	}

	@PostConstruct
	public void intit() {
		logger.info("initialization activities after bean creration");
	}

	@PreDestroy
	public void destroy() {
		logger.info("destruction activities after bean has finished it's task");
	}

	public void display() {

		logger.info("LifeCycleController life cycle method demo");
		test.show();

	}

	//List of aware 
	@Override
	public void setBeanName(String neanName) {
		logger.info("BeanNameAware :: " + neanName);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		logger.info("ApplicationContextAware :: " +applicationContext.getBean("lifeCycleController", LifeCycleController.class));
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		logger.info("BeanFactoryAware :: " +beanFactory.getBean("lifeCycleController", LifeCycleController.class));
		
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		logger.info("BeanClassLoaderAware :: " +classLoader.getClass());
		
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		logger.info("BeanPostProcessor :: postProcessBeforeInitialization :: " +bean);
			return bean;
		}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		logger.info("BeanPostProcessor :: postProcessAfterInitialization  :: " +bean);
		return bean;
	}

}
