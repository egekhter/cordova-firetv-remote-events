package app.memorable.cordova.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.view.View;


public class FireTVEventsPlugin extends CordovaPlugin {
    private static final String JS_NAMESPACE = "FireTVEventsPlugin";

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
//         if( action.equals("showKeyboard") ){
//             View view = cordova.getActivity().findViewById(android.R.id.content);
//             view.requestFocusFromTouch();
//             return true;
//         }

        return false;
    }
}