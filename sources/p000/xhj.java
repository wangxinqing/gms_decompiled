package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;

/* renamed from: xhj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xhj implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Transport[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return Transport.m23428a(parcel.readString());
        } catch (xhk e) {
            throw new RuntimeException(e);
        }
    }
}