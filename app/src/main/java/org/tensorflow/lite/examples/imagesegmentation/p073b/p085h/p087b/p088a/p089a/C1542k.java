package p073b.p085h.p087b.p088a.p089a;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import p073b.C3218m;
import p073b.C3230x;
import p073b.p074a.C1415k;
import p073b.p079e.p080a.C1450b;
import p073b.p079e.p081b.C1489j;
import p073b.p079e.p081b.C1490k;
import p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2149t;
import p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2319g;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R6\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0006j\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b`\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo10386c = {"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider;", "Lkotlin/reflect/jvm/internal/impl/load/kotlin/PackagePartProvider;", "classLoader", "Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "packageParts", "Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/HashMap;", "visitedModules", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "findPackageParts", "", "packageFqName", "getAnnotationsOnBinaryModule", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "moduleName", "registerModule", "", "EmptyEnumeration", "descriptors.runtime"})
/* renamed from: b.h.b.a.a.k */
/* compiled from: RuntimePackagePartProvider.kt */
public final class C1542k implements C2149t {

    /* renamed from: a */
    private final HashSet<String> f4909a = new HashSet<>();

    /* renamed from: b */
    private final HashMap<String, LinkedHashSet<String>> f4910b = new HashMap<>();

    /* renamed from: c */
    private final ClassLoader f4911c;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, mo10386c = {"Lkotlin/reflect/jvm/internal/components/RuntimePackagePartProvider$EmptyEnumeration;", "Ljava/util/Enumeration;", "", "()V", "hasMoreElements", "", "nextElement", "descriptors.runtime"})
    /* renamed from: b.h.b.a.a.k$a */
    /* compiled from: RuntimePackagePartProvider.kt */
    private static final class C1543a implements Enumeration {

        /* renamed from: a */
        public static final C1543a f4912a = new C1543a();

        public boolean hasMoreElements() {
            return false;
        }

        private C1543a() {
        }

        /* renamed from: a */
        public Void nextElement() {
            throw new NoSuchElementException();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo10386c = {"<anonymous>", "", "version", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "invoke"})
    /* renamed from: b.h.b.a.a.k$b */
    /* compiled from: RuntimePackagePartProvider.kt */
    static final class C1544b extends C1490k implements C1450b<C2319g, C3230x> {

        /* renamed from: a */
        public static final C1544b f4913a = new C1544b();

        C1544b() {
            super(1);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo6756a(Object obj) {
            mo7018a((C2319g) obj);
            return C3230x.f8645a;
        }

        /* renamed from: a */
        public final void mo7018a(C2319g gVar) {
            C1489j.m6972b(gVar, "version");
            StringBuilder sb = new StringBuilder();
            sb.append("Module was compiled with an incompatible version of Kotlin. The binary version of its metadata is ");
            sb.append(gVar);
            sb.append(", ");
            sb.append("expected version is ");
            sb.append(C2319g.f7107b);
            sb.append(". Please update Kotlin to the latest version");
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public C1542k(ClassLoader classLoader) {
        C1489j.m6972b(classLoader, "classLoader");
        this.f4911c = classLoader;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = p073b.p085h.p087b.p088a.p089a.C1542k.C1543a.f4912a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo7013a(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.String r0 = "moduleName"
            p073b.p079e.p081b.C1489j.m6972b(r9, r0)     // Catch:{ all -> 0x00c0 }
            java.util.HashSet<java.lang.String> r0 = r8.f4909a     // Catch:{ all -> 0x00c0 }
            boolean r0 = r0.add(r9)     // Catch:{ all -> 0x00c0 }
            if (r0 != 0) goto L_0x0010
            monitor-exit(r8)
            return
        L_0x0010:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r0.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = "META-INF/"
            r0.append(r1)     // Catch:{ all -> 0x00c0 }
            r0.append(r9)     // Catch:{ all -> 0x00c0 }
            java.lang.String r9 = ".kotlin_module"
            r0.append(r9)     // Catch:{ all -> 0x00c0 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x00c0 }
            java.lang.ClassLoader r0 = r8.f4911c     // Catch:{ IOException -> 0x002d }
            java.util.Enumeration r0 = r0.getResources(r9)     // Catch:{ IOException -> 0x002d }
            goto L_0x0031
        L_0x002d:
            b.h.b.a.a.k$a r0 = p073b.p085h.p087b.p088a.p089a.C1542k.C1543a.f4912a     // Catch:{ all -> 0x00c0 }
            java.util.Enumeration r0 = (java.util.Enumeration) r0     // Catch:{ all -> 0x00c0 }
        L_0x0031:
            java.lang.String r1 = "resources"
            p073b.p079e.p081b.C1489j.m6969a(r0, r1)     // Catch:{ all -> 0x00c0 }
            java.util.Iterator r0 = p073b.p074a.C1415k.m6844a(r0)     // Catch:{ all -> 0x00c0 }
        L_0x003a:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x00be
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00c0 }
            java.net.URL r1 = (java.net.URL) r1     // Catch:{ all -> 0x00c0 }
            java.io.InputStream r1 = r1.openStream()     // Catch:{ UnsupportedOperationException -> 0x00ba, Exception -> 0x003a }
            if (r1 == 0) goto L_0x003a
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch:{ UnsupportedOperationException -> 0x00ba, Exception -> 0x003a }
            r2 = 0
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ UnsupportedOperationException -> 0x00ba, Exception -> 0x003a }
            r4 = r1
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch:{ Throwable -> 0x00b3 }
            b.h.b.a.b.e.b.a.k$a r5 = p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2325k.f7122c     // Catch:{ Throwable -> 0x00b3 }
            r6 = 0
            r7 = 1
            byte[] r2 = p073b.p078d.C1445a.m6933a(r4, r6, r7, r2)     // Catch:{ Throwable -> 0x00b3 }
            b.h.b.a.b.j.a.j$a r4 = p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2658j.C2659a.f7852a     // Catch:{ Throwable -> 0x00b3 }
            b.h.b.a.b.j.a.j r4 = (p073b.p085h.p087b.p088a.p090b.p127j.p128a.C2658j) r4     // Catch:{ Throwable -> 0x00b3 }
            b.h.b.a.a.k$b r6 = p073b.p085h.p087b.p088a.p089a.C1542k.C1544b.f4913a     // Catch:{ Throwable -> 0x00b3 }
            b.e.a.b r6 = (p073b.p079e.p080a.C1450b) r6     // Catch:{ Throwable -> 0x00b3 }
            b.h.b.a.b.e.b.a.k r2 = p073b.p085h.p087b.p088a.p090b.p100d.p110b.C2148s.m9582a(r5, r2, r9, r4, r6)     // Catch:{ Throwable -> 0x00b3 }
            java.util.Map r2 = r2.mo8898a()     // Catch:{ Throwable -> 0x00b3 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ Throwable -> 0x00b3 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Throwable -> 0x00b3 }
        L_0x0075:
            boolean r4 = r2.hasNext()     // Catch:{ Throwable -> 0x00b3 }
            if (r4 == 0) goto L_0x00ab
            java.lang.Object r4 = r2.next()     // Catch:{ Throwable -> 0x00b3 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Throwable -> 0x00b3 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ Throwable -> 0x00b3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x00b3 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Throwable -> 0x00b3 }
            b.h.b.a.b.e.b.a.m r4 = (p073b.p085h.p087b.p088a.p090b.p112e.p114b.p115a.C2328m) r4     // Catch:{ Throwable -> 0x00b3 }
            java.util.HashMap<java.lang.String, java.util.LinkedHashSet<java.lang.String>> r6 = r8.f4910b     // Catch:{ Throwable -> 0x00b3 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ Throwable -> 0x00b3 }
            java.lang.Object r7 = r6.get(r5)     // Catch:{ Throwable -> 0x00b3 }
            if (r7 != 0) goto L_0x009f
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet     // Catch:{ Throwable -> 0x00b3 }
            r7.<init>()     // Catch:{ Throwable -> 0x00b3 }
            r6.put(r5, r7)     // Catch:{ Throwable -> 0x00b3 }
        L_0x009f:
            java.util.LinkedHashSet r7 = (java.util.LinkedHashSet) r7     // Catch:{ Throwable -> 0x00b3 }
            java.util.Set r4 = r4.mo8901a()     // Catch:{ Throwable -> 0x00b3 }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ Throwable -> 0x00b3 }
            r7.addAll(r4)     // Catch:{ Throwable -> 0x00b3 }
            goto L_0x0075
        L_0x00ab:
            b.x r2 = p073b.C3230x.f8645a     // Catch:{ Throwable -> 0x00b3 }
            p073b.p078d.C1446b.m6934a(r1, r3)     // Catch:{ UnsupportedOperationException -> 0x00ba, Exception -> 0x003a }
            goto L_0x003a
        L_0x00b1:
            r2 = move-exception
            goto L_0x00b6
        L_0x00b3:
            r2 = move-exception
            r3 = r2
            throw r3     // Catch:{ all -> 0x00b1 }
        L_0x00b6:
            p073b.p078d.C1446b.m6934a(r1, r3)     // Catch:{ UnsupportedOperationException -> 0x00ba, Exception -> 0x003a }
            throw r2     // Catch:{ UnsupportedOperationException -> 0x00ba, Exception -> 0x003a }
        L_0x00ba:
            r9 = move-exception
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x00c0 }
            throw r9     // Catch:{ all -> 0x00c0 }
        L_0x00be:
            monitor-exit(r8)
            return
        L_0x00c0:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p073b.p085h.p087b.p088a.p089a.C1542k.mo7013a(java.lang.String):void");
    }

    /* renamed from: b */
    public synchronized List<String> mo7014b(String str) {
        List<String> k;
        C1489j.m6972b(str, "packageFqName");
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.f4910b.get(str);
        k = linkedHashSet != null ? C1415k.m6893k((Iterable<? extends T>) linkedHashSet) : null;
        if (k == null) {
            k = C1415k.m6837a();
        }
        return k;
    }
}
