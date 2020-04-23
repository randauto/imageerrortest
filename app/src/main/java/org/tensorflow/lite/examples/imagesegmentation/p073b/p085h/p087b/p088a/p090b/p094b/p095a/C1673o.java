package p073b.p085h.p087b.p088a.p090b.p094b.p095a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p073b.C3221p;
import p073b.C3226t;
import p073b.p074a.C1389ad;
import p073b.p074a.C1406e;
import p073b.p074a.C1415k;
import p073b.p079e.p081b.C1489j;

/* renamed from: b.h.b.a.b.b.a.o */
/* compiled from: KotlinTarget.kt */
public enum C1673o {
    CLASS("class", false, 2, null),
    ANNOTATION_CLASS("annotation class", false, 2, null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, null),
    FIELD("field", false, 2, null),
    LOCAL_VARIABLE("local variable", false, 2, null),
    VALUE_PARAMETER("value parameter", false, 2, null),
    CONSTRUCTOR("constructor", false, 2, null),
    FUNCTION("function", false, 2, null),
    PROPERTY_GETTER("getter", false, 2, null),
    PROPERTY_SETTER("setter", false, 2, null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    

    /* renamed from: P */
    public static final C1674a f5283P = null;

    /* renamed from: T */
    private static final HashMap<String, C1673o> f5285T = null;

    /* renamed from: U */
    private static final Set<C1673o> f5286U = null;

    /* renamed from: V */
    private static final Set<C1673o> f5287V = null;

    /* renamed from: W */
    private static final Map<C1654e, C1673o> f5288W = null;

    /* renamed from: R */
    private final String f5315R;

    /* renamed from: S */
    private final boolean f5316S;

    /* renamed from: b.h.b.a.b.b.a.o$a */
    /* compiled from: KotlinTarget.kt */
    public static final class C1674a {
        private C1674a() {
        }

        public /* synthetic */ C1674a(C1486g gVar) {
            this();
        }
    }

    protected C1673o(String str, boolean z) {
        C1489j.m6972b(str, "description");
        this.f5315R = str;
        this.f5316S = z;
    }

    static {
        C1673o[] values;
        f5283P = new C1674a(null);
        f5285T = new HashMap<>();
        for (C1673o oVar : values()) {
            f5285T.put(oVar.name(), oVar);
        }
        C1673o[] values2 = values();
        Collection arrayList = new ArrayList();
        for (C1673o oVar2 : values2) {
            if (oVar2.f5316S) {
                arrayList.add(oVar2);
            }
        }
        f5286U = C1415k.m6895m((List) arrayList);
        f5287V = C1406e.m6825j(values());
        f5288W = C1389ad.m6751a((C3221p<? extends K, ? extends V>[]) new C3221p[]{C3226t.m14841a(C1654e.CONSTRUCTOR_PARAMETER, VALUE_PARAMETER), C3226t.m14841a(C1654e.FIELD, FIELD), C3226t.m14841a(C1654e.PROPERTY, PROPERTY), C3226t.m14841a(C1654e.FILE, FILE), C3226t.m14841a(C1654e.PROPERTY_GETTER, PROPERTY_GETTER), C3226t.m14841a(C1654e.PROPERTY_SETTER, PROPERTY_SETTER), C3226t.m14841a(C1654e.RECEIVER, VALUE_PARAMETER), C3226t.m14841a(C1654e.SETTER_PARAMETER, VALUE_PARAMETER), C3226t.m14841a(C1654e.PROPERTY_DELEGATE_FIELD, FIELD)});
    }
}
