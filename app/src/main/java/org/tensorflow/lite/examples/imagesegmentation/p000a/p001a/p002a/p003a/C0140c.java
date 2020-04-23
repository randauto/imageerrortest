package p000a.p001a.p002a.p003a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.p001a.p002a.p003a.C0000a.C0003b;
import p000a.p001a.p002a.p003a.p004a.p006b.C0027l;
import p000a.p001a.p002a.p003a.p004a.p006b.C0037s;
import p000a.p001a.p002a.p003a.p004a.p007c.C0067d;
import p000a.p001a.p002a.p003a.p004a.p007c.C0076k;
import p000a.p001a.p002a.p003a.p004a.p007c.C0079m;

/* renamed from: a.a.a.a.c */
/* compiled from: Fabric */
public class C0140c {

    /* renamed from: a */
    static volatile C0140c f308a;

    /* renamed from: b */
    static final C0154l f309b = new C0139b();

    /* renamed from: c */
    final C0154l f310c;

    /* renamed from: d */
    final boolean f311d;

    /* renamed from: e */
    private final Context f312e;

    /* renamed from: f */
    private final Map<Class<? extends C0151i>, C0151i> f313f;

    /* renamed from: g */
    private final ExecutorService f314g;

    /* renamed from: h */
    private final Handler f315h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C0146f<C0140c> f316i;

    /* renamed from: j */
    private final C0146f<?> f317j;

    /* renamed from: k */
    private final C0037s f318k;

    /* renamed from: l */
    private C0000a f319l;

    /* renamed from: m */
    private WeakReference<Activity> f320m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public AtomicBoolean f321n = new AtomicBoolean(false);

    /* renamed from: a.a.a.a.c$a */
    /* compiled from: Fabric */
    public static class C0143a {

        /* renamed from: a */
        private final Context f326a;

        /* renamed from: b */
        private C0151i[] f327b;

        /* renamed from: c */
        private C0076k f328c;

        /* renamed from: d */
        private Handler f329d;

        /* renamed from: e */
        private C0154l f330e;

        /* renamed from: f */
        private boolean f331f;

        /* renamed from: g */
        private String f332g;

        /* renamed from: h */
        private String f333h;

        /* renamed from: i */
        private C0146f<C0140c> f334i;

        public C0143a(Context context) {
            if (context != null) {
                this.f326a = context;
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public C0143a mo306a(C0151i... iVarArr) {
            if (this.f327b == null) {
                if (!C0027l.m90a(this.f326a).mo52a()) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    for (C0151i iVar : iVarArr) {
                        String identifier = iVar.getIdentifier();
                        char c = 65535;
                        int hashCode = identifier.hashCode();
                        if (hashCode != 607220212) {
                            if (hashCode == 1830452504 && identifier.equals("com.crashlytics.sdk.android:crashlytics")) {
                                c = 0;
                            }
                        } else if (identifier.equals("com.crashlytics.sdk.android:answers")) {
                            c = 1;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                                arrayList.add(iVar);
                                break;
                            default:
                                if (z) {
                                    break;
                                } else {
                                    C0140c.m397g().mo290d("Fabric", "Fabric will not initialize any kits when Firebase automatic data collection is disabled; to use Third-party kits with automatic data collection disabled, initialize these kits via non-Fabric means.");
                                    z = true;
                                    break;
                                }
                        }
                    }
                    iVarArr = (C0151i[]) arrayList.toArray(new C0151i[0]);
                }
                this.f327b = iVarArr;
                return this;
            }
            throw new IllegalStateException("Kits already set.");
        }

        /* renamed from: a */
        public C0140c mo307a() {
            Map a;
            if (this.f328c == null) {
                this.f328c = C0076k.m204a();
            }
            if (this.f329d == null) {
                this.f329d = new Handler(Looper.getMainLooper());
            }
            if (this.f330e == null) {
                if (this.f331f) {
                    this.f330e = new C0139b(3);
                } else {
                    this.f330e = new C0139b();
                }
            }
            if (this.f333h == null) {
                this.f333h = this.f326a.getPackageName();
            }
            if (this.f334i == null) {
                this.f334i = C0146f.f338d;
            }
            if (this.f327b == null) {
                a = new HashMap();
            } else {
                a = C0140c.m393b((Collection<? extends C0151i>) Arrays.asList(this.f327b));
            }
            Map map = a;
            Context applicationContext = this.f326a.getApplicationContext();
            C0140c cVar = new C0140c(applicationContext, map, this.f328c, this.f329d, this.f330e, this.f331f, this.f334i, new C0037s(applicationContext, this.f333h, this.f332g, map.values()), C0140c.m396d(this.f326a));
            return cVar;
        }
    }

    /* renamed from: c */
    public String mo300c() {
        return "1.4.8.32";
    }

