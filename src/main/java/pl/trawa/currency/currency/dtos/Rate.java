
package pl.trawa.currency.currency.dtos;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Rate {

    @SerializedName("effectiveDate")
    private String mEffectiveDate;
    @SerializedName("mid")
    private Double mMid;
    @SerializedName("no")
    private String mNo;

    public String getEffectiveDate() {
        return mEffectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        mEffectiveDate = effectiveDate;
    }

    public Double getMid() {
        return mMid;
    }

    public void setMid(Double mid) {
        mMid = mid;
    }

    public String getNo() {
        return mNo;
    }

    public void setNo(String no) {
        mNo = no;
    }

}
