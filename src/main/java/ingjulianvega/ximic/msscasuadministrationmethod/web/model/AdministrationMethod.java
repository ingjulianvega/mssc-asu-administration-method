package ingjulianvega.ximic.msscasuadministrationmethod.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdministrationMethod implements Serializable {

    static final long serialVersionUID = 4563249978283821775L;
    @NotBlank
    private String name;

}
