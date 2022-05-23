package sachika;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;


public class Formula1ChampionshipManager implements ChampionshipManager {


    // initilaizing a class array to gather around data of drivers name ,team ,location
    public static ArrayList<Formula1Driver> drive_info = new ArrayList<Formula1Driver>();

    // initilaizing a class array to gather around data of drivers positions ,points, races
    public static ArrayList<Formula1Driver> drive_piont_info = new ArrayList<Formula1Driver>();

    // initilaizing a class array to gather around data of dates of race
    public static ArrayList<Formula1Driver> drive_date_info = new ArrayList<Formula1Driver>();



    @Override
    public void menue() { //ceating the menue method
        System.out.println(" ");
        System.out.println("-------------------");
        System.out.println("|  FORMULA1 RACE  |");
        System.out.println("-------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("press A to Enter a new driver");
        System.out.println("press B to Enter drivers positions");
        System.out.println("press C to Delete a drive");
        System.out.println("press D to change the driver for the team");
        System.out.println("press E to View driver statistics");
        System.out.println("press F to viwe ALL drivers statistics in descending order,");
        System.out.println("press G to race");
        System.out.println("press H to exportData in to a file");
        System.out.println("press I to importData in from a file");
        System.out.println("press J to open GUI");
        System.out.print("Enter :");
        String code = input.next();
        System.out.println(" ");
        switch (code) {
            case "A":
                enter_new_driver();
                break;
            case "B":
                enter_positions();
                break;
            case "C":
                delete_driver();
                break;
            case "D":
                change_driver();
                break;
            case "E":
                display_statistics();
                break;
            case "F":
                descending_order();
                break;
            case "G":
                auto_race();
                break;
            case "H":
                exportData();
                break;
            case "I":
                importData();
                break;
            case "J":
                openGUI();
                break;
        }

        menue();


    }

    public void openGUI(){//ceating the open GUI method
        GUI gi = new GUI();
    }

    public void enter_new_driver() { //ceating the enter_new_driver method to (enter new driver)

        try {//using try to define a block of code to be tested for errors while it is being executed

            System.out.println("-----------------------------------");
            System.out.println("|  Fomula1 race (ADD NEW DRIVER)  |");
            System.out.println("-----------------------------------");


            Scanner reader = new Scanner(System.in);
            System.out.print("Enter drivers name :");
            String name = reader.next();//enter the name of the new racer

            System.out.println("+============+New driver should be in a new team+===========+");
            System.out.print("Enter drivers team :");
            String team = reader.next();//enter the name of the new racers team

            System.out.print("Enter drivers location :");
            String country = reader.next();//enter the name of the new racers location

            Formula1Driver driver = new Formula1Driver(name, country, team);
            drive_info.add(driver);//----------------

            System.out.println();
            System.out.println("------NEW DRIVER CREATED-------");
            System.out.println();

        } catch (Exception e) {
            System.out.println("ERORR please try again");

//            if some thing wrong with the logic  it will print "ERORR please try again"
        }

    }

    public void enter_positions() {//ceating the enter_positions method to (enter the points of the new driver)

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("|  Fomula1 race (ENTER POSITION)  |");
        System.out.println("-----------------------------------");


        Scanner racer_position = new Scanner(System.in);
        System.out.print("Enetr  the drivers name :");
        String DriverName = racer_position.next();//enter the name of the new driver to add ponits

        for (int i = 0; i < drive_info.size(); i++) {//creating a for loop to run number of time which equls (to drive_info.size()
            if (DriverName.equals(drive_info.get(i).getName())) {
                // cheking whether there is a name in the driver_info array if not the code will exicutes

                try {//using try to define a block of code to be tested for errors while it is being executed

                    // inputing alla the position of the driver
                    System.out.print("Enter number of  First position");
                    int first_position = racer_position.nextInt();
                    System.out.print("Enter number of  Second position");
                    int second_position = racer_position.nextInt();
                    System.out.print("Enter number of  Third position");
                    int third_positions = racer_position.nextInt();
                    System.out.print("Enter number of  forth position");
                    int forth_positions = racer_position.nextInt();
                    System.out.print("Enter number of  fifth position");
                    int fifth_position = racer_position.nextInt();
                    System.out.print("Enter number of  sixs position");
                    int sixs_position = racer_position.nextInt();
                    System.out.print("Enter number of  seventh position");
                    int seventh_position = racer_position.nextInt();
                    System.out.print("Enter number of  eigth position");
                    int eigth_position = racer_position.nextInt();
                    System.out.print("Enter number of  ninth position");
                    int ninth_position = racer_position.nextInt();
                    System.out.print("Enter number of  tenth position");
                    int tenth_position = racer_position.nextInt();

                    //calculating the number of races
                    int races = ((first_position)
                            + (second_position)
                            + (third_positions)
                            + (forth_positions)
                            + (fifth_position)
                            + (sixs_position)
                            + (seventh_position)
                            + (eigth_position)
                            + (ninth_position)
                            + (tenth_position));


                    //calculating number of point each driver has
                    int points = ((first_position * 25)
                            + (second_position * 18)
                            + (third_positions * 15)
                            + (forth_positions * 12)
                            + (fifth_position * 10)
                            + (sixs_position * 8)
                            + (seventh_position * 6)
                            + (eigth_position * 4)
                            + (ninth_position * 2)
                            + (tenth_position));


                    Formula1Driver driver1 = new Formula1Driver(first_position, second_position, third_positions, forth_positions, fifth_position,
                            sixs_position, seventh_position, eigth_position, ninth_position, tenth_position, races, points);

                    drive_piont_info.add(driver1);//-------------------

                    System.out.println();
                    System.out.println("------POSITINS ADDED-------");
                    System.out.println();


                } catch (Exception e) {


                    System.out.println();
                    System.out.println("X===================================X");
                    System.out.println("ERORR!!!!!Please enter integer values");
                    System.out.println("X===================================X");

                    System.out.println("OR");

                    System.out.println("Driver not found please enter again, THANK YOU!!!!!!!!!!!");
                    System.out.println();
                }
            }
        }
    }

    public void delete_driver() {//ceating the delete_drivers method to (remove driver from the race)
        try {

            System.out.println("---------------------------------");
            System.out.println("|  Fomula1 race (DELETE RACER)  |");
            System.out.println("---------------------------------");

            Scanner reader1 = new Scanner(System.in);
            System.out.println("Enetr a the name ypu want to remove : ");
            String Delete_name = reader1.next();
            for (int i = 0; i < drive_info.size(); i++) {//creating a for loop to run number of time which equls (to drive_info.size()
                if (Delete_name.equals(drive_info.get(i).getName())) {//checking whther delete_name equal the any of racers in the drive info array

                    drive_info.remove(i);//this step  will remove the name from the drver_info array
                    drive_piont_info.remove(i);//this step  will remove the name from the drver_point_info array

                    System.out.println();
                    System.out.println("------RACER DELETED-------");
                    System.out.println();

                }
            }
        }  catch (Exception e) {


            System.out.println();
            System.out.println("X===================================X");
            System.out.println("ERORR!!!!!Please enter integer values");
            System.out.println("X===================================X");

        }
    }

    public void change_driver() {//creating the change_driver method to change the driver form a team

        System.out.println("-------------------------------------");
        System.out.println("|  Fomula1 race (ENTER NEW DRIVER)  |");
        System.out.println("-------------------------------------");

        Scanner reader2 = new Scanner(System.in);
        System.out.println("Enter the team team : ");
        String teamName = reader2.next();//Asking to entre the teama name
        System.out.println("Enter new drivers name :");
        String newDrivername = reader2.next();//Asking to enter the new driver s namea
        for (int i = 0; i < drive_info.size(); i++) {
            if (teamName.equals(drive_info.get(i).getTeam()))//searchimhg for the teamm in the driver_info array
            {
                drive_info.get(i).setName(newDrivername);//changing the driver name


            }


        }
        System.out.println();
        System.out.println("------NEW RACER ADDED-------");
        System.out.println();
    }

    public void display_statistics() {//creating the display statistics method to show iformation about drivers

        System.out.println("-----------------------------------------------");
        System.out.println("|  Fomula1 race (DISPLAY DRIVER STATISTICS )  |");
        System.out.println("-----------------------------------------------");
        try {

            Scanner reader3 = new Scanner(System.in);
            System.out.println("Enetr the name driver to display the statics : ");
            String Driver_name = reader3.next();//Asking to entre the name of the driver
            for (int i = 0; i < drive_info.size(); i++) {
                if (Driver_name.equals(drive_info.get(i).getName())) {//checking whther driverr_name equal the any of racers in the drive info array
                    System.out.println("Number of first_position :" + drive_piont_info.get(i).getfirst_position());
                    System.out.println("Number of second_position :" + drive_piont_info.get(i).getsecond_positions());
                    System.out.println("Number of third_position :" + drive_piont_info.get(i).getthird_positions());

                    System.out.println("Number of racers = " + drive_piont_info.get(i).getraces());

                    System.out.println("Number of points = " + drive_piont_info.get(i).getPoints());

                }
            }

        } catch (Exception e) {

            System.out.println();
            System.out.println("X===================================X");
            System.out.println("ERORR!!!!!Please try again");
            System.out.println("X===================================X");
            System.out.println();
        }


    }

    public void descending_order() {//creating the display statistics method to show each driver iformation in decending oder

        System.out.println("---------------------------------------------");
        System.out.println("|  Fomula1 race (DISPLAY IN DECENDED ODER)  |");
        System.out.println("---------------------------------------------");

        try {

            String leftAlignFormat = "| %-15s | %-16s | %-16d | %-16d | %-16d | %-9d | %-8d |%n";// forming the table

            System.out.format("+-----------------+------------------+------------------+------------------+------------------+-----------+----------+%n");
            System.out.format("| Drivers  name   | Drivers team     | First positions  | Second positions | Third positions  |   Points  |   races  |%n");
            System.out.format("+-----------------+------------------+------------------+------------------+------------------+-----------+----------+%n");

            ArrayList<Integer> point_arr = new ArrayList<>();//Creating an Array (point_arr) usin each driver points
            for (int i = 0; i < drive_info.size(); i++) {
                point_arr.add(drive_piont_info.get(i).getPoints());

            }
            Collections.sort(point_arr, Collections.reverseOrder());//forming the array(point_arr) to decending oder


            for (int i = 0; i < point_arr.size(); i++) {//creating an nested arry to print the values ocordding to the 3point_arra

                for (int j = 0; j < drive_info.size(); j++) {
                    if (point_arr.get(i) == drive_piont_info.get(j).getPoints()) {
                        // cheking whether the point_arrays (i) equals to drive_piont_info(j)

                        System.out.format(leftAlignFormat, drive_info.get(j).getName() , drive_info.get(j).getTeam(), drive_piont_info.get(j).getfirst_position()
                                , drive_piont_info.get(j).getsecond_positions() , drive_piont_info.get(j).getthird_positions() , drive_piont_info.get(j).getPoints() , drive_piont_info.get(j).getraces());

                    }
                }
                System.out.format("+-----------------+------------------+------------------+------------------+------------------+-----------+----------+%n");
            }
        } catch (Exception e) {
            System.out.println();
            System.out.println("X===================================X");
            System.out.println("ERORR!!!!!Please try again");
            System.out.println("X===================================X");
            System.out.println();
        }
    }

    public void auto_race() {//creating auto_race method
        System.out.println("-----------------------------------------------");
        System.out.println("| Fomula1 race (DISPLAY STATICS AFTER A RACE)  |");
        System.out.println("-----------------------------------------------");

        try {
            LocalDateTime date = LocalDateTime.now();

            Formula1Driver racerDate = new Formula1Driver(date);// storing the date of the race
            drive_date_info.add(racerDate);
//            System.out.println(racerDate);

            for (int i = 0; i < drive_info.size() ; i++) {
//                creating array using positions like strings
                String[] position_arr = {"drive_piont_info.get(i).getfirst_position()", "drive_piont_info.get(i).getsecond_positions()", "drive_piont_info.get(i).getthird_positions()",
                        "drive_piont_info.get(i).getForth_positions()", "drive_piont_info.get(i).getFifth_positions()", "drive_piont_info.get(i).getSixs_positions()",
                        "drive_piont_info.get(i).getSeven_positions()", "drive_piont_info.get(i).getEight_positions()", "drive_piont_info.get(i).getNine_positions()",
                        "drive_piont_info.get(i).getTenth_positions()"};
//
                Random r = new Random();
                int randomNumber = r.nextInt(position_arr.length);
                System.out.println(position_arr[randomNumber]);// chossing en one element form the psoition_arr

                if (position_arr[randomNumber] == "drive_piont_info.get(i).getfirst_position()") {
                    //if the random element is first positsion
//                    the driver will award awarded as the first positiosn
                    drive_piont_info.get(i).setfirst_position(drive_piont_info.get(i).getfirst_position() + 1); //the first position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1); //the races will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 25);
                    //the points will update by 25 because (for the fist position the piont is 25)


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getsecond_positions()") {
                    //if the random element is second positsion
//                    the driver will award awarded as the second positiosn
                    drive_piont_info.get(i).setsecond_positions(drive_piont_info.get(i).getsecond_positions() + 1);//the second position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);//the races will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 18);
                    //the points will update by 18 because (for the second position the piont is 18)

                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getthird_positions()") {
                    //if the random element is third positsion
//                    the driver will award awarded as the thied positiosn
                    drive_piont_info.get(i).setthird_positions(drive_piont_info.get(i).getthird_positions() + 1);//the third position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);//the races will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 15);
                    //the points will update by 15 because (for the third position the piont is 15)


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getForth_positions()") {
                    //if the random element is forth positsion
//                    the driver will award awarded as the forth positiosn
                    drive_piont_info.get(i).setForth_positions(drive_piont_info.get(i).getForth_positions() + 1);//the forth position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);//the races will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 12);
                    //the points will update by 12 because (for the forthr position the piont is 12)


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getFifth_positions()") {
                    //if the random element is fifth positsion
//                    the driver will award awarded as the fifth positiosn
                    drive_piont_info.get(i).setFifth_positions(drive_piont_info.get(i).getFifth_positions() + 1);//the Fifth position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);//the races will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 10);
                    //the points will update by 10 because (for the fifth position the piont is 10)


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getSixs_positions()") {
                    //if the random element is sixth positsion
//                    the driver will award awarded as the sixth positiosn
                    drive_piont_info.get(i).setSixs_positions(drive_piont_info.get(i).getSixs_positions() + 1);//the fsixth position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);//the race will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 8);
                    //the points will update by 6 because (for the sixth position the piont is 8)


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getSeven_positions()") {
                    //if the random element is sevnth positsion
//                    the driver will award awarded as the seventh positiosn
                    drive_piont_info.get(i).setSeven_positions(drive_piont_info.get(i).getSeven_positions() + 1);//the seventh position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);//the races will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 6);
                    //the points will update by 6 because (for the seventhh position the piont is 6)


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getEight_positions()") {
                    //if the random element is eighth positsion
//                    the driver will award awarded as the eighth positiosn
                    drive_piont_info.get(i).setEight_positions(drive_piont_info.get(i).getEight_positions() + 1);//the eigth position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);//the races will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 4);
                    //the points will update by 4 because (for the eigtth position the piont is 4)


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getNine_positions()") {
                    //if the random element is nineth positsion
//                    the driver will award awarded as the ninth positiosn
                    drive_piont_info.get(i).setNine_positions(drive_piont_info.get(i).getNine_positions() + 1);//the ninth position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);//the races will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 2);
                    //the points will update by 2 because (for the ninth position the piont is 2)


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getTenth_positions()") {
                    //if the random element is tenth positsion
//                    the driver will award awarded as the tenth  positiosn
                    drive_piont_info.get(i).setTenth_positions(drive_piont_info.get(i).getTenth_positions() + 1);//the tenth position will update by 1
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);//the races will update by 1
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 1);
                    //the points will update by 1 because (for the tenth position the piont is 1)

                }


            }
//            after updating all the driver positions points races
            descending_order();//calling descending_order to display the updted version of the  races points

        } catch (Exception e) {
            System.out.println();
            System.out.println("X===================================X");
            System.out.println("     ERORR!!!!!Please try again      ");
            System.out.println("X===================================X");
            System.out.println();
        }
    }


    public void exportData() {//creating exportdata to stor data into it as a object output stream

        try {
//            storing data
            ObjectOutputStream SaveFile = new ObjectOutputStream(new FileOutputStream("File.txt"));
            SaveFile.writeObject(drive_info);//saving the object arrays as object
            SaveFile.writeObject(drive_piont_info);//saving the object arrays as object
            SaveFile.writeObject(drive_date_info);//saving the object arrays as object



            SaveFile.close();//the file and closed
            System.out.println("+------------successfully saved to file.TXT------------+");

        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println();
            System.out.println("X===================================X");
            System.out.println("     ERORR!!!!!Please try again      ");
            System.out.println("X===================================X");
            System.out.println();
        }

    }

    public  void importData(){//creating importData to load data from the saved file as a new object output stream

        try {//using try catch to catch any exception
            //loading data from the saved file as a new object output stream
            ObjectInputStream LoadFile = new ObjectInputStream(new FileInputStream("File.txt"));

            //clearing the arraylists
            // assigning the object saved into the respective object array
            drive_info.clear();
            drive_info = (ArrayList<Formula1Driver>) LoadFile.readObject();
            drive_piont_info.clear();
            drive_piont_info = (ArrayList<Formula1Driver>) LoadFile.readObject();
            drive_date_info.clear();
            drive_date_info = (ArrayList<Formula1Driver>) LoadFile.readObject();

            LoadFile.close();
            System.out.println("+------------successfully imported fro file.TXT------------+");
        } catch (IOException | ClassNotFoundException e) {
            //if any saved files cannot be found giving a error massage
            //e.printStackTrace();
        }

    }     //export data to a text file




    public ArrayList<Formula1Driver> sendDriverInfo(){
        return drive_info;
    }

    public ArrayList<Formula1Driver> sendDriverPointinfo(){
        return drive_piont_info;
    }

    public ArrayList<Formula1Driver> sendDriverdateinfo(){
        return drive_date_info;
    }


}