package p000;

/* renamed from: caar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caar extends bxvk implements bxxd {

    /* renamed from: c */
    public static final caar f172365c;

    /* renamed from: d */
    private static volatile bxxk f172366d;

    /* renamed from: a */
    public int f172367a;

    /* renamed from: b */
    public double f172368b;

    static {
        caar caar = new caar();
        f172365c = caar;
        bxvk.m124024a(caar.class, caar);
    }

    private caar() {
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
            return bxvk.m124022a(f172365c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new caar();
        } else {
            if (i2 == 4) {
                return new bxvd(f172365c);
            }
            if (i2 == 5) {
                return f172365c;
            }
            bxxk bxxk = f172366d;
            if (bxxk == null) {
                synchronized (caar.class) {
                    bxxk = f172366d;
                    if (bxxk == null) {
                        bxxk = new bxve(f172365c);
                        f172366d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}