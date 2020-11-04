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

//     @Override
//     public boolean onKeyDown(int keyCode, KeyEvent event) {
//         if(!android.os.Build.MODEL.contains("AFT")) {
//             return super.onKeyDown(keyCode, event);
//         }
//
//         JSONObject key_data = new JSONObject();
//
//         try {
//             key_data.put("action", "down");
//             key_data.put("keyCode", keyCode);
//         } catch (JSONException e) {
//             e.printStackTrace();
//         }
//
//         String js = String.format("javascript:FireTVEventsPlugin.fireEvent('%s');",
//                 key_data.toString());
//
//         this.loadUrl(js);
//
//         return true;
//     }
//
//     @Override
//     public boolean onKeyUp(int keyCode, KeyEvent event) {
//         if(!android.os.Build.MODEL.contains("AFT")) {
//             return super.onKeyDown(keyCode, event);
//         }
//
//         JSONObject key_data = new JSONObject();
//
//         try {
//             key_data.put("action", "up");
//             key_data.put("keyCode", keyCode);
//         } catch (JSONException e) {
//             e.printStackTrace();
//         }
//
//         String js = String.format("javascript:FireTVEventsPlugin.fireEvent('%s');",
//                 key_data.toString());
//
//         this.loadUrl(js);
//
//         return true;
//     }
}