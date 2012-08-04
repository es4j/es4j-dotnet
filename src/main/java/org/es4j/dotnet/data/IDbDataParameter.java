package org.es4j.dotnet.data;

/**
 *
 * @author Esfand
 */
/*
public interface IDbDataParameter {

    public void setValue(Object value);

    public void setParameterName(String name);

    public DbType getDbType();
    
    public void setDbType(DbType dbType);

    public Object getValue();
    
}
*/

// Summary:
//     Used by the Visual Basic .NET Data Designers to represent a parameter to
//     a Command object, and optionally, its mapping to System.Data.DataSet columns.
public interface IDbDataParameter extends IDataParameter {
    
    // Summary:
    //     Indicates the precision of numeric parameters.
    //
    // Returns:
    //     The maximum number of digits used to represent the Value property of a data
    //     provider Parameter object. The default value is 0, which indicates that a
    //     data provider sets the precision for Value.
    //byte Precision { get; set; }
    byte getPrecision();
    void setPrecision(byte precision);
    
    // Summary:
    //     Indicates the scale of numeric parameters.
    //
    // Returns:
    //     The number of decimal places to which System.Data.OleDb.OleDbParameter.Value
    //     is resolved. The default is 0.
    //byte Scale { get; set; }
    byte getScale();
    void setScale(byte scale);   
    
    // Summary:
    //     The size of the parameter.
    //
    // Returns:
    //     The maximum size, in bytes, of the data within the column. The default value
    //     is inferred from the the parameter value.
    //int Size { get; set; }
    int  getSize();
    void setSize(int size);
}

