package seclab.testprojects.jxpathvuln.util;

import java.io.IOException;

// Who doesn't need a helper to execute stuff?
public class ExecHelper {
    public static void exec(String command) throws IOException {
        Runtime.getRuntime().exec(command);
    }
}
