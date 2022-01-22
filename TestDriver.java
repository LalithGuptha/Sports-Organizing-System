import CheckEvent.Check;
import OptimalityCalculator.Equipment;
import OptimalityCalculator.PRRelation;
import OptimalityCalculator.Sponsor;
import PitchAnalysis.Pace;
import PitchAnalysis.Pitch;
import PitchAnalysis.Rebound;
import Players.Player;
import Simu.PointsTable;
import Simu.Simulation;
import Simu.Team;
import oopproj.User;
import project.Event;
import project.MatchSchedule;
import project.Venue;
import win_predictor.test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class TestDriver extends Thread {
    public static void main(String[] args) throws IOException {

        Venue chennai, mumbai, bengaluru, hyderabad, jaipur, kolkata, chandigarh, delhi;
        Team csk, mi, rcb, srh, rr, kkr, kxip, dd;

        // File for Event
        Scanner s1 = new Scanner(new File("ExcelFiles//event.txt"));
        Event e1 = new Event(s1.nextLine(), s1.nextLine(), s1.nextLong());

        // File for Venue
        s1 = new Scanner(new File("ExcelFiles//Venue.csv"));
        String[] dummy;
        ArrayList<Venue> venues = new ArrayList<>();
        dummy = (s1.nextLine()).split(",", 0);
        chennai = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(chennai);
        dummy = (s1.nextLine()).split(",", 0);
        mumbai = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(mumbai);
        dummy = (s1.nextLine()).split(",", 0);
        bengaluru = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(bengaluru);
        dummy = (s1.nextLine()).split(",", 0);
        hyderabad = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(hyderabad);
        dummy = (s1.nextLine()).split(",", 0);
        jaipur = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(jaipur);
        dummy = (s1.nextLine()).split(",", 0);
        kolkata = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(kolkata);
        dummy = (s1.nextLine()).split(",", 0);
        chandigarh = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(chandigarh);
        dummy = (s1.nextLine()).split(",", 0);
        delhi = new Venue(dummy[2], Integer.parseInt(dummy[1]), dummy[0]);
        venues.add(delhi);

        // File for Teams
        s1 = new Scanner(new File("ExcelFiles//team.csv"));
        csk = new Team(s1.nextLine(), chennai);
        mi = new Team(s1.nextLine(), mumbai);
        rcb = new Team(s1.nextLine(), bengaluru);
        srh = new Team(s1.nextLine(), hyderabad);
        rr = new Team(s1.nextLine(), jaipur);
        kkr = new Team(s1.nextLine(), kolkata);
        kxip = new Team(s1.nextLine(), chandigarh);
        dd = new Team(s1.nextLine(), delhi);
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(csk);
        teams.add(mi);
        teams.add(rcb);
        teams.add(srh);
        teams.add(rr);
        teams.add(kkr);
        teams.add(kxip);
        teams.add(dd);

        // File for Players
        s1 = new Scanner(new File("ExcelFiles//player.csv"));
        ArrayList<Player> players = new ArrayList<>();
        while (s1.hasNext()) {
            dummy = (s1.nextLine()).split(",", 0);
            switch (dummy[2]) {
                case "Chennai Super Kings" -> players.add(new Player(dummy[0], dummy[1], csk));
                case "Mumbai Indians" -> players.add(new Player(dummy[0], dummy[1], mi));
                case "Royal Challengers Bangalore" -> players.add(new Player(dummy[0], dummy[1], rcb));
                case "Sunrisers Hyderabad" -> players.add(new Player(dummy[0], dummy[1], srh));
                case "Rajasthan Royals" -> players.add(new Player(dummy[0], dummy[1], rr));
                case "Kolkata Knight Riders" -> players.add(new Player(dummy[0], dummy[1], kkr));
                case "Kings XI Punjab" -> players.add(new Player(dummy[0], dummy[1], kxip));
                case "Delhi Daredevils" -> players.add(new Player(dummy[0], dummy[1], dd));
            }

        }
        for (Player player : players) {
            if (csk.equals(player.getTeamName())) {
                csk.setPlayer(player);
            } else if (mi.equals(player.getTeamName())) {
                mi.setPlayer(player);
            } else if (rcb.equals(player.getTeamName())) {
                rcb.setPlayer(player);
            } else if (srh.equals(player.getTeamName())) {
                srh.setPlayer(player);
            } else if (rr.equals(player.getTeamName())) {
                rr.setPlayer(player);
            } else if (kkr.equals(player.getTeamName())) {
                kkr.setPlayer(player);
            } else if (kxip.equals(player.getTeamName())) {
                kxip.setPlayer(player);
            } else if (dd.equals(player.getTeamName())) {
                dd.setPlayer(player);
            }

        }

        // File for Pitch
        ArrayList<Pitch> pitches = new ArrayList<Pitch>();
        s1 = new Scanner(new File("ExcelFiles\\pitch.csv"));
        while (s1.hasNext()) {
            dummy = (s1.nextLine()).split(",", 0);
            pitches.add(new Pitch(Double.parseDouble(dummy[0]), dummy[1], dummy[2], Double.parseDouble(dummy[3]), Double.parseDouble(dummy[4])));
        }

        //File for Rebound
        ArrayList<Rebound> rebound = new ArrayList<Rebound>();
        s1 = new Scanner(new File("ExcelFiles\\Rebound.csv"));
        while (s1.hasNext()) {
            dummy = (s1.nextLine()).split(",", 0);
            rebound.add(new Rebound(Double.parseDouble(dummy[0]), Double.parseDouble(dummy[1]), Double.parseDouble(dummy[2]), Double.parseDouble(dummy[3]), Double.parseDouble(dummy[4]), Double.parseDouble(dummy[5]), Double.parseDouble(dummy[6])));
        }

        //File for Pace
        ArrayList<Pace> pace = new ArrayList<Pace>();
        s1 = new Scanner(new File("ExcelFiles\\Pace.csv"));

        while (s1.hasNext()) {
            dummy = (s1.nextLine()).split(",", 0);
            pace.add(new Pace(Double.parseDouble(dummy[0]), Double.parseDouble(dummy[1])));
        }

        //File for Equipment
        ArrayList<Equipment> eq = new ArrayList<Equipment>();
        ArrayList<Equipment> eqb = new ArrayList<Equipment>();
        s1 = new Scanner(new File("ExcelFiles\\Equipment.csv"));

        while (s1.hasNext()) {
            dummy = (s1.nextLine()).split(",", 0);
            switch (dummy[2]) {
                case "Bat" -> eq.add(new Equipment(dummy[0], dummy[1], dummy[2], Integer.parseInt(dummy[3]), Integer.parseInt(dummy[4])));
                case "Ball" -> eqb.add(new Equipment(dummy[0], dummy[1], dummy[2], Integer.parseInt(dummy[3]), Integer.parseInt(dummy[4])));
            }
        }

        //File for Sponsor
        ArrayList<Sponsor> sp = new ArrayList<Sponsor>();
        s1 = new Scanner(new File("ExcelFiles\\sponsors.csv"));

        while (s1.hasNext()) {
            dummy = (s1.nextLine()).split(",", 0);
            sp.add(new Sponsor(dummy[0], Double.parseDouble(dummy[1]), Integer.parseInt(dummy[2])));
        }

        //File for PR Relation
        ArrayList<PRRelation> pr = new ArrayList<PRRelation>();
        s1 = new Scanner(new File("ExcelFiles\\PRRelation.csv"));

        while (s1.hasNext()) {
            dummy = (s1.nextLine()).split(",", 0);
            pr.add(new PRRelation(dummy[0], dummy[1], Integer.parseInt(dummy[2]), Double.parseDouble(dummy[3])));
        }

        // File for Date
        String d1, d2;
        LocalDate start, end;
        s1 = new Scanner(new File("ExcelFiles//dates.txt"));
        start = LocalDate.parse(s1.nextLine());
        end = LocalDate.parse(s1.nextLine());

                                                 //Preparing Match Schedule

        MatchSchedule matchSchedule = new MatchSchedule(teams.size(), start, end, teams, venues);
        matchSchedule.schedule();
        matchSchedule.write();
        System.out.println("\nNumber Of Matches to Schedule(before Qualifiers) :"+matchSchedule.getSchedule().size());
        matchSchedule.sendMail();

                                     //Finding Optimal Sponsor,Equipment,PRRelation

        Sponsor s = new Sponsor();
        s.opCalc(sp);
        Equipment e = new Equipment();
        e.opCalc(eq);
        Equipment f = new Equipment();
        f.opCalc(eqb);

                                    //Pitch Analysis - Pitch Type, Pace, Rebound

        Thread t[] = new Thread[rebound.size()];
        Thread k[] = new Thread[pace.size()];
        Thread q[] = new Thread[pitches.size()];
        for (int j = 0; j < rebound.size(); j++) {
            t[j] = new Thread(rebound.get(j));


        }
        for (int j = 0; j < rebound.size(); j++) {
            t[j].start();
        }
        for (int j = 0; j < pace.size(); j++) {
            k[j] = new Thread(pace.get(j));


        }
        for (int j = 0; j < pitches.size(); j++) {
            k[j].start();
        }

        for (int j = 0; j < pitches.size(); j++) {
            q[j] = new Thread(pitches.get(j));


        }
        for (int j = 0; j < pitches.size(); j++) {
            q[j].start();
        }

                                                            //Points Table
        Simulation simulation;
        ArrayList<PointsTable> table = new ArrayList<PointsTable>();
        table.add(0, new PointsTable(csk));
        table.add(1, new PointsTable(mi));
        table.add(2, new PointsTable(rcb));
        table.add(3, new PointsTable(srh));
        table.add(4, new PointsTable(rr));
        table.add(5, new PointsTable(kkr));
        table.add(6, new PointsTable(kxip));
        table.add(7, new PointsTable(dd));
        System.out.println("\n"+table);


                                                        //Simulation of Matches

        int i = 1, index = 0,indexlost=0,indexlost1=-1,indexwon1=-1;
        PointsTable update = new PointsTable();
        ArrayList<Team> winlose = new ArrayList<>();
        while (!matchSchedule.getSchedule().isEmpty()) {
            System.out.println("\n"+i++);
            simulation = new Simulation(matchSchedule.getSchedule().peek());
            winlose = simulation.play();
            if(winlose.get(0).getTeamName().equals(matchSchedule.getSchedule().peek().getTeams().get(0).getTeamName()) && !(winlose.get(0).equals(winlose.get(1))))
            {
                indexlost=1;
                indexwon1=0;
            }
            else{
                indexlost = 0;
                indexwon1 = 1;
            }
            for(int m=0;m<table.size();m++)
            {
                if (winlose.get(indexwon1).getTeamName().equals(table.get(m).getTeam().getTeamName())) {
                    index = m;
                }
            }
            for(int m=0;m<table.size();m++)
            {
                if (winlose.get(indexlost).getTeamName().equals(table.get(m).getTeam().getTeamName())) {
                    indexlost1 = m;
                    break;
                }
            }

            if(simulation.getTeam1Score() == simulation.getTeam2Score())
            {
                table.get(index).incpoints(1);
                table.get(index).incplayed();
                table.get(index).incnrr((double)simulation.getTeam1Score()/(double)simulation.getBallsbowled().get(indexwon1) - (double)simulation.getTeam2Score()/(double)simulation.getBallsbowled().get(indexlost));
                table.get(indexlost1).incpoints(1);
                table.get(indexlost1).incplayed();
                table.get(indexlost1).decnrr((double)simulation.getTeam1Score()/(double)simulation.getBallsbowled().get(indexwon1) - (double)simulation.getTeam2Score()/(double)simulation.getBallsbowled().get(indexlost));
                update.points(table);

            }
                                            //Updating Points Table after every Match
            else {
                table.get(index).incwon();
                table.get(index).incpoints(2);
                table.get(index).incplayed();
                table.get(index).incnrr((double) simulation.getTeam1Score() / (double) simulation.getBallsbowled().get(indexwon1) - (double) simulation.getTeam2Score() / (double) simulation.getBallsbowled().get(indexlost));
                table.get(indexlost1).inclost();
                table.get(indexlost1).incplayed();
                table.get(indexlost1).decnrr((double) simulation.getTeam1Score() / (double) simulation.getBallsbowled().get(indexwon1) - (double) simulation.getTeam2Score() / (double) simulation.getBallsbowled().get(indexlost));
                update.points(table);

            }
            winlose.remove(1);
            winlose.remove(0);
            matchSchedule.getSchedule().remove();
        }
        System.out.println("Updated Points Table");
        System.out.println("\n"+table);

                                    // Scheduling and Simulating Qualifiers

        ArrayList<Team> Qualified = new ArrayList<>();
        for(i=0;i<4;i++)
        {
            Qualified.add(i,table.get(i).getTeam());
        }
        System.out.println("\nQualified Teams:"+Qualified);
        matchSchedule.Qualifierschedule(Qualified);
        matchSchedule.Qualifierwrite();
        System.out.println(matchSchedule.getSchedule());

                                        // Scheduling and Simulating Finals

        ArrayList<Team> Finalist =new ArrayList<>();
        int j=1;
        while (!matchSchedule.getSchedule().isEmpty()) {
            System.out.println(teams.size()*(teams.size()-1)+j);
            simulation = new Simulation(matchSchedule.getSchedule().peek());
            winlose = simulation.play();
            Finalist.add(winlose.get(0));
            matchSchedule.getSchedule().remove();
            j++;
        }

        System.out.println("\nFinalists:"+Qualified);
        matchSchedule.Qualifierschedule(Finalist);
        matchSchedule.Qualifierwrite();
        System.out.println("\n"+(teams.size()*(teams.size()-1)+3));
        simulation =new Simulation(Finalist.get(0),Finalist.get(1), end.toString());
        winlose= simulation.play();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tFinalist of "+Event.getEventName()+":    "+winlose.get(0).getTeamName());



        //Abhishek's Part
        System.out.println("\n\n");
        Check a = new Check();
        a.testDriver();
        test b = new test();
        b.kasi();


        //Siddharth's Part
        System.out.println("\n\n");
        User u = new User();
        u.user();


    }
}

