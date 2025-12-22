package Lesson2_OpenClosedPrinciple.Example1.ProblematicCode;

public enum NotificationType {
   SMS,
   EMAIL,
   WHATSAPP;

   public void sendSMSNotification(){
       System.out.println("Sending SMS");
   }
    public void sendEMAILNotification(){
        System.out.println("Sending EMAIL");
    }
    public void sendWhatsappNotification(){
        System.out.println("Sending Whatsapp");
    }
}
