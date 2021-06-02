public class Main {
    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        String[] phoneNumbers = new String[]{"84046545464","548645146"};
        for (String phone: phoneNumbers){
            System.out.println(phone + " is " + phoneNumber.validate(phone));
        }
    }
}
