package p256e.p260d;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: e.d.b */
/* compiled from: JSONObject */
public class C7003b {

    /* renamed from: a */
    public static final Object f24842a = new C7005a();

    /* renamed from: b */
    private static HashMap<String, Object> f24843b = new HashMap<>(100);

    /* renamed from: c */
    private final HashMap<String, Object> f24844c;

    /* renamed from: e.d.b$a */
    /* compiled from: JSONObject */
    private static final class C7005a {
        /* access modifiers changed from: protected */
        public final Object clone() {
            return this;
        }

        public boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public String toString() {
            return "null";
        }

        private C7005a() {
        }

        public int hashCode() {
            return super.hashCode();
        }
    }

    public C7003b() {
        this.f24844c = new HashMap<>();
    }

    protected C7003b(Object obj) {
        this();
        m36817c(obj);
    }

    /* renamed from: a */
    public Iterator mo22092a() {
        return this.f24844c.keySet().iterator();
    }

    /* renamed from: b */
    public int mo22093b() {
        return this.f24844c.size();
    }

    /* renamed from: a */
    private static String m36812a(Number number) {
        if (number != null) {
            m36815a((Object) number);
            String obj = number.toString();
            if (obj.indexOf(46) <= 0 || obj.indexOf(101) >= 0 || obj.indexOf(69) >= 0) {
                return obj;
            }
            while (obj.endsWith("0")) {
                obj = obj.substring(0, obj.length() - 1);
            }
            return obj.endsWith(".") ? obj.substring(0, obj.length() - 1) : obj;
        }
        throw new RuntimeException("Null pointer");
    }

