package p256e.p260d;

import java.util.Iterator;
import p256e.p259c.C6982a;

/* renamed from: e.d.c */
/* compiled from: StringList */
public class C7006c implements Iterable<String> {

    /* renamed from: a */
    int f24845a;

    /* renamed from: b */
    String[] f24846b;

    public C7006c() {
        this(10);
    }

    public C7006c(int i) {
        this.f24846b = new String[i];
    }

    public C7006c(Object... objArr) {
        this.f24845a = objArr.length;
        this.f24846b = new String[this.f24845a];
        int i = 0;
        for (Object obj : objArr) {
            if (obj != null) {
                this.f24846b[i] = obj.toString();
            }
            i++;
        }
    }

    /* renamed from: a */
    public int mo22099a() {
        return this.f24845a;
    }

    /* renamed from: a */
    public String mo22100a(int i) {
        if (i < 0 || i >= this.f24845a) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        String str = this.f24846b[i];
        while (i < this.f24845a - 1) {
            int i2 = i + 1;
            this.f24846b[i] = this.f24846b[i2];
            i = i2;
        }
        this.f24845a--;
        return str;
    }

    /* renamed from: a */
    public void mo22101a(String str) {
        if (this.f24845a == this.f24846b.length) {
            this.f24846b = C6982a.m36411a(this.f24846b);
        }
        String[] strArr = this.f24846b;
        int i = this.f24845a;
        this.f24845a = i + 1;
        strArr[i] = str;
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {

            /* renamed from: a */
            int f24847a = -1;

            public void remove() {
                C7006c.this.mo22100a(this.f24847a);
                this.f24847a--;
            }

            /* renamed from: a */
            public String next() {
                String[] strArr = C7006c.this.f24846b;
                int i = this.f24847a + 1;
                this.f24847a = i;
                return strArr[i];
            }

            public boolean hasNext() {
                return this.f24847a + 1 < C7006c.this.f24845a;
            }
        };
    }

    /* renamed from: b */
    public String mo22103b(String str) {
        if (this.f24845a == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f24846b[0]);
        for (int i = 1; i < this.f24845a; i++) {
            sb.append(str);
            sb.append(this.f24846b[i]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public String mo22102b() {
        C7006c cVar = new C7006c();
        Iterator it = iterator();
        while (it.hasNext()) {
            cVar.mo22101a(C7003b.m36813a((String) it.next()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        sb.append(cVar.mo22103b(", "));
        sb.append(" ]");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" size=");
        sb.append(mo22099a());
        sb.append(" ");
        sb.append(mo22102b());
        return sb.toString();
    }
}
