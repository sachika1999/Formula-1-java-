package sachika;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class GUI {
    static Formula1ChampionshipManager fcp = new Formula1ChampionshipManager();//cerating object of Formula1ChampionshipManager
    static JFrame frame = new JFrame("main GUI ");


    GUI() {

        JLabel label = new JLabel("+++FORMULA! RACE+++");//initializing label
        label.setBounds(320, 50, 150, 20);
        JLabel labelA = new JLabel("===================");
        labelA.setBounds(320, 60, 150, 20);//setting the location for the lable
        JLabel label1 = new JLabel("(1)  press CLICK_1 to display statistics in decending  order");//Initializing label1
        label1.setBounds(50, 100, 500, 20);//setting the location for the lable1

        JLabel label2 = new JLabel("(2)  press CLICK_2 to display statistics in ascending order).");//initializing label2
        label2.setBounds(50, 130, 500, 20);//setting the location for the lable2

        JLabel label3 = new JLabel("(3)  press CLICK_3 to show statistics in according to the largest  number of first position");//initializing label3333333
        label3.setBounds(50, 160, 500, 20);//setting the location for the lable3

        JLabel label4 = new JLabel("(4)  press CLICK_4 to run a race and show statistics in decending order");//initializing label4
        label4.setBounds(50, 190, 500, 20);//setting the location for the lable4

        JLabel label5 = new JLabel("(5)  press CLICK_5 to show the probability to win the race,");//initializing label5
        label5.setBounds(50, 220, 500, 20);//setting the location for the lable5

        JLabel label6 = new JLabel("(6)  press CLICK_1 to show statistics in ascending order of date played");//initializing label6
        label6.setBounds(50, 250, 500, 20);//setting the location for the lable6

        JLabel label7 = new JLabel("(7)  press CLICK_1 to search for all races");//initializing label7
        label7.setBounds(50, 280, 500, 20);//setting the location for the lable7

        JButton button = new JButton("CLICK_1");//initializing button
        button.setBounds(50, 330, 100, 20);//setting the location for the button
        JButton button2 = new JButton("CLICK_2");//initializing button2
        button2.setBounds(160, 330, 100, 20);//setting the location for the button2
        JButton button3 = new JButton("CLICK_3");//initializing button3
        button3.setBounds(270, 330, 100, 20);//setting the location for the button3
        JButton button4 = new JButton("CLICK_4");//initializing button4
        button4.setBounds(380, 330, 100, 20);//setting the location for the button4
        JButton button5 = new JButton("CLICK_5");//initializing button5
        button5.setBounds(490, 330, 100, 20);//setting the location for the button5
        JButton button6 = new JButton("CLICK_6");//initializing button6
        button6.setBounds(600, 330, 100, 20);//setting the location for the button6
        JButton button7 = new JButton("CLICK_7");//initializing button7
        button7.setBounds(710, 330, 100, 20);//setting the location for the button7


       //using ActionListener to the button
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                descending_order_Gui();
            }

        });
        //using ActionListener to the buttons
        button2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ascending_order_GUI();
            }

        });
        //using ActionListener to the buttons
        button3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                first_position_descending_order_Gui();
            }

        });
        //using ActionListener to the buttons
        button4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                auto_race();
            }

        });
        //using ActionListener to the buttons
        button5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                propability();
            }

        });
        //using ActionListener to the buttons
        button6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                date();
            }

        });
        //using ActionListener to the buttons
        button7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                search_driver();
            }

        });

