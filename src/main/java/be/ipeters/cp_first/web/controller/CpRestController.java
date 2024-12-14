package be.ipeters.cp_first.web.controller;

import be.ipeters.cp_first.web.model.CpDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/* carlpeters created on 13/12/2024 inside the package - be.ipeters.cp_first.web.controller */
@RestController
@RequestMapping("api/v1/cp")
public class CpRestController {

    @GetMapping("/{id}")
    public ResponseEntity<CpDto> getCpById(@PathVariable("id") UUID id) {
        // todo imple

        return ResponseEntity.ok(CpDto.builder().build());
    }
    @PostMapping
    public  ResponseEntity saveNewCp(@RequestBody CpDto cpDto) {
        // todo imple

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCp(@PathVariable("id") UUID id, @RequestBody CpDto cpDto) {
        // todo imple

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    public String  sayHello() {
        return "Hello World";
    }
}
