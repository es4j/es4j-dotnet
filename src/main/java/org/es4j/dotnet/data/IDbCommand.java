package org.es4j.dotnet.data;

import java.util.Collection;
import org.es4j.dotnet.IDisposable;

/**
 *
 * @author Esfand
 */
/*
public interface IDbCommand extends IDisposable {
    

    public Object executeScalar();

    public void setTransaction(IDbTransaction transaction);

    public void setCommandText(String statement);

    public IDataParameter createParameter();

    public Collection<IDataParameter> getParameters();

    public Object getParameter(String key);
    public void   setParameter(String skip, int position);

    public IDataReader executeReader();

    public int  executeNonQuery();
    public void executeNonQuery(String command);
}
*/


// Represents an SQL statement that is executed while connected to a data source,
// and is implemented by .NET Framework data providers that access relational
// databases.
public interface IDbCommand extends IDisposable {
    
    // Summary:
    //     Gets or sets the text command to run against the data source.
    //
    // Returns:
    //     The text command to execute. The default value is an empty string ("").
    //string CommandText { get; set; }
    String getCommandText();
    void   setCommandText(String text);
        
    // Summary:
    //     Gets or sets the wait time before terminating the attempt to execute a command
    //     and generating an error.
    //
    // Returns:
    //     The time (in seconds) to wait for the command to execute. The default value
    //     is 30 seconds.
    //
    // Exceptions:
    //   System.ArgumentException:
    //     The property value assigned is less than 0.
    //int CommandTimeout { get; set; }
    int  getCommandTimeout();
    void setCommandTimeout(int timeout);
        
    // Summary:
    //     Indicates or specifies how the System.Data.IDbCommand.CommandText property
    //     is interpreted.
    //
    // Returns:
    //     One of the System.Data.CommandType values. The default is Text.
    //CommandType CommandType { get; set; }
    //CommandType getCommandType();
    //void        setCommandType(CommandType type);

    // Summary:
    //     Gets or sets the System.Data.IDbConnection used by this instance of the System.Data.IDbCommand.
    //
    // Returns:
    //     The connection to the data source.
    //IDbConnection Connection { get; set; }
    IDbConnection getConnection();
    void          setConnection(IDbConnection connection);
    
    // Summary:
    //     Gets the System.Data.IDataParameterCollection.
    //
    // Returns:
    //     The parameters of the SQL statement or stored procedure.
    //IDataParameterCollection Parameters { get; }
    IDataParameterCollection getParameters();
        
    // Summary:
    //     Gets or sets the transaction within which the Command object of a .NET Framework
    //     data provider executes.
    //
    // Returns:
    //     the Command object of a .NET Framework data provider executes. The default
    //     value is null.
    //IDbTransaction Transaction { get; set; }
    IDbTransaction getTransaction();
    void           setTransaction(IDbTransaction transaction);
        
    // Summary:
    //     Gets or sets how command results are applied to the System.Data.DataRow when
    //     used by the System.Data.IDataAdapter.Update(System.Data.DataSet) method of
    //     a System.Data.Common.DbDataAdapter.
    //
    // Returns:
    //     One of the System.Data.UpdateRowSource values. The default is Both unless
    //     the command is automatically generated. Then the default is None.
    //
    // Exceptions:
    //   System.ArgumentException:
    //     The value entered was not one of the System.Data.UpdateRowSource values.
    //UpdateRowSource UpdatedRowSource { get; set; }
    //UpdateRowSource getUpdatedRowSource();
    //void            setUpdatedRowSource(UpdatedRowSource xx);

    // Summary:
    //     Attempts to cancels the execution of an System.Data.IDbCommand.
    void cancel();

    // Summary:
    //     Creates a new instance of an System.Data.IDbDataParameter object.
    //
    // Returns:
    //     An IDbDataParameter object.
    IDbDataParameter createParameter();

    // Summary:
    //     Executes an SQL statement against the Connection object of a .NET Framework
    //     data provider, and returns the number of rows affected.
    //
    // Returns:
    //     The number of rows affected.
    //
    // Exceptions:
    //   System.InvalidOperationException:
    //     The connection does not exist.-or- The connection is not open.
    int executeNonQuery();

    // Summary:
    //     Executes the System.Data.IDbCommand.CommandText against the System.Data.IDbCommand.Connection
    //     and builds an System.Data.IDataReader.
    //
    // Returns:
    //     An System.Data.IDataReader object.
    IDataReader executeReader();

    // Summary:
    //     Executes the System.Data.IDbCommand.CommandText against the System.Data.IDbCommand.Connection,
    //     and builds an System.Data.IDataReader using one of the System.Data.CommandBehavior
    //     values.
    //
    // Parameters:
    //   behavior:
    //     One of the System.Data.CommandBehavior values.
    //
    // Returns:
    //     An System.Data.IDataReader object.
    //IDataReader executeReader(CommandBehavior behavior);

    // Summary:
    //     Executes the query, and returns the first column of the first row in the
    //     resultset returned by the query. Extra columns or rows are ignored.
    //
    // Returns:
    //     The first column of the first row in the resultset.
    Object executeScalar();

    // Summary:
    //     Creates a prepared (or compiled) version of the command on the data source.
    //
    // Exceptions:
    //   System.InvalidOperationException:
    //     The System.Data.OleDb.OleDbCommand.Connection is not set.-or- The System.Data.OleDb.OleDbCommand.Connection
    //     is not System.Data.OleDb.OleDbConnection.Open().
    void prepare();
}


