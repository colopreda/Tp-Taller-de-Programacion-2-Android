package api;

import java.util.List;
import model.ContributorTest;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by apredazzi on 3/22/17.
 */

public interface GitHubService {
    @GET("repos/{owner}/{repo}/contributors")
    Call<List<ContributorTest>> repoContributors(
    @Path("owner") String owner, @Path("repo") String repo);

    public static final Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();
}
