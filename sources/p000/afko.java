package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.FootprintsRecordingSetting;

/* renamed from: afko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afko implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FootprintsRecordingSetting[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                i = sed.m35010g(parcel, readInt);
            } else if (a == 2) {
                z = sed.m35006c(parcel, readInt);
            } else if (a == 3) {
                z2 = sed.m35006c(parcel, readInt);
            } else if (a != 4) {
                sed.m35002b(parcel, readInt);
            } else {
                j = sed.m35012i(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new FootprintsRecordingSetting(i, z, z2, j);
    }
}