package p073b.p143j;

import p073b.C3218m;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo10386c = {"Lkotlin/text/ScreenFloatValueRegEx;", "", "()V", "value", "Lkotlin/text/Regex;", "kotlin-stdlib"})
/* renamed from: b.j.l */
/* compiled from: StringNumberConversionsJVM.kt */
final class C3198l {

    /* renamed from: a */
    public static final C3193j f8617a;

    /* renamed from: b */
    public static final C3198l f8618b = new C3198l();

    static {
        String str = "(\\p{Digit}+)";
        String str2 = "(\\p{XDigit}+)";
        StringBuilder sb = new StringBuilder();
        sb.append("[eE][+-]?");
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("(0[xX]");
        sb3.append(str2);
        sb3.append("(\\.)?)|");
        sb3.append("(0[xX]");
        sb3.append(str2);
        sb3.append("?(\\.)");
        sb3.append(str2);
        sb3.append(')');
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append('(');
        sb5.append(str);
        sb5.append("(\\.)?(");
        sb5.append(str);
        sb5.append("?)(");
        sb5.append(sb2);
        sb5.append(")?)|");
        sb5.append("(\\.(");
        sb5.append(str);
        sb5.append(")(");
        sb5.append(sb2);
        sb5.append(")?)|");
        sb5.append("((");
        sb5.append(sb4);
        sb5.append(")[pP][+-]?");
        sb5.append(str);
        sb5.append(')');
        String sb6 = sb5.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("[\\x00-\\x20]*[+-]?(NaN|Infinity|((");
        sb7.append(sb6);
        sb7.append(")[fFdD]?))[\\x00-\\x20]*");
        f8617a = new C3193j(sb7.toString());
    }

    private C3198l() {
    }
}
