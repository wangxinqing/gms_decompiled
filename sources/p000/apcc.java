package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.romanesco.protomodel.PhoneNumberEntity;

/* renamed from: apcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apcc implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new PhoneNumberEntity[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            if (sed.m34995a(readInt) != 2) {
                sed.m35002b(parcel, readInt);
            } else {
                str = sed.m35020q(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new PhoneNumberEntity(str);
    }
}