package util;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtil {

    public static JSONObject convertToJSONObject(String json) throws JSONException {
        JSONObject jsonObject =new JSONObject(json);
        return jsonObject;
    }

    public static String getJsonValue(JSONObject jsonObject,String propertyName) throws JSONException {
        String value = jsonObject.get(propertyName).toString();
        return value;

    }
}
