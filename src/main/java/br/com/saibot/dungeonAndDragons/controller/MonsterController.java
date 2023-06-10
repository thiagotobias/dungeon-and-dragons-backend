package br.com.saibot.dungeonAndDragons.controller;

import br.com.saibot.dungeonAndDragons.entities.Monster;
import br.com.saibot.dungeonAndDragons.model.dto.MonsterDTO;
import br.com.saibot.dungeonAndDragons.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/monster")
public class MonsterController {

    @Autowired
    private MonsterService monsterService;

    @GetMapping
    public List<MonsterDTO> findAll(){
        return monsterService.findAll();
    }
}
