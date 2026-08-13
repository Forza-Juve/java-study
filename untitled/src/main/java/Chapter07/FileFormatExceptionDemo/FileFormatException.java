package Chapter07.FileFormatExceptionDemo;

import java.io.IOException;

public class FileFormatException extends IOException {

    public FileFormatException() {
    }

    public FileFormatException(String message) {
        super(message);
    }
}
