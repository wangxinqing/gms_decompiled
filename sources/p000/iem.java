package p000;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.util.EntityUtils;

/* renamed from: iem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iem {

    /* renamed from: a */
    public static final sek f20798a = new sek("GLSUser", "AppCertManager");

    /* renamed from: b */
    static final Charset f20799b = Charset.forName("UTF-8");

    /* renamed from: i */
    private static WeakReference f20800i = new WeakReference(null);

    /* renamed from: c */
    public final ilq f20801c;

    /* renamed from: d */
    public final ien f20802d;

    /* renamed from: e */
    public final Object f20803e = new Object();

    /* renamed from: f */
    private final SecureRandom f20804f = new SecureRandom();

    /* renamed from: g */
    private boolean f20805g = false;

    /* renamed from: h */
    private long f20806h = 0;

    public iem(ilq ilq, ien ien) {
        sdo.m34959a(ilq);
        this.f20801c = ilq;
        sdo.m34959a(ien);
        this.f20802d = ien;
    }

    /* renamed from: a */
    public static synchronized iem m15329a(Context context) {
        iem iem;
        synchronized (iem.class) {
            iem = (iem) f20800i.get();
            if (iem == null) {
                iem = new iem(new ilq(context), ien.m15332a(context));
                f20800i = new WeakReference(iem);
            }
        }
        return iem;
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ec A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01f2 A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01fd A[SYNTHETIC, Splitter:B:98:0x01fd] */
    /* renamed from: a */
    public final boolean mo12955a() {
        String str;
        FileOutputStream openFileOutput;
        if (!gnv.m13498H()) {
            f20798a.mo25409a("DeviceKey is turned off", new Object[0]);
            return false;
        }
        synchronized (this.f20803e) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f20806h >= gnv.m13580y() * 1000) {
                this.f20806h = elapsedRealtime;
                long nextLong = this.f20804f.nextLong();
                long a = spn.m35843a(this.f20801c.f21306a);
                HashMap a2 = bnmt.m109794a();
                a2.put("dg_androidId", Long.toHexString(a));
                a2.put("dg_session", Long.toHexString(nextLong));
                a2.put("dg_gmsCoreVersion", "201515033");
                a2.put("dg_sdkVersion", String.valueOf(Build.VERSION.SDK_INT));
                String a3 = glq.m13399a(this.f20801c.f21306a, "devicekey", a2);
                try {
                    bxvd da = bzxc.f171723g.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzxc bzxc = (bzxc) da.f164949b;
                    int i = bzxc.f171725a | 2;
                    bzxc.f171725a = i;
                    bzxc.f171727c = a;
                    int i2 = i | 4;
                    bzxc.f171725a = i2;
                    bzxc.f171728d = nextLong;
                    if (a3 != null) {
                        a3.getClass();
                        bzxc.f171725a = i2 | 1;
                        bzxc.f171726b = a3;
                    }
                    HttpEntity httpEntity = null;
                    try {
                        str = addi.m50206a(this.f20801c.f21306a).mo33343a(gnv.m13501K(), gnv.m13502L());
                    } catch (IOException e) {
                        f20798a.mo25415d("Failed to get security token.", e, new Object[0]);
                        str = null;
                    }
                    if (str != null) {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bzxc bzxc2 = (bzxc) da.f164949b;
                        str.getClass();
                        bzxc2.f171725a |= 32;
                        bzxc2.f171730f = str;
                    }
                    bxvd da2 = bzxi.f171753d.mo74144da();
                    int i3 = Build.VERSION.SDK_INT;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bzxi bzxi = (bzxi) da2.f164949b;
                    int i4 = bzxi.f171755a | 1;
                    bzxi.f171755a = i4;
                    bzxi.f171756b = i3;
                    bzxi.f171755a = i4 | 2;
                    bzxi.f171757c = 201515033;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzxc bzxc3 = (bzxc) da.f164949b;
                    bzxi bzxi2 = (bzxi) da2.mo74062i();
                    bzxi2.getClass();
                    bzxc3.f171729e = bzxi2;
                    bzxc3.f171725a |= 8;
                    ByteArrayEntity byteArrayEntity = new ByteArrayEntity(((bzxc) da.mo74062i()).mo73642k());
                    byteArrayEntity.setContentType("application/octet-stream");
                    HttpResponse a4 = gmv.m13464a(String.valueOf(gnv.m13522aD()).concat("/devicekey"), this.f20801c.mo13123a().f10841e, byteArrayEntity, this.f20801c.f21306a);
                    try {
                        httpEntity = a4.getEntity();
                        try {
                            if (a4.getStatusLine() == null || a4.getStatusLine().getStatusCode() != 200) {
                                throw new IOException("Invalid device key response.");
                            }
                            byte[] byteArray = EntityUtils.toByteArray(httpEntity);
                            if (httpEntity != null) {
                                if (httpEntity.getContent() != null) {
                                    httpEntity.getContent().close();
                                }
                            }
                            bzxb bzxb = (bzxb) bxvk.m124016a(bzxb.f171716f, byteArray, bxus.m123744c());
                            try {
                                ien ien = this.f20802d;
                                ien.f20807a.mo25409a("Storing device key...", new Object[0]);
                                Lock writeLock = ien.f20809b.writeLock();
                                writeLock.lock();
                                try {
                                    openFileOutput = ien.f20810c.openFileOutput("device_key", 0);
                                    ien.f20811d = bzxb;
                                    bzxb.mo73638a(openFileOutput);
                                    openFileOutput.close();
                                    writeLock.unlock();
                                    this.f20805g = true;
                                    return true;
                                } catch (FileNotFoundException e2) {
                                    throw new IOException("File could not be created to store device key.", e2);
                                } catch (Throwable th) {
                                    writeLock.unlock();
                                    throw th;
                                }
                            } catch (IOException e3) {
                                f20798a.mo25415d("Error storing key: ", e3, new Object[0]);
                                this.f20805g = false;
                                return false;
                            }
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            try {
                                String valueOf = String.valueOf(e.toString());
                                throw new IOException(valueOf.length() != 0 ? new String("IllegalArgumentException while parsing entity: ") : "IllegalArgumentException while parsing entity: ".concat(valueOf));
                            } catch (Throwable th2) {
                                th = th2;
                                if (httpEntity != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (httpEntity != null) {
                            }
                            throw th;
                        }
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        String valueOf2 = String.valueOf(e.toString());
                        throw new IOException(valueOf2.length() != 0 ? new String("IllegalArgumentException while parsing entity: ") : "IllegalArgumentException while parsing entity: ".concat(valueOf2));
                    } catch (Throwable th4) {
                        th = th4;
                        if (httpEntity != null) {
                            if (httpEntity.getContent() != null) {
                                httpEntity.getContent().close();
                            }
                        }
                        throw th;
                    }
                } catch (IOException e6) {
                    f20798a.mo25415d("IOException while requesting key: ", e6, new Object[0]);
                }
            } else {
                boolean z = this.f20805g;
                return z;
            }
        }
    }

    /* renamed from: a */
    public final byte[] mo12956a(bzxb bzxb, String str) {
        Mac c = spn.m35871c("HMACSHA256");
        if (c != null) {
            try {
                c.init(new SecretKeySpec(bzxb.f171721d.mo73780k(), "HMACSHA256"));
                return c.doFinal(str.getBytes(f20799b));
            } catch (InvalidKeyException e) {
                f20798a.mo25418e("Invalid key.", new Object[0]);
                throw new IOException("Invalid key.", e);
            }
        } else {
            f20798a.mo25418e("Failed to get Mac.", new Object[0]);
            throw new IOException("Failed to get Mac.");
        }
    }
}