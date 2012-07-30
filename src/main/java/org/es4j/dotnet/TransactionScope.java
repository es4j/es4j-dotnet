package org.es4j.dotnet;


public class TransactionScope implements AutoCloseable {

    public TransactionScope() {
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void complete() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
