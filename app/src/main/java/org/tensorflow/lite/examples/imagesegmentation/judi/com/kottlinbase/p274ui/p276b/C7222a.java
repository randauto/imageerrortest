package org.tensorflow.lite.examples.imagesegmentation.judi.com.kottlinbase.p274ui.p276b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.judi.emojiphoto.R;
import judi.com.kottlinbase.C7191b.C7192a;
import p073b.C3218m;
import p073b.p079e.p081b.C1489j;

@C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0010\u0011B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo10386c = {"Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog;", "Ljudi/com/kottlinbase/ui/dialog/BaseAlert;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "builder", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$Builder;", "(Landroid/content/Context;Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$Builder;)V", "onClick", "", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Builder", "OnClickListener", "OnDismissListener", "app_release"})
/* renamed from: judi.com.kottlinbase.ui.b.a */
/* compiled from: AppAlertDialog.kt */
public final class C7222a extends C7227b implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C7223a f26373a;

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0006J\u000e\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0006J\u000e\u00101\u001a\u00020\u00002\u0006\u00102\u001a\u000203J\u000e\u00101\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u000fJ\u0018\u00105\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\b\u00106\u001a\u0004\u0018\u00010\u0015J\u0018\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010\u0015J\u000e\u00108\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u001eJ\u0018\u00109\u001a\u00020\u00002\u0006\u00102\u001a\u0002032\b\u00106\u001a\u0004\u0018\u00010\u0015J\u0018\u00109\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u000f2\b\u00106\u001a\u0004\u0018\u00010\u0015J\u000e\u0010:\u001a\u00020\u00002\u0006\u00102\u001a\u000203J\u0010\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u000fH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001c\u0010&\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R\u001c\u0010)\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013¨\u0006<"}, mo10386c = {"Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$Builder;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mCancelable", "", "getMCancelable", "()Z", "setMCancelable", "(Z)V", "mCanceledOnTouchOutside", "getMCanceledOnTouchOutside", "setMCanceledOnTouchOutside", "mMessage", "", "getMMessage", "()Ljava/lang/String;", "setMMessage", "(Ljava/lang/String;)V", "mNegativeButtonListener", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "getMNegativeButtonListener", "()Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "setMNegativeButtonListener", "(Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;)V", "mNegativeButtonText", "getMNegativeButtonText", "setMNegativeButtonText", "mOnDismissListener", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnDismissListener;", "getMOnDismissListener", "()Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnDismissListener;", "setMOnDismissListener", "(Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnDismissListener;)V", "mPositiveButtonListener", "getMPositiveButtonListener", "setMPositiveButtonListener", "mPositiveButtonText", "getMPositiveButtonText", "setMPositiveButtonText", "mTitle", "getMTitle", "setMTitle", "create", "Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog;", "setCancelable", "flag", "setCanceledOnTouchOutside", "setMessage", "resId", "", "msg", "setNegativeButtonText", "l", "text", "setOnDismissListener", "setPositiveButtonText", "setTitle", "title", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.b.a$a */
    /* compiled from: AppAlertDialog.kt */
    public static final class C7223a {

        /* renamed from: a */
        private String f26374a;

        /* renamed from: b */
        private String f26375b;

        /* renamed from: c */
        private String f26376c;

        /* renamed from: d */
        private String f26377d;

        /* renamed from: e */
        private C7224b f26378e;

        /* renamed from: f */
        private C7224b f26379f;

        /* renamed from: g */
        private C7225c f26380g;

        /* renamed from: h */
        private boolean f26381h = true;

        /* renamed from: i */
        private boolean f26382i;

        /* renamed from: j */
        private final Context f26383j;

        public C7223a(Context context) {
            C1489j.m6972b(context, "mContext");
            this.f26383j = context;
        }

        /* renamed from: a */
        public final String mo23268a() {
            return this.f26374a;
        }

        /* renamed from: b */
        public final String mo23275b() {
            return this.f26375b;
        }

        /* renamed from: c */
        public final String mo23280c() {
            return this.f26376c;
        }

        /* renamed from: d */
        public final String mo23281d() {
            return this.f26377d;
        }

        /* renamed from: e */
        public final C7224b mo23282e() {
            return this.f26378e;
        }

        /* renamed from: f */
        public final C7224b mo23283f() {
            return this.f26379f;
        }

        /* renamed from: g */
        public final C7225c mo23284g() {
            return this.f26380g;
        }

        /* renamed from: h */
        public final boolean mo23285h() {
            return this.f26381h;
        }

        /* renamed from: i */
        public final boolean mo23286i() {
            return this.f26382i;
        }

        /* renamed from: b */
        private final C7223a m38588b(String str) {
            this.f26374a = str;
            return this;
        }

        /* renamed from: a */
        public final C7223a mo23269a(int i) {
            String string = this.f26383j.getString(i);
            C1489j.m6969a((Object) string, "mContext.getString(resId)");
            return m38588b(string);
        }

        /* renamed from: a */
        public final C7223a mo23271a(String str) {
            C1489j.m6972b(str, "msg");
            this.f26375b = str;
            return this;
        }

        /* renamed from: b */
        public final C7223a mo23276b(int i) {
            String string = this.f26383j.getString(i);
            C1489j.m6969a((Object) string, "mContext.getString(resId)");
            return mo23271a(string);
        }

        /* renamed from: a */
        public final C7223a mo23272a(String str, C7224b bVar) {
            C1489j.m6972b(str, "text");
            this.f26376c = str;
            this.f26378e = bVar;
            return this;
        }

        /* renamed from: a */
        public final C7223a mo23270a(int i, C7224b bVar) {
            String string = this.f26383j.getString(i);
            C1489j.m6969a((Object) string, "mContext.getString(resId)");
            return mo23272a(string, bVar);
        }

        /* renamed from: b */
        public final C7223a mo23278b(String str, C7224b bVar) {
            C1489j.m6972b(str, "text");
            this.f26377d = str;
            this.f26379f = bVar;
            return this;
        }

        /* renamed from: b */
        public final C7223a mo23277b(int i, C7224b bVar) {
            String string = this.f26383j.getString(i);
            C1489j.m6969a((Object) string, "mContext.getString(resId)");
            return mo23278b(string, bVar);
        }

        /* renamed from: a */
        public final C7223a mo23273a(C7225c cVar) {
            C1489j.m6972b(cVar, "l");
            this.f26380g = cVar;
            return this;
        }

        /* renamed from: a */
        public final C7223a mo23274a(boolean z) {
            this.f26381h = z;
            return this;
        }

        /* renamed from: b */
        public final C7223a mo23279b(boolean z) {
            this.f26382i = z;
            return this;
        }

        /* renamed from: j */
        public final C7222a mo23287j() {
            return new C7222a(this.f26383j, this);
        }
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo10386c = {"Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnClickListener;", "", "onClick", "", "v", "Landroid/view/View;", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.b.a$b */
    /* compiled from: AppAlertDialog.kt */
    public interface C7224b {
        /* renamed from: a */
        void mo23288a(View view);
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, mo10386c = {"Ljudi/com/kottlinbase/ui/dialog/AppAlertDialog$OnDismissListener;", "", "onDismiss", "", "app_release"})
    /* renamed from: judi.com.kottlinbase.ui.b.a$c */
    /* compiled from: AppAlertDialog.kt */
    public interface C7225c {
        /* renamed from: a */
        void mo23289a();
    }

    @C3218m(mo10384a = {1, 1, 11}, mo10385b = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo10386c = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"})
    /* renamed from: judi.com.kottlinbase.ui.b.a$d */
    /* compiled from: AppAlertDialog.kt */
    static final class C7226d implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C7222a f26384a;

        C7226d(C7222a aVar) {
            this.f26384a = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f26384a.f26373a.mo23284g() != null) {
                C7225c g = this.f26384a.f26373a.mo23284g();
                if (g == null) {
                    C1489j.m6968a();
                }
                g.mo23289a();
            }
        }
    }

    public C7222a(Context context, C7223a aVar) {
        C1489j.m6972b(aVar, "builder");
        super(context);
        this.f26373a = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        super.onCreate(bundle);
        setContentView(R.layout.dialog_alert);
        mo23291a();
        setCancelable(this.f26373a.mo23285h());
        setCanceledOnTouchOutside(this.f26373a.mo23286i());
        if (this.f26373a.mo23268a() == null) {
            TextView textView = (TextView) findViewById(C7192a.tvTitle);
            C1489j.m6969a((Object) textView, "tvTitle");
            textView.setVisibility(8);
        } else {
            TextView textView2 = (TextView) findViewById(C7192a.tvTitle);
            C1489j.m6969a((Object) textView2, "tvTitle");
            textView2.setVisibility(0);
            TextView textView3 = (TextView) findViewById(C7192a.tvTitle);
            C1489j.m6969a((Object) textView3, "tvTitle");
            textView3.setText(this.f26373a.mo23268a());
        }
        if (this.f26373a.mo23275b() == null) {
            TextView textView4 = (TextView) findViewById(C7192a.tvMessage);
            C1489j.m6969a((Object) textView4, "tvMessage");
            textView4.setVisibility(8);
        } else {
            TextView textView5 = (TextView) findViewById(C7192a.tvMessage);
            C1489j.m6969a((Object) textView5, "tvMessage");
            textView5.setVisibility(0);
            TextView textView6 = (TextView) findViewById(C7192a.tvMessage);
            C1489j.m6969a((Object) textView6, "tvMessage");
            textView6.setText(this.f26373a.mo23275b());
        }
        Button button = (Button) findViewById(C7192a.btnPositive);
        C1489j.m6969a((Object) button, "btnPositive");
        if (this.f26373a.mo23280c() == null) {
            charSequence = getContext().getString(17039370);
        } else {
            charSequence = this.f26373a.mo23280c();
        }
        button.setText(charSequence);
        if (this.f26373a.mo23281d() == null) {
            Button button2 = (Button) findViewById(C7192a.btnNegative);
            C1489j.m6969a((Object) button2, "btnNegative");
            button2.setVisibility(8);
        } else {
            Button button3 = (Button) findViewById(C7192a.btnNegative);
            C1489j.m6969a((Object) button3, "btnNegative");
            button3.setVisibility(0);
            Button button4 = (Button) findViewById(C7192a.btnNegative);
            C1489j.m6969a((Object) button4, "btnNegative");
            button4.setText(this.f26373a.mo23281d());
        }
        OnClickListener onClickListener = this;
        ((Button) findViewById(C7192a.btnPositive)).setOnClickListener(onClickListener);
        ((Button) findViewById(C7192a.btnNegative)).setOnClickListener(onClickListener);
        setOnDismissListener(new C7226d(this));
    }

    public void onClick(View view) {
        if (view == null) {
            C1489j.m6968a();
        }
        int id = view.getId();
        if (id == R.id.btnNegative) {
            C7224b f = this.f26373a.mo23283f();
            if (f != null) {
                f.mo23288a(view);
            }
        } else if (id == R.id.btnPositive) {
            C7224b e = this.f26373a.mo23282e();
            if (e != null) {
                e.mo23288a(view);
            }
        }
        dismiss();
    }
}
