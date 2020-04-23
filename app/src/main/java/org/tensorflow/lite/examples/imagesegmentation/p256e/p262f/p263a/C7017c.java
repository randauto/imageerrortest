package p256e.p262f.p263a;

/* renamed from: e.f.a.c */
/* compiled from: Dict */
class C7017c {

    /* renamed from: a */
    C7019d f24905a;

    /* renamed from: b */
    Object f24906b;

    /* renamed from: c */
    C7018a f24907c;

    /* renamed from: e.f.a.c$a */
    /* compiled from: Dict */
    public interface C7018a {
        /* renamed from: a */
        boolean mo22133a(Object obj, Object obj2, Object obj3);
    }

    private C7017c() {
    }

    /* renamed from: a */
    static C7017c m36851a(Object obj, C7018a aVar) {
        C7017c cVar = new C7017c();
        cVar.f24905a = new C7019d();
        cVar.f24905a.f24908a = null;
        cVar.f24905a.f24909b = cVar.f24905a;
        cVar.f24905a.f24910c = cVar.f24905a;
        cVar.f24906b = obj;
        cVar.f24907c = aVar;
        return cVar;
    }

    /* renamed from: a */
    static void m36855a(C7017c cVar) {
        cVar.f24905a = null;
        cVar.f24906b = null;
        cVar.f24907c = null;
    }

    /* renamed from: a */
    static C7019d m36853a(C7017c cVar, Object obj) {
        return m36852a(cVar, cVar.f24905a, obj);
    }

    /* renamed from: a */
    static C7019d m36852a(C7017c cVar, C7019d dVar, Object obj) {
        do {
            dVar = dVar.f24910c;
            if (dVar.f24908a == null) {
                break;
            }
        } while (!cVar.f24907c.mo22133a(cVar.f24906b, dVar.f24908a, obj));
        C7019d dVar2 = new C7019d();
        dVar2.f24908a = obj;
        dVar2.f24909b = dVar.f24909b;
        dVar.f24909b.f24910c = dVar2;
        dVar2.f24910c = dVar;
        dVar.f24909b = dVar2;
        return dVar2;
    }

    /* renamed from: a */
    static Object m36854a(C7019d dVar) {
        return dVar.f24908a;
    }

    /* renamed from: b */
    static C7019d m36859b(C7019d dVar) {
        return dVar.f24909b;
    }

    /* renamed from: c */
    static C7019d m36860c(C7019d dVar) {
        return dVar.f24910c;
    }

    /* renamed from: b */
    static C7019d m36857b(C7017c cVar) {
        return cVar.f24905a.f24909b;
    }

    /* renamed from: a */
    static void m36856a(C7017c cVar, C7019d dVar) {
        dVar.f24909b.f24910c = dVar.f24910c;
        dVar.f24910c.f24909b = dVar.f24909b;
    }

    /* renamed from: b */
    static C7019d m36858b(C7017c cVar, Object obj) {
        C7019d dVar = cVar.f24905a;
        do {
            dVar = dVar.f24909b;
            if (dVar.f24908a == null) {
                break;
            }
        } while (!cVar.f24907c.mo22133a(cVar.f24906b, obj, dVar.f24908a));
        return dVar;
    }
}
