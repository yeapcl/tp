package seedu.duke.task;

/**
 * Provides blueprint for a Task object.
 */
public abstract class Task {
    protected String description;
    protected String location;
    protected String timeStart;
    protected String timeEnd;
    //protected String taskType;
    //protected boolean isDone;

    /**
     * Initialises a new Task object, and marks it as undone by default.
     *
     * @param description the description of a particular task.
     */
    public Task(String description, String location, String timeStart, String timeEnd) {
        this.description = description;
        this.location = location;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        //this.isDone = false;
    }

    /**
     * Sets the task type based on 'todo', 'deadline' and 'event'.
     *
     * @param taskType the type of task.
     */
    //public void setTaskType(String taskType) {
    //this.taskType = taskType;
    //}

    /**
     * Returns a task's description.
     *
     * @return the description of the task in string.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns a task's type.
     *
     * @return the type of task in string.
     */
    /*public String getTaskType() {
        return taskType;
    }*/

    /**
     * Returns the done status of a task.
     *
     * @return the done status of the task in boolean.
     */
    /*public boolean isDone() {
        return isDone;
    }*/

    /**
     * Returns the done status of a task.
     * @return {@code \u2713} or {@code \u2718}.
     */
    /*public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }*/

    /**
     * Sets a task as done.
     */
    //public void markAsDone() {
    //this.isDone = true;
    //}

    /**
     * Returns the task description and status based on given format.
     *
     * @return the description and task status based on a given format.
     */
    @Override
    public String toString() {
        return this.description + this.location + this.timeStart + this.timeEnd;
    }

    public String getTimeStart() {
        return this.timeStart;
    }

    public String getTimeEnd() {
        return this.timeEnd;
    }
    
    public String getLocation() {
        return this.location;
    }

}
