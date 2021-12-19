package me.tux.cool.main;

import me.tux.cool.util.ColourUtil;
import me.tux.cool.util.WriteUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {


    public static void main(String[] args) throws IOException, InterruptedException {


        FileWriter file = new FileWriter("README.md", true);
        File f = new File("README.md");

        if (f.exists() && f.canRead()) {

            try {
                file.write(System.lineSeparator());
                System.out.println(ColourUtil.GREEN + "File Created" + ColourUtil.RESET);

            } catch (IOException e) {
                System.out.println(ColourUtil.FAIL + "File Couldn't be created.");
                e.printStackTrace();

            }

            System.out.println("Please enter your Github username: " + ColourUtil.PURPLE);

            Scanner usn = new Scanner(System.in);
            String username = usn.nextLine();

            System.out.println("Please choose a GIF.: " + ColourUtil.PURPLE);
            Thread.sleep(300);

            System.out.println(ColourUtil.PURPLE + "1. Hands");
            Thread.sleep(300);

            System.out.println(ColourUtil.PURPLE + "2. Dino");
            Thread.sleep(300);

            System.out.println(ColourUtil.PURPLE + "3. Ghost");

            Scanner giftype = new Scanner(System.in);
            String gifnum = giftype.next();


            try {

                file.write("<h3 align=\"center\">" + WriteUtil.SKIP);
                file.write("Welcome to " + username + "'s profile!" + WriteUtil.SKIP);

                switch (gifnum) {

                    default:
                    case "1":
                        file.write("<img src=\"https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif\" width=\"28\">");
                        file.write(WriteUtil.SKIP + "</h3>");
                        break;

                    case "2":
                        file.write("<img src=\"https://cdn-learn.adafruit.com/assets/assets/000/075/201/original/gaming_vita_Idle.gif?1556902250\" width=\"28\">");
                        file.write(WriteUtil.SKIP + "</h3>");
                        break;

                    case "3":
                        file.write("<img src=\"https://64.media.tumblr.com/3ececbb033456396a8cdb3483153f1c6/tumblr_muby2mnWSc1qhl91yo1_r1_250.gifv\" width=\"28\">");
                        file.write(WriteUtil.SKIP + "</h3>" );
                        break;

                }

                System.out.println(ColourUtil.GREEN + "Writing to file successful." + ColourUtil.RESET);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(ColourUtil.RED + "Writing to file failed." + ColourUtil.RESET);

            } finally {
                if (file != null) ;
                file.close();
            }

        } else {
            System.out.println(ColourUtil.FAIL + "File couldn't be read/created.");
        }
    }
}
