package p000;

/* renamed from: cbmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbmp f177663b;

    /* renamed from: c */
    private static volatile bxxk f177664c;

    /* renamed from: a */
    public bxtx f177665a = bxtx.f164797b;

    static {
        cbmp cbmp = new cbmp();
        f177663b = cbmp;
        bxvk.m124024a(cbmp.class, cbmp);
    }

    private cbmp() {
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
            return bxvk.m124022a(f177663b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbmp();
        } else {
            if (i2 == 4) {
                return new bxvd(f177663b);
            }
            if (i2 == 5) {
                return f177663b;
            }
            bxxk bxxk = f177664c;
            if (bxxk == null) {
                synchronized (cbmp.class) {
                    bxxk = f177664c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177663b);
                        f177664c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}