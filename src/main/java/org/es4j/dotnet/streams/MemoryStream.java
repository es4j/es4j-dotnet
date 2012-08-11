package org.es4j.dotnet.streams;


public class MemoryStream extends Stream {

    public MemoryStream(byte[] serialized) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public MemoryStream() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void flush() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int read(byte[] buffer, int offset, int count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void write(byte[] buffer, int offset, int count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
