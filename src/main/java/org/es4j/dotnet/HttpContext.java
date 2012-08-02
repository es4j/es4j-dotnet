package org.es4j.dotnet;

import java.util.Map;

/**
 *
 * @author Esfand
 */
public class HttpContext {

    public static HttpContext getCurrent() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public Map<String, Object> getItems() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public <T> T getItem(String key) {
        assert(false);
        return null;
    }
    
    public <T> void setItem(String key, T value) {
        assert(false);
    }    
}
