package ro.bogdanenache.demodocker.service;

import org.springframework.stereotype.Service;
import ro.bogdanenache.demodocker.dto.DemoDTO;

@Service
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
