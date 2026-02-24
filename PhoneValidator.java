public class PhoneValidator {

    public static boolean isValidPhone(String phone) {
        return phone.matches("^(98|97)\\d{8}$");
    }

    // Testing
    public static void main(String[] args) {
        System.out.println(isValidPhone("9841234567")); // true
        System.out.println(isValidPhone("1234567890")); // false
        System.out.println(isValidPhone("98412345"));   // false
        System.out.println(isValidPhone("98-412-345")); // false
    }
}