package ingjulianvega.ximic.msscasuadministrationmethod.web.controller;


import ingjulianvega.ximic.msscasuadministrationmethod.services.AdministrationMethodService;
import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethod;
import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethodDto;
import ingjulianvega.ximic.msscasuadministrationmethod.web.model.AdministrationMethodList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class AdministrationMethodController implements AdministrationMethodI {

    private final AdministrationMethodService administrationMethodService;

    @Override
    public ResponseEntity<AdministrationMethodList> get(Boolean usingCache) {
        return new ResponseEntity<>(administrationMethodService.get(usingCache), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<AdministrationMethodDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(administrationMethodService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid AdministrationMethod administrationMethod) {
        administrationMethodService.create(administrationMethod);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid AdministrationMethod administrationMethod) {
        administrationMethodService.updateById(id, administrationMethod);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        administrationMethodService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
