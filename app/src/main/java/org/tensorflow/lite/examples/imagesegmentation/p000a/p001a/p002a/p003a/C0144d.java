package p000a.p001a.p002a.p003a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import java.io.File;

/* renamed from: a.a.a.a.d */
/* compiled from: FabricContext */
class C0144d extends ContextWrapper {

    /* renamed from: a */
    private final String f335a;

    /* renamed from: b */
    private final String f336b;

    public C0144d(Context context, String str, String str2) {
        super(context);
        this.f336b = str;
        this.f335a = str2;
    }

    public File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.f335a);
        file.mkdirs();
        return new File(file, str);
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
    }

    @TargetApi(11)
    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
    }

    public File getFilesDir() {
        return new File(super.getFilesDir(), this.f335a);
    }

    @TargetApi(8)
    public File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.f335a);
    }

    public File getCacheDir() {
        return new File(super.getCacheDir(), this.f335a);
    }

    @TargetApi(8)
    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.f335a);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f336b);
        sb.append(":");
        sb.append(str);
        return super.getSharedPreferences(sb.toString(), i);
    }
}
