package p000;

/* renamed from: bupu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupu extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bupu f154676a;

    /* renamed from: b */
    private static volatile bxxk f154677b;

    static {
        bupu bupu = new bupu();
        f154676a = bupu;
        bxvk.m124024a(bupu.class, bupu);
    }

    private bupu() {
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
            return bxvk.m124022a(f154676a, "\u0000\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bupu();
        }
        if (i2 == 4) {
            return new bxvd(f154676a);
        }
        if (i2 == 5) {
            return f154676a;
        }
        bxxk bxxk = f154677b;
        if (bxxk == null) {
            synchronized (bupu.class) {
                bxxk = f154677b;
                if (bxxk == null) {
                    bxxk = new bxve(f154676a);
                    f154677b = bxxk;
                }
            }
        }
        return bxxk;
    }
}