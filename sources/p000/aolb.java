package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.sharebox.Circle;

/* renamed from: aolb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aolb implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Circle[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                i2 = sed.m35010g(parcel, readInt);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new Circle(i, str, str2, i2);
    }
}