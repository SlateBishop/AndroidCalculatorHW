package ru.geekbrains.makulin.mycalculator;

import android.os.Parcel;
import android.os.Parcelable;

public class Calculator implements Parcelable {
    private String resultView = "0";
    private String userActionsText = "";
    private Double result = 0.0;

    public Calculator() {

    }

//    public void plusAction(double input) {
//        result += input;
    }


    public String getResultView() {
        return resultView;
    }

    public String getUserActionsText() {
        return userActionsText;
    }

    public Double getResult() {
        return result;
    }

    public void setResultView(String resultView) {
        this.resultView = resultView;
    }

    public void setUserActionsText(String userActionsText) {
        this.userActionsText = userActionsText;
    }


    //Parcelable implementation

    protected Calculator(Parcel in) {
        resultView = in.readString();
        userActionsText = in.readString();
        if (in.readByte() == 0) {
            result = null;
        } else {
            result = in.readDouble();
        }
    }

    public static final Creator<Calculator> CREATOR = new Creator<Calculator>() {
        @Override
        public Calculator createFromParcel(Parcel in) {
            return new Calculator(in);
        }

        @Override
        public Calculator[] newArray(int size) {
            return new Calculator[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(resultView);
        dest.writeString(userActionsText);
        if (result == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(result);
        }
    }
}
