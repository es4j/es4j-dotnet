package org.es4j.dotnet.data;

import java.util.Map;

// Collects all parameters relevant to a Command object and their mappings to
// System.Data.DataSet columns, and is implemented by .NET Framework data providers
// that access data sources.
public interface IDataParameterCollection extends Map<String, Object> /*implements IList, ICollection, IEnumerable*/ {
    
    // Summary:
    //     Gets or sets the parameter at the specified index.
    //
    // Parameters:
    //   parameterName:
    //     The name of the parameter to retrieve.
    //
    // Returns:
    //     An System.Object at the specified index.
    //object this[string parameterName] { get; set; }

    // Summary:
    //     Gets a value indicating whether a parameter in the collection has the specified
    //     name.
    //
    // Parameters:
    //   parameterName:
    //     The name of the parameter.
    //
    // Returns:
    //     true if the collection contains the parameter; otherwise, false.
    //bool Contains(string parameterName);
    
    // Summary:
    //     Gets the location of the System.Data.IDataParameter within the collection.
    //
    // Parameters:
    //   parameterName:
    //     The name of the parameter.
    //
    // Returns:
    //     The zero-based location of the System.Data.IDataParameter within the collection.
    //int IndexOf(string parameterName);
    
    // Summary:
    //     Removes the System.Data.IDataParameter from the collection.
    //
    // Parameters:
    //   parameterName:
    //     The name of the parameter.
    //void RemoveAt(string parameterName);
}

