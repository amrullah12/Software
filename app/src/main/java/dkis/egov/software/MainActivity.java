package dkis.egov.software;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    IniInterface mApi;
    TextView textresult;
    RecyclerView mRecyclerview;
    List<Model> aktif = new ArrayList<Model>();
    RvAll recyclerAdapter;
    private RecyclerView.LayoutManager layoutManager;
//    public static MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textresult = findViewById(R.id.tvResult);
        mRecyclerview =  findViewById(R.id.allid);
        //recyclerAdapter = new RvAll(this, aktif);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerview.setLayoutManager(layoutManager);
        mRecyclerview.setAdapter(recyclerAdapter);
//        mApi = ApiClient.getClient().create(IniInterface.class);
//        mainActivity = this;
        refresh();
    }

    private void refresh() {

        final ProgressDialog progressDialog;
        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();


        mApi = ApiClient.getClient().create(IniInterface.class);
        Call<ResponseEvent> call = mApi.getAllsoftware();
        call.enqueue(new Callback<ResponseEvent>() {
            @Override
            public void onResponse(Call<ResponseEvent> call, retrofit2.Response<ResponseEvent> response) {

                progressDialog.dismiss();

                aktif = response.body().getResponse().getData();
                recyclerAdapter = new RvAll(MainActivity.this, aktif);
                mRecyclerview.setAdapter(recyclerAdapter);
                Log.d(TAG, "onResponse: " + response);
                Log.d(TAG, "onResponse: " + response.body());
                Log.d(TAG, "onResponse: " + aktif.size());
            }

            @Override
            public void onFailure(Call<ResponseEvent> call, Throwable t) {
                Log.e(TAG, "onFailure: retrofit ga konek"  );
                progressDialog.dismiss();

            }
        });
      /*  call.enqueue(new Callback<ResponseStatus>() {
            @Override
            public void onResponse(Call<ResponseStatus> call, retrofit2.ResponseEvent<ResponseStatus> response) {
                progressDialog.dismiss();
                coba = response.body();

                recyclerAdapter = new RvAll(MainActivity.this, aktif);
                mRecyclerview.setAdapter(recyclerAdapter);
                Log.d(TAG, "onResponse: " + response);
                Log.d(TAG, "onResponse: " + response.body());
                Log.d(TAG, "onResponse: " + aktif.size());
                Log.d(TAG, "onResponse: " + aktif);
            }

            @Override
            public void onFailure(Call<ResponseEvent> call, Throwable t) {

                Log.e(TAG, "onFailure: retrofit ga konek"  );
                progressDialog.dismiss();
            }
        });

*/
    }
}
