package q3;

//TODO: Create a class named EmailService.
public class EmailService implements NotificationService {
    @Override
    public void notifyPatient(String message){
        System.out.println("Sending Email: " + message);
    }

}
//
//Requirements:
//
//Must implement NotificationService
//Print: "Sending Email: " + message
