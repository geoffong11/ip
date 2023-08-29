package duke;

public class Ui {
    private static final String ANSWER_BORDER = "=========================================";
    private static final String BOT_NAME = "RatSpeak";

    /**
     * print greetings in the command line
     */
    public void greeting() {
        System.out.println("Hello from " + BOT_NAME + "\nWhat can I do for you?\n" + ANSWER_BORDER);
    }

    /**
     * print goodbye in the command line
     */
    public void bye() {
        System.out.println(ANSWER_BORDER);
        System.out.println("Bye. Hope to see you again soon!");
    }

    /**
     * Print the message that is created by processing the command given
     * @param commandMessage
     */
    public void message(String commandMessage) {
        System.out.println(ANSWER_BORDER);
        System.out.print(commandMessage);
        System.out.println(ANSWER_BORDER);

    }

}
