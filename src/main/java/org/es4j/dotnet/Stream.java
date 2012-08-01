package org.es4j.dotnet;

public class Stream implements AutoCloseable, IDisposable {

    @Override
    public void close() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected void dispose(boolean disposing) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public byte[] toArray() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean canRead() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void dispose() throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean canSeek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean canWrite() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long length() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long getPosition() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setPosition(long position) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void flush() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long seek(long offset, SeekOrigin origin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setLength(long value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void read(byte[] buffer, int offset, int count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void write(byte[] buffer, int offset, int count) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
