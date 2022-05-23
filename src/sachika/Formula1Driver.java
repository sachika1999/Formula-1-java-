package sachika;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Formula1Driver extends Driver implements Serializable {
    private int races ;
    private int points;
    private String date;
    private int first_position;
    private int second_positions;
    private int third_positions;
    private int forth_positions;
    private int fifth_positions;
    private int sixs_positions;
    private int seven_positions;
    private int eight_positions;
    private int nine_positions;
    private int tenth_positions;





    public Formula1Driver(){

    }

     //Creatimg a class constructor for the Formula1Driver  class
    public Formula1Driver(String name,String location, String team)
    {
        super(name, location, team); //calling construxter in drive class



    }
    //Creatimg a class constructor for the Formula1Driver  class
    public Formula1Driver( int first_position, int second_positions , int third_positions,int
            forth_positions,int fifth_positions, int sixs_positions,int
                                   seven_positions,int eight_positions,int
                                   nine_positions,int tenth_positions, int races, int points)
    {
        this.first_position=first_position;
        this.second_positions=second_positions;
        this.third_positions=third_positions;
        this.forth_positions=forth_positions;
        this.fifth_positions=fifth_positions; 
        this.sixs_positions=sixs_positions;
        this.seven_positions=seven_positions;
        this.eight_positions=eight_positions;
        this.nine_positions=nine_positions;
        this.tenth_positions=tenth_positions;
        this.races=races;
        this.points=points;

    }

    // initalizing Getters and Setters to
    //retrieving and updating the value of a variable outside the  class



    public Formula1Driver(String date)
    {
        this.date=date;
    }

    public Formula1Driver(LocalDateTime date) {
    }

    //    Using getter to date
    public String getdate()
    {
        return this.date;
    }

    public void setdate(String date)
    {
        this.date = date;
    }


//    using getter to racse
    public int getraces()
    {
        return this.races;
    }
    //Using setter to races
    public void setraces(int races)
    {
        this.races = races;
    }


//    using getter to points
    public int getPoints()
    {
        return this.points;
    }
//    using setter to points
    public void setPoints(int points)
    {
        this.points = points;
    }


//using getter to first_position
    public int getfirst_position()
    {
        return this.first_position;
    }

//    using setter to first_position
    public void setfirst_position(int first_position)
    {
        this.first_position = first_position;
    }



    //using getter to second_positions
    public int getsecond_positions()
    {
        return this.second_positions;
    }
    //    using setter to second_positions
    public void setsecond_positions(int second_positions)
    {
        this.second_positions = second_positions;
    }



    //using getter to third_positions
    public int getthird_positions()
    {
        return this.third_positions;
    }
    //    using setter to third_positions
    public void setthird_positions(int third_positions)
    {
        this.third_positions = third_positions;
    }


    //using getter to Forth_positions
    public int getForth_positions()
    {
        return this.forth_positions;
    }
    //    using setter to Forth_positions
    public void setForth_positions(int forth_positions)
    {
        this.forth_positions = forth_positions;
    }


    //using getter to Fifth_positions
    public int getFifth_positions()
    {
        return this.fifth_positions;
    }
    //    using setter to Fifth_positions
    public void setFifth_positions(int fifth_positions)
    {
        this.fifth_positions = fifth_positions;
    }


    //using getter to Sixs_positions
    public int getSixs_positions()
    {
        return this.sixs_positions;
    }
    //    using setter to Sixs_positions
    public void setSixs_positions(int sixs_positions)
    {
        this.sixs_positions = sixs_positions;
    }


    //using getter to Seven_positions
    public int getSeven_positions()
    {
        return this.seven_positions;
    }
    //    using setter to Seven_positions
    public void setSeven_positions(int seven_positions)
    {
        this.seven_positions = seven_positions;
    }


    //using getter to Eight_positions
    public int getEight_positions()
    {
        return this.eight_positions;
    }
    //    using setter to Eight_positions
    public void setEight_positions(int eight_positions)
    {
        this.eight_positions= eight_positions;
    }


    //using getter to Nine_positions
    public int getNine_positions()
    {
        return this.nine_positions;
    }
    //    using setter to Nine_positions
    public void setNine_positions(int nine_positions)
    {
        this.nine_positions = nine_positions;
    }


    //using getter to Tenth_positions
    public int getTenth_positions()
    {
        return this.tenth_positions;
    }
    //    using setter to Tenth_positions
    public void setTenth_positions(int tenth_positions)
    {
        this.tenth_positions = tenth_positions;
    }


}
