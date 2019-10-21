package com.example.bsgamestate;

/**
 *
 * @author Kyle Sanchez
 * @author Gianni Magliana
 * @author Daniel Co
 * @author William Leung
 *
 */


public class Ship {

    private int shipHealth;
    private int shipHits;
    private boolean isSunk;
    private int xCoord;
    private int yCoord;
    private int owner;

    public Ship(int xLocation, int yLocation, int idOfOwner, int shipSize){
        this.xCoord=xLocation;
        this.yCoord=yLocation;
        this.owner=idOfOwner;
        this.shipHealth=shipSize;
        this.isSunk=false;
    }

}
