package ingjulianvega.ximic.msscasuadministrationmethod.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdministrationMethodDto implements Serializable {

    static final long serialVersionUID = -5669199646003698251L;

    private UUID id;
    private String name;

}
