package com.company.map;

import com.company.Game;

import java.util.ArrayList;

/**
 * Třída pro lokace
 * @author Marie Čubanová
 * @version 0.1a
 * @since Java 16
 */
public class GameLocation {
    /**
     * Název lokace
     */
    private String name;
    /**
     * Maximální počet tahů
     */
    private byte maxMoves;
    /**
     * Současný počet tahů
     */
    private byte movesCount;
    /**
     * Dostupné cesty
     */
    private ArrayList<GameLocation> paths = new ArrayList<>();

    /**
     *
     * @param name - název lokace
     * @param maxMoves - maximální počet tahů
     * @param movesCount - současný počet tahů
     */
    public GameLocation(String name, byte maxMoves, byte movesCount) {
        this.name = name;
        this.maxMoves = maxMoves;
        this.movesCount = movesCount;
    }

    /**
     * Přidání dostupné cesty
     * @param gameLocation
     */
    public void addPath(GameLocation gameLocation) {
        paths.add(gameLocation);
    }

    /**
     * Odebrání dostupné cesty
     * @param gameLocation
     */
    public void removePath(GameLocation gameLocation) {
        paths.remove(gameLocation);
    }

    /**
     * Výpis dostupné cesty
     * @throws Exception
     */
    public void printPaths() throws Exception {
        System.out.println("Dostupné lokace:");
        if (paths.isEmpty()) {
            throw new Exception("Lokace " + name + " nemá další cesty");
        }
        for (GameLocation path : paths) {
            System.out.println(path.getName());
        }
    }

    /**
     *
     * @return název lokace
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name - nový název lokace
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return - maximální počet tahů
     */
    public byte getMaxMoves() {
        return maxMoves;
    }

    /**
     *
     * @param maxMoves - nový maximální počet tahů
     */
    public void setMaxMoves(byte maxMoves) {
        this.maxMoves = maxMoves;
    }

    /**
     *
     * @return - současný počet tahů
     */
    public byte getMovesCount() {
        return movesCount;
    }

    /**
     *
     * @param movesCount nový počet současných tahů
     */
    public void setMovesCount(byte movesCount) {
        this.movesCount = movesCount;
    }
}