    /* renamed from: c */
    private void m36817c(Object obj) {
        Method[] methodArr;
        Class cls = obj.getClass();
        if (cls.getClassLoader() != null) {
            methodArr = cls.getMethods();
        } else {
            methodArr = cls.getDeclaredMethods();
        }
        for (int i = 0; i < methodArr.length; i++) {
            try {
                Method method = methodArr[i];
                if (Modifier.isPublic(method.getModifiers())) {
                    String name = method.getName();
                    String str = "";
                    if (name.startsWith("get")) {
                        if (!"getClass".equals(name)) {
                            if (!"getDeclaringClass".equals(name)) {
                                str = name.substring(3);
                            }
                        }
                        str = "";
                    } else if (name.startsWith("is")) {
                        str = name.substring(2);
                    }
                    if (str.length() > 0 && Character.isUpperCase(str.charAt(0)) && method.getParameterTypes().length == 0) {
                        if (str.length() == 1) {
                            str = str.toLowerCase();
                        } else if (!Character.isUpperCase(str.charAt(1))) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str.substring(0, 1).toLowerCase());
                            sb.append(str.substring(1));
                            str = sb.toString();
                        }
                        Object invoke = method.invoke(obj, null);
                        if (invoke != null) {
                            this.f24844c.put(str, m36816b(invoke));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    protected static String m36813a(String str) {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                obj = m36811a(str, (Writer) stringWriter).toString();
            } catch (IOException unused) {
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* renamed from: a */
    protected static Writer m36811a(String str, Writer writer) {
        if (str == null || str.length() == 0) {
            writer.write("\"\"");
            return writer;
        }
        int length = str.length();
        writer.write(34);
        int i = 0;
        char c = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '\"') {
                if (charAt != '/') {
                    if (charAt != '\\') {
                        switch (charAt) {
                            case 8:
                                writer.write("\\b");
                                break;
                            case 9:
                                writer.write("\\t");
                                break;
                            case 10:
                                writer.write("\\n");
                                break;
                            default:
                                switch (charAt) {
                                    case 12:
                                        writer.write("\\f");
                                        break;
                                    case 13:
                                        writer.write("\\r");
                                        break;
                                    default:
                                        if (charAt >= ' ' && ((charAt < 128 || charAt >= 160) && (charAt < 8192 || charAt >= 8448))) {
                                            writer.write(charAt);
                                            break;
                                        } else {
                                            writer.write("\\u");
                                            String hexString = Integer.toHexString(charAt);
                                            writer.write("0000", 0, 4 - hexString.length());
                                            writer.write(hexString);
                                            break;
                                        }
                                }
                        }
                    }
                } else {
                    if (c == '<') {
                        writer.write(92);
                    }
                    writer.write(charAt);
                }
                i++;
                c = charAt;
            }
            writer.write(92);
            writer.write(charAt);
            i++;
            c = charAt;
        }
        writer.write(34);
        return writer;
    }

    /* renamed from: a */
    protected static void m36815a(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Double) {
            Double d = (Double) obj;
            if (d.isInfinite() || d.isNaN()) {
                throw new RuntimeException("JSON does not allow non-finite numbers.");
            }
        } else if (obj instanceof Float) {
            Float f = (Float) obj;
            if (f.isInfinite() || f.isNaN()) {
                throw new RuntimeException("JSON does not allow non-finite numbers.");
            }
        }
    }

    public String toString() {
        try {
            return mo22091a(2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo22091a(int i) {
        String obj;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            obj = mo22090a(stringWriter, i, 0).toString();
        }
        return obj;
    }

    /* renamed from: b */
    protected static Object m36816b(Object obj) {
        if (obj == null) {
            try {
                return f24842a;
            } catch (Exception unused) {
                return null;
            }
        } else {
            if (!(obj instanceof C7003b) && !(obj instanceof C7002a) && !f24842a.equals(obj) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Double)) {
                if (!(obj instanceof String)) {
                    if (obj instanceof Collection) {
                        return new C7002a(obj);
                    }
                    if (obj.getClass().isArray()) {
                        return new C7002a(obj);
                    }
                    if (obj instanceof Map) {
                        return new C7003b(obj);
                    }
                    Package packageR = obj.getClass().getPackage();
                    String name = packageR != null ? packageR.getName() : "";
                    if (!name.startsWith("java.") && !name.startsWith("javax.")) {
                        if (obj.getClass().getClassLoader() != null) {
                            return new C7003b(obj);
                        }
                    }
                    return obj.toString();
                }
            }
            return obj;
        }
    }

    /* renamed from: a */
    static final Writer m36810a(Writer writer, Object obj, int i, int i2) {
        if (obj == null || obj.equals(null)) {
            writer.write("null");
        } else if (obj instanceof C7003b) {
            ((C7003b) obj).mo22090a(writer, i, i2);
        } else if (obj instanceof C7002a) {
            ((C7002a) obj).mo22087a(writer, i, i2);
        } else if (obj instanceof Map) {
            new C7003b(obj).mo22090a(writer, i, i2);
        } else if (obj instanceof Collection) {
            new C7002a(obj).mo22087a(writer, i, i2);
        } else if (obj.getClass().isArray()) {
            new C7002a(obj).mo22087a(writer, i, i2);
        } else if (obj instanceof Number) {
            writer.write(m36812a((Number) obj));
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else {
            m36811a(obj.toString(), writer);
        }
        return writer;
    }

    /* renamed from: a */
    static final void m36814a(Writer writer, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            writer.write(32);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Writer mo22090a(Writer writer, int i, int i2) {
        try {
            int b = mo22093b();
            Iterator a = mo22092a();
            writer.write(123);
            boolean z = false;
            int i3 = i == -1 ? 0 : i;
            if (b == 1) {
                Object next = a.next();
                writer.write(m36813a(next.toString()));
                writer.write(58);
                if (i3 > 0) {
                    writer.write(32);
                }
                m36810a(writer, this.f24844c.get(next), i, i2);
            } else if (b != 0) {
                int i4 = i2 + i3;
                while (a.hasNext()) {
                    Object next2 = a.next();
                    if (z) {
                        writer.write(44);
                    }
                    if (i != -1) {
                        writer.write(10);
                    }
                    m36814a(writer, i4);
                    writer.write(m36813a(next2.toString()));
                    writer.write(58);
                    if (i3 > 0) {
                        writer.write(32);
                    }
                    m36810a(writer, this.f24844c.get(next2), i, i4);
                    z = true;
                }
                if (i != -1) {
                    writer.write(10);
                }
                m36814a(writer, i2);
            }
            writer.write(125);
            return writer;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
