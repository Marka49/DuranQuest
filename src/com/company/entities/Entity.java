package com.company.entities;

import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocation;

/**
 * Interface utváří další enntity
 * @author Marie Čubanová
 * @version 0.1a
 * @since Java 16
 */
public interface Entity {

    /**
     * Metoda pro boj
     */
    void fight();

    /**
     * Metoda pro obranu
     */
    void defend();

    /**
     * Metoda pro uhýbání
     */
    void dodge();

    /**
     * Metoda pro útěk
     */
    void escape();

    /**
     * Metoda pro uzdravení
     * @param potion - potion, kterou může použít
     */
    void heal(Potion potion);

    /**
     * Metoda pro jezení
     * @param food - jídlo, které může sníst
     */
    void eat(Food food);

    /**
     * Metoda pro změnu lokace
     * @param gameLocation - dostupná lokace
     */
    void moveTo(GameLocation gameLocation);

    /**
     * Metoda pro komunikaci
     * @param entity - entita, se kterou se komunikuje
     */
    void talkTo (Entity entity);


}
