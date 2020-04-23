package p073b.p143j;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import p073b.C3218m;
import p073b.p074a.C1384a;
import p073b.p074a.C1399b;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p084g.C1515c;
import p073b.p142i.C3161i;
import p073b.p143j.C3186h.C3187a;
import p073b.p143j.C3186h.C3188b;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, mo10386c = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "kotlin.jvm.PlatformType", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"})
/* renamed from: b.j.i */
/* compiled from: Regex.kt */
final class C3189i implements C3186h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MatchResult f8604a = this.f8607d.toMatchResult();

    /* renamed from: b */
    private final C3184f f8605b = new C3191b(this);

    /* renamed from: c */
    private List<String> f8606c;

    /* renamed from: d */
    private final Matcher f8607d;

    /* renamed from: e */
    private final CharSequence f8608e;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo10386c = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"})
    /* renamed from: b.j.i$a */
    /* compiled from: Regex.kt */
    public static final class C3190a extends C1399b<String> {

        /* renamed from: b */
        final /* synthetic */ C3189i f8609b;

        C3190a(C3189i iVar) {
            this.f8609b = iVar;
        }

        /* renamed from: a */
        public int mo10368a(String str) {
            return super.indexOf(str);
        }

        /* renamed from: b */
        public int mo10370b(String str) {
            return super.lastIndexOf(str);
        }

        /* renamed from: c */
        public boolean mo10371c(String str) {
            return super.contains(str);
        }

        public final boolean contains(Object obj) {
            if (obj instanceof String) {
                return mo10371c((String) obj);
            }
            return false;
        }

        public final int indexOf(Object obj) {
            if (obj instanceof String) {
                return mo10368a((String) obj);
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return mo10370b((String) obj);
            }
            return -1;
        }

        /* renamed from: a */
        public int mo6742a() {
            return this.f8609b.f8604a.groupCount() + 1;
        }

        /* renamed from: a */
        public String get(int i) {
            String group = this.f8609b.f8604a.group(i);
            return group != null ? group : "";
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo10386c = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"})
    /* renamed from: b.j.i$b */
    /* compiled from: Regex.kt */
    public static final class C3191b extends C1384a<C3183e> implements C3185g {

        /* renamed from: a */
        final /* synthetic */ C3189i f8610a;

        @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"})
        /* renamed from: b.j.i$b$a */
        /* compiled from: Regex.kt */
        static final class C3192a extends C1490k implements C1450b<Integer, C3183e> {

            /* renamed from: a */
            final /* synthetic */ C3191b f8611a;

            C3192a(C3191b bVar) {
                this.f8611a = bVar;
                super(1);
            }

            /* renamed from: a */
            public /* synthetic */ Object mo6756a(Object obj) {
                return mo10375a(((Number) obj).intValue());
            }

            /* renamed from: a */
            public final C3183e mo10375a(int i) {
                return this.f8611a.mo10372a(i);
            }
        }

        public boolean isEmpty() {
            return false;
        }

        C3191b(C3189i iVar) {
            this.f8610a = iVar;
        }

        /* renamed from: a */
        public boolean mo10373a(C3183e eVar) {
            return super.contains(eVar);
        }

        public final boolean contains(Object obj) {
            if (obj != null ? obj instanceof C3183e : true) {
                return mo10373a((C3183e) obj);
            }
            return false;
        }

        /* renamed from: a */
        public int mo6742a() {
            return this.f8610a.f8604a.groupCount() + 1;
        }

        public Iterator<C3183e> iterator() {
            return C3161i.m14688e(C1415k.m6899q(C1415k.m6835a((Collection<?>) this)), new C3192a(this)).mo6822a();
        }

        /* renamed from: a */
        public C3183e mo10372a(int i) {
            MatchResult a = this.f8610a.f8604a;
            C1489j.m6969a((Object) a, "matchResult");
            C1515c a2 = C3197k.m14740b(a, i);
            if (a2.mo6984f().intValue() < 0) {
                return null;
            }
            String group = this.f8610a.f8604a.group(i);
            C1489j.m6969a((Object) group, "matchResult.group(index)");
            return new C3183e(group, a2);
        }
    }

    public C3189i(Matcher matcher, CharSequence charSequence) {
        C1489j.m6972b(matcher, "matcher");
        C1489j.m6972b(charSequence, "input");
        this.f8607d = matcher;
        this.f8608e = charSequence;
    }

    /* renamed from: b */
    public C3188b mo10366b() {
        return C3187a.m14720a(this);
    }

    /* renamed from: a */
    public List<String> mo10365a() {
        if (this.f8606c == null) {
            this.f8606c = new C3190a(this);
        }
        List<String> list = this.f8606c;
        if (list == null) {
            C1489j.m6968a();
        }
        return list;
    }
}
