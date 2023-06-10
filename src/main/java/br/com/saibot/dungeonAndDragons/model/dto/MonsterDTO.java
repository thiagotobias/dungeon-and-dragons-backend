package br.com.saibot.dungeonAndDragons.model.dto;

import br.com.saibot.dungeonAndDragons.entities.Monster;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MonsterDTO {
    private Long id;
    private String name;
    private String monsterType;
    private String monsterSubType;
    private String book;
    private Integer numberPage;
    private Double challengeLevel;

    public MonsterDTO(Monster monster) {
        this.id = monster.getId();
        this.name = monster.getName();
        this.monsterType = monster.getMonsterType();
        this.monsterSubType = monster.getMonsterSubType();
        this.book = monster.getBook();
        this.numberPage = monster.getNumberPage();
        this.challengeLevel = monster.getChallengeLevel();
    }
}
