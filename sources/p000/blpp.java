package p000;

/* renamed from: blpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blpp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final blpp f127268c;

    /* renamed from: e */
    private static volatile bxxk f127269e;

    /* renamed from: a */
    public blox f127270a;

    /* renamed from: b */
    public blrw f127271b;

    /* renamed from: d */
    private int f127272d;

    static {
        blpp blpp = new blpp();
        f127268c = blpp;
        bxvk.m124024a(blpp.class, blpp);
    }

    private blpp() {
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
            return bxvk.m124022a(f127268c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new blpp();
        } else {
            if (i2 == 4) {
                return new bxvd(f127268c);
            }
            if (i2 == 5) {
                return f127268c;
            }
            bxxk bxxk = f127269e;
            if (bxxk == null) {
                synchronized (blpp.class) {
                    bxxk = f127269e;
                    if (bxxk == null) {
                        bxxk = new bxve(f127268c);
                        f127269e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}