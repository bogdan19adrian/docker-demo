package ro.bogdanenache.demodocker.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.bogdanenache.demodocker.dto.DemoDTO;
import ro.bogdanenache.demodocker.service.DemoDockerService;

@RestController
@AllArgsConstructor
public class DemoDockerController {

    private DemoDockerService demoDockerService;

    @PostMapping
    public ResponseEntity<DemoDTO> persistDemo(@RequestBody DemoDTO demoDTO) {
        var demo = demoDockerService.persistDemo(demoDTO);
        return new ResponseEntity<>(demo, HttpStatus.CREATED);
    }
}
