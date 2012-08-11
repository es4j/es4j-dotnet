package org.es4j.dotnet;


public interface IDisposable extends AutoCloseable {

    public void dispose(); // throws Exception;

}
