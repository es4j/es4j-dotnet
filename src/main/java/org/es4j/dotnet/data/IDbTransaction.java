package org.es4j.dotnet.data;

import org.es4j.dotnet.IDisposable;

/**
 *
 * @author Esfand
 */
public interface IDbTransaction extends IDisposable {
    public void commit();

}
