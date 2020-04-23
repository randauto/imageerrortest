package org.tensorflow.lite.examples.imagesegmentation.judi.com;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: judi.com.a */
/* compiled from: SessionManager */
public class C7139a {

    /* renamed from: a */
    private static C7139a f26121a;

    /* renamed from: b */
    private SharedPreferences f26122b;

    /* renamed from: a */
    public static C7139a m38192a() {
        if (f26121a == null) {
            f26121a = new C7139a();
        }
        return f26121a;
    }

    /* renamed from: a */
    public void mo23013a(Context context) {
        this.f26122b = context.getSharedPreferences("com.judi.base.PREFERENCE_FILE_KEY", 0);
    }

    private C7139a() {
    }

    /* renamed from: b */
    public boolean mo23017b() {
        long j = this.f26122b.getLong("last.last.show.attend", 0);
        boolean z = true;
        if (j <= 0) {
            return true;
        }
        if (System.currentTimeMillis() - j <= 172800000) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public void mo23018c() {
        this.f26122b.edit().putLong("last.last.show.attend", System.currentTimeMillis()).apply();
    }

    /* renamed from: d */
    public void mo23021d() {
        this.f26122b.edit().putLong("last.refresh.otherapp", System.currentTimeMillis()).apply();
    }

    /* renamed from: e */
    public boolean mo23022e() {
        long j = this.f26122b.getLong("last.refresh.otherapp", 0);
        boolean z = true;
        if (j <= 0) {
            return true;
        }
        if (System.currentTimeMillis() - j <= 7200000) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public void mo23023f() {
        this.f26122b.edit().putLong("has.ask.rate.at", -1).apply();
    }

    /* renamed from: a */
    public void mo23012a(long j) {
        this.f26122b.edit().putLong("remind.new.photo", j).apply();
    }

    /* renamed from: g */
    public long mo23024g() {
        return this.f26122b.getLong("remind.new.photo", System.currentTimeMillis() - 600000);
    }

    /* renamed from: b */
    public void mo23015b(long j) {
        long j2 = this.f26122b.getLong("has.ask.rate.at", 0);
        if (j2 >= 0) {
            this.f26122b.edit().putLong("has.ask.rate.at", j2).apply();
        }
    }

    /* renamed from: h */
    public boolean mo23025h() {
        long j = this.f26122b.getLong("has.ask.rate.at", 0);
        boolean z = false;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            return false;
        }
        if (i == 0 || (System.currentTimeMillis() - j) / 1000 > 5000) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo23014a(boolean z) {
        this.f26122b.edit().putBoolean("has.show.tut", z).apply();
    }

    /* renamed from: i */
    public boolean mo23026i() {
        return this.f26122b.getBoolean("has.show.tut", false);
    }

    /* renamed from: b */
    public void mo23016b(boolean z) {
        this.f26122b.edit().putBoolean("waring.apk.install", z).apply();
    }

    /* renamed from: j */
    public boolean mo23027j() {
        return this.f26122b.getBoolean("waring.apk.install", false);
    }

    /* renamed from: c */
    public void mo23020c(boolean z) {
        this.f26122b.edit().putBoolean("badge.new.emoji", z).apply();
    }

    /* renamed from: k */
    public boolean mo23028k() {
        return this.f26122b.getBoolean("badge.new.emoji", false);
    }

    /* renamed from: c */
    public void mo23019c(long j) {
        this.f26122b.edit().putLong("last.time.check.emoji", j).apply();
    }

    /* renamed from: l */
    public boolean mo23029l() {
        long j = this.f26122b.getLong("last.time.check.emoji", 0);
        boolean z = true;
        if (j <= 0) {
            return true;
        }
        if (System.currentTimeMillis() - j <= 1728000) {
            z = false;
        }
        return z;
    }
}
