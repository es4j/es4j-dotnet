package org.es4j.dotnet.data;

// Represents a parameter to a Command object, and optionally, its mapping to
// System.Data.DataSet columns; and is implemented by .NET Framework data providers
// that access data sources.
public interface IDataParameter
{
    // Summary:
    //     Gets or sets the System.Data.DbType of the parameter.
    //
    // Returns:
    //     One of the System.Data.DbType values. The default is System.Data.DbType.String.
    //
    // Exceptions:
    //   System.ArgumentOutOfRangeException:
    //     The property was not set to a valid System.Data.DbType.
    //DbType DbType { get; set; }
    DbType getDbType();
    void   setDbType(DbType type);
    
    // Summary:
    //     Gets or sets a value indicating whether the parameter is input-only, output-only,
    //     bidirectional, or a stored procedure return value parameter.
    //
    // Returns:
    //     One of the System.Data.ParameterDirection values. The default is Input.
    //
    // Exceptions:
    //   System.ArgumentException:
    //     The property was not set to one of the valid System.Data.ParameterDirection
    //     values.
    //ParameterDirection Direction { get; set; }
    //ParameterDirection getDirection();
    //void               setDirection(ParameterDirection direction);

    // Summary:
    //     Gets a value indicating whether the parameter accepts null values.
    //
    // Returns:
    //     true if null values are accepted; otherwise, false. The default is false.
    //bool IsNullable { get; }
    boolean isNullable();
    
    // Summary:
    //     Gets or sets the name of the System.Data.IDataParameter.
    //
    // Returns:
    //     The name of the System.Data.IDataParameter. The default is an empty string.
    //string ParameterName { get; set; }
    String getParameterName();
    void   setParameterName(String name);
    
    // Summary:
    //     Gets or sets the name of the source column that is mapped to the System.Data.DataSet
    //     and used for loading or returning the System.Data.IDataParameter.Value.
    //
    // Returns:
    //     The name of the source column that is mapped to the System.Data.DataSet.
    //     The default is an empty string.
    //string SourceColumn { get; set; }
    String getSourceColumn();
    void   setSourceColumn();
    
    // Summary:
    //     Gets or sets the System.Data.DataRowVersion to use when loading System.Data.IDataParameter.Value.
    //
    // Returns:
    //     One of the System.Data.DataRowVersion values. The default is Current.
    //
    // Exceptions:
    //   System.ArgumentException:
    //     The property was not set one of the System.Data.DataRowVersion values.
    //DataRowVersion SourceVersion { get; set; }
    //DataRowVersion getSourceVersion();
    //void           setSourceVersion(DataRowVersion version)
    
    // Summary:
    //     Gets or sets the value of the parameter.
    //
    // Returns:
    //     An System.Object that is the value of the parameter. The default value is
    //     null.
    //object Value { get; set; }
    Object getValue();
    void   setValue(Object value);
}
