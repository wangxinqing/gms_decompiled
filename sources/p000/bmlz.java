package p000;

/* renamed from: bmlz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmlz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bmlz f129993c;

    /* renamed from: d */
    private static volatile bxxk f129994d;

    /* renamed from: a */
    public bxwc f129995a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f129996b = bxxn.f165040b;

    static {
        bmlz bmlz = new bmlz();
        f129993c = bmlz;
        bxvk.m124024a(bmlz.class, bmlz);
    }

    private bmlz() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f129993c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", bmly.class, "b", bmnf.class});
        } else if (i2 == 3) {
            return new bmlz();
        } else {
            if (i2 == 4) {
                return new bxvd(f129993c);
            }
            if (i2 == 5) {
                return f129993c;
            }
            bxxk bxxk = f129994d;
            if (bxxk == null) {
                synchronized (bmlz.class) {
                    bxxk = f129994d;
                    if (bxxk == null) {
                        bxxk = new bxve(f129993c);
                        f129994d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}