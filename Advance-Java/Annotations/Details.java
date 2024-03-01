package src.java.Annotations;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Details {
    int age() default 15;
    String name() default "Priyanshu";
    String city() default "Delhi";
}
