package ingjulianvega.ximic.msscasuadministrationmethod.services;


import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethod;
import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethodDto;
import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethodList;

import java.util.UUID;

public interface AdministrationMethodService {
    AdministrationMethodList get(Boolean usingCache);

    AdministrationMethodDto getById(UUID id);

    void create(AdministrationMethod administrationMethod);

    void updateById(UUID id, AdministrationMethod administrationMethod);

    void deleteById(UUID id);
}
