package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    //This is my first attempt at ascii-art.//

        Scanner userInput = new Scanner(System.in);

        //This is how you set up a new Scanner based on input.//

        System.out.println("Please select a random digit");

        String ascii1 =
                "The Ascii-art below is of the Stonehenge"+
                "\n"+
                "         .----------.\n" +
                "          :`.---------`.          .-----------.\n" +
                "          '.|_.------..'          :`.----------`.  .-----.._\n" +
                "           | ||    | ||           `.|__.------..' |`--..__.'|\n" +
                "           | ||__..| ||-._ ___    | | |.... | ||-.|`--.._ |.'----.\n" +
                "    _ .:::/ / |    | ||   ___  `--| | |  _  | ||  | | | | |\\      `.\n" +
                "  .` `.  -'.|_|    `.||  /`.  `.  '.|_\\     `.|/  | | | | ||`.      `.\n" +
                " / `. _`.  `-   _     _  |  `.__`   _           _ `.|.' | || |\\       \\\n" +
                " \\   /   \\ _            _ `. |   |     `--   _          '.|| | `.______.\n" +
                " /`. |   |  .'`---...____   `'---' _       _          _    | | |'------'\n" +
                " | /`.-_.' |`---...___ . |  `--      ______________________`.|_| |  ` |\n" +
                " | | | '|  `---...____|.'    _     |`._-_______-______-_____`. | |    |\n" +
                ".| | |  | _ |  .---. | '| `-       '.|  ' ' '  '  '  '  ' ' ' || |    |  \n" +
                "' `| |  |   /  ||  |'|  |      _    |'.__.-------.__.-----.__.'| | .- | \\\n" +
                "|  | |' |   |  ||  | |  |   `--     | |..|    |  |''|   | |::| `.|____| |\n" +
                "\\   `|__| _ |  || _| '. | .`-._     | |  |    |  |  |   | |  | `--     .'\n" +
                " '.         |  ||  |  | | |`.  `. _ | |  |    |  |  |   | |  |   _    `.\n" +
                "   '-. _    \\__|   |  | | |  `.__`. | |  | __ |  |  |___| |  |  `-- _  |\n" +
                "      `''''.    _  `-.|.' '.  |   |  `|__| ___ `.|__| _ `.|__|        /\n" +
                "           :    _    _      `.|_.-'   `-             _          _   .'\n" +
                "            `-._______.::.__     `-     _      _       ___.:::.__.-'\n" +
                "                            `----.....__..------------`";

        String ascii2 =
                "The Ascii-art below is of the Statue of Liberty"+
                        "(\n" +
                        "(_)\n" +
                        "###       .\n" +
                        "(#c    __\\|/__\n" +
                        " #\\     wWWWw\n" +
                        " \\ \\-. (/. .\\)\n" +
                        " /\\ /`\\/\\   /\\\n" +
                        " |\\/   \\_) (_|\n" +
                        " `\\.' ; ; `' ;`\\\n" +
                        "   `\\;  ;    .  ;/\\\n" +
                        "     `\\;    ;  ;|  \\\n" +
                        "      ;   .'  ' ;  /\n" +
                        "      |_.'   ;  | /)\n" +
                        "      (     ''._;/`\n" +
                        "      |    ' . ;\n" +
                        "      |.-'   .:)\n" +
                        "      |        |\n" +
                        "      (  .'  : |\n" +
                        "      |,-  .:: |\n" +
                        "      | ,-'  .;|\n" +
                        "     _/___,_.:_\\_\n" +
                        "    [I_I_I_I_I_I_]\n" +
                        "    | __________ |\n" +
                        "    | || |  | || |\n" +
                        "   _| ||_|__|_|| |_\n" +
                        "  /=--------------=\\\n" +
                        " /                  \\\n" +
                        "|                    |";

        String ascii3 =
                "The Ascii-art below is of the Pyramids"+
                "\n"+
                "                .,aadd\"'    `\"bbaa,.\n" +
                "            ,ad8888P'          `Y8888ba,\n" +
                "         ,a88888888              88888888a,\n" +
                "       a88888888888              88888888888a\n" +
                "     a8888888888888b,          ,d8888888888888a\n" +
                "    d8888888888888888b,_    _,d8888888888888888b\n" +
                "   d88888888888888888888888888888888888888888888b\n" +
                "  d8888888888888888888888888888888888888888888888b\n" +
                " I888888888888888888888888888888888888888888888888I\n" +
                ",88888888888888888888888888888888888888888888888888,\n" +
                "I8888888888888888PY8888888PY88888888888888888888888I\n" +
                "8888888888888888\"  \"88888\"  \"88888888888888888888888\n" +
                "8::::::::::::::'    `:::'    `:::::::::::::::::::::8\n" +
                "Ib:::::::::::\"        \"        `::::::' `:::::::::dI\n" +
                "`8888888888P            Y88888888888P     Y88888888'\n" +
                " Ib:::::::'              `:::::::::'       `:::::dI\n" +
                "  Yb::::\"                  \":::::\"           \"::dP\n" +
                "   Y88P                      Y8P               `P\n" +
                "    Y'                        \"\n" +
                "                                `:::::::::::;8\"\n" +
                "       \"888888888888888888888888888888888888\"\n" +
                "         `\"8;::::::::::::::::::::::::::;8\"'\n" +
                "            `\"Ya;::::::::::::::::::;aP\"'\n" +
                "                ``\"\"YYbbaaaaddPP\"\"''";

        for (int i = 0; i < 3; i++) {

            int scannerInput = userInput.nextInt();

            //Here is where we ask the scanner to use our userInput instead of the numbers of input.//

            if (scannerInput == 1) {
                System.out.println(ascii1);
            }
            //Here is where we allow the users input to output the ascii-art.

            //Remember that == is how you select the number, while = would assign the number//

            else if (scannerInput == 2) {
                System.out.println(ascii2);
            } else if (scannerInput == 3) {
                System.out.println(ascii3);
            }
        }
    }
}