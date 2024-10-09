package annotation;

import java.lang.annotation.*;

@Repeatable(Categories.class)
public @interface Category {
    String name();
}
