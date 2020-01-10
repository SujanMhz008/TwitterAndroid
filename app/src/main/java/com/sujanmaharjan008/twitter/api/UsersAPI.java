package com.sujanmaharjan008.twitter.api;

import com.sujanmaharjan008.twitter.model.User;
import com.sujanmaharjan008.twitter.serverresponse.ImageResponse;
import com.sujanmaharjan008.twitter.serverresponse.SignUpResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UsersAPI {

    @POST("users/v1/signup")
    Call<SignUpResponse> registerUser(@Body User users);

    @FormUrlEncoded
    @POST("users/v1/login")
    Call<SignUpResponse> checkUser(@Field("fullName") String fullName, @Field("password") String password);

    @Multipart
    @POST("/users/v1/imageUpload")
    Call<ImageResponse> uploadImage(@Part MultipartBody.Part img);

}