package p000;

/* renamed from: bvqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvqt extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bvqt f157408a;

    /* renamed from: b */
    private static volatile bxxk f157409b;

    static {
        bvqt bvqt = new bvqt();
        f157408a = bvqt;
        bxvk.m124024a(bvqt.class, bvqt);
    }

    private bvqt() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f157408a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bvqt();
        }
        if (i2 == 4) {
            return new bxvd(f157408a);
        }
        if (i2 == 5) {
            return f157408a;
        }
        bxxk bxxk = f157409b;
        if (bxxk == null) {
            synchronized (bvqt.class) {
                bxxk = f157409b;
                if (bxxk == null) {
                    bxxk = new bxve(f157408a);
                    f157409b = bxxk;
                }
            }
        }
        return bxxk;
    }
}