package org.es4j.dotnet;


public interface IDisposable extends AutoCloseable {
    
    //@Override
    //public default void close() {
    //    dispose();
    //}

    public void dispose() throws RuntimeException;

}
