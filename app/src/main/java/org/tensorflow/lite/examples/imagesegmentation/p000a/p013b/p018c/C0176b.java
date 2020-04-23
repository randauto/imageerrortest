package p000a.p013b.p018c;

import p000a.p013b.p020e.p029h.C0250a;

/* renamed from: a.b.c.b */
/* compiled from: Exceptions */
public final class C0176b {
    /* renamed from: a */
    public static RuntimeException m497a(Throwable th) {
        throw C0250a.m658a(th);
    }

    /* renamed from: b */
    public static void m498b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
