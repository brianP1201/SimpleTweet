package com.codepath.apps.restclienttemplate.models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

@Parcel
public class User {

    public String name, screenName, profileImageUrl;

    // empty constructor needed by the Parceler library
    public User() {}

    public static User fromJson(JSONObject jsonObject) throws JSONException {
       User user = new User();
       user.name = jsonObject.getString("name");
       user.screenName = jsonObject.getString("screen_name");
       user.profileImageUrl = jsonObject.getString("profile_image_url_https");
       return user;
    }


}
