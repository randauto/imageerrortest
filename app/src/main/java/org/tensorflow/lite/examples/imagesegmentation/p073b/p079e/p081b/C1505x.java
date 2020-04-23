package p073b.p079e.p081b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: b.e.b.x */
/* compiled from: SpreadBuilder */
public class C1505x {

    /* renamed from: a */
    private final ArrayList<Object> f4872a;

    public C1505x(int i) {
        this.f4872a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void mo6966a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    this.f4872a.ensureCapacity(this.f4872a.size() + objArr.length);
                    for (Object add : objArr) {
                        this.f4872a.add(add);
                    }
                }
            } else if (obj instanceof Collection) {
                this.f4872a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add2 : (Iterable) obj) {
                    this.f4872a.add(add2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f4872a.add(it.next());
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Don't know how to spread ");
                sb.append(obj.getClass());
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public int mo6965a() {
        return this.f4872a.size();
    }

    /* renamed from: b */
    public void mo6968b(Object obj) {
        this.f4872a.add(obj);
    }

    /* renamed from: a */
    public Object[] mo6967a(Object[] objArr) {
        return this.f4872a.toArray(objArr);
    }
}
