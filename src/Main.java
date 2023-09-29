import okhttp3.*;
import org.json.JSONException;
import org.json.JSONArray;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        String location = "bahen centre";
        JSONArray location_info = getLocationInfo(location);

        String lat = location_info.getJSONObject(0).getString("lat");
        String lon = location_info.getJSONObject(0).getString("lon");
        String disp = location_info.getJSONObject(0).getString("display_name");

        System.out.println(disp + "\nLongitude: " + lon + " Latitude: " + lat);
    }

    public static JSONArray getLocationInfo(String query) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(String.format("https://nominatim.openstreetmap.org/search?format=json&q=%s", query))
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            String responseBody = response.body().string();
            return new JSONArray(responseBody);

        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }
}