package intefaces;

import annotation.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Category[] annotations = new Eagle().getClass().getAnnotationsByType(Category.class);

        for (Category annotation : annotations) {
            System.out.println(annotation.name());
        }

    }
}

/*
    output:
    Bird
    LivingThing
    Carnivor
 */