package com.example.bsgamestate;

public class BSGameState {

    private int p1TotalHits;
    private int p2TotalHits;
    private int playerTurn;
    private int shipsAlive;
    private int shipsSunk;
    private int playerNum;
    private int boatHealth;
    private boolean isHit;
    private String phaseOfGame;
    private String[][] shipLocations;
    private boolean isVisible;
    private String[][] shotLocations;
    private int shipType;
    private String[][] board;
    private GamePlayer player1;
    private GamePlayer player2;


    // kyle's variables
    // should be in ship
    private int carrier = 5;
    private int battleShip = 4;
    private int cruiser = 3;
    private int submariner = 3;
    private int destroyer = 2;


    public BSGameState() {
        this.playerTurn=1;
        this.p1TotalHits=0;
        this.p2TotalHits=0;
        this.shipsAlive=10;
        this.shipsSunk=0;
        this.isHit=false;
        this.phaseOfGame="SetUp";
        this.shotLocations=null;
        this.shipLocations=null;
        this.shipType=1;
        this.board=new String[10][20];
        this.player1=new HumanPlayer;
        this.player2=new ComputerPlayer;

    }


    // Kyle's Copy Constructor
    public BSGameState(BSGameState original)
    {
        this.playerTurn=1;
        this.p1TotalHits=0;
        this.p2TotalHits=0;
        this.shipsAlive=10;
        this.shipsSunk=0;
        this.isHit=false;
        this.phaseOfGame="SetUp";
        this.shotLocations=null;
        this.shipLocations=null;
        this.shipType=1;
        this.board=new String[10][20];

        // copy the player-to-move information
        HumanPlayer = original.HumanPlayer;
        ComputerPlayer = original.ComputerPlayer;
    }


    // Getter for boat selected (Kyle)
    public int getBoat(int shipType) {
        if (shipType == 0){
            return carrier;
        }else if(shipType == 1){
            return battleShip;
        }else if(shipType == 2){
            return cruiser;
        }else if(shipType == 3){
            return submarine;
        }else if(shipType == 4){
            return destroyer;
        }
    }

    // Setter for boat selected (Kyle)
    public int setBoat(int shipType, int ship) { return this.shipType; }

  public boolean rotate(int playerID, int shipType, String xCoord, String yCoord, BSGameState gameState){
        boolean valid=false;
        if(playerID==gameState.getPlayerTurn()){
            switch(shipType){
                case 1: //code
                    valid=true;
                    break;

                case 2: //code
                    valid=true;
                    break;

                case 3: //code
                    valid=true;
                    break;

                case 4: //code
                    valid=true;
                    break;
                case 5: //code
                    valid=true;
                    break;

                default: //code
                    valid=false;
                    break;
            }
        }
        return valid;
  }

    // 
    public int getPlayerTurn() {
        return this.playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }


    /**
     * fire method: take board as parameter & fire on selected coordinates, return true if successful fire
     **/
    public boolean fire(String[][] bsBoard) {
        return false; // default return value
    }

}