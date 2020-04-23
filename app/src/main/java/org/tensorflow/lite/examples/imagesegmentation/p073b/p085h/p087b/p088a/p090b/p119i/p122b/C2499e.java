package p073b.p085h.p087b.p088a.p090b.p119i.p122b;

import java.util.Arrays;
import p073b.p079e.p081b.C1489j;
import p073b.p085h.p087b.p088a.p090b.p094b.C1821y;
import p073b.p085h.p087b.p088a.p090b.p131l.C2755ad;

/* renamed from: b.h.b.a.b.i.b.e */
/* compiled from: constantValues.kt */
public final class C2499e extends C2511m<Character> {
    public C2499e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: b */
    public C2755ad mo9516a(C1821y yVar) {
        C1489j.m6972b(yVar, "module");
        return yVar.mo7522a().mo7179B();
    }

    public String toString() {
        Object[] objArr = {Integer.valueOf(((Character) mo9521a()).charValue()), m12527a(((Character) mo9521a()).charValue())};
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, objArr.length));
        C1489j.m6969a((Object) format, "java.lang.String.format(this, *args)");
        return format;
    }

    /* renamed from: a */
    private final String m12527a(char c) {
        switch (c) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            case 12:
                return "\\f";
            case 13:
                return "\\r";
            default:
                String ch = m12528b(c) ? Character.toString(c) : "?";
                C1489j.m6969a((Object) ch, "if (isPrintableUnicode(c…cter.toString(c) else \"?\"");
                return ch;
        }
    }

    /* renamed from: b */
    private final boolean m12528b(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }
}
