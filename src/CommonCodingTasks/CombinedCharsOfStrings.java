package CommonCodingTasks;

public class CombinedCharsOfStrings {
    public static void main(String[] args) {

// this is the task where we build new String taking words of an array iterate through every char and append it to
        //our new string
        String[] arr = {"Daisy", "Rose", "Hyacinth", "Poppy"};
        StringBuilder result = new StringBuilder();

        // Find the maximum length of strings in the array
        int maxLength = 0;
        for (String word : arr) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        // Combine characters from each string at the same index
        for (int i = 0; i < maxLength; i++) {
            for (String word : arr) {
                if (i < word.length()) {
                    result.append(word.charAt(i));
                }
            }
        }

        // Print the combined result
        System.out.println(result.toString());

        String [] arr1 = {"a","b","d","t"};
        StringBuilder f = new StringBuilder();
        for(String letter:arr1){
            f.append(letter);

        }
        System.out.println(f);
    }
}
