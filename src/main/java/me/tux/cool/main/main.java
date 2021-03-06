package me.tux.cool.main;

import me.tux.cool.util.ColourUtil;
import me.tux.cool.util.DebugUtil;
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
                System.out.println(DebugUtil.SUCCESS + "File Created" + ColourUtil.RESET);

            } catch (IOException e) {
                System.out.println(DebugUtil.FAIL + "File Couldn't be created.");
                e.printStackTrace();

            }

            System.out.println("Please enter your Github username: " + ColourUtil.PURPLE);

            Scanner usn = new Scanner(System.in);
            String username = usn.nextLine();

            System.out.println("Please choose a GIF: ");
            Thread.sleep(300);

            System.out.println(ColourUtil.PURPLE + "1. Hands");
            Thread.sleep(300);

            System.out.println(ColourUtil.PURPLE + "2. Dino");
            Thread.sleep(300);

            System.out.println(ColourUtil.PURPLE + "3. Ghost");
            Thread.sleep(300);

            System.out.println(ColourUtil.PURPLE + "4. None");
            Thread.sleep(300);

            Scanner giftype = new Scanner(System.in);
            String gifnum = giftype.next();


            try {
                file.write("<h3 align=\"center\">" + WriteUtil.SKIP);
                file.write("  Welcome to " + username + "'s profile!" + WriteUtil.SKIP);

                switch (gifnum) {

                    default:
                    case "1":
                        file.write("<img src=https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif width=\"28\">");
                        file.write(WriteUtil.SKIP + "</h3>" + WriteUtil.SKIP);
                        break;

                    case "2":
                        file.write("<img src=https://cdn.cjstevenson.com/images/dino.gif?1556902250 width=\"28\">");
                        file.write(WriteUtil.SKIP + "</h3>");
                        break;

                    case "3":
                        file.write("<img src=https://64.media.tumblr.com/3ececbb033456396a8cdb3483153f1c6/tumblr_muby2mnWSc1qhl91yo1_r1_250.gifv width=\"28\">");
                        file.write(WriteUtil.SKIP + "</h3>" + WriteUtil.SKIP);
                        break;

                    case "4":
                }
                System.out.println("What Type Of Developer Are You?: ");
                Thread.sleep(300);
    
                System.out.println(ColourUtil.PURPLE + "1. Discord Bot Developer");
                Thread.sleep(300);
    
                System.out.println(ColourUtil.PURPLE + "2. Java Developer");
                Thread.sleep(300);
    
                System.out.println(ColourUtil.PURPLE + "3. Frontend Developer");
                Thread.sleep(300);
    
                System.out.println(ColourUtil.PURPLE + "4. Backend Developer");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "5. Fullstack Developer");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "6. C Developer");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "7. C++ Developer");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "8. C# Developer");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "9. JavaScript Developer");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "10. PHP Developer");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "11. Kotlin Developer");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "12. All Of These");
                Thread.sleep(300);

                Scanner devtype = new Scanner(System.in);
                String dev = devtype.next();

                switch (dev) {

                    case "1":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=Discord+Bot+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "2":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=Java+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "3":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=Frontend+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "4":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=Backend+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "5":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=Fullstack+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "6":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=C+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "7":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=C%2B%2B+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "8":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=C%23+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "9":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=JavaScript+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "10":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=PHP+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "11":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=Kotlin+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;

                    case "12":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "<!-- Typing SVG by DenverCoder1 - https://github.com/DenverCoder1/readme-typing-svg -->");
                        file.write(WriteUtil.SKIP + "<p align=\"center\">");
                        file.write(WriteUtil.SKIP + "<img src=\"https://readme-typing-svg.herokuapp.com/?lines=Discord+Bot+Developer;Java+Developer;Frontend+Developer;Backend+Developer;Fullstack+Developer;C+Developer;C%2B%2B+Developer;C%23+Developer;JavaScript+Developer;PHP+Developer;Kotlin+Developer&font=Fira%20Code&center=true&width=440&height=45&color=36BCF7&vCenter=true&size=22\">");
                        file.write(WriteUtil.SKIP + "</p>");
                        break;
                }
                System.out.println("Info About What You Are Doing:");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "1. FAQ");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "2. None");
                Thread.sleep(300);

                Scanner svg = new Scanner(System.in);
                String svgans = svg.next();


                switch (svgans) {

                    case "1":
                        System.out.print(ColourUtil.PURPLE + "What Are You Currently Working on? : ");

                        Scanner won = new Scanner(System.in);
                        String wonans = won.next();

                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "# More About Me:");
                        file.write(WriteUtil.SKIP + "- I'm currently working on " + wonans + "");

                        System.out.print(ColourUtil.PURPLE + "What Are You Currently learning? : ");

                        Scanner learn = new Scanner(System.in);
                        String learnans = learn.next();

                        file.write(WriteUtil.SKIP + "- I'm currently learning " + learnans + "");

                        System.out.print(ColourUtil.PURPLE + "A cool thing you have made : ");

                        Scanner contact = new Scanner(System.in);
                        String contactans = contact.next();

                        file.write(WriteUtil.SKIP + "- A Cool thing I have made is " + contactans + "");

                        System.out.print(ColourUtil.PURPLE + "Fun fact about you : ");

                        Scanner ffact = new Scanner(System.in);
                        String ffactans = ffact.next();

                        file.write(WriteUtil.SKIP + "- Fun fact " + ffactans + "");
                        file.write(WriteUtil.SKIP);
                        break;

                    case "2":
                }

                System.out.println("Contact Me:");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "1. Github");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "2. Discord");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "3. Both");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "4. None");
                Thread.sleep(300);

                Scanner socialm = new Scanner(System.in);
                String sclm = socialm.next();


                switch (sclm) {

                    default:
                    case "1":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "# Contact Me:");
                        file.write(WriteUtil.SKIP + "- Github:" + " [" + username + "]" + "(https://github.com/" + username + ")");
                        break;

                    case "2":
                        System.out.print(ColourUtil.PURPLE + "Please enter your Discord ID");

                        Scanner discord = new Scanner(System.in);
                        String discordid = discord.next();

                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "# Contact Me:");
                        file.write(WriteUtil.SKIP + "- Discord:" + " [Discord]" + "(https://discord.com/users/" + discordid + ")");
                        break;

                    case "3":
                        file.write(WriteUtil.SKIP + "# Contact Me:");
                        file.write(WriteUtil.SKIP + "- Github:" + " [" + username + "]" + "(https://github.com/" + username + ")");

                        System.out.print(ColourUtil.PURPLE + "Please enter your Discord ID: ");

                        discord = new Scanner(System.in);
                        discordid = discord.next();

                        file.write(WriteUtil.SKIP + "- Discord:" + " [Discord]" + "(https://discord.com/users/" + discordid + ")");
                        break;

                    case "4":
                }

                System.out.println("Please choose additional info.");
                Thread.sleep(300);


                System.out.println(ColourUtil.PURPLE + "1. Stats");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "2. None");
                Thread.sleep(300);

                Scanner stats = new Scanner(System.in);
                String stat = stats.next();


                switch (stat) {
                    case "1":
                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "# Statistics");
                        file.write(WriteUtil.SKIP + "<br/>" + WriteUtil.SKIP + "  <br/>");
                        file.write(WriteUtil.SKIP + "<a href=https://github.com/anuraghazra/github-readme-stats><img alt=" + username + " src=https://github-readme-stats.vercel.app/api/top-langs/?username=" + username + "&layout=compact&show_icons=true&theme=synthwave height=162px/></a>");

                        System.out.print(ColourUtil.PURPLE + "Please enter Repo #1");

                        file.write(WriteUtil.SKIP + "<a href=https://github.com/anuraghazra/github-readme-stats><img alt=" + username + " src=https://github-readme-stats.vercel.app/api?username=" + username + " &show_icons=true&theme=synthwave height=162px/></a>");
                        file.write(WriteUtil.SKIP + "  <br/>" + WriteUtil.SKIP + "<br/>" + WriteUtil.SKIP);
                        break;

                    case "2":
                }

                System.out.println("Featured Projects");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "1. One Project ");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "2. Two Projects ");
                Thread.sleep(300);

                System.out.println(ColourUtil.PURPLE + "3. None");
                Thread.sleep(300);

                Scanner project = new Scanner(System.in);
                String projectans = project.next();

                switch (projectans) {

                    case "1":
                        System.out.print("Please enter your repo.");
                        Scanner repo = new Scanner(System.in);
                        String rep = repo.next();

                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "# Featured Project:");
                        file.write("[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=" + username + "&repo=" + rep + "&layout=compact&show_icons=true&theme=synthwave)](https://github.com/anuraghazra/github-readme-stats)");
                        break;

                    case "2":
                        System.out.print("Please enter repo #1: ");
                        Scanner repo1 = new Scanner(System.in);
                        String rep1 = repo1.next();

                        System.out.print("Please enter repo #2: ");
                        Scanner repo2 = new Scanner(System.in);
                        String rep2 = repo2.next();

                        file.write(WriteUtil.SKIP);
                        file.write(WriteUtil.SKIP + "# Featured Projects:" + WriteUtil.SKIP);
                        file.write("[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=" + username + "&repo=" + rep1 + "&layout=compact&show_icons=true&theme=synthwave)](https://github.com/anuraghazra/github-readme-stats)" + WriteUtil.SKIP);
                        file.write("[![Readme Card](https://github-readme-stats.vercel.app/api/pin/?username=" + username + "&repo=" + rep2 + "&layout=compact&show_icons=true&theme=synthwave)](https://github.com/anuraghazra/github-readme-stats)");
                        break;

                    case "3":
                    default:
                }

                System.out.println(DebugUtil.SUCCESS + "Writing to file" + ColourUtil.RESET);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(ColourUtil.RED + "Writing to file failed." + ColourUtil.RESET);

            } finally {
                if (file != null) ;
                file.close();
            }

        } else {
            System.out.println(DebugUtil.FAIL + "File couldn't be read/created.");
        }
    }
}
