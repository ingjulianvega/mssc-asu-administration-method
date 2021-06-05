package ingjulianvega.ximic.msscasuadministrationmethod.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdministrationMethodList implements Serializable {

    static final long serialVersionUID = 5416901418068390538L;

    public ArrayList<AdministrationMethodDto> administrationMethodList;
}
