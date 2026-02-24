public class Main {

    public static void main(String[] args) {

        String[] csvData = {
                "Name,Age,School,Grade,Citizenship,Phone",
                "Ram Bahadur Thapa,18,Itahari Int. College,12,01-0012345,9841234567",
                "Sita Kumari Rai,17,Itahari Int. College,11,01-0054321,9807654321",
                "Anita Rai,17,ICK College,11,04-002222,981234",
        };

        Student[] students =censusProcessor.parseCSV(csvData);

        // Print students
        System.out.println("===== STUDENT LIST =====");
        for (Student s : students) {
            System.out.println(s);
        }

        // Generate Report
        System.out.println("\n");
        System.out.println(censusProcessor.generateCensusReport(students));
    }
}