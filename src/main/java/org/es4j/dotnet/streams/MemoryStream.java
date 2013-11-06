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

    @Override
    public boolean canRead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canSeek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canWrite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long length() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getPosition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPosition(long position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long seek(long offset, SeekOrigin origin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLength(long value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
