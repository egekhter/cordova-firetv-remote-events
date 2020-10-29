var exec    = require('cordova/exec'),
    channel = require('cordova/channel');

exports.fireEvent = function (event)
{
    debugger;
    var args     = Array.apply(null, arguments).slice(1),
        listener = this._listener[event];

    if (!listener)
        return;

    for (var i = 0; i < listener.length; i++)
    {
        var fn    = listener[i][0],
            scope = listener[i][1];

        fn.apply(scope, args);
    }
};