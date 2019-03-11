
package pl.trawa.currency.currency.dtos;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class CourseListDto {

    @SerializedName("rates")
    private List<Rate> mRates;

    public List<Rate> getRates() {
        return mRates;
    }

    public void setRates(List<Rate> rates) {
        mRates = rates;
    }

}
