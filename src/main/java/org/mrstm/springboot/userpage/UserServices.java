package org.mrstm.springboot.userpage;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserServices {
    @GET("/users/{id}")
    Call<UserClass> getUserById(@Path("id") int id);
}