    /* renamed from: d */
    public String mo301d() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: a */
    static C0140c m386a() {
        if (f308a != null) {
            return f308a;
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    C0140c(Context context, Map<Class<? extends C0151i>, C0151i> map, C0076k kVar, Handler handler, C0154l lVar, boolean z, C0146f fVar, C0037s sVar, Activity activity) {
        this.f312e = context;
        this.f313f = map;
        this.f314g = kVar;
        this.f315h = handler;
        this.f310c = lVar;
        this.f311d = z;
        this.f316i = fVar;
        this.f317j = mo295a(map.size());
        this.f318k = sVar;
        mo294a(activity);
    }

    /* renamed from: a */
    public static C0140c m387a(Context context, C0151i... iVarArr) {
        if (f308a == null) {
            synchronized (C0140c.class) {
                if (f308a == null) {
                    m395c(new C0143a(context).mo306a(iVarArr).mo307a());
                }
            }
        }
        return f308a;
    }

    /* renamed from: c */
    private static void m395c(C0140c cVar) {
        f308a = cVar;
        cVar.m399i();
    }

    /* renamed from: a */
    public C0140c mo294a(Activity activity) {
        this.f320m = new WeakReference<>(activity);
        return this;
    }

    /* renamed from: b */
    public Activity mo298b() {
        if (this.f320m != null) {
            return (Activity) this.f320m.get();
        }
        return null;
    }

    /* renamed from: i */
    private void m399i() {
        this.f319l = new C0000a(this.f312e);
        this.f319l.mo2a(new C0003b() {
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C0140c.this.mo294a(activity);
            }

            public void onActivityStarted(Activity activity) {
                C0140c.this.mo294a(activity);
            }

            public void onActivityResumed(Activity activity) {
                C0140c.this.mo294a(activity);
            }
        });
        mo296a(this.f312e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo296a(Context context) {
        StringBuilder sb;
        Future b = mo299b(context);
        Collection f = mo303f();
        C0155m mVar = new C0155m(b, f);
        ArrayList<C0151i> arrayList = new ArrayList<>(f);
        Collections.sort(arrayList);
        mVar.injectParameters(context, this, C0146f.f338d, this.f318k);
        for (C0151i injectParameters : arrayList) {
            injectParameters.injectParameters(context, this, this.f317j, this.f318k);
        }
        mVar.initialize();
        if (m397g().mo285a("Fabric", 3)) {
            sb = new StringBuilder("Initializing ");
            sb.append(mo301d());
            sb.append(" [Version: ");
            sb.append(mo300c());
            sb.append("], with the following kits:\n");
        } else {
            sb = null;
        }
        for (C0151i iVar : arrayList) {
            iVar.initializationTask.addDependency(mVar.initializationTask);
            mo297a(this.f313f, iVar);
            iVar.initialize();
            if (sb != null) {
                sb.append(iVar.getIdentifier());
                sb.append(" [Version: ");
                sb.append(iVar.getVersion());
                sb.append("]\n");
            }
        }
        if (sb != null) {
            m397g().mo283a("Fabric", sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo297a(Map<Class<? extends C0151i>, C0151i> map, C0151i iVar) {
        Class[] a;
        C0067d dVar = iVar.dependsOnAnnotation;
        if (dVar != null) {
            for (Class cls : dVar.mo142a()) {
                if (cls.isInterface()) {
                    for (C0151i iVar2 : map.values()) {
                        if (cls.isAssignableFrom(iVar2.getClass())) {
                            iVar.initializationTask.addDependency(iVar2.initializationTask);
                        }
                    }
                } else if (((C0151i) map.get(cls)) != null) {
                    iVar.initializationTask.addDependency(((C0151i) map.get(cls)).initializationTask);
                } else {
                    throw new C0079m("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Activity m396d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* renamed from: e */
    public ExecutorService mo302e() {
        return this.f314g;
    }

    /* renamed from: f */
    public Collection<C0151i> mo303f() {
        return this.f313f.values();
    }

    /* renamed from: a */
    public static <T extends C0151i> T m388a(Class<T> cls) {
        return (C0151i) m386a().f313f.get(cls);
    }

    /* renamed from: g */
    public static C0154l m397g() {
        if (f308a == null) {
            return f309b;
        }
        return f308a.f310c;
    }

    /* renamed from: h */
    public static boolean m398h() {
        if (f308a == null) {
            return false;
        }
        return f308a.f311d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Map<Class<? extends C0151i>, C0151i> m393b(Collection<? extends C0151i> collection) {
        HashMap hashMap = new HashMap(collection.size());
        m391a((Map<Class<? extends C0151i>, C0151i>) hashMap, collection);
        return hashMap;
    }

    /* renamed from: a */
    private static void m391a(Map<Class<? extends C0151i>, C0151i> map, Collection<? extends C0151i> collection) {
        for (C0151i iVar : collection) {
            map.put(iVar.getClass(), iVar);
            if (iVar instanceof C0152j) {
                m391a(map, ((C0152j) iVar).getKits());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0146f<?> mo295a(final int i) {
        return new C0146f() {

            /* renamed from: a */
            final CountDownLatch f323a = new CountDownLatch(i);

            /* renamed from: a */
            public void mo305a(Object obj) {
                this.f323a.countDown();
                if (this.f323a.getCount() == 0) {
                    C0140c.this.f321n.set(true);
                    C0140c.this.f316i.mo305a(C0140c.this);
                }
            }

            /* renamed from: a */
            public void mo304a(Exception exc) {
                C0140c.this.f316i.mo304a(exc);
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Future<Map<String, C0153k>> mo299b(Context context) {
        return mo302e().submit(new C0145e(context.getPackageCodePath()));
    }
}
