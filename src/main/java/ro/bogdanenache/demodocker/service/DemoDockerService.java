package ro.bogdanenache.demodocker.service;

import ro.bogdanenache.demodocker.dto.DemoDTO;

public class DemoDockerService {
    public DemoDTO persistDemo() {
        return DemoDTO.builder()
                .firstName("George")
                .lastName("Harrison")
                .age(35)
                .ownedCar("Volvo")
                .build();
    }
}
