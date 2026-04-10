import java.util.*;
class User {
    String username;
    String password;

    User(String u, String p) {
        this.username = u;
        this.password = p;
    }
}
class Message {
    String sender;
    String receiver;
    String text;

    Message(String s, String r, String t) {
        sender = s;
        receiver = r;
        text = t;
    }
}

public class chat_application {

    static ArrayList<User> users = new ArrayList<>();
    static ArrayList<Message> messages = new ArrayList<>();
    static void register(Scanner sc) {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        for (User u : users) {
            if (u.username.equals(username)) {
                System.out.println("User already exists!");
                return;
            }
        }

        users.add(new User(username, password));
        System.out.println("Registration successful!");
    }

    static String login(Scanner sc) {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                System.out.println("Login successful!");
                return username;
            }
        }

        System.out.println("Invalid login!");
        return null;
    }

    static void sendMessage(Scanner sc, String sender) {
        System.out.print("Enter receiver username: ");
        String receiver = sc.nextLine();

        boolean found = false;
        for (User u : users) {
            if (u.username.equals(receiver)) {
                found = true;
            }
        }

        if (!found) {
            System.out.println("Receiver not found!");
            return;
        }

        System.out.print("Enter message: ");
        String text = sc.nextLine();

        messages.add(new Message(sender, receiver, text));
        System.out.println("Message sent!");
    }

    static void viewMessages(String user) {
        System.out.println("---- Chat Messages ----");
        for (Message m : messages) {
            if (m.sender.equals(user) || m.receiver.equals(user)) {
                System.out.println(m.sender + " -> " + m.receiver + " : " + m.text);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n CHAT APPLICATION ");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                register(sc);
            }

            else if (choice == 2) {
                String currentUser = login(sc);

                if (currentUser != null) {
                    while (true) {
                        System.out.println("\n1. Send Message");
                        System.out.println("2. View Messages");
                        System.out.println("3. Logout");
                        System.out.print("Enter choice: ");
                        int ch = sc.nextInt();
                        sc.nextLine();

                        if (ch == 1) {
                            sendMessage(sc, currentUser);
                        }
                        else if (ch == 2) {
                            viewMessages(currentUser);
                        }
                        else {
                            break;
                        }
                    }
                }
            }

            else {
                System.out.println("Exit");
                break;
            }
        }
    }
}