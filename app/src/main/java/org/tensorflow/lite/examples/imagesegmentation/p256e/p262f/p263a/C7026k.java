package p256e.p262f.p263a;

/* renamed from: e.f.a.k */
/* compiled from: Mesh */
class C7026k {

    /* renamed from: a */
    static final /* synthetic */ boolean f24974a = (!C7026k.class.desiredAssertionStatus());

    private C7026k() {
    }

    /* renamed from: a */
    static C7021f m36895a(C7021f fVar) {
        C7021f fVar2 = new C7021f(true);
        C7021f fVar3 = new C7021f(false);
        if (!fVar.f24926i) {
            fVar = fVar.f24919b;
        }
        C7021f fVar4 = fVar.f24919b.f24918a;
        fVar3.f24918a = fVar4;
        fVar4.f24919b.f24918a = fVar2;
        fVar2.f24918a = fVar;
        fVar.f24919b.f24918a = fVar3;
        fVar2.f24919b = fVar3;
        fVar2.f24920c = fVar2;
        fVar2.f24921d = fVar3;
        fVar2.f24922e = null;
        fVar2.f24923f = null;
        fVar2.f24925h = 0;
        fVar2.f24924g = null;
        fVar3.f24919b = fVar2;
        fVar3.f24920c = fVar3;
        fVar3.f24921d = fVar2;
        fVar3.f24922e = null;
        fVar3.f24923f = null;
        fVar3.f24925h = 0;
        fVar3.f24924g = null;
        return fVar2;
    }

    /* renamed from: a */
    static void m36900a(C7021f fVar, C7021f fVar2) {
        C7021f fVar3 = fVar.f24920c;
        C7021f fVar4 = fVar2.f24920c;
        fVar3.f24919b.f24921d = fVar2;
        fVar4.f24919b.f24921d = fVar;
        fVar.f24920c = fVar4;
        fVar2.f24920c = fVar3;
    }

