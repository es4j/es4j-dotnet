package org.es4j.dotnet;

/**
 *
 * @author Esfand
 */
public interface Task1<T> {
    
    public static Object Factory = null;

    public T    Result();

    public void Wait();
    
}
