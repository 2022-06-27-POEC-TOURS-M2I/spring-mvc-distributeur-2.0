package fr.m2i.spring.lesson.mvc.form;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
@Valid
public class BuyForm {

    @Min(value = 1, message = "Vous devez entrer une valeur positive")
    @NotNull(message = "Vous devez entrer une valeur")
    private Long id;
}
