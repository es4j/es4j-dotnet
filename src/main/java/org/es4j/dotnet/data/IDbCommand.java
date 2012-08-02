package org.es4j.dotnet.data;

import java.util.Collection;
import org.es4j.dotnet.IDisposable;

/**
 *
 * @author Esfand
 */
public interface IDbCommand extends IDisposable {
    
    public Object getParameter(String key);

    public Object executeScalar();

    public void setTransaction(IDbTransaction transaction);

    public void setCommandText(String statement);

    public IDataParameter createParameter();

    public Collection<IDataParameter> getParameters();

    public void setParameter(String skip, int position);

    public IDataReader executeReader();

    public int  executeNonQuery();
    public void executeNonQuery(String command);
}
