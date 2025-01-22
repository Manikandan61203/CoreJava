package MethodReferenceConstructor;

@FunctionalInterface
interface StudentFactory{
    Student create(String name, int marks);
}