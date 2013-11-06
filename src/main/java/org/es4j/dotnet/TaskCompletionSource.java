package org.es4j.dotnet;

//import org.es4j.gyes.clientapi.base.WriteResult;

/**
 *
 * @author Esfand
 */
public class TaskCompletionSource<T> {
    
    //public Task1<T> Task;
    //public Action1<Exception> setException;

    public void setResult(T result) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void setException(RuntimeException exception) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void trySetException(RuntimeException exc) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Task1<T> task() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Action1<Exception> setException() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
