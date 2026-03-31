package q3;

import q1.NotificationService;

//TODO: Remove direct dependency on SMSService
//Depend on NotificationService abstraction
//Use constructor injection
public class AppointmentManager {
    private SMSService smsService = new SMSService();
    private EmailService emailService = new EmailService();
    private PushService pushService = new PushService();

    public AppointmentManager(NotificationService smsService) {
    }

    public void notifyPatient(String message) {
        smsService.notifyPatient(message);
        emailService.notifyPatient(message);
        pushService.notifyPatient(message);
    }
}

