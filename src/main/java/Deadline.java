public class Deadline extends Task {
    private String deadlineDate;

    public static final String SEPARATOR = " /by ";

    public Deadline(String description, String deadlineDate) {
        super(description);
        this.deadlineDate = deadlineDate;
    }

    @Override
    public String toString() {
        return String.format("[D]%s (by: %s)", super.toString(), this.deadlineDate);
    }

    public static String[] extractParameters(String command) throws IllegalArgumentException {
        String commandParameters = command.split(" ", 2)[1];
        String[] parameters = commandParameters.split(SEPARATOR);
        if (parameters.length < 2) {
            throw new IllegalArgumentException();
        }
        return parameters;
    }
}
