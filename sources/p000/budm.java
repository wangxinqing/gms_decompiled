package p000;

/* renamed from: budm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class budm extends bxvk implements bxxd {

    /* renamed from: a */
    public static final budm f153488a;

    /* renamed from: b */
    private static volatile bxxk f153489b;

    static {
        budm budm = new budm();
        f153488a = budm;
        bxvk.m124024a(budm.class, budm);
    }

    private budm() {
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
            return bxvk.m124022a(f153488a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new budm();
        }
        if (i2 == 4) {
            return new bxvd(f153488a);
        }
        if (i2 == 5) {
            return f153488a;
        }
        bxxk bxxk = f153489b;
        if (bxxk == null) {
            synchronized (budm.class) {
                bxxk = f153489b;
                if (bxxk == null) {
                    bxxk = new bxve(f153488a);
                    f153489b = bxxk;
                }
            }
        }
        return bxxk;
    }
}