package s01object;


/**
 * Класс описывающий телеофн
 */
public class Phone {

    private static int phoneCount = 0;

    public static int getPhoneCount() {
        return phoneCount;
    }

    private String number;
    private String model;
    private float weight;
    private int batteryIndicator;

    public Phone(String number, String model, float weight) {
        this(number, model);

        if (weight > 0) {
            this.weight = weight;
        }
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        phoneCount++;
    }

    public Phone() {
        this.model = "phoneX";
        this.weight = 5.3f;
        this.number = "0000000000";
        this.batteryIndicator = 100;
        phoneCount++;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
       this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            return;
        }
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getBatteryIndicator() {
        if (batteryIndicator < 0) return 0;
        return batteryIndicator;
    }

    public void setBatteryIndicator(int batteryIndicator) {
        this.batteryIndicator = batteryIndicator;
    }

    private boolean isCharged() {
        if(batteryIndicator <= 0) {
            System.out.println("Телефон разрядился");
            return false;
        }
        return true;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        if (isCharged()) {
            System.out.println("Звонит " + name + ", c номера: " + number);
            batteryIndicator -= 20;
        }
    }

    /**
     * Отправка сообщения
     * @param numbers номера телефонов кому отравить сообщение
     */
    public void sendMessage(String... numbers) {
        if (isCharged()) {
            System.out.println("Сообщение отравляется на номера: ");
            for (String number : numbers) {
                System.out.println(number);
            }
            System.out.println("Сообщение отправлено");
        }
    }

    public void charging() {
        System.out.println("Телефон " + model + " заряжаеться...");
        this.batteryIndicator = 100;
        System.out.println("Телефон " + model + " заряжен");
    }

    public void takePhoto(Person person) {
        if (isCharged()) {
            System.out.println("Телеофн " + model + " фотографирует " + person.getName());
        }
    }

    String getInfo() {
        return "[модель: " + model + ", номер: " + number + ", вес: "
                + weight + ", заряд: " + batteryIndicator + "]";
    }
}
