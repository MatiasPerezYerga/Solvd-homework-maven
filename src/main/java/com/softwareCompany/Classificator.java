package com.softwareCompany;


import java.util.function.Function;

@FunctionalInterface
public interface Classificator<T> {

    String classify(T input);

}
