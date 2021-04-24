package ingjulianvega.ximic.msscasuadministrationmethod.exception;

import lombok.Getter;

@Getter
public class AdministrationMethodException extends RuntimeException {

    private final String code;

    public AdministrationMethodException(final String code, final String message) {
        super(message);
        this.code = code;
    }
}

