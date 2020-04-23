package p073b.p085h.p087b.p088a.p090b.p117g;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: b.h.b.a.b.g.j */
/* compiled from: Internal */
public class C2392j {

    /* renamed from: a */
    public static final byte[] f7311a = new byte[0];

    /* renamed from: b */
    public static final ByteBuffer f7312b = ByteBuffer.wrap(f7311a);

    /* renamed from: b.h.b.a.b.g.j$a */
    /* compiled from: Internal */
    public interface C2393a {
        /* renamed from: a */
        int mo8186a();
    }

    /* renamed from: b.h.b.a.b.g.j$b */
    /* compiled from: Internal */
    public interface C2394b<T extends C2393a> {
        /* renamed from: b */
        T mo8188b(int i);
    }

    /* renamed from: a */
    public static boolean m11979a(byte[] bArr) {
        return C2429y.m12118a(bArr);
    }

    /* renamed from: b */
    public static String m11980b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}
