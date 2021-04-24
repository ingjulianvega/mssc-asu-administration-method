package ingjulianvega.ximic.msscasuadministrationmethod.web.Mappers;


import ingjulianvega.ximic.msscasuadministrationmethod.domain.AdministrationMethodEntity;
import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethodDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface AdministrationMethodMapper {
    AdministrationMethodDto administrationMethodEntityToAdministrationMethodDto(AdministrationMethodEntity administrationMethodEntity);

    AdministrationMethodEntity administrationMethodDtoToAdministrationMethodEntity(AdministrationMethodDto administrationMethodDto);

    ArrayList<AdministrationMethodDto> administrationMethodEntityListToAdministrationMethodDtoList(List<AdministrationMethodEntity> administrationMethodEntityList);
}
