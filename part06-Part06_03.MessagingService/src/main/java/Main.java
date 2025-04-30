
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService msgServ = new MessagingService();

        Message msg1 = new Message("Alex", "Coucou");
        Message msg2 = new Message("Loann", "Comment ça va?");
        Message msg3 = new Message("Loann", "Super et toi?");

        msgServ.add(msg1);
        msgServ.add(msg2);
        msgServ.add(msg3);

        for(Message msg : msgServ.getMessages()){
            System.out.println(msg.toString());
        }
    }
}
