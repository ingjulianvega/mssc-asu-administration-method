package ingjulianvega.ximic.msscasuadministrationmethod.services;

import ingjulianvega.ximic.msscasuadministrationmethod.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasuadministrationmethod.domain.AdministrationMethodEntity;
import ingjulianvega.ximic.msscasuadministrationmethod.domain.repositories.AdministrationMethodRepository;
import ingjulianvega.ximic.msscasuadministrationmethod.exception.AdministrationMethodException;
import ingjulianvega.ximic.msscasuadministrationmethod.web.Mappers.AdministrationMethodMapper;
import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethod;
import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethodDto;
import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethodList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class AdministrationMethodServiceImpl implements AdministrationMethodService {

    private final AdministrationMethodRepository administrationMethodRepository;
    private final AdministrationMethodMapper administrationMethodMapper;

    @Cacheable(cacheNames = "administrationMethodListCache", condition = "#usingCache == false")
    @Override
    public AdministrationMethodList get(Boolean usingCache) {
        log.debug("get()...");
        return AdministrationMethodList
                .builder()
                .administrationMethodList(administrationMethodMapper.administrationMethodEntityListToAdministrationMethodDtoList(administrationMethodRepository.findAllByOrderByName()))
                .build();
    }

    @Cacheable(cacheNames = "administrationMethodCache")
    @Override
    public AdministrationMethodDto getById(UUID id) {
        log.debug("getById()...");
        return administrationMethodMapper.administrationMethodEntityToAdministrationMethodDto(
                administrationMethodRepository.findById(id)
                        .orElseThrow(() -> new AdministrationMethodException(ErrorCodeMessages.ADMINISTRATION_METHOD_NOT_FOUND, "")));
    }

    @Override
    public void create(AdministrationMethod administrationMethod) {
        log.debug("create()...");
        administrationMethodMapper.administrationMethodEntityToAdministrationMethodDto(
                administrationMethodRepository.save(
                        administrationMethodMapper.administrationMethodDtoToAdministrationMethodEntity(
                                AdministrationMethodDto
                                        .builder()
                                        .name(administrationMethod.getName())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, AdministrationMethod administrationMethod) {
        log.debug("updateById...");
        AdministrationMethodEntity evidenceEntity = administrationMethodRepository.findById(id)
                .orElseThrow(() -> new AdministrationMethodException(ErrorCodeMessages.ADMINISTRATION_METHOD_NOT_FOUND, ""));

        evidenceEntity.setName(administrationMethod.getName());

        administrationMethodRepository.save(evidenceEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        administrationMethodRepository.deleteById(id);
    }
}
