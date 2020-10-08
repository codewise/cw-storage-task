package pl.codewise;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class StorageTest {

    Storage storage;

    @Test
    public void shouldCreateFileInStorage() throws Exception {
        //given
        String fileContents = "File contents";
        InputStream data = new ByteArrayInputStream(fileContents.getBytes());

        //when
        storage.put("file1", data);

        //then
        assertThat(new String(storage.get("file1").readAllBytes())).isEqualTo(fileContents);
    }
}
