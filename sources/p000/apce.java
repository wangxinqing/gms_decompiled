package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.romanesco.protomodel.RestoreInfoEntity;

/* renamed from: apce */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apce implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RestoreInfoEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        Long l = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 2) {
                str = sed.m35020q(parcel, readInt);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                l = sed.m35013j(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new RestoreInfoEntity(str, l);
    }
}