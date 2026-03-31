package q3;

//TODO: Implement the NotificationService interface
//Adapt existing method accordingly
public class SMSService implements NotificationService {
    @Override
    public void notifyPatient(String message) {
        System.out.println("SMS sent: " + message);
    }
}

