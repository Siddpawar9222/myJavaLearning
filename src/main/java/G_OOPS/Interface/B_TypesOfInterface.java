package G_OOPS.Interface;


interface MySerializable{  
    default void m(){
        System.out.println("Doing Something");
    }
} 
@FunctionalInterface
interface MyFuctional{
      void task() ;
       default void myTask(){

       }
} 
public class B_TypesOfInterface{
    public static void main(String[] args) {
        
    }
}

/*
 -An interface which has no abstract method is known as a marker or tagged interface .
  for example, Serializable, Cloneable, Remote, etc. 
  -They are used to provide some essential information to the JVM so that JVM may perform some useful operation.
  -notation for jvm so jvm can understand which task should perform .
  
  -An interface which has only one abstract method is known as a Functional interface .
   for example, Predicate<T>, Function<T, R> , Consumer<T> etc. 
  
    Note : Functional interface and markup interface might have default ,static and private methods . only one rule matter for this interface that they must have one and zero abstract method respectively .
    Converter<S, T> interface(Functional) comes in spring best example of it
     
  */