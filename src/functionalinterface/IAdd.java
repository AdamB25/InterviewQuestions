package functionalinterface;
@FunctionalInterface
public interface IAdd<T,R,A> {
    A add(T t,R r);
}
