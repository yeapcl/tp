package seedu.duke.command;

import seedu.duke.Duke;
import seedu.duke.exception.DukeException;
import seedu.duke.task.Event;
import seedu.duke.ui.Ui;
import seedu.duke.user.User;
import seedu.duke.user.UserList;

import java.util.ArrayList;

/**
 * Clear timetable of user on a particular day.
 */
public class ClearCommand extends Command {

    public ClearCommand(String information) {
        super(information);
    }

    @Override
    public void execute(UserList users, Ui ui, User nowUser/*, Storage storage*/) throws DukeException {
        if (nowUser == null) {
            throw new DukeException("Sorry! You are not Logged in to any account :-(");
        }

        String[] parsedInputs = input.split("/", 2);
        String day = parsedInputs[1];

        for (int i = 0; i < users.getTotalUserCount(); i++) {
            if ((users.getUser(i + 1).getName() == nowUser.getName())) {
                ArrayList<Event> timetable = (users.getUser(i + 1).getTimetable()).getTimetable(day);
                if (!timetable.isEmpty()) {
                    ArrayList<Object> deletedTimetable = new ArrayList<>(timetable);
                    timetable.clear();
                    ui.printClear(deletedTimetable, day);
                } else {
                    throw new DukeException("There is no class in your timetable for " + day + "!");
                }
                break;
            }
        }
    }
}