package br.com.saibot.dungeonAndDragons.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_monster")
public class Monster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String monsterType;
    private String monsterSubType;
    private String book;
    private Integer numberPage;
    private Double challengeLevel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monster monster)) return false;
        return Objects.equals(getId(), monster.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
