package Lesson2_OpenClosedPrinciple.Example1.ProblematicCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<NotificationType> notificationTypes){
        for(NotificationType type: notificationTypes){
            if(type == NotificationType.SMS){
                type.sendSMSNotification();
            }else if(type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            }else if(type == NotificationType.EMAIL) {
                type.sendEMAILNotification();
            }
        }
    }

}

//OPEN-CLOSED Principle:- A class should be open for extension but closed for modifications

//Problems
//1. This class knows too much about notifications i.e. notification types and their methods
//2. Extendibility:- as new notification method is added in NotificationType class then code of this class also has to be change
//Hence we are not able to modify/add new features without modifying the class
//This condition violates the OpenClosedPrinciple