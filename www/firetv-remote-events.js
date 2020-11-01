var exec    = require('cordova/exec'),
    channel = require('cordova/channel');

let keyMap = {
    "4": {
        keyCode: 4,
        code: "GoBack"
    },
    "82": {
        keyCode: 82,
        code: "Menu"
    },
};


exports.fireEvent = function (e)
{
    console.log(e);
    let data = JSON.parse(e);

    if(data.action === 'up') {
        if(data.keyCode in keyMap) {
            let event = keyMap[data.keyCode];
            window.dispatchEvent(
                new KeyboardEvent('keyup', {
                    keyCode: event.keyCode,
                    code: event.code,
                    key: event.key
                })
            );
        }
    }
};

exports.showKeyboard = function() {
    exec(null, null, 'FireTVEventsPlugin', 'showKeyboard');
}