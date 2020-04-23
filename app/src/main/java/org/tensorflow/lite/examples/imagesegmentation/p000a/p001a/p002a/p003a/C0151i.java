package p000a.p001a.p002a.p003a;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import p000a.p001a.p002a.p003a.p004a.p006b.C0037s;
import p000a.p001a.p002a.p003a.p004a.p007c.C0067d;
import p000a.p001a.p002a.p003a.p004a.p007c.C0078l;

/* renamed from: a.a.a.a.i */
/* compiled from: Kit */
public abstract class C0151i<Result> implements Comparable<C0151i> {
    Context context;
    final C0067d dependsOnAnnotation = ((C0067d) getClass().getAnnotation(C0067d.class));
    C0140c fabric;
    C0037s idManager;
    C0146f<Result> initializationCallback;
    C0150h<Result> initializationTask = new C0150h<>(this);

    /* access modifiers changed from: protected */
    public abstract Result doInBackground();

    public abstract String getIdentifier();

    public abstract String getVersion();

    /* access modifiers changed from: protected */
    public void onCancelled(Result result) {
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Result result) {
    }

    /* access modifiers changed from: protected */
    public boolean onPreExecute() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void injectParameters(Context context2, C0140c cVar, C0146f<Result> fVar, C0037s sVar) {
        this.fabric = cVar;
        this.context = new C0144d(context2, getIdentifier(), getPath());
        this.initializationCallback = fVar;
        this.idManager = sVar;
    }

    /* access modifiers changed from: 0000 */
    public final void initialize() {
        this.initializationTask.mo144a(this.fabric.mo302e(), null);
    }

    /* access modifiers changed from: protected */
    public C0037s getIdManager() {
        return this.idManager;
    }

    public Context getContext() {
        return this.context;
    }

    public C0140c getFabric() {
        return this.fabric;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(".Fabric");
        sb.append(File.separator);
        sb.append(getIdentifier());
        return sb.toString();
    }

    public int compareTo(C0151i iVar) {
        if (containsAnnotatedDependency(iVar)) {
            return 1;
        }
        if (iVar.containsAnnotatedDependency(this)) {
            return -1;
        }
        if (hasAnnotatedDependency() && !iVar.hasAnnotatedDependency()) {
            return 1;
        }
        if (hasAnnotatedDependency() || !iVar.hasAnnotatedDependency()) {
            return 0;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public boolean containsAnnotatedDependency(C0151i iVar) {
        if (hasAnnotatedDependency()) {
            for (Class isAssignableFrom : this.dependsOnAnnotation.mo142a()) {
                if (isAssignableFrom.isAssignableFrom(iVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean hasAnnotatedDependency() {
        return this.dependsOnAnnotation != null;
    }

    /* access modifiers changed from: protected */
    public Collection<C0078l> getDependencies() {
        return this.initializationTask.getDependencies();
    }
}
