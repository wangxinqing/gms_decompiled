package p000;

/* renamed from: afbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afbh extends bxvk implements bxxd {

    /* renamed from: a */
    public static final afbh f64135a;

    /* renamed from: b */
    private static volatile bxxk f64136b;

    static {
        afbh afbh = new afbh();
        f64135a = afbh;
        bxvk.m124024a(afbh.class, afbh);
    }

    private afbh() {
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
            return bxvk.m124022a(f64135a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new afbh();
        }
        if (i2 == 4) {
            return new bxvd(f64135a);
        }
        if (i2 == 5) {
            return f64135a;
        }
        bxxk bxxk = f64136b;
        if (bxxk == null) {
            synchronized (afbh.class) {
                bxxk = f64136b;
                if (bxxk == null) {
                    bxxk = new bxve(f64135a);
                    f64136b = bxxk;
                }
            }
        }
        return bxxk;
    }
}