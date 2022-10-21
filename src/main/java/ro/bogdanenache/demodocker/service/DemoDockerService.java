package ro.bogdanenache.demodocker.service;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ro.bogdanenache.demodocker.dao.DemoDocument;
import ro.bogdanenache.demodocker.dao.DemoRepository;
import ro.bogdanenache.demodocker.dto.DemoDTO;

@Service
@AllArgsConstructor
public class DemoDockerService {

    private final DemoRepository demoRepository;

    public DemoDTO persistDemo(DemoDTO demoDTO) {
        return saveToDB(demoDTO);
    }

    private DemoDTO saveToDB(DemoDTO demoDTO){
        final ModelMapper modelMapper = new ModelMapper();
        var demoDocument = modelMapper.map(demoDTO, DemoDocument.class);
        var savedDocument = demoRepository.save(demoDocument);
        return modelMapper.map(savedDocument, DemoDTO.class);
    }
}
