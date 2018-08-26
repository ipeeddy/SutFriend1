package masterung.androidthai.in.th.sutfriend;


import android.os.Parcel;
import android.os.Parcelable;

public class UsetSutModel implements Parcelable{

    private String nameString, urlAvataString;

    public UsetSutModel() {

    } // Constructor getter เรียกตัวบนจะส่งค่าให้เลย

    public UsetSutModel(String nameString, String urlAvataString) {
        this.nameString = nameString;
        this.urlAvataString = urlAvataString;
    } // Constructor setter เรียกตัวล่างจะส่งให้แต่ต้องโยนค่าเข้ามา

    protected UsetSutModel(Parcel in) {
        nameString = in.readString();
        urlAvataString = in.readString();
    }

    public static final Creator<UsetSutModel> CREATOR = new Creator<UsetSutModel>() {
        @Override
        public UsetSutModel createFromParcel(Parcel in) {
            return new UsetSutModel(in);
        }

        @Override
        public UsetSutModel[] newArray(int size) {
            return new UsetSutModel[size];
        }
    };

    public String getNameString() {
        return nameString;
    }

    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    public String getUrlAvataString() {
        return urlAvataString;
    }

    public void setUrlAvataString(String urlAvataString) {
        this.urlAvataString = urlAvataString;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nameString);
        parcel.writeString(urlAvataString);
    }
} //Main Class
