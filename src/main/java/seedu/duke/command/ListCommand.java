package seedu.duke.command;

//import seedu.duke.storage.Storage;
//import seedu.duke.exception.DukeException;
import seedu.duke.exception.DukeException;
import seedu.duke.ui.Ui;
import seedu.duke.user.User;
import seedu.duke.user.UserList;

import java.util.ArrayList;

/**
 * Prints a list of all tasks to the user.
 */
public class ListCommand extends Command {

    public ListCommand(String input) {
        super(input);
    }

    @Override
    public void execute(UserList users, Ui ui, User nowUser/*, Storage storage*/) throws DukeException {
        String day = input.substring(1);
        if (day.equals("all")) {
            ui.printList(users, nowUser, "mon");
            ui.printList(users, nowUser, "tue");
            ui.printList(users, nowUser, "wed");
            ui.printList(users, nowUser, "thu");
            ui.printList(users, nowUser, "fri");
            ui.printList(users, nowUser, "sat");
            ui.printList(users, nowUser, "sun");
        } else {
            ui.printList(users, nowUser, day);
        }
    }
}
