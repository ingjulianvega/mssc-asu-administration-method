package ingjulianvega.ximic.msscasuadministrationmethod.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "administration-method")
public class AdministrationMethodParameters {

    private String api;
}
