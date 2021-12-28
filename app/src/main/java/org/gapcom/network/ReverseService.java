package org.gapcom.network;

import org.gapcom.model.address.NeshanAddress;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * @author Ali (alirezaiyann@gmail.com)
 * @since 4/18/2020 5:48 PM.
 */
public interface ReverseService {
    // TODO: replace "YOUR_API_KEY" with your api key
    @Headers("Api-Key: service.2ZYotexOaeD4OFPqpTI0acluQpbmqh0m0IZC7cbG")
    @GET("/v2/reverse")
    Call<NeshanAddress> getReverse(@Query("lat") Double lat, @Query("lng") Double lng);
}
