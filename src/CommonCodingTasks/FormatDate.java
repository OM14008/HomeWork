package CommonCodingTasks;



public class FormatDate {
    public static void main(String[] args){
       String date = formatFullDate("12/14/2005");


        
    }
    public static String formatFullDate(String fullDate) {
        String[] monthNames = {
                "",     // Index 0 is not used, as months are 1-based
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        String[] dateParts = fullDate.split("/");
        if (dateParts.length == 3) {
            int monthNumber = Integer.parseInt(dateParts[0]);
            if (monthNumber >= 1 && monthNumber <= 12) {
                String formattedMonth = monthNames[monthNumber];
                return formattedMonth + "/" + dateParts[1] + "/" + dateParts[2];
            }
        }

        return "Invalid";
    }
}
