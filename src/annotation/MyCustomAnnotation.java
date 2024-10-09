package annotation;

import java.lang.annotation.*;

public @interface MyCustomAnnotation {
    String name() default "hello";
}