//Adding components to the GUI
        frame.add(button);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.setSize(845, 408);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.cyan);
        frame.getContentPane().add(label);
        frame.getContentPane().add(labelA);
        frame.getContentPane().add(label1);
        frame.getContentPane().add(label2);
        frame.getContentPane().add(label3);
        frame.getContentPane().add(label4);
        frame.getContentPane().add(label5);
        frame.getContentPane().add(label6);
        frame.getContentPane().add(label7);
    }


    public static void main(String[] args) {
        //calling the constructor from the method
        new GUI();
    }

    public static void descending_order_Gui() {
        ArrayList<Formula1Driver> drive_info = fcp.sendDriverInfo();
        ArrayList<Formula1Driver> drive_point_info = fcp.sendDriverPointinfo();
        ArrayList<Integer> point_arr = new ArrayList<>();

        for (int i = 0; i < drive_info.size(); i++) {
            point_arr.add(drive_point_info.get(i).getPoints());

        }
        Collections.sort(point_arr, Collections.reverseOrder());
        String[][] arr = new String[point_arr.size()][7];//using a 2d array to get the values to the table
        for (int i = 0; i < point_arr.size(); i++) {
            for (int j = 0; j < drive_info.size(); j++) {
                if (point_arr.get(i) == drive_point_info.get(j).getPoints()) {

//                    asinging values to the 2d array

                    arr[i][0] = drive_info.get(j).getName();
                    arr[i][1] = drive_info.get(j).getTeam();
                    arr[i][2] = String.valueOf(drive_point_info.get(j).getfirst_position());
                    arr[i][3] = String.valueOf(drive_point_info.get(j).getsecond_positions());
                    arr[i][4] = String.valueOf(drive_point_info.get(j).getthird_positions());
                    arr[i][5] = String.valueOf(drive_point_info.get(j).getPoints());
                    arr[i][6] = String.valueOf(drive_point_info.get(j).getraces());

                }
            }

        }
        JFrame frame;
        frame = new JFrame();

        String column[] = {"Name", "Team", "First position", "Second position", "Third psoiton", "points", "races"};//columns of the jtable
        JTable jt = new JTable(arr, column);
        jt.setBounds(30, 40, 800, 300);
        JScrollPane sp = new JScrollPane(jt);
        frame.add(sp);
        frame.setSize(800, 400);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.cyan);


    }

    public static void ascending_order_GUI() {
        ArrayList<Formula1Driver> drive_info = fcp.sendDriverInfo();
        ArrayList<Formula1Driver> drive_point_info = fcp.sendDriverPointinfo();
        ArrayList<Integer> point_arr = new ArrayList<>();

        for (int i = 0; i < drive_info.size(); i++) {
            point_arr.add(drive_point_info.get(i).getPoints());

        }

        Collections.sort(point_arr);
        String[][] arr = new String[point_arr.size()][7];//using a 2d array to get the values to the table

        for (int i = 0; i < point_arr.size(); i++) {
            for (int j = 0; j < drive_info.size(); j++) {

                if (point_arr.get(i) == drive_point_info.get(j).getPoints()) {
//                    asinging values to the 2d array
                    arr[i][0] = drive_info.get(j).getName();
                    arr[i][1] = drive_info.get(j).getTeam();
                    arr[i][2] = String.valueOf(drive_point_info.get(j).getfirst_position());
                    arr[i][3] = String.valueOf(drive_point_info.get(j).getsecond_positions());
                    arr[i][4] = String.valueOf(drive_point_info.get(j).getthird_positions());
                    arr[i][5] = String.valueOf(drive_point_info.get(j).getPoints());
                    arr[i][6] = String.valueOf(drive_point_info.get(j).getraces());

                }
            }
        }
        JFrame frame;
        frame = new JFrame();

        String column[] = {"Name", "Team", "First position", "Second position", "Third psoiton", "points", "races"};
        JTable jt = new JTable(arr, column);
        jt.setBounds(30, 40, 800, 300);
        JScrollPane sp = new JScrollPane(jt);
        frame.add(sp);
        frame.setSize(800, 400);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.cyan);


    }

    public static void first_position_descending_order_Gui() {

        ArrayList<Formula1Driver> drive_info = fcp.sendDriverInfo();
        ArrayList<Formula1Driver> drive_point_info = fcp.sendDriverPointinfo();
        ArrayList<Integer> point_arr = new ArrayList<>();

        for (int i = 0; i < drive_info.size(); i++) {
            point_arr.add(drive_point_info.get(i).getfirst_position());

        }
        Collections.sort(point_arr, Collections.reverseOrder());
        String[][] arr = new String[point_arr.size()][7];//using a 2d array to get the values to the table
        for (int i = 0; i < point_arr.size(); i++) {
            for (int j = 0; j < drive_info.size(); j++) {
                if (point_arr.get(i) == drive_point_info.get(j).getfirst_position()) {
//                    asinging values to the 2d array
                    arr[i][0] = drive_info.get(j).getName();
                    arr[i][1] = drive_info.get(j).getTeam();
                    arr[i][2] = String.valueOf(drive_point_info.get(j).getfirst_position());
                    arr[i][3] = String.valueOf(drive_point_info.get(j).getsecond_positions());
                    arr[i][4] = String.valueOf(drive_point_info.get(j).getthird_positions());
                    arr[i][5] = String.valueOf(drive_point_info.get(j).getPoints());
                    arr[i][6] = String.valueOf(drive_point_info.get(j).getraces());

                }
            }

        }
        JFrame frame;
        frame = new JFrame();

        String column[] = {"Name", "Team", "First position", "Second position", "Third psoiton", "points", "races"};
        JTable jt = new JTable(arr, column);
        jt.setBounds(30, 40, 800, 300);
        JScrollPane sp = new JScrollPane(jt);
        frame.add(sp);
        frame.setSize(800, 400);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.cyan);


    }

    public void auto_race() {
        ArrayList<Formula1Driver> drive_info = fcp.sendDriverInfo();
        ArrayList<Formula1Driver> drive_piont_info = fcp.sendDriverPointinfo();
        ArrayList<Formula1Driver> drive_date_info = fcp.sendDriverPointinfo();

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();

            Formula1Driver racerDate = new Formula1Driver(formatter.format(date));
            drive_date_info.add(racerDate);

            for (int i = 0; i < drive_info.size(); i++) {
                String[] position_arr = {"drive_piont_info.get(i).getfirst_position()", "drive_piont_info.get(i).getsecond_positions()", "drive_piont_info.get(i).getthird_positions()",
                        "drive_piont_info.get(i).getForth_positions()", "drive_piont_info.get(i).getFifth_positions()", "drive_piont_info.get(i).getSixs_positions()",
                        "drive_piont_info.get(i).getSeven_positions()", "drive_piont_info.get(i).getEight_positions()", "drive_piont_info.get(i).getNine_positions()",
                        "drive_piont_info.get(i).getTenth_positions()"};

                Random r = new Random();
                int randomNumber = r.nextInt(position_arr.length);


                if (position_arr[randomNumber] == "drive_piont_info.get(i).getfirst_position()") {
                    drive_piont_info.get(i).setfirst_position(drive_piont_info.get(i).getfirst_position() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 25);


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getsecond_positions()") {
                    drive_piont_info.get(i).setsecond_positions(drive_piont_info.get(i).getsecond_positions() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 18);

                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getthird_positions()") {
                    drive_piont_info.get(i).setthird_positions(drive_piont_info.get(i).getthird_positions() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 15);


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getForth_positions()") {
                    drive_piont_info.get(i).setForth_positions(drive_piont_info.get(i).getForth_positions() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 12);


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getFifth_positions()") {
                    drive_piont_info.get(i).setFifth_positions(drive_piont_info.get(i).getFifth_positions() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 10);


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getSixs_positions()") {
                    drive_piont_info.get(i).setSixs_positions(drive_piont_info.get(i).getSixs_positions() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 8);


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getSeven_positions()") {
                    drive_piont_info.get(i).setSeven_positions(drive_piont_info.get(i).getSeven_positions() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 6);


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getEight_positions()") {
                    drive_piont_info.get(i).setEight_positions(drive_piont_info.get(i).getEight_positions() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 4);


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getNine_positions()") {
                    drive_piont_info.get(i).setNine_positions(drive_piont_info.get(i).getNine_positions() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 2);


                }
                if (position_arr[randomNumber] == "drive_piont_info.get(i).getTenth_positions()") {
                    drive_piont_info.get(i).setTenth_positions(drive_piont_info.get(i).getTenth_positions() + 1);
                    drive_piont_info.get(i).setraces(drive_piont_info.get(i).getraces() + 1);
                    drive_piont_info.get(i).setPoints(drive_piont_info.get(i).getPoints() + 1);

                }
//


            }
//            fcp.descendingorder();
            descending_order_Gui();//calling V to show the updated data

        } catch (Exception e) {
            System.out.println("ERROR");


        }


    }

    public void propability() {
        ArrayList<Formula1Driver> drive_info = fcp.sendDriverInfo();
//        ArrayList<Formula1Driver> drive_piont_info = fcp.sendDriverPointinfo();

        ArrayList<String> driver_name_arr = new ArrayList<>();
        for (int i = 0; i < drive_info.size(); i++) {
            driver_name_arr.add(drive_info.get(i).getName());
        }
        Collections.shuffle(driver_name_arr);// shufeling th elemnets in the arrayList


        ArrayList<Integer> point_arr = new ArrayList<>();
        for (int i = 1; i < drive_info.size() + 1; i++)
            point_arr.add(i);
        Collections.shuffle(point_arr);


        JFrame frame = new JFrame("probability GUI");
        JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10; //diffing labels

//        initalize label
        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();
        l6 = new JLabel();
        l7 = new JLabel();
        l8 = new JLabel();
        l9 = new JLabel();
        l10 = new JLabel();
        l3 = new JLabel();

        for (int i = 0; i < drive_info.size(); i++) {
//            System.out.println(i);


            if (point_arr.get(i) == 1) {
//                System.out.println(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 40% probability to win the race,");
                l1.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 40% probability to win the race,");
                l1.setBounds(50, 50, 500, 30);
            }

            if (point_arr.get(i) == 2) {
                l2.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 20% probability to win the race,");
                l2.setBounds(50, 100, 500, 30);
            }

            if (point_arr.get(i) == 3) {
                l3.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 10% probability to win the race,");
                l3.setBounds(50, 150, 500, 30);
            }


            if (point_arr.get(i) == 4) {
                l4.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 10% probability to win the race,");
                l4.setBounds(50, 150, 500, 30);
            }

            if (point_arr.get(i) == 5) {
                l5.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 2% probability to win the race,");
                l5.setBounds(50, 150, 500, 30);
            }

            if (point_arr.get(i) == 6) {
                l6.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 2% probability to win the race,");
                l6.setBounds(50, 150, 500, 30);
            }

            if (point_arr.get(i) == 7) {
                l7.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 2% probability to win the race,");
                l7.setBounds(50, 150, 500, 30);
            }

            if (point_arr.get(i) == 8) {
                l8.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 2% probability to win the race,");
                l8.setBounds(50, 150, 500, 30);
            }

            if (point_arr.get(i) == 9) {
                l9.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 2% probability to win the race,");
                l9.setBounds(50, 150, 500, 30);
            }

            if (point_arr.get(i) >= 10) {
                l10.setText(driver_name_arr.get(i) + " in starting position " + point_arr.get(i) + "and has a 0% probability to win the race,");
                l10.setBounds(50, 150, 500, 30);
            }

        }


        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);
        frame.add(l10);
        frame.setSize(500, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.cyan);


    }

    public void date() {
        ArrayList<Formula1Driver> drive_info = fcp.sendDriverInfo();
        ArrayList<Formula1Driver> drive_piont_info = fcp.sendDriverPointinfo();
        ArrayList<Formula1Driver> drive_date_info = fcp.sendDriverPointinfo();

        JFrame frame = new JFrame("date GUI");

        JLabel l1;

        l1 = new JLabel();


        for (int i = 0; i < drive_date_info.size(); i++) {
            System.out.println("-----------------------------------");
            System.out.println(drive_date_info.get(i).getdate());
            System.out.println("-----------------------------------");
            l1.setText(drive_date_info.get(i).getdate());
            l1.setBounds(50, 50, 500, 30);
            JLabel[] jLabels = new JLabel[drive_date_info.size()];
            for (int j = 0; j < drive_info.size(); j++) {
                System.out.println("racers name :" + drive_info.get(j).getName());
                System.out.println("Number of first_position :" + drive_piont_info.get(j).getfirst_position());
                System.out.println("Number of second_position :" + drive_piont_info.get(j).getsecond_positions());
                System.out.println("Number of third_position :" + drive_piont_info.get(j).getthird_positions());

                System.out.println("Number of racers = " + drive_piont_info.get(j).getraces());

                System.out.println("Number of points = " + drive_piont_info.get(j).getPoints());
            }


        }
        frame.add(l1);
        frame.setSize(500, 1000);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.cyan);


    }

    public void search_driver()
    {
        ArrayList<Formula1Driver> drive_info = fcp.sendDriverInfo();
        ArrayList<Formula1Driver> drive_piont_info = fcp.sendDriverPointinfo();

        JFrame frame = new JFrame("search_driver _statistics");
        JTextField text = new JTextField(16);
        text.setBounds(50, 230, 200, 50);
        JButton buton = new JButton("SEARCH");
        buton.setBounds(50, 280, 100, 30);
        JLabel l1, l2, l3, l4, l5;

        l1 = new JLabel();
        l2 = new JLabel();
        l3 = new JLabel();
        l4 = new JLabel();
        l5 = new JLabel();

        buton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input = text.getText();//getting the output from the text box

                for (int i = 0; i < drive_info.size(); i++) {
                    if (input.equals(drive_info.get(i).getName())) //checking wether ther is an any name that matches to the text box
                    {
                        System.out.println();
                        l1.setText("Number of first_position :" + drive_piont_info.get(i).getfirst_position());
                        l1.setBounds(50, 50, 500, 30);
                        l2.setText("Number of second_position :" + drive_piont_info.get(i).getsecond_positions());
                        l2.setBounds(50, 80, 500, 30);
                        System.out.println();
                        l3.setText("Number of third_position :" + drive_piont_info.get(i).getthird_positions());
                        l3.setBounds(50, 110, 500, 30);


                        l4.setText("Number of racers = " + drive_piont_info.get(i).getraces());
                        l4.setBounds(50, 140, 500, 30);

                        l5.setText("Number of points = " + drive_piont_info.get(i).getPoints());
                        l5.setBounds(50, 170, 500, 30);

                    }
                }
            }

        });




        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.setSize(400, 400);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.add(text);
        frame.add(buton);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
