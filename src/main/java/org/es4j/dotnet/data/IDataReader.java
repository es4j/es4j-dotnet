package org.es4j.dotnet.data;

import java.io.Closeable;


public interface IDataReader extends IDataRecord, Closeable {

    public boolean read();

    public void dispose();
    
}
