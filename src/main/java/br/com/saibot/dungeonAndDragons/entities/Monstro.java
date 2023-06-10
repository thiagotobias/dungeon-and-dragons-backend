package br.com.saibot.dungeonAndDragons.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_monstro")
public class Monstro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String monsterType;

    private String monsterSubType;

    private String book;
    private Integer numberPage;

    private Double challengeLevel;

    public Monstro() {
    }

    public Monstro(Long id, String name, String monsterType, String monsterSubType, String book, Integer numberPage, Double challengeLevel) {
        this.id = id;
        this.name = name;
        this.monsterType = monsterType;
        this.monsterSubType = monsterSubType;
        this.book = book;
        this.numberPage = numberPage;
        this.challengeLevel = challengeLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(String monsterType) {
        this.monsterType = monsterType;
    }

    public String getMonsterSubType() {
        return monsterSubType;
    }

    public void setMonsterSubType(String monsterSubType) {
        this.monsterSubType = monsterSubType;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public Integer getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(Integer numberPage) {
        this.numberPage = numberPage;
    }

    public Double getChallengeLevel() {
        return challengeLevel;
    }

    public void setChallengeLevel(Double challengeLevel) {
        this.challengeLevel = challengeLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monstro monstro = (Monstro) o;
        return Objects.equals(id, monstro.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
