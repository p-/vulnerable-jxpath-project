package seclab.testprojects.jxpathvuln.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class RemoteReader extends Reader {
    private final BufferedReader in;

    public RemoteReader(String remoteUrl) {
        try {
            URL url = new URL(remoteUrl);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return in.read(cbuf, off, len);
    }

    @Override
    public void close() throws IOException {
        in.close();
    }
}
