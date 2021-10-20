package seedu.duke.command;

import seedu.duke.exceptions.DukeException;

public class AlertCommand extends Command {

    public AlertCommand() {
    }

    @Override
    public String run() throws DukeException {
        String expiryAlerts = new AlertExpiringSoonCommand().run();
        String lowStockAlerts = new AlertLowStockCommand().run();
        return expiryAlerts + '\n' + lowStockAlerts;
    }
}