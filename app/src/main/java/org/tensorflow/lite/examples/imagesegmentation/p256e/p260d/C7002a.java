package p256e.p260d;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: e.d.a */
/* compiled from: JSONArray */
public class C7002a {

    /* renamed from: a */
    private final ArrayList<Object> f24841a;

    public C7002a() {
        this.f24841a = new ArrayList<>();
    }

    protected C7002a(Object obj) {
        this();
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                mo22086a(C7003b.m36816b(Array.get(obj, i)));
            }
            return;
        }
        throw new RuntimeException("JSONArray initial value should be a string or collection or array.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C7002a mo22086a(Object obj) {
        this.f24841a.add(obj);
        return this;
    }

    /* renamed from: a */
    public int mo22085a() {
        return this.f24841a.size();
    }

    public String toString() {
        try {
            return mo22088a(2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo22088a(int i) {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            obj = mo22087a(stringWriter, i, 0).toString();
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Writer mo22087a(Writer writer, int i, int i2) {
        try {
            int a = mo22085a();
            writer.write(91);
            int i3 = 0;
            int i4 = i == -1 ? 0 : i;
            if (a == 1) {
                C7003b.m36810a(writer, this.f24841a.get(0), i, i2);
            } else if (a != 0) {
                int i5 = i4 + i2;
                boolean z = false;
                while (i3 < a) {
                    if (z) {
                        writer.write(44);
                    }
                    if (i != -1) {
                        writer.write(10);
                    }
                    C7003b.m36814a(writer, i5);
                    C7003b.m36810a(writer, this.f24841a.get(i3), i, i5);
                    i3++;
                    z = true;
                }
                if (i != -1) {
                    writer.write(10);
                }
                C7003b.m36814a(writer, i2);
            }
            writer.write(93);
            return writer;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
