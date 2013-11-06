package org.es4j.dotnet.streams;

import java.io.Serializable;
import org.es4j.dotnet.IDisposable;
//import org.es4j.dotnet.http.IAsyncResult;


//namespace System.IO
//using System;
//using System.Runtime;
//using System.Runtime.InteropServices;
//using System.Threading;


// Provides a generic view of a sequence of bytes.
//[Serializable]
//[ComVisible(true)]
 public abstract class Stream implements IDisposable, Serializable { // : MarshalByRefObject, IDisposable

     @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    // Summary:
    //     Releases all resources used by the System.IO.Stream.
     @Override
    public void dispose() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
 
    // Summary:
    //     Releases the unmanaged resources used by the System.IO.Stream and optionally
    //     releases the managed resources.
    //
    // Parameters:
    //   disposing:
    //     true to release both managed and unmanaged resources; false to release only
    //     unmanaged resources.
    // virtual
    protected void dispose(boolean disposing) {
        throw new UnsupportedOperationException("Not yet implemented");
    }     

    public byte[] toArray() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Summary:
    //     A Stream with no backing store.
    //public static final Stream1 Null;

    // Summary:
    //     Initializes a new instance of the System.IO.Stream class.
    protected Stream() {
    }
    
    
    // Summary:
    //     When overridden in a derived class, clears all buffers for this stream and
    //     causes any buffered data to be written to the underlying device.
    //
    // Exceptions:
    //   System.IO.IOException:
    //     An I/O error occurs.
    //public abstract void flush();
    

    // Summary:
    //     When overridden in a derived class, reads a sequence of bytes from the current
    //     stream and advances the position within the stream by the number of bytes
    //     read.
    //
    // Parameters:
    //   buffer:
    //     An array of bytes. When this method returns, the buffer contains the specified
    //     byte array with the values between offset and (offset + count - 1) replaced
    //     by the bytes read from the current source.
    //
    //   offset:
    //     The zero-based byte offset in buffer at which to begin storing the data read
    //     from the current stream.
    //
    //   count:
    //     The maximum number of bytes to be read from the current stream.
    //
    // Returns:
    //     The total number of bytes read into the buffer. This can be less than the
    //     number of bytes requested if that many bytes are not currently available,
    //     or zero (0) if the end of the stream has been reached.
    //
    // Exceptions:
    //   System.ArgumentException:
    //     The sum of offset and count is larger than the buffer length.
    //
    //   System.ArgumentNullException:
    //     buffer is null.
    //
    //   System.ArgumentOutOfRangeException:
    //     offset or count is negative.
    //
    //   System.IO.IOException:
    //     An I/O error occurs.
    //
    //   System.NotSupportedException:
    //     The stream does not support reading.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    //public abstract int read(byte[] buffer, int offset, int count);

    // Summary:
    //     When overridden in a derived class, writes a sequence of bytes to the current
    //     stream and advances the current position within this stream by the number
    //     of bytes written.
    //
    // Parameters:
    //   buffer:
    //     An array of bytes. This method copies count bytes from buffer to the current
    //     stream.
    //
    //   offset:
    //     The zero-based byte offset in buffer at which to begin copying bytes to the
    //     current stream.
    //
    //   count:
    //     The number of bytes to be written to the current stream.
    //
    // Exceptions:
    //   System.ArgumentException:
    //     The sum of offset and count is greater than the buffer length.
    //
    //   System.ArgumentNullException:
    //     buffer is null.
    //
    //   System.ArgumentOutOfRangeException:
    //     offset or count is negative.
    //
    //   System.IO.IOException:
    //     An I/O error occurs.
    //
    //   System.NotSupportedException:
    //     The stream does not support writing.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    public abstract void write(byte[] buffer, int offset, int count);   
    

    // Summary:
    //     When overridden in a derived class, gets a value indicating whether the current
    //     stream supports reading.
    //
    // Returns:
    //     true if the stream supports reading; otherwise, false.
    public abstract boolean canRead(); // { get; }

    // Summary:
    //     When overridden in a derived class, gets a value indicating whether the current
    //     stream supports seeking.
    //
    // Returns:
    //     true if the stream supports seeking; otherwise, false.
    public abstract boolean canSeek(); // { get; }
    
    // Summary:
    //     Gets a value that determines whether the current stream can time out.
    //
    // Returns:
    //     A value that determines whether the current stream can time out.
    //[ComVisible(false)]
    // virtual
    private boolean canTimeout; //{ get; }
    public boolean canTimeout() {
        return canTimeout;
    }
    
    // Summary:
    //     When overridden in a derived class, gets a value indicating whether the current
    //     stream supports writing.
    //
    // Returns:
    //     true if the stream supports writing; otherwise, false.
    public abstract boolean canWrite(); // { get; }
 
    // Summary:
    //     When overridden in a derived class, gets the length in bytes of the stream.
    //
    // Returns:
    //     A long value representing the length of the stream in bytes.
    //
    // Exceptions:
    //   System.NotSupportedException:
    //     A class derived from Stream does not support seeking.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    public abstract long length(); // { get; }
 
    // Summary:
    //     When overridden in a derived class, gets or sets the position within the
    //     current stream.
    //
    // Returns:
    //     The current position within the stream.
    //
    // Exceptions:
    //   System.IO.IOException:
    //     An I/O error occurs.
    //
    //   System.NotSupportedException:
    //     The stream does not support seeking.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    public abstract long getPosition(); // { get; set; 
    public abstract void setPosition(long position);
    
    // Summary:
    //     Gets or sets a value, in miliseconds, that determines how long the stream
    //     will attempt to read before timing out.
    //
    // Returns:
    //     A value, in miliseconds, that determines how long the stream will attempt
    //     to read before timing out.
    //
    // Exceptions:
    //   System.InvalidOperationException:
    //     The System.IO.Stream.ReadTimeout method always throws an System.InvalidOperationException.
    //[ComVisible(false)]
    //virtual
    private int readTimeout; // { get; set; }
    public int getReadTimeout() {
        return readTimeout;
    }
    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }
  
    // Summary:
    //     Provides support for a System.Diagnostics.Contracts.Contract.
    //virtual
    protected void objectInvariant() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    // Summary:
    //     Gets or sets a value, in miliseconds, that determines how long the stream
    //     will attempt to write before timing out.
    //
    // Returns:
    //     A value, in miliseconds, that determines how long the stream will attempt
    //     to write before timing out.
    //
    // Exceptions:
    //   System.InvalidOperationException:
    //     The System.IO.Stream.WriteTimeout method always throws an System.InvalidOperationException.
    //[ComVisible(false)]
    //virtual
    private int writeTimeout; // { get; set; }

    public int getWriteTimeout() {
        return writeTimeout;
    }
    public void setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    // Summary:
    //     Begins an asynchronous read operation.
    //
    // Parameters:
    //   buffer:
    //     The buffer to read the data into.
    //
    //   offset:
    //     The byte offset in buffer at which to begin writing data read from the stream.
    //
    //   count:
    //     The maximum number of bytes to read.
    //
    //   callback:
    //     An optional asynchronous callback, to be called when the read is complete.
    //
    //   state:
    //     A user-provided object that distinguishes this particular asynchronous read
    //     request from other requests.
    //
    // Returns:
    //     An System.IAsyncResult that represents the asynchronous read, which could
    //     still be pending.
    //
    // Exceptions:
    //   System.IO.IOException:
    //     Attempted an asynchronous read past the end of the stream, or a disk error
    //     occurs.
    //
    //   System.ArgumentException:
    //     One or more of the arguments is invalid.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    //
    //   System.NotSupportedException:
    //     The current Stream implementation does not support the read operation.
    // virtual
    public IAsyncResult beginRead(byte[] buffer, int offset, int count, AsyncCallback callback, Object state) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Summary:
    //     Begins an asynchronous write operation.
    //
    // Parameters:
    //   buffer:
    //     The buffer to write data from.
    //
    //   offset:
    //     The byte offset in buffer from which to begin writing.
    //
    //   count:
    //     The maximum number of bytes to write.
    //
    //   callback:
    //     An optional asynchronous callback, to be called when the write is complete.
    //
    //   state:
    //     A user-provided object that distinguishes this particular asynchronous write
    //     request from other requests.
    //
    // Returns:
    //     An IAsyncResult that represents the asynchronous write, which could still
    //     be pending.
    //
    // Exceptions:
    //   System.IO.IOException:
    //     Attempted an asynchronous write past the end of the stream, or a disk error
    //     occurs.
    //
    //   System.ArgumentException:
    //     One or more of the arguments is invalid.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    //
    //   System.NotSupportedException:
    //     The current Stream implementation does not support the write operation.
    // virtual
    public IAsyncResult beginWrite(byte[] buffer, int offset, int count, AsyncCallback callback, Object state) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Summary:
    //     Closes the current stream and releases any resources (such as sockets and
    //     file handles) associated with the current stream.
    // virtual
    public void Close() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    //
    // Summary:
    //     Reads all the bytes from the current stream and writes them to the destination
    //     stream.
    //
    // Parameters:
    //   destination:
    //     The stream that will contain the contents of the current stream.
    //
    // Exceptions:
    //   System.ArgumentNullException:
    //     destination is null.
    //
    //   System.NotSupportedException:
    //     The current stream does not support reading.-or-destination does not support
    //     writing.
    //
    //   System.ObjectDisposedException:
    //     Either the current stream or destination were closed before the System.IO.Stream.CopyTo(System.IO.Stream)
    //     method was called.
    //
    //   System.IO.IOException:
    //     An I/O error occurred.
    public void copyTo(Stream destination) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Summary:
    //     Reads all the bytes from the current stream and writes them to a destination
    //     stream, using a specified buffer size.
    //
    // Parameters:
    //   destination:
    //     The stream that will contain the contents of the current stream.
    //
    //   bufferSize:
    //     The size of the buffer. This value must be greater than zero. The default
    //     size is 4096.
    //
    // Exceptions:
    //   System.ArgumentNullException:
    //     destination is null.
    //
    //   System.ArgumentOutOfRangeException:
    //     bufferSize is negative or zero.
    //
    //   System.NotSupportedException:
    //     The current stream does not support reading.-or-destination does not support
    //     writing.
    //
    //   System.ObjectDisposedException:
    //     Either the current stream or destination were closed before the System.IO.Stream.CopyTo(System.IO.Stream)
    //     method was called.
    //
    //   System.IO.IOException:
    //     An I/O error occurred.
    public void copyTo(Stream destination, int bufferSize) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Summary:
    //     Allocates a System.Threading.WaitHandle object.
    //
    // Returns:
    //     A reference to the allocated WaitHandle.
    //[Obsolete(@"CreateWaitHandle will be removed eventually.  Please use ""new ManualResetEvent(false)"" instead.")]
    // virtual
    protected WaitHandle createWaitHandle() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Summary:
    //     Waits for the pending asynchronous read to complete.
    //
    // Parameters:
    //   asyncResult:
    //     The reference to the pending asynchronous request to finish.
    //
    // Returns:
    //     The number of bytes read from the stream, between zero (0) and the number
    //     of bytes you requested. Streams return zero (0) only at the end of the stream,
    //     otherwise, they should block until at least one byte is available.
    //
    // Exceptions:
    //   System.ArgumentNullException:
    //     asyncResult is null.
    //
    //   System.ArgumentException:
    //     asyncResult did not originate from a System.IO.Stream.BeginRead(System.Byte[],System.Int32,System.Int32,System.AsyncCallback,System.Object)
    //     method on the current stream.
    //
    //   System.IO.IOException:
    //     The stream is closed or an internal error has occurred.
    //  virtual
    public int endRead(IAsyncResult asyncResult) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Summary:
    //     Ends an asynchronous write operation.
    //
    // Parameters:
    //   asyncResult:
    //     A reference to the outstanding asynchronous I/O request.
    //
    // Exceptions:
    //   System.ArgumentNullException:
    //     asyncResult is null.
    //
    //   System.ArgumentException:
    //     asyncResult did not originate from a System.IO.Stream.BeginWrite(System.Byte[],System.Int32,System.Int32,System.AsyncCallback,System.Object)
    //     method on the current stream.
    //
    //   System.IO.IOException:
    //     The stream is closed or an internal error has occurred.
    //  virtual
    public void endWrite(IAsyncResult asyncResult) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    // Summary:
    //     When overridden in a derived class, clears all buffers for this stream and
    //     causes any buffered data to be written to the underlying device.
    //
    // Exceptions:
    //   System.IO.IOException:
    //     An I/O error occurs.
    public abstract void flush();
    
    // Summary:
    //     Provides support for a System.Diagnostics.Contracts.Contract.
    //virtual
    protected void ObjectInvariant() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    // Summary:
    //     When overridden in a derived class, reads a sequence of bytes from the current
    //     stream and advances the position within the stream by the number of bytes
    //     read.
    //
    // Parameters:
    //   buffer:
    //     An array of bytes. When this method returns, the buffer contains the specified
    //     byte array with the values between offset and (offset + count - 1) replaced
    //     by the bytes read from the current source.
    //
    //   offset:
    //     The zero-based byte offset in buffer at which to begin storing the data read
    //     from the current stream.
    //
    //   count:
    //     The maximum number of bytes to be read from the current stream.
    //
    // Returns:
    //     The total number of bytes read into the buffer. This can be less than the
    //     number of bytes requested if that many bytes are not currently available,
    //     or zero (0) if the end of the stream has been reached.
    //
    // Exceptions:
    //   System.ArgumentException:
    //     The sum of offset and count is larger than the buffer length.
    //
    //   System.ArgumentNullException:
    //     buffer is null.
    //
    //   System.ArgumentOutOfRangeException:
    //     offset or count is negative.
    //
    //   System.IO.IOException:
    //     An I/O error occurs.
    //
    //   System.NotSupportedException:
    //     The stream does not support reading.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    public abstract int read(byte[] buffer, int offset, int count);

    // Summary:
    //     Reads a byte from the stream and advances the position within the stream
    //     by one byte, or returns -1 if at the end of the stream.
    //
    // Returns:
    //     The unsigned byte cast to an Int32, or -1 if at the end of the stream.
    //
    // Exceptions:
    //   System.NotSupportedException:
    //     The stream does not support reading.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    //[TargetedPatchingOptOut("Performance critical to inline across NGen image boundaries")]
    // virtual
    public int readByte() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    //
    // Summary:
    //     When overridden in a derived class, sets the position within the current
    //     stream.
    //
    // Parameters:
    //   offset:
    //     A byte offset relative to the origin parameter.
    //
    //   origin:
    //     A value of type System.IO.SeekOrigin indicating the reference point used
    //     to obtain the new position.
    //
    // Returns:
    //     The new position within the current stream.
    //
    // Exceptions:
    //   System.IO.IOException:
    //     An I/O error occurs.
    //
    //   System.NotSupportedException:
    //     The stream does not support seeking, such as if the stream is constructed
    //     from a pipe or console output.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    public abstract long seek(long offset, SeekOrigin origin);

    // Summary:
    //     When overridden in a derived class, sets the length of the current stream.
    //
    // Parameters:
    //   value:
    //     The desired length of the current stream in bytes.
    //
    // Exceptions:
    //   System.IO.IOException:
    //     An I/O error occurs.
    //
    //   System.NotSupportedException:
    //     The stream does not support both writing and seeking, such as if the stream
    //     is constructed from a pipe or console output.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    public abstract void setLength(long value);

    // Summary:
    //     Creates a thread-safe (synchronized) wrapper around the specified System.IO.Stream
    //     object.
    //
    // Parameters:
    //   stream:
    //     The System.IO.Stream object to synchronize.
    //
    // Returns:
    //     A thread-safe System.IO.Stream object.
    //
    // Exceptions:
    //   System.ArgumentNullException:
    //     stream is null.
    public static Stream synchronized_(Stream stream) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    // Summary:
    //     Writes a byte to the current position in the stream and advances the position
    //     within the stream by one byte.
    //
    // Parameters:
    //   value:
    //     The byte to write to the stream.
    //
    // Exceptions:
    //   System.IO.IOException:
    //     An I/O error occurs.
    //
    //   System.NotSupportedException:
    //     The stream does not support writing, or the stream is already closed.
    //
    //   System.ObjectDisposedException:
    //     Methods were called after the stream was closed.
    // virtual
    public void writeByte(byte value) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}

