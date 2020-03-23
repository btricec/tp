package jikan.command;

import jikan.Log;
import jikan.activity.ActivityList;
import jikan.exception.EmptyNameException;
import jikan.parser.Parser;
import jikan.ui.Ui;

import java.util.Scanner;

/**
 * Represents a command to start an activity.
 */
public class StartCommand extends Command {

    private Scanner scanner;

    /**
     * Constructor to create a new start command.
     */
    public StartCommand() {
    }
    
    @Override
    public void executeCommand(ActivityList activityList) {
        try {
            Parser.parseStart(activityList, scanner);
        } catch (EmptyNameException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            Log.makeInfoLog("Activity started without activity name");
            Ui.printDivider("Activity name cannot be empty!");
        }
    }

}
