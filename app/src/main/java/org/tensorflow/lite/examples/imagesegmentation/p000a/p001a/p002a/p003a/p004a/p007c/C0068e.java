package p000a.p001a.p002a.p003a.p004a.p007c;

/* renamed from: a.a.a.a.a.c.e */
/* compiled from: Priority */
public enum C0068e {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    /* renamed from: a */
    static <Y> int m195a(C0074i iVar, Y y) {
        C0068e eVar;
        if (y instanceof C0074i) {
            eVar = ((C0074i) y).getPriority();
        } else {
            eVar = NORMAL;
        }
        return eVar.ordinal() - iVar.getPriority().ordinal();
    }
}
