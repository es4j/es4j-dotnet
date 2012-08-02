package org.es4j.dotnet.data;

/**
 *
 * @author Esfand
 */
public interface IDataParameter {

    public void setValue(Object value);

    public void setParameterName(String name);

    public DbType getDbType();
    
    public void setDbType(DbType dbType);

    public Object getValue();
    
}
