package com.android.virgilsecurity.virgilback4app.model;

import com.parse.ParseObject;

/**
 * Created by Danylo Oliinyk on 11/22/17 at Virgil Security.
 * -__o
 */

public class Message extends ParseObject {

    private static final String USER_ID_KEY = "userId";
    private static final String BODY_KEY = "body";
    private static final String TIMESTAMP_KEY = "timestamp";

    public String getUserId() {
        return getString(USER_ID_KEY);
    }

    public String getBody() {
        return getString(BODY_KEY);
    }

    public void setUserId(String userId) {
        put(USER_ID_KEY, userId);
    }

    public void setBody(String body) {
        put(BODY_KEY, body);
    }

    public String getTimestamp() {
        return getString(TIMESTAMP_KEY);
    }

    public void setTimestamp(String timestamp) {
        put(TIMESTAMP_KEY, timestamp);
    }
}