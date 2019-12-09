package dkis.egov.software;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IniInterface {
@GET("api/swall.php")
    Call <ResponseEvent> getAllsoftware();
}
