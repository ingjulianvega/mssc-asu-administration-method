package ingjulianvega.ximic.msscasuadministrationmethod.domain.repositories;

import ingjulianvega.ximic.msscasuadministrationmethod.domain.AdministrationMethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface AdministrationMethodRepository extends JpaRepository<AdministrationMethodEntity, UUID>, JpaSpecificationExecutor<AdministrationMethodEntity> {
}
