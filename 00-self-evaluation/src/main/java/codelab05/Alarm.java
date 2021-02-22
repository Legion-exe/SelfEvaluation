package codelab05;

public class Alarm {
    String sound = "BEEP";

    public Alarm(String alarm) {
        this.sound = alarm;
    }

        public String[] makeSound(int timesAlarm) {

        if (timesAlarm == 0) {
            String alarmSound[] = {"BEEP BEEP BEEP"};
            return alarmSound;
        } else {
            String[] alarmSound = new String[timesAlarm];
            for (int i = 0; i < timesAlarm; i++) {
                alarmSound[i] = "BEEP";
            }
            return alarmSound;
        }

    }




}
