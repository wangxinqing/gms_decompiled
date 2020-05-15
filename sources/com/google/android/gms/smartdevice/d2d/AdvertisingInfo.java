package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AdvertisingInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aqxs();

    /* renamed from: a */
    public String f107793a;

    /* renamed from: b */
    public String f107794b;

    /* renamed from: c */
    public String f107795c;

    /* renamed from: d */
    public String f107796d;

    public AdvertisingInfo(String str, String str2, String str3, String str4) {
        this.f107793a = str;
        this.f107794b = str2;
        this.f107795c = str3;
        this.f107796d = str4;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: see.a(android.os.Parcel, int, java.lang.String, boolean):void
     arg types: [android.os.Parcel, int, java.lang.String, int]
     candidates:
      see.a(android.os.Parcel, int, android.os.Bundle, boolean):void
      see.a(android.os.Parcel, int, android.os.Parcel, boolean):void
      see.a(android.os.Parcel, int, java.math.BigDecimal, boolean):void
      see.a(android.os.Parcel, int, java.util.List, boolean):void
      see.a(android.os.Parcel, int, byte[], boolean):void
      see.a(android.os.Parcel, int, double[], boolean):void
      see.a(android.os.Parcel, int, float[], boolean):void
      see.a(android.os.Parcel, int, int[], boolean):void
      see.a(android.os.Parcel, int, long[], boolean):void
      see.a(android.os.Parcel, int, android.os.Parcelable[], int):void
      see.a(android.os.Parcel, int, java.lang.String[], boolean):void
      see.a(android.os.Parcel, int, boolean[], boolean):void
      see.a(android.os.Parcel, int, java.lang.String, boolean):void */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35046a(parcel, 2, this.f107793a, false);
        see.m35046a(parcel, 3, this.f107794b, false);
        see.m35046a(parcel, 4, this.f107795c, false);
        see.m35046a(parcel, 5, this.f107796d, false);
        see.m35062b(parcel, a);
    }
}