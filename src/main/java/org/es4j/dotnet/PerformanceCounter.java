package org.es4j.dotnet;

import org.es4j.dotnet.IDisposable;


public class PerformanceCounter implements IDisposable {

    public PerformanceCounter(String CategoryName, String TotalCommitsName, String instanceName, boolean b) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void close() {
        dispose_FORNOW();
    }
    @Override
    public void dispose_FORNOW() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void increment() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void incrementBy(long elapsedMilliseconds) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void decrement() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
