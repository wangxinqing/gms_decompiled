package p000;

/* renamed from: birb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class birb extends bxvk implements bxxd {

    /* renamed from: c */
    public static final birb f121375c;

    /* renamed from: d */
    private static volatile bxxk f121376d;

    /* renamed from: a */
    public int f121377a;

    /* renamed from: b */
    public int f121378b = 1;

    static {
        birb birb = new birb();
        f121375c = birb;
        bxvk.m124024a(birb.class, birb);
    }

    private birb() {
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
            return bxvk.m124022a(f121375c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", biqh.m102725b()});
        } else if (i2 == 3) {
            return new birb();
        } else {
            if (i2 == 4) {
                return new bxvd(f121375c);
            }
            if (i2 == 5) {
                return f121375c;
            }
            bxxk bxxk = f121376d;
            if (bxxk == null) {
                synchronized (birb.class) {
                    bxxk = f121376d;
                    if (bxxk == null) {
                        bxxk = new bxve(f121375c);
                        f121376d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}