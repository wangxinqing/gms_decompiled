package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.plus.internal.model.acls.AclsResponse;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;

/* renamed from: anwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AclsResponse[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        String str2 = null;
        AppAclsEntity appAclsEntity = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                str = sed.m35020q(parcel, readInt);
            } else if (a == 2) {
                str2 = sed.m35020q(parcel, readInt);
            } else if (a == 3) {
                appAclsEntity = (AppAclsEntity) sed.m34998a(parcel, readInt, AppAclsEntity.CREATOR);
            } else if (a != 1000) {
                sed.m35002b(parcel, readInt);
            } else {
                i = sed.m35010g(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new AclsResponse(i, str, str2, appAclsEntity);
    }
}