package org.es4j.dotnet.data;

//using System;

import org.es4j.dotnet.data.IDataReader;
import java.util.UUID;
import org.es4j.util.DateTime;
//import org.joda.time.DateTime;

//using System.Reflection;
//namespace System.Data


//     Provides access to the column values within each row for a DataReader, and
//     is implemented by .NET Framework data providers that access relational databases.
public interface IDataRecord {

        //     Gets the number of columns in the current row.
        // Returns:
        //     When not positioned in a valid recordset, 0; otherwise, the number of columns
        //     in the current record. The default is -1.
        public int getFieldCount(); // { get; }

        //     Gets the column located at the specified index.
        //
        // Parameters:
        //   i:
        //     The zero-based index of the column to get.
        //
        // Returns:
        //     The column located at the specified index as an System.Object.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        Object get(int i); //this[int i] { get; }
        
        //
        // Summary:
        //     Gets the column with the specified name.
        //
        // Parameters:
        //   name:
        //     The name of the column to find.
        //
        // Returns:
        //     The column with the specified name as an System.Object.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     No column with the specified name was found.
        Object get(String name); //this[string name] { get; }

        // Summary:
        //     Gets the value of the specified column as a Boolean.
        //
        // Parameters:
        //   i:
        //     The zero-based column ordinal.
        //
        // Returns:
        //     The value of the column.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        boolean getBoolean(int i);
        
        //
        // Summary:
        //     Gets the 8-bit unsigned integer value of the specified column.
        //
        // Parameters:
        //   i:
        //     The zero-based column ordinal.
        //
        // Returns:
        //     The 8-bit unsigned integer value of the specified column.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        byte getByte(int i);
        
        //
        // Summary:
        //     Reads a stream of bytes from the specified column offset into the buffer
        //     as an array, starting at the given buffer offset.
        //
        // Parameters:
        //   i:
        //     The zero-based column ordinal.
        //
        //   fieldOffset:
        //     The index within the field from which to start the read operation.
        //
        //   buffer:
        //     The buffer into which to read the stream of bytes.
        //
        //   bufferoffset:
        //     The index for buffer to start the read operation.
        //
        //   length:
        //     The number of bytes to read.
        //
        // Returns:
        //     The actual number of bytes read.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        long getBytes(int i, long fieldOffset, byte[] buffer, int bufferoffset, int length);
        
        //
        // Summary:
        //     Gets the character value of the specified column.
        //
        // Parameters:
        //   i:
        //     The zero-based column ordinal.
        //
        // Returns:
        //     The character value of the specified column.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        char getChar(int i);
        
        //
        // Summary:
        //     Reads a stream of characters from the specified column offset into the buffer
        //     as an array, starting at the given buffer offset.
        //
        // Parameters:
        //   i:
        //     The zero-based column ordinal.
        //
        //   fieldoffset:
        //     The index within the row from which to start the read operation.
        //
        //   buffer:
        //     The buffer into which to read the stream of bytes.
        //
        //   bufferoffset:
        //     The index for buffer to start the read operation.
        //
        //   length:
        //     The number of bytes to read.
        //
        // Returns:
        //     The actual number of characters read.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        long getChars(int i, long fieldoffset, char[] buffer, int bufferoffset, int length);
        
        //
        // Summary:
        //     Returns an System.Data.IDataReader for the specified column ordinal.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The System.Data.IDataReader for the specified column ordinal.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        IDataReader getData(int i);
        
        //
        // Summary:
        //     Gets the data type information for the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The data type information for the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        String getDataTypeName(int i);
        
        //
        // Summary:
        //     Gets the date and time data value of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The date and time data value of the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        DateTime getDateTime(int i);
        
        //
        // Summary:
        //     Gets the fixed-position numeric value of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The fixed-position numeric value of the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        //decimal GetDecimal(int i);
        
        //
        // Summary:
        //     Gets the double-precision floating point number of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The double-precision floating point number of the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        double getDouble(int i);
        
        //     Gets the System.Type information corresponding to the type of System.Object
        //     that would be returned from System.Data.IDataRecord.GetValue(System.Int32).
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The System.Type information corresponding to the type of System.Object that
        //     would be returned from System.Data.IDataRecord.GetValue(System.Int32).
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        //Type GetFieldType(int i);
        
        //
        // Summary:
        //     Gets the single-precision floating point number of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The single-precision floating point number of the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        float getFloat(int i);
        
        //     Returns the GUID value of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The GUID value of the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        UUID getUUID(int i);
        
        //
        // Summary:
        //     Gets the 16-bit signed integer value of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The 16-bit signed integer value of the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        short getInt16(int i);
        
        //     Gets the 32-bit signed integer value of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The 32-bit signed integer value of the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        int getInt32(int i);
        
        //
        // Summary:
        //     Gets the 64-bit signed integer value of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The 64-bit signed integer value of the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        long getInt64(int i);
        
        //     Gets the name for the field to find.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The name of the field or the empty string (""), if there is no value to return.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        String getName(int i);
        
        //
        // Summary:
        //     Return the index of the named field.
        //
        // Parameters:
        //   name:
        //     The name of the field to find.
        //
        // Returns:
        //     The index of the named field.
        int getOrdinal(String name);

        //     Gets the string value of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The string value of the specified field.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        String getString(int i);
        
        //
        // Summary:
        //     Return the value of the specified field.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     The System.Object which will contain the field value upon return.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        Object getValue(int i);
        
        //
        // Summary:
        //     Populates an array of objects with the column values of the current record.
        //
        // Parameters:
        //   values:
        //     An array of System.Object to copy the attribute fields into.
        //
        // Returns:
        //     The number of instances of System.Object in the array.
        int getValues(Object[] values);
        
        //
        // Summary:
        //     Return whether the specified field is set to null.
        //
        // Parameters:
        //   i:
        //     The index of the field to find.
        //
        // Returns:
        //     true if the specified field is set to null; otherwise, false.
        //
        // Exceptions:
        //   System.IndexOutOfRangeException:
        //     The index passed was outside the range of 0 through System.Data.IDataRecord.FieldCount.
        boolean isDBNull(int i);

}
