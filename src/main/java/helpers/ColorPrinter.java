package helpers;


import org.apache.logging.log4j.Logger;

import java.sql.ResultSet;

import static helpers.ConsoleColors.*;
import static org.apache.logging.log4j.Level.INFO;

public class ColorPrinter {
    public static void printMessageInYellow(String message) {
        System.out.println(YELLOW + message + RESET);
    }

    public static void printColorMessage(String message, Logger logger, Level level ) {
        switch (level) {
            case INFO:
                logger.info(GREEN + message + RESET);
                break;
            case DEBUG:
                logger.debug(BLUE + message + RESET);
                break;
            case ERROR:
                logger.error(RED + message + RESET);
        }
    }
}
