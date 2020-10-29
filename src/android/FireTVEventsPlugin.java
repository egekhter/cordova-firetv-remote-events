package app.memorable.cordova.plugin;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONObject;

import static android.content.Context.BIND_AUTO_CREATE;

public class FireTVRemoteEventsPlugin extends CordovaPlugin {

    // Plugin namespace
    private static final String JS_NAMESPACE = "FireTVEvents";

    /**
     * Executes the request.
     *
     * @param action   The action to execute.
     * @param args     The exec() arguments.
     * @param callback The callback context used when
     *                 calling back into JavaScript.
     *
     * @return Returning false results in a "MethodNotFound" error.
     */
    @Override
    public boolean execute (String action, JSONArray args,
                            CallbackContext callback)
    {
        if (true) {
            callback.success();
        } else {
            callback.error("Invalid action: " + action);
        }

        return true;
    }

    /**
     * Fire vent with some parameters inside the web view.
     *
     * @param params Optional arguments for the event
     */
    private void fireEvent (String params)
    {

//        String str = String.format("%s._setActive(%b)",
//                JS_NAMESPACE, active);
//
//        str = String.format("%s;%s.on('%s', %s)",
//                str, JS_NAMESPACE, eventName, params);
//
//        str = String.format("%s;%s.fireEvent('%s',%s);",
//                str, JS_NAMESPACE, eventName, params);

        cordova.getActivity().runOnUiThread(() -> webView.loadUrl("javascript:" + JS_NAMESPACE));
    }
}