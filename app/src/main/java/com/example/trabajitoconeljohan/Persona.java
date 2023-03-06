package com.example.trabajitoconeljohan;

import android.os.Parcel;
import android.os.Parcelable;

public class Persona implements Parcelable{
    private String correo;
    private String codigo;

    public Persona(String correo, String codigo) {
        this.correo = correo;
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCodigo() {
        return codigo;
    }
    protected Persona(Parcel in) {
        correo = in.readString();
        codigo = in.readString();
    }

    public static final Parcelable.Creator<Persona> CREATOR = new Parcelable.Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(correo);
        dest.writeString(codigo);
    }
}

