package br.com.saibot.dungeonAndDragons.service;

import br.com.saibot.dungeonAndDragons.entities.Monster;
import br.com.saibot.dungeonAndDragons.model.dto.MonsterDTO;
import br.com.saibot.dungeonAndDragons.repository.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterService {

    @Autowired
    private MonsterRepository monsterRepository;
    public List<MonsterDTO> findAll(){

        List<Monster> result = monsterRepository.findAll();
//        List<MonsterDTO> dto = result.stream().map(x -> new MonsterDTO(x)).toList();

        return result.stream().map(MonsterDTO::new).toList();
    }
}
