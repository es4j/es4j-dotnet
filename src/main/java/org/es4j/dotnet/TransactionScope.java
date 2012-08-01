package org.es4j.dotnet;


public class TransactionScope implements IDisposable {

    public TransactionScope() {
    }

    public TransactionScope(TransactionScopeOption scopeOption) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void complete() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void dispose() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
