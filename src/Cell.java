public class Cell {

    boolean alive;
    int livingNeighbours;

    void update()   {
        if(getAlive()==true && livingNeighbours<2)
            setAlive();
        else if (getAlive()==true && livingNeighbours>=2)
            ;
        else if(getAlive()==false && livingNeighbours<2)
                    ;
        else
            setAlive();

    }

    void getLivingNeighbours(){

    }
    void setLivingNeighbours(){

    }

    void setAlive(){
        if(alive==true)
            alive=false;
        else
            alive=true;

    }
    boolean getAlive(){
        return alive;

    }
}
