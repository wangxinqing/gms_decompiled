package p000;

/* renamed from: bvls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvls extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bvls f156593d;

    /* renamed from: e */
    private static volatile bxxk f156594e;

    /* renamed from: a */
    public int f156595a;

    /* renamed from: b */
    public bvov f156596b;

    /* renamed from: c */
    public int f156597c;

    static {
        bvls bvls = new bvls();
        f156593d = bvls;
        bxvk.m124024a(bvls.class, bvls);
    }

    private bvls() {
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
            return bxvk.m124022a(f156593d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", bvkz.m121222b()});
        } else if (i2 == 3) {
            return new bvls();
        } else {
            if (i2 == 4) {
                return new bxvd(f156593d);
            }
            if (i2 == 5) {
                return f156593d;
            }
            bxxk bxxk = f156594e;
            if (bxxk == null) {
                synchronized (bvls.class) {
                    bxxk = f156594e;
                    if (bxxk == null) {
                        bxxk = new bxve(f156593d);
                        f156594e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}