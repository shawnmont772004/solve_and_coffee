import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(); // List to hold the entire triangle

        // If numRows is 0, return an empty result
        if (numRows == 0)
            return result;

        // The first row of Pascal's Triangle is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow); // Add the first row to the result

        // Generate the remaining rows of Pascal's Triangle
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(); // Create a new row
            List<Integer> prevRow = result.get(i - 1); // Get the previous row

            // The first element of each row is always 1
            row.add(1);

            // Calculate the values between the first and last element of the row
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // The last element of each row is always 1
            row.add(1);

            // Add the generated row to the result
            result.add(row);
        }

        return result; // Return the complete triangle
    }

    public static void main(String[] args) {
        PascalTriangle solution = new PascalTriangle();

        // Example: Generate Pascal's Triangle with 5 rows
        List<List<Integer>> triangle = solution.generate(5);

        // Print Pascal's Triangle
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
