package pl.codewise;

import java.io.IOException;
import java.io.InputStream;

public interface Storage {
    void put(String name, InputStream data) throws IOException;
    InputStream get(String name);
}