    /* renamed from: a */
    static void m36901a(C7024i iVar, C7021f fVar, C7024i iVar2) {
        if (f24974a || iVar != null) {
            C7024i iVar3 = iVar2.f24966b;
            iVar.f24966b = iVar3;
            iVar3.f24965a = iVar;
            iVar.f24965a = iVar2;
            iVar2.f24966b = iVar;
            iVar.f24967c = fVar;
            iVar.f24968d = null;
            C7021f fVar2 = fVar;
            do {
                fVar2.f24922e = iVar;
                fVar2 = fVar2.f24920c;
            } while (fVar2 != fVar);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    static void m36899a(C7020e eVar, C7021f fVar, C7020e eVar2) {
        if (f24974a || eVar != null) {
            C7020e eVar3 = eVar2.f24912b;
            eVar.f24912b = eVar3;
            eVar3.f24911a = eVar;
            eVar.f24911a = eVar2;
            eVar2.f24912b = eVar;
            eVar.f24913c = fVar;
            eVar.f24914d = null;
            eVar.f24915e = null;
            eVar.f24916f = false;
            eVar.f24917g = eVar2.f24917g;
            C7021f fVar2 = fVar;
            do {
                fVar2.f24923f = eVar;
                fVar2 = fVar2.f24921d;
            } while (fVar2 != fVar);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    static void m36903b(C7021f fVar) {
        if (!fVar.f24926i) {
            fVar = fVar.f24919b;
        }
        C7021f fVar2 = fVar.f24918a;
        C7021f fVar3 = fVar.f24919b.f24918a;
        fVar2.f24919b.f24918a = fVar3;
        fVar3.f24919b.f24918a = fVar2;
    }

    /* renamed from: a */
    static void m36902a(C7024i iVar, C7024i iVar2) {
        C7021f fVar = iVar.f24967c;
        C7021f fVar2 = fVar;
        do {
            fVar2.f24922e = iVar2;
            fVar2 = fVar2.f24920c;
        } while (fVar2 != fVar);
        C7024i iVar3 = iVar.f24966b;
        C7024i iVar4 = iVar.f24965a;
        iVar4.f24966b = iVar3;
        iVar3.f24965a = iVar4;
    }

    /* renamed from: a */
    static void m36898a(C7020e eVar, C7020e eVar2) {
        C7021f fVar = eVar.f24913c;
        C7021f fVar2 = fVar;
        do {
            fVar2.f24923f = eVar2;
            fVar2 = fVar2.f24921d;
        } while (fVar2 != fVar);
        C7020e eVar3 = eVar.f24912b;
        C7020e eVar4 = eVar.f24911a;
        eVar4.f24912b = eVar3;
        eVar3.f24911a = eVar4;
    }

    /* renamed from: a */
    public static C7021f m36896a(C7022g gVar) {
        C7024i iVar = new C7024i();
        C7024i iVar2 = new C7024i();
        C7020e eVar = new C7020e();
        C7021f a = m36895a(gVar.f24929c);
        if (a == null) {
            return null;
        }
        m36901a(iVar, a, gVar.f24927a);
        m36901a(iVar2, a.f24919b, gVar.f24927a);
        m36899a(eVar, a, gVar.f24928b);
        return a;
    }

    /* renamed from: b */
    public static boolean m36905b(C7021f fVar, C7021f fVar2) {
        boolean z;
        if (fVar == fVar2) {
            return true;
        }
        boolean z2 = false;
        if (fVar2.f24922e != fVar.f24922e) {
            m36902a(fVar2.f24922e, fVar.f24922e);
            z = true;
        } else {
            z = false;
        }
        if (fVar2.f24923f != fVar.f24923f) {
            m36898a(fVar2.f24923f, fVar.f24923f);
            z2 = true;
        }
        m36900a(fVar2, fVar);
        if (!z) {
            m36901a(new C7024i(), fVar2, fVar.f24922e);
            fVar.f24922e.f24967c = fVar;
        }
        if (!z2) {
            m36899a(new C7020e(), fVar2, fVar.f24923f);
            fVar.f24923f.f24913c = fVar;
        }
        return true;
    }

    /* renamed from: c */
    static boolean m36908c(C7021f fVar) {
        boolean z;
        C7021f fVar2 = fVar.f24919b;
        if (fVar.f24923f != fVar.f24919b.f24923f) {
            m36898a(fVar.f24923f, fVar.f24919b.f24923f);
            z = true;
        } else {
            z = false;
        }
        if (fVar.f24920c == fVar) {
            m36902a(fVar.f24922e, (C7024i) null);
        } else {
            fVar.f24919b.f24923f.f24913c = fVar.f24919b.f24921d;
            fVar.f24922e.f24967c = fVar.f24920c;
            m36900a(fVar, fVar.f24919b.f24921d);
            if (!z) {
                m36899a(new C7020e(), fVar, fVar.f24923f);
            }
        }
        if (fVar2.f24920c == fVar2) {
            m36902a(fVar2.f24922e, (C7024i) null);
            m36898a(fVar2.f24923f, (C7020e) null);
        } else {
            fVar.f24923f.f24913c = fVar2.f24919b.f24921d;
            fVar2.f24922e.f24967c = fVar2.f24920c;
            m36900a(fVar2, fVar2.f24919b.f24921d);
        }
        m36903b(fVar);
        return true;
    }

    /* renamed from: d */
    static C7021f m36909d(C7021f fVar) {
        C7021f a = m36895a(fVar);
        C7021f fVar2 = a.f24919b;
        m36900a(a, fVar.f24921d);
        a.f24922e = fVar.f24919b.f24922e;
        m36901a(new C7024i(), fVar2, a.f24922e);
        C7020e eVar = fVar.f24923f;
        fVar2.f24923f = eVar;
        a.f24923f = eVar;
        return a;
    }

    /* renamed from: e */
    public static C7021f m36910e(C7021f fVar) {
        C7021f fVar2 = m36909d(fVar).f24919b;
        m36900a(fVar.f24919b, fVar.f24919b.f24919b.f24921d);
        m36900a(fVar.f24919b, fVar2);
        fVar.f24919b.f24922e = fVar2.f24922e;
        fVar2.f24919b.f24922e.f24967c = fVar2.f24919b;
        fVar2.f24919b.f24923f = fVar.f24919b.f24923f;
        fVar2.f24925h = fVar.f24925h;
        fVar2.f24919b.f24925h = fVar.f24919b.f24925h;
        return fVar2;
    }

    /* renamed from: c */
    static C7021f m36906c(C7021f fVar, C7021f fVar2) {
        boolean z;
        C7021f a = m36895a(fVar);
        C7021f fVar3 = a.f24919b;
        if (fVar2.f24923f != fVar.f24923f) {
            z = true;
            m36898a(fVar2.f24923f, fVar.f24923f);
        } else {
            z = false;
        }
        m36900a(a, fVar.f24921d);
        m36900a(fVar3, fVar2);
        a.f24922e = fVar.f24919b.f24922e;
        fVar3.f24922e = fVar2.f24922e;
        C7020e eVar = fVar.f24923f;
        fVar3.f24923f = eVar;
        a.f24923f = eVar;
        fVar.f24923f.f24913c = fVar3;
        if (!z) {
            m36899a(new C7020e(), a, fVar.f24923f);
        }
        return a;
    }

    /* renamed from: a */
    public static C7022g m36897a() {
        C7022g gVar = new C7022g();
        C7024i iVar = gVar.f24927a;
        C7020e eVar = gVar.f24928b;
        C7021f fVar = gVar.f24929c;
        C7021f fVar2 = gVar.f24930d;
        iVar.f24966b = iVar;
        iVar.f24965a = iVar;
        iVar.f24967c = null;
        iVar.f24968d = null;
        eVar.f24912b = eVar;
        eVar.f24911a = eVar;
        eVar.f24913c = null;
        eVar.f24914d = null;
        eVar.f24915e = null;
        eVar.f24916f = false;
        eVar.f24917g = false;
        fVar.f24918a = fVar;
        fVar.f24919b = fVar2;
        fVar.f24920c = null;
        fVar.f24921d = null;
        fVar.f24922e = null;
        fVar.f24923f = null;
        fVar.f24925h = 0;
        fVar.f24924g = null;
        fVar2.f24918a = fVar2;
        fVar2.f24919b = fVar;
        fVar2.f24920c = null;
        fVar2.f24921d = null;
        fVar2.f24922e = null;
        fVar2.f24923f = null;
        fVar2.f24925h = 0;
        fVar2.f24924g = null;
        return gVar;
    }

    /* renamed from: b */
    public static void m36904b(C7022g gVar) {
        for (C7020e eVar = gVar.f24928b.f24911a; eVar != gVar.f24928b; eVar = eVar.f24911a) {
        }
        for (C7024i iVar = gVar.f24927a.f24965a; iVar != gVar.f24927a; iVar = iVar.f24965a) {
        }
        for (C7021f fVar = gVar.f24929c.f24918a; fVar != gVar.f24929c; fVar = fVar.f24918a) {
        }
    }

    /* renamed from: c */
    public static void m36907c(C7022g gVar) {
        C7020e eVar = gVar.f24928b;
        C7024i iVar = gVar.f24927a;
        C7021f fVar = gVar.f24929c;
        C7020e eVar2 = eVar;
        while (true) {
            C7020e eVar3 = eVar2.f24911a;
            if (eVar3 != eVar) {
                if (f24974a || eVar3.f24912b == eVar2) {
                    C7021f fVar2 = eVar3.f24913c;
                    do {
                        if (!f24974a && fVar2.f24919b == fVar2) {
                            throw new AssertionError();
                        } else if (!f24974a && fVar2.f24919b.f24919b != fVar2) {
                            throw new AssertionError();
                        } else if (!f24974a && fVar2.f24921d.f24920c.f24919b != fVar2) {
                            throw new AssertionError();
                        } else if (!f24974a && fVar2.f24920c.f24919b.f24921d != fVar2) {
                            throw new AssertionError();
                        } else if (f24974a || fVar2.f24923f == eVar3) {
                            fVar2 = fVar2.f24921d;
                        } else {
                            throw new AssertionError();
                        }
                    } while (fVar2 != eVar3.f24913c);
                    eVar2 = eVar3;
                } else {
                    throw new AssertionError();
                }
            } else if (f24974a || (eVar3.f24912b == eVar2 && eVar3.f24913c == null && eVar3.f24914d == null)) {
                C7024i iVar2 = iVar;
                while (true) {
                    C7024i iVar3 = iVar2.f24965a;
                    if (iVar3 != iVar) {
                        if (f24974a || iVar3.f24966b == iVar2) {
                            C7021f fVar3 = iVar3.f24967c;
                            do {
                                if (!f24974a && fVar3.f24919b == fVar3) {
                                    throw new AssertionError();
                                } else if (!f24974a && fVar3.f24919b.f24919b != fVar3) {
                                    throw new AssertionError();
                                } else if (!f24974a && fVar3.f24921d.f24920c.f24919b != fVar3) {
                                    throw new AssertionError();
                                } else if (!f24974a && fVar3.f24920c.f24919b.f24921d != fVar3) {
                                    throw new AssertionError();
                                } else if (f24974a || fVar3.f24922e == iVar3) {
                                    fVar3 = fVar3.f24920c;
                                } else {
                                    throw new AssertionError();
                                }
                            } while (fVar3 != iVar3.f24967c);
                            iVar2 = iVar3;
                        } else {
                            throw new AssertionError();
                        }
                    } else if (f24974a || (iVar3.f24966b == iVar2 && iVar3.f24967c == null && iVar3.f24968d == null)) {
                        C7021f fVar4 = fVar;
                        while (true) {
                            C7021f fVar5 = fVar4.f24918a;
                            if (fVar5 != fVar) {
                                if (!f24974a && fVar5.f24919b.f24918a != fVar4.f24919b) {
                                    throw new AssertionError();
                                } else if (!f24974a && fVar5.f24919b == fVar5) {
                                    throw new AssertionError();
                                } else if (!f24974a && fVar5.f24919b.f24919b != fVar5) {
                                    throw new AssertionError();
                                } else if (!f24974a && fVar5.f24922e == null) {
                                    throw new AssertionError();
                                } else if (!f24974a && fVar5.f24919b.f24922e == null) {
                                    throw new AssertionError();
                                } else if (!f24974a && fVar5.f24921d.f24920c.f24919b != fVar5) {
                                    throw new AssertionError();
                                } else if (f24974a || fVar5.f24920c.f24919b.f24921d == fVar5) {
                                    fVar4 = fVar5;
                                } else {
                                    throw new AssertionError();
                                }
                            } else if (f24974a) {
                                return;
                            } else {
                                if (fVar5.f24919b.f24918a != fVar4.f24919b || fVar5.f24919b != gVar.f24930d || fVar5.f24919b.f24919b != fVar5 || fVar5.f24922e != null || fVar5.f24919b.f24922e != null || fVar5.f24923f != null || fVar5.f24919b.f24923f != null) {
                                    throw new AssertionError();
                                }
                                return;
                            }
                        }
                    } else {
                        throw new AssertionError();
                    }
                }
            } else {
                throw new AssertionError();
            }
        }
    }
}
