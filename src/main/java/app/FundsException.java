package app;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;

public class FundsException extends FilerException {

    public FundsException(String message) {
        super(message);

    }
}
