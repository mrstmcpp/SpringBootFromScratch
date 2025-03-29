package org.mrstm.springboot.userpage;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@RestController
public class Main {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://fakestoreapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    UserServices userData = retrofit.create(UserServices.class);
    Call<UserClass> call = userData.getUserById(4);

    Response<UserClass> response = call.execute();

    @GetMapping("/userpage")
    public String userpage() {
        return response.body().toString();
    }
    public Main() throws IOException {
    }
}
