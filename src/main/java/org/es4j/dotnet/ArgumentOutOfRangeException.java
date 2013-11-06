package org.es4j.dotnet;

import org.es4j.dotnet.SerializationInfo;
import org.es4j.dotnet.streams.StreamingContext;

//using System;
//using System.Runtime.Serialization;
//namespace EventStore.ClientAPI.Exceptions

public class ArgumentOutOfRangeException extends RuntimeException {

    public ArgumentOutOfRangeException() {
    }

    public ArgumentOutOfRangeException(String message) //: base(message)
    {
        super(message);
    }

    public ArgumentOutOfRangeException(String message, Exception innerException) //: base(message, innerException)
    {
        super(message, innerException);
    }

    protected ArgumentOutOfRangeException(SerializationInfo info, StreamingContext context) //: base(info, context)
    {
        //super(info, context);
    }
    
    public ArgumentOutOfRangeException(String str1, String str2) //: base(info, context)
    {
        //super(info, context);
    }
    
}
