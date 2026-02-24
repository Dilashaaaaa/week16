public class censusProcessor {

    public static Student[] parseCSV(String[] csvData) {

        Student[] students = new Student[csvData.length - 1];

        for (int i = 1; i < csvData.length; i++) {

            String[] fields = csvData[i].split(",");

            String name = fields[0].trim();
            int age = Integer.parseInt(fields[1].trim());
            String school = fields[2].trim();
            int grade = Integer.parseInt(fields[3].trim());
            String citizenship = fields[4].trim();
            String phone = fields[5].trim();

            students[i - 1] = new Student(name, age, school, grade, citizenship, phone);
        }

        return students;
    }

    // SECTION C – Citizenship Validation
    public static boolean isValidCitizenship(String cit) {

       for (int i = 0; i < cit.length(); i++) {

    char ch = cit.charAt(i);   // get character at position i

    if (i == 2) {              // position of dash
        if (ch != '-')         // must be '-'
            return false;
    }
    else {                     // all other positions
        if (!Character.isDigit(ch))   // must be digit
            return false;
    }
}

return true;
}
    // Phone Validation (reuse logic from Q7)
    public static boolean isValidPhone(String phone) {
        return phone.matches("9[78]\\d{8}");
    }

    // SECTION D – Find By School
   public static Student[] findBySchool(Student[] students, String school) {
    int count = 0;
    for (int i = 0; i < students.length; i++) {
        if (students[i].getSchool().equalsIgnoreCase(school)) {
            count++;
        }
    }

    Student[] result = new Student[count];
    int index = 0;

    for (int i = 0; i < students.length; i++) {
        if (students[i].getSchool().equalsIgnoreCase(school)) {
            result[index] = students[i];
            index++;
        }
    }

    return result;
}
    // Count By Grade
    public static int countByGrade(Student[] students, int grade) {

        int count = 0;

        for (Student s : students) {
            if (s.getGrade() == grade)
                count++;
        }

        return count;
    }

    // Average Age
    public static double averageAge(Student[] students) {

        int sum = 0;

        for (Student s : students) {
            sum += s.getAge();
        }

        return (double) sum / students.length;
    }

    // Longest Name
    public static Student findLongestName(Student[] students) {

        Student longest = students[0];

        for (Student s : students) {
            if (s.getName().length() > longest.getName().length()) {
                longest = s;
            }
        }

        return longest;
    }

    // SECTION E – Report Generator
    public static String generateCensusReport(Student[] students) {

        StringBuilder report = new StringBuilder();

        int valid = 0;
        int invalid = 0;

        report.append("NEPAL SCHOOL CENSUS REPORT");

        report.append(String.format("%-10s %-25s %-5s %-8s %-10s\n",
                "Initials", "Name", "Age", "Grade", "Status"));

        for (Student s : students) {

            boolean isValid = isValidCitizenship(s.getCitizenship()) && isValidPhone(s.getPhone());

            if (isValid)
                valid++;
            else
                invalid++;

            report.append(String.format("%-10s %-25s %-5d %-8d %-10s\n",
                    s.getNameInitials(),
                    s.getName(),
                    s.getAge(),
                    s.getGrade(),
                    isValid ? "Valid" : "Invalid"));
        }
        report.append("Total Students: ").append(students.length).append("\n");
        report.append("Valid Records : ").append(valid).append("\n");
        report.append("Invalid Records: ").append(invalid).append("\n");

        report.append("\n===== STATISTICS =====\n");
        report.append(String.format("Average Age : %.2f\n", averageAge(students)));
        report.append("Longest Name: ").append(findLongestName(students).getName()).append("\n");

        return report.toString();
    }
}