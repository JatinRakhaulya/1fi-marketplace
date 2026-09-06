package z2;

import l2.b0;
import v2.g;
/* compiled from: r8-map-id-c0d3c884047de8118f2064d4e1d8504d38edaacc94d44b538abe1fcf1e74421f */
/* loaded from: classes.dex */
public class a implements Iterable, w2.a {

    /* renamed from: h  reason: collision with root package name */
    public static final C0096a f5628h = new C0096a(null);

    /* renamed from: e  reason: collision with root package name */
    private final int f5629e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5630f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5631g;

    /* compiled from: r8-map-id-c0d3c884047de8118f2064d4e1d8504d38edaacc94d44b538abe1fcf1e74421f */
    /* renamed from: z2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0096a {
        public /* synthetic */ C0096a(g gVar) {
            this();
        }

        public final a a(int i4, int i5, int i6) {
            return new a(i4, i5, i6);
        }

        private C0096a() {
        }
    }

    public a(int i4, int i5, int i6) {
        if (i6 != 0) {
            if (i6 != Integer.MIN_VALUE) {
                this.f5629e = i4;
                this.f5630f = p2.c.b(i4, i5, i6);
                this.f5631g = i6;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final int a() {
        return this.f5629e;
    }

    public final int b() {
        return this.f5630f;
    }

    public final int c() {
        return this.f5631g;
    }

    @Override // java.lang.Iterable
    /* renamed from: d */
    public b0 iterator() {
        return new b(this.f5629e, this.f5630f, this.f5631g);
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f5629e == aVar.f5629e && this.f5630f == aVar.f5630f && this.f5631g == aVar.f5631g) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5629e * 31) + this.f5630f) * 31) + this.f5631g;
    }

    public boolean isEmpty() {
        if (this.f5631g > 0) {
            if (this.f5629e <= this.f5630f) {
                return false;
            }
            return true;
        } else if (this.f5629e >= this.f5630f) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.f5631g > 0) {
            sb = new StringBuilder();
            sb.append(this.f5629e);
            sb.append("..");
            sb.append(this.f5630f);
            sb.append(" step ");
            i4 = this.f5631g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f5629e);
            sb.append(" downTo ");
            sb.append(this.f5630f);
            sb.append(" step ");
            i4 = -this.f5631g;
        }
        sb.append(i4);
        return sb.toString();
    }
}
