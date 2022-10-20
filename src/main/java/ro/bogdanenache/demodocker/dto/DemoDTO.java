package ro.bogdanenache.demodocker.dto;


import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class DemoDTO {

    private String firstName;
    private String lastName;
    private Integer age;
    private String ownedCar;
}
