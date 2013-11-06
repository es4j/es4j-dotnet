package org.es4j.dotnet.streams;

/**
 *
 * @author Esfand
 */
@FunctionalInterface
public interface AsyncCallback {
    public /*delegate*/ void AsyncCallback(IAsyncResult ar);
}

//[SerializableAttribute]
//[ComVisibleAttribute(true)]
//public delegate void AsyncCallback(IAsyncResult ar)