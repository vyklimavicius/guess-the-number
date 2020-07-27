package com.klimavicius;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.ListIterator;

public class Driver {

    private static final Logger log = LoggerFactory.getLogger(Driver.class);
//    private static final String CONFIG_LOCATION = "beans.xml"; // Only when you have an xml config file

    public static void main(String[] args) {
        log.info("It's alive!");

        // Create context(IoC container)
        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);

        // Get the bean
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);
        Game game = context.getBean(Game.class);
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);


        System.out.println(numberGenerator.next());
        /* Call the method in the bean, the {} internally in f4j has a message formatter. So the {} gets replace by the var.
         This is call parametize logging, a good feature of slf4j
         */
//        int num = numberGenerator.next();
//        log.info("The random number is: {}", num);

        // Get game bean from context with Interface and just the class
//        Game game = context.getBean(Game.class);

        // Call reset method
//        game.reset();

        // close container, to prevent any memory leaks.
        context.close();

    }
}
