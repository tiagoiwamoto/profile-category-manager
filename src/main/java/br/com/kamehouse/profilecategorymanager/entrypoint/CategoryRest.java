package br.com.kamehouse.profilecategorymanager.entrypoint;

import br.com.kamehouse.profilecategorymanager.entrypoint.dto.CategoryDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/categories")
public class CategoryRest {

    @PostMapping
    public ResponseEntity createCategory(@RequestBody @Valid CategoryDto categoryDto) {
        return ResponseEntity.ok().build();
    }
}
