import org.json.JSONArray;
import org.json.JSONObject;

public class ApiResponseValidator {

    public static void main(String[] args) {
        String jsonResponse = "{\"users\": [{\"id\": 101,\"name\": \"John Doe\",\"orders\": [{\"orderId\": \"A1\",\"amount\": 120.0},{\"orderId\": \"A2\",\"amount\": 150.5}]},{\"id\": 102,\"name\": \"Jane Smith\",\"orders\": []}]}";
        int statusCode = 200;

        validateApiResponse(statusCode, jsonResponse);
    }

    public static void validateApiResponse(int statusCode, String jsonResponse) {
        boolean isValid = true;

        // Validate status code
        if (statusCode == 200) {
            System.out.println("Response status code: PASSED");
        } else {
            System.out.println("Response status code: FAILED (Received: " + statusCode + ")");
            isValid = false;
        }

        JSONObject jsonObject = new JSONObject(jsonResponse);
        JSONArray users = jsonObject.getJSONArray("users");

        boolean userValidation = true;
        boolean orderValidation = true;

        for (int i = 0; i < users.length(); i++) {
            JSONObject user = users.getJSONObject(i);

            if (!user.has("id") || !user.has("name") || user.getString("name").isEmpty()) {
                userValidation = false;
                System.out.println("User validation issue: Missing or empty 'id'/'name' for user at index: " + i);
            }

            JSONArray orders = user.getJSONArray("orders");

            if (orders.length() == 0) {
                System.out.println("Order validation notice: User ID " + user.getInt("id") + " has no orders. [Handled as acceptable]");
                continue;
            }

            for (int j = 0; j < orders.length(); j++) {
                JSONObject order = orders.getJSONObject(j);
                if (!order.has("orderId") || !order.has("amount") || order.getDouble("amount") <= 0) {
                    orderValidation = false;
                    System.out.println("Order validation issue: User ID " + user.getInt("id") + ", Order index " + j);
                }
            }
        }

        System.out.println("User validation: " + (userValidation ? "PASSED" : "FAILED"));
        System.out.println("Order validation: " + (orderValidation ? "PASSED" : "FAILED"));

        if (isValid && userValidation && orderValidation) {
            System.out.println("Overall Validation: PASSED");
        } else {
            System.out.println("Overall Validation: FAILED");
        }
    }
}
