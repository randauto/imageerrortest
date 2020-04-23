package org.tensorflow.lite.examples.imagesegmentation.judi.com.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import com.bumptech.glide.Glide;

import org.tensorflow.lite.examples.imagesegmentation.judi.com.p271d.TrimImage;

import java.io.File;

import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0003\u0019\u001a\u001bB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u000eJ \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\nR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo10386c = {"Ljudi/com/service/DetectorService;", "Landroid/app/Service;", "Ljudi/com/service/IDetectorService;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "callback", "Ljudi/com/service/DetectorManager$DetectorCallback;", "detectTask", "Ljudi/com/service/DetectorService$DetectTask;", "mBinder", "Ljudi/com/service/DetectorService$LocalBinder;", "cancelDetect", "", "loadProcessor", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "release", "startDetect", "path", "config", "Ljudi/com/service/Config;", "Companion", "DetectTask", "LocalBinder", "bgremover_release"})
/* compiled from: DetectorService.kt */
public final class DetectorService extends Service implements C7371e {

    /* renamed from: a */
    public static final C7360a f26694a = new C7360a(null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f26695b = DetectorService.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7365c.C7366a f26696c;

    /* renamed from: d */
    private final C7362c f26697d = new C7362c();

    /* renamed from: e */
    private C7361b f26698e;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo10386c = {"Ljudi/com/service/DetectorService$Companion;", "", "()V", "ERRR_FILE_NOT_FOUND", "", "bgremover_release"})
    /* renamed from: judi.com.service.DetectorService$a */
    /* compiled from: DetectorService.kt */
    public static final class C7360a {
        private C7360a() {
        }

        public /* synthetic */ C7360a(C1486g gVar) {
            this();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ?\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo10386c = {"Ljudi/com/service/DetectorService$DetectTask;", "Ljava/lang/Thread;", "context", "Landroid/content/Context;", "path", "", "config", "Ljudi/com/service/Config;", "(Ljudi/com/service/DetectorService;Landroid/content/Context;Ljava/lang/String;Ljudi/com/service/Config;)V", "isDone", "", "()Z", "setDone", "(Z)V", "createBlurBitmap", "Landroid/graphics/Bitmap;", "bitmap", "bRad", "", "eRad", "imgMatrixDilated", "", "", "imgMatrixEroded", "(Landroid/graphics/Bitmap;II[[I[[I)Landroid/graphics/Bitmap;", "interrupt", "", "run", "bgremover_release"})
    /* renamed from: judi.com.service.DetectorService$b */
    /* compiled from: DetectorService.kt */
    public final class C7361b extends Thread {

        /* renamed from: a */
        final /* synthetic */ DetectorService f26699a;

        /* renamed from: b */
        private Context f26700b;

        /* renamed from: c */
        private boolean f26701c;

        /* renamed from: d */
        private Config f26702d;

        /* renamed from: e */
        private String f26703e;

        public C7361b(DetectorService detectorService, Context context, String str, Config aVar) {
            C1489j.m6972b(context, "context");
            C1489j.m6972b(str, "path");
            C1489j.m6972b(aVar, "config");
            this.f26699a = detectorService;
            this.f26702d = aVar;
            this.f26700b = context;
            this.f26703e = str;
        }

        public void run() {
            super.run();
            File file = new File(this.f26703e);
            if (!file.isFile() || !file.exists()) {
                C7365c.C7366a a = this.f26699a.f26696c;
                if (a != null) {
                    a.mo23464a(1, "file not found");
                }
                this.f26699a.mo23448b();
                return;
            }
            Object obj = Glide.m15109b(this.f26700b).mo10845f().mo10832a(this.f26703e).mo10833b().get();
            C1489j.m6969a(obj, "Glide.with(context).asBi…load(path).submit().get()");
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null) {
                C7365c.C7366a a2 = this.f26699a.f26696c;
                if (a2 != null) {
                    a2.mo23464a(1, "file not found");
                }
                this.f26699a.mo23448b();
                return;
            }
            FileUtil.m39133a(this.f26700b, new File(this.f26702d.mo23457d()), bitmap, this.f26702d.mo23455b());
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float max = ((float) 513) / ((float) Math.max(bitmap.getWidth(), bitmap.getHeight()));
            int round = Math.round(((float) width) * max);
            int round2 = Math.round(((float) height) * max);
            int[] a3 = DeeplabProcessor.m39109a(ImageUtils.m39139a(bitmap, round, round2), 1);
            Bitmap createBitmap = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(a3, 0, round, 0, 0, round, round2);


            Bitmap a4 = ImageUtils.m39139a(createBitmap, width, height);
            FileUtil.m39133a(this.f26700b, new File(this.f26702d.mo23457d()), a4, this.f26702d.mo23458e());

            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            TrimImage eVar = new TrimImage(this.f26700b, a4, bitmap, createBitmap2);
            eVar.mo23103e();
            eVar.mo23101a(createBitmap2);
            eVar.mo23102d();


            FileUtil.m39133a(this.f26700b, new File(this.f26702d.mo23457d()), createBitmap2, this.f26702d.mo23453a());
            createBitmap2.recycle();
            a4.recycle();

            System.currentTimeMillis();
            C7365c.C7366a a5 = this.f26699a.f26696c;
            if (a5 != null) {
                String d = this.f26702d.mo23457d();
                C1489j.m6969a((Object) d, "config.outPutDir");
                a5.mo23465a(d);
            }
            this.f26701c = true;
        }

        public void interrupt() {
            DeeplabProcessor.closeProcessor();
            super.interrupt();
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo10386c = {"Ljudi/com/service/DetectorService$LocalBinder;", "Landroid/os/Binder;", "(Ljudi/com/service/DetectorService;)V", "service", "Ljudi/com/service/IDetectorService;", "getService$bgremover_release", "()Ljudi/com/service/IDetectorService;", "bgremover_release"})
    /* renamed from: judi.com.service.DetectorService$c */
    /* compiled from: DetectorService.kt */
    public final class C7362c extends Binder {
        public C7362c() {
        }

        /* renamed from: a */
        public final C7371e mo23452a() {
            return DetectorService.this;
        }
    }

    public IBinder onBind(Intent intent) {
        C1489j.m6972b(intent, "intent");
        return this.f26697d;
    }

    /* renamed from: a */
    public void mo23446a() {
        if (!DeeplabProcessor.m39110b()) {
            DeeplabProcessor.m39108a(this);
        }
    }

    /* renamed from: a */
    public void mo23447a(String str, Config aVar, C7365c.C7366a aVar2) {
        C1489j.m6972b(str, "path");
        C1489j.m6972b(aVar, "config");
        C1489j.m6972b(aVar2, "callback");
        this.f26696c = aVar2;
        this.f26698e = new C7361b(this, this, str, aVar);
        C7361b bVar = this.f26698e;
        if (bVar == null) {
            C1489j.m6968a();
        }
        bVar.start();
    }

    /* renamed from: b */
    public final void mo23448b() {
        Log.d(this.f26695b, ": release");
        this.f26696c = null;
    }
}
