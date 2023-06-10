package br.com.saibot.dungeonAndDragons.repository;

import br.com.saibot.dungeonAndDragons.entities.Monster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonsterRepository extends JpaRepository<Monster,Long> {
}
