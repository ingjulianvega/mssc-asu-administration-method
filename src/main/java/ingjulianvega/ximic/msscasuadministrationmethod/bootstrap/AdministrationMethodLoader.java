package ingjulianvega.ximic.msscasuadministrationmethod.bootstrap;

import ingjulianvega.ximic.msscasuadministrationmethod.domain.AdministrationMethodEntity;
import ingjulianvega.ximic.msscasuadministrationmethod.domain.repositories.AdministrationMethodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class AdministrationMethodLoader implements CommandLineRunner {

    private final AdministrationMethodRepository administrationMethodRepository;

    @Override
    public void run(String... args) throws Exception {
        if (administrationMethodRepository.count() == 0) {
            loadAdministrationMethodObjects();
        }
    }

    private void loadAdministrationMethodObjects() {
        administrationMethodRepository.saveAll(Arrays.asList(
                AdministrationMethodEntity.builder().name("Oral").build(),
                AdministrationMethodEntity.builder().name("Iyectada").build(),
                AdministrationMethodEntity.builder().name("Inhalada").build()
        ));
    }
}