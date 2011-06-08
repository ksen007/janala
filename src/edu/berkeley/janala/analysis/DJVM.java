package edu.berkeley.janala.analysis;

/**
 * Copyright (c) 2006-2010,
 * Koushik Sen    <ksen@cs.berkeley.edu>
 * All rights reserved.
 * <p/>
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * <p/>
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * <p/>
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * <p/>
 * 3. The names of the contributors may not be used to endorse or promote
 * products derived from this software without specific prior written
 * permission.
 * <p/>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER
 * OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
public class DJVM {
    public static Interpreter intp = null;

    public static void LDC(int iid, int c) {
        intp.LDC(iid,c);
    }

    public static void LDC(int iid, long c) {
        intp.LDC(iid,c);
    }

    public static void LDC(int iid, float c) {
        intp.LDC(iid,c);
    }

    public static void LDC(int iid, double c) {
        intp.LDC(iid,c);
    }

    public static void LDC(int iid, String c) {
        intp.LDC(iid,c);
    }

    public static void IINC(int iid, int var, int increment) {
        intp.IINC(iid,var,increment);
    }

    public static void MULTIANEWARRAY(int iid, String desc, int dims) {
        intp.MULTIANEWARRAY(iid,desc,dims);
    }

    public static void LOOKUPSWITCH(int iid, int dflt, int[] keys, int[] labels) {
        intp.LOOKUPSWITCH(iid,dflt,keys,labels);
    }

    public static void TABLESWITCH(int iid, int min, int max, int dflt, int[] labels) {
        intp.TABLESWITCH(iid,min,max,dflt,labels);
    }

    public static void IFEQ(int iid, int label) {
        intp.IFEQ(iid,label);
    }

    public static void IFNE(int iid, int label) {
        intp.IFNE(iid,label);
    }

    public static void IFLT(int iid, int label) {
        intp.IFLT(iid,label);
    }

    public static void IFGE(int iid, int label) {
        intp.IFGE(iid,label);
    }

    public static void IFGT(int iid, int label) {
        intp.IFGT(iid,label);
    }

    public static void IFLE(int iid, int label) {
        intp.IFLE(iid,label);
    }

    public static void IF_ICMPEQ(int iid, int label) {
        intp.IF_ICMPEQ(iid,label);
    }

    public static void IF_ICMPNE(int iid, int label) {
        intp.IF_ICMPNE(iid,label);
    }

    public static void IF_ICMPLT(int iid, int label) {
        intp.IF_ICMPLT(iid,label);
    }

    public static void IF_ICMPGE(int iid, int label) {
        intp.IF_ICMPGE(iid,label);
    }

    public static void IF_ICMPGT(int iid, int label) {
        intp.IF_ICMPGT(iid,label);
    }

    public static void IF_ICMPLE(int iid, int label) {
        intp.IF_ICMPLE(iid,label);
    }

    public static void IF_ACMPEQ(int iid, int label) {
        intp.IF_ACMPEQ(iid,label);
    }

    public static void IF_ACMPNE(int iid, int label) {
        intp.IF_ACMPNE(iid,label);
    }

    public static void GOTO(int iid, int label) {
        intp.GOTO(iid,label);
    }

    public static void JSR(int iid, int label) {
        intp.JSR(iid,label);
    }

    public static void IFNULL(int iid, int label) {
        intp.IFNULL(iid,label);
    }

    public static void IFNONNULL(int iid, int label) {
        intp.IFNONNULL(iid,label);
    }

    public static void INVOKEVIRTUAL(int iid, String owner, String name, String desc) {
        intp.INVOKEVIRTUAL(iid,owner,name,desc);
    }

    public static void INVOKESPECIAL(int iid, String owner, String name, String desc) {
        intp.INVOKESPECIAL(iid,owner,name,desc);
    }

    public static void INVOKESTATIC(int iid, String owner, String name, String desc) {
        intp.INVOKESTATIC(iid,owner,name,desc);
    }

    public static void INVOKEINTERFACE(int iid, String owner, String name, String desc) {
        intp.INVOKEINTERFACE(iid,owner,name,desc);
    }

    public static void GETSTATIC(int iid, String owner, String name, String desc) {
        intp.GETSTATIC(iid,owner,name,desc);
    }

    public static void PUTSTATIC(int iid, String owner, String name, String desc) {
        intp.PUTSTATIC(iid,owner,name,desc);
    }

    public static void GETFIELD(int iid, String owner, String name, String desc) {
        intp.GETFIELD(iid,owner,name,desc);
    }

    public static void PUTFIELD(int iid, String owner, String name, String desc) {
        intp.PUTFIELD(iid,owner,name,desc);
    }

    public static void NEW(int iid, String type) {
        intp.NEW(iid,type);
    }

    public static void ANEWARRAY(int iid, String type) {
        intp.ANEWARRAY(iid,type);
    }

    public static void CHECKCAST(int iid, String type) {
        intp.CHECKCAST(iid,type);
    }

    public static void INSTANCEOF(int iid, String type) {
        intp.INSTANCEOF(iid,type);
    }

    public static void BIPUSH(int iid, int value) {
        intp.BIPUSH(iid,value);
    }

    public static void SIPUSH(int iid, int value) {
        intp.SIPUSH(iid,value);
    }

    public static void NEWARRAY_INT(int iid) {
        intp.NEWARRAY_INT(iid);
    }

    public static void NEWARRAY_BYTE(int iid) {
        intp.NEWARRAY_BYTE(iid);
    }

    public static void NEWARRAY_CHAR(int iid) {
        intp.NEWARRAY_CHAR(iid);
    }

    public static void NEWARRAY_LONG(int iid) {
        intp.NEWARRAY_LONG(iid);
    }

    public static void NEWARRAY_BOOLEAN(int iid) {
        intp.NEWARRAY_BOOLEAN(iid);
    }

    public static void NEWARRAY_DOUBLE(int iid) {
        intp.NEWARRAY_DOUBLE(iid);
    }

    public static void NEWARRAY_FLOAT(int iid) {
        intp.NEWARRAY_FLOAT(iid);
    }

    public static void NEWARRAY_SHORT(int iid) {
        intp.NEWARRAY_SHORT(iid);
    }

    public static void ILOAD(int iid, int var) {
        intp.ILOAD(iid,var);
    }

    public static void LLOAD(int iid, int var) {
        intp.LLOAD(iid,var);
    }

    public static void FLOAD(int iid, int var) {
        intp.FLOAD(iid,var);
    }

    public static void DLOAD(int iid, int var) {
        intp.DLOAD(iid,var);
    }

    public static void ALOAD(int iid, int var) {
        intp.ALOAD(iid,var);
    }

    public static void ISTORE(int iid, int var) {
        intp.ISTORE(iid,var);
    }

    public static void LSTORE(int iid, int var) {
        intp.LSTORE(iid,var);
    }

    public static void FSTORE(int iid, int var) {
        intp.FSTORE(iid,var);
    }

    public static void DSTORE(int iid, int var) {
        intp.DSTORE(iid,var);
    }

    public static void ASTORE(int iid, int var) {
        intp.ASTORE(iid,var);
    }

    public static void RET(int iid, int var) {
        intp.RET(iid,var);
    }

    public static void NOP(int iid) {
        intp.NOP(iid);
    }

    public static void ACONST_NULL(int iid) {
        intp.ACONST_NULL(iid);
    }

    public static void ICONST_M1(int iid) {
        intp.ICONST_M1(iid);
    }

    public static void ICONST_0(int iid) {
        intp.ICONST_0(iid);
    }

    public static void ICONST_1(int iid) {
        intp.ICONST_1(iid);
    }

    public static void ICONST_2(int iid) {
        intp.ICONST_2(iid);
    }

    public static void ICONST_3(int iid) {
        intp.ICONST_3(iid);
    }

    public static void ICONST_4(int iid) {
        intp.ICONST_4(iid);
    }

    public static void ICONST_5(int iid) {
        intp.ICONST_5(iid);
    }

    public static void LCONST_0(int iid) {
        intp.LCONST_0(iid);
    }

    public static void LCONST_1(int iid) {
        intp.LCONST_1(iid);
    }

    public static void FCONST_0(int iid) {
        intp.FCONST_0(iid);
    }

    public static void FCONST_1(int iid) {
        intp.FCONST_1(iid);
    }

    public static void FCONST_2(int iid) {
        intp.FCONST_2(iid);
    }

    public static void DCONST_0(int iid) {
        intp.DCONST_0(iid);
    }

    public static void DCONST_1(int iid) {
        intp.DCONST_1(iid);
    }

    public static void IALOAD(int iid) {
        intp.IALOAD(iid);
    }

    public static void LALOAD(int iid) {
        intp.LALOAD(iid);
    }

    public static void FALOAD(int iid) {
        intp.FALOAD(iid);
    }

    public static void DALOAD(int iid) {
        intp.DALOAD(iid);
    }

    public static void AALOAD(int iid) {
        intp.AALOAD(iid);
    }

    public static void BALOAD(int iid) {
        intp.BALOAD(iid);
    }

    public static void CALOAD(int iid) {
        intp.CALOAD(iid);
    }

    public static void SALOAD(int iid) {
        intp.SALOAD(iid);
    }

    public static void IASTORE(int iid) {
        intp.IASTORE(iid);
    }

    public static void LASTORE(int iid) {
        intp.LASTORE(iid);
    }

    public static void FASTORE(int iid) {
        intp.FASTORE(iid);
    }

    public static void DASTORE(int iid) {
        intp.DASTORE(iid);
    }

    public static void AASTORE(int iid) {
        intp.AASTORE(iid);
    }

    public static void BASTORE(int iid) {
        intp.BASTORE(iid);
    }

    public static void CASTORE(int iid) {
        intp.CASTORE(iid);
    }

    public static void SASTORE(int iid) {
        intp.SASTORE(iid);
    }

    public static void POP(int iid) {
        intp.POP(iid);
    }

    public static void POP2(int iid) {
        intp.POP2(iid);
    }

    public static void DUP(int iid) {
        intp.DUP(iid);
    }

    public static void DUP_X1(int iid) {
        intp.DUP_X1(iid);
    }

    public static void DUP_X2(int iid) {
        intp.DUP_X2(iid);
    }

    public static void DUP2(int iid) {
        intp.DUP2(iid);
    }

    public static void DUP2_X1(int iid) {
        intp.DUP2_X1(iid);
    }

    public static void DUP2_X2(int iid) {
        intp.DUP2_X2(iid);
    }

    public static void SWAP(int iid) {
        intp.SWAP(iid);
    }

    public static void IADD(int iid) {
        intp.IADD(iid);
    }

    public static void LADD(int iid) {
        intp.LADD(iid);
    }

    public static void FADD(int iid) {
        intp.FADD(iid);
    }

    public static void DADD(int iid) {
        intp.DADD(iid);
    }

    public static void ISUB(int iid) {
        intp.ISUB(iid);
    }

    public static void LSUB(int iid) {
        intp.LSUB(iid);
    }

    public static void FSUB(int iid) {
        intp.FSUB(iid);
    }

    public static void DSUB(int iid) {
        intp.DSUB(iid);
    }

    public static void IMUL(int iid) {
        intp.IMUL(iid);
    }

    public static void LMUL(int iid) {
        intp.LMUL(iid);
    }

    public static void FMUL(int iid) {
        intp.FMUL(iid);
    }

    public static void DMUL(int iid) {
        intp.DMUL(iid);
    }

    public static void IDIV(int iid) {
        intp.IDIV(iid);
    }

    public static void LDIV(int iid) {
        intp.LDIV(iid);
    }

    public static void FDIV(int iid) {
        intp.FDIV(iid);
    }

    public static void DDIV(int iid) {
        intp.DDIV(iid);
    }

    public static void IREM(int iid) {
        intp.IREM(iid);
    }

    public static void LREM(int iid) {
        intp.LREM(iid);
    }

    public static void FREM(int iid) {
        intp.FREM(iid);
    }

    public static void DREM(int iid) {
        intp.DREM(iid);
    }

    public static void INEG(int iid) {
        intp.INEG(iid);
    }

    public static void LNEG(int iid) {
        intp.LNEG(iid);
    }

    public static void FNEG(int iid) {
        intp.FNEG(iid);
    }

    public static void DNEG(int iid) {
        intp.DNEG(iid);
    }

    public static void ISHL(int iid) {
        intp.ISHL(iid);
    }

    public static void LSHL(int iid) {
        intp.LSHL(iid);
    }

    public static void ISHR(int iid) {
        intp.ISHR(iid);
    }

    public static void LSHR(int iid) {
        intp.LSHR(iid);
    }

    public static void IUSHR(int iid) {
        intp.IUSHR(iid);
    }

    public static void LUSHR(int iid) {
        intp.LUSHR(iid);
    }

    public static void IAND(int iid) {
        intp.IAND(iid);
    }

    public static void LAND(int iid) {
        intp.LAND(iid);
    }

    public static void IOR(int iid) {
        intp.IOR(iid);
    }

    public static void LOR(int iid) {
        intp.LOR(iid);
    }

    public static void IXOR(int iid) {
        intp.IXOR(iid);
    }

    public static void LXOR(int iid) {
        intp.LXOR(iid);
    }

    public static void I2L(int iid) {
        intp.I2L(iid);
    }

    public static void I2F(int iid) {
        intp.I2F(iid);
    }

    public static void I2D(int iid) {
        intp.I2D(iid);
    }

    public static void L2I(int iid) {
        intp.L2I(iid);
    }

    public static void L2F(int iid) {
        intp.L2F(iid);
    }

    public static void L2D(int iid) {
        intp.L2D(iid);
    }

    public static void F2I(int iid) {
        intp.F2I(iid);
    }

    public static void F2L(int iid) {
        intp.F2L(iid);
    }

    public static void F2D(int iid) {
        intp.F2D(iid);
    }

    public static void D2I(int iid) {
        intp.D2I(iid);
    }

    public static void D2L(int iid) {
        intp.D2L(iid);
    }

    public static void D2F(int iid) {
        intp.D2F(iid);
    }

    public static void I2B(int iid) {
        intp.I2B(iid);
    }

    public static void I2C(int iid) {
        intp.I2C(iid);
    }

    public static void I2S(int iid) {
        intp.I2S(iid);
    }

    public static void LCMP(int iid) {
        intp.LCMP(iid);
    }

    public static void FCMPL(int iid) {
        intp.FCMPL(iid);
    }

    public static void FCMPG(int iid) {
        intp.FCMPG(iid);
    }

    public static void DCMPL(int iid) {
        intp.DCMPL(iid);
    }

    public static void DCMPG(int iid) {
        intp.DCMPG(iid);
    }

    public static void IRETURN(int iid) {
        intp.IRETURN(iid);
    }

    public static void LRETURN(int iid) {
        intp.LRETURN(iid);
    }

    public static void FRETURN(int iid) {
        intp.FRETURN(iid);
    }

    public static void DRETURN(int iid) {
        intp.DRETURN(iid);
    }

    public static void ARETURN(int iid) {
        intp.ARETURN(iid);
    }

    public static void RETURN(int iid) {
        intp.RETURN(iid);
    }

    public static void ARRAYLENGTH(int iid) {
        intp.ARRAYLENGTH(iid);
    }

    public static void ATHROW(int iid) {
        intp.ATHROW(iid);
    }

    public static void MONITORENTER(int iid) {
        intp.MONITORENTER(iid);
    }

    public static void MONITOREXIT(int iid) {
        intp.MONITOREXIT(iid);
    }




    public static void GETFIELDORSTATIC_VALUE(int iid, double  v) {
        intp.GETFIELDORSTATIC_VALUE(iid,v);
    }
    public static void GETFIELDORSTATIC_VALUE(int iid, long v) {
        intp.GETFIELDORSTATIC_VALUE(iid,v);
    }
    public static void GETFIELDORSTATIC_VALUE(int iid, Object v) {
        intp.GETFIELDORSTATIC_VALUE(iid,v);
    }
    public static void GETFIELDORSTATIC_VALUE(int iid, boolean v) {
        intp.GETFIELDORSTATIC_VALUE(iid,v);
    }
    public static void GETFIELDORSTATIC_VALUE(int iid, byte v) {
        intp.GETFIELDORSTATIC_VALUE(iid,v);
    }
    public static void GETFIELDORSTATIC_VALUE(int iid, char v) {
        intp.GETFIELDORSTATIC_VALUE(iid,v);
    }
    public static void GETFIELDORSTATIC_VALUE(int iid, float v) {
        intp.GETFIELDORSTATIC_VALUE(iid,v);
    }
    public static void GETFIELDORSTATIC_VALUE(int iid, int v) {
        intp.GETFIELDORSTATIC_VALUE(iid,v);
    }
    public static void GETFIELDORSTATIC_VALUE(int iid, short v) {
        intp.GETFIELDORSTATIC_VALUE(iid,v);
    }

    public static void INVOKEMETHOD_VALUE(int iid, double  v) {
        intp.INVOKEMETHOD_VALUE(iid,v);
    }
    public static void INVOKEMETHOD_VALUE(int iid, long v) {
        intp.INVOKEMETHOD_VALUE(iid,v);
    }
    public static void INVOKEMETHOD_VALUE(int iid, Object v) {
        intp.INVOKEMETHOD_VALUE(iid,v);
    }
    public static void INVOKEMETHOD_VALUE(int iid, boolean v) {
        intp.INVOKEMETHOD_VALUE(iid,v);
    }
    public static void INVOKEMETHOD_VALUE(int iid, byte v) {
        intp.INVOKEMETHOD_VALUE(iid,v);
    }
    public static void INVOKEMETHOD_VALUE(int iid, char v) {
        intp.INVOKEMETHOD_VALUE(iid,v);
    }
    public static void INVOKEMETHOD_VALUE(int iid, float v) {
        intp.INVOKEMETHOD_VALUE(iid,v);
    }
    public static void INVOKEMETHOD_VALUE(int iid, int v) {
        intp.INVOKEMETHOD_VALUE(iid,v);
    }
    public static void INVOKEMETHOD_VALUE(int iid, short v) {
        intp.INVOKEMETHOD_VALUE(iid,v);
    }

    public static void INVOKEMETHOD_VALUE(int iid) {
        intp.INVOKEMETHOD_VALUE(iid);
    }
    public static void INVOKEMETHOD_EXCEPTION(int iid) {
        intp.INVOKEMETHOD_EXCEPTION(iid);
    }
}
