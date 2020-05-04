package com.klimavicius;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    private static final Logger log = LoggerFactory.getLogger(Driver.class);
    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        log.info("It's alive!");

        // Create context(IoC container)
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // Get the bean
        NumberGeneratorImpl numberGenerator = context.getBean("numberGenerator", NumberGeneratorImpl.class);

        /* Call the method in the bean, the {} internally in f4j has a message formatter. So the {} gets replace by the var.
         This is call parametize logging, a good feature of slf4j
         */
        int num = numberGenerator.next();
        log.info("The random number is: {}", num);

        // close container, to prevent any memory leaks.
        context.close();

    }
}
