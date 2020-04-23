package p073b.p085h.p087b.p088a.p090b.p112e.p113a;

import java.util.LinkedList;
import java.util.List;
import p073b.C3225s;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2264w;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2264w.C2267b;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2264w.C2267b.C2270b;
import p073b.p085h.p087b.p088a.p090b.p112e.C2158a.C2274y;

/* renamed from: b.h.b.a.b.e.a.d */
/* compiled from: NameResolverImpl.kt */
public final class C2286d implements C2285c {

    /* renamed from: a */
    private final C2274y f7033a;

    /* renamed from: b */
    private final C2264w f7034b;

    public C2286d(C2274y yVar, C2264w wVar) {
        C1489j.m6972b(yVar, "strings");
        C1489j.m6972b(wVar, "qualifiedNames");
        this.f7033a = yVar;
        this.f7034b = wVar;
    }

    /* renamed from: a */
    public String mo8811a(int i) {
        String a = this.f7033a.mo8790a(i);
        C1489j.m6969a((Object) a, "strings.getString(index)");
        return a;
    }

    /* renamed from: b */
    public String mo8812b(int i) {
        C3225s d = m11193d(i);
        List list = (List) d.mo10399b();
        String a = C1415k.m6859a((List) d.mo10400c(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C1415k.m6859a(list, "/", null, null, 0, null, null, 62, null));
        sb.append('/');
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: c */
    public boolean mo8813c(int i) {
        return ((Boolean) m11193d(i).mo10398a()).booleanValue();
    }

    /* renamed from: d */
    private final C3225s<List<String>, List<String>, Boolean> m11193d(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C2267b a = this.f7034b.mo8755a(i);
            C2274y yVar = this.f7033a;
            C1489j.m6969a((Object) a, "proto");
            String a2 = yVar.mo8790a(a.mo8773g());
            C2270b k = a.mo8775k();
            if (k == null) {
                C1489j.m6968a();
            }
            switch (C2287e.f7035a[k.ordinal()]) {
                case 1:
                    linkedList2.addFirst(a2);
                    break;
                case 2:
                    linkedList.addFirst(a2);
                    break;
                case 3:
                    linkedList2.addFirst(a2);
                    z = true;
                    break;
            }
            i = a.mo8771e();
        }
        return new C3225s<>(linkedList, linkedList2, Boolean.valueOf(z));
    }
}
