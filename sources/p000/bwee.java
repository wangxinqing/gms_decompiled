package p000;

/* renamed from: bwee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwee extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwee f158964d;

    /* renamed from: e */
    private static volatile bxxk f158965e;

    /* renamed from: a */
    public int f158966a;

    /* renamed from: b */
    public String f158967b = "";

    /* renamed from: c */
    public int f158968c;

    static {
        bwee bwee = new bwee();
        f158964d = bwee;
        bxvk.m124024a(bwee.class, bwee);
    }

    private bwee() {
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
            return bxvk.m124022a(f158964d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bwec.f158963a});
        } else if (i2 == 3) {
            return new bwee();
        } else {
            if (i2 == 4) {
                return new bxvd(f158964d);
            }
            if (i2 == 5) {
                return f158964d;
            }
            bxxk bxxk = f158965e;
            if (bxxk == null) {
                synchronized (bwee.class) {
                    bxxk = f158965e;
                    if (bxxk == null) {
                        bxxk = new bxve(f158964d);
                        f158965e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}