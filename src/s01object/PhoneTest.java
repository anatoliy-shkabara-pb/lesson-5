package s01object;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("23", "qre", 2.5f);
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone();

        phone1.setModel("iphone");
        phone1.setNumber("0991234567");
        phone2.setModel("pixel");


        System.out.println(phone1.getInfo());
        System.out.println(phone2.getInfo());
        System.out.println(phone3.getInfo());

        if (phone1.getNumber() != null) {
            String upperNumber = phone1.getNumber().toUpperCase();
            System.out.println(upperNumber);
        }

        phone1.receiveCall("Иванов");
        phone1.sendMessage("09123456", "234566", "112466");


        // Person person = new Person("Петров А. И.");
        // phone1.takePhoto(person);

        phone1.charging();
        phone1.takePhoto(new Person("Петров А. И."));

        System.out.println("Кол-во телефонов " + Phone.getPhoneCount());
    }
}
