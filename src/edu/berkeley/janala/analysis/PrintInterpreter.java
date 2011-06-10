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
public class PrintInterpreter implements Interpreter {

    public void LDC(int iid, int mid, int c) {

        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LDC(int iid, int mid, long c) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LDC(int iid, int mid, float c) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LDC(int iid, int mid, double c) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LDC(int iid, int mid, String c) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IINC(int iid, int mid, int var, int increment) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void MULTIANEWARRAY(int iid, int mid, String desc, int dims) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LOOKUPSWITCH(int iid, int mid, int dflt, int[] keys, int[] labels) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void TABLESWITCH(int iid, int mid, int min, int max, int dflt, int[] labels) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IFEQ(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IFNE(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IFLT(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IFGE(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IFGT(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IFLE(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IF_ICMPEQ(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IF_ICMPNE(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IF_ICMPLT(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IF_ICMPGE(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IF_ICMPGT(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IF_ICMPLE(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IF_ACMPEQ(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IF_ACMPNE(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GOTO(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void JSR(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IFNULL(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IFNONNULL(int iid, int mid, int label) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEVIRTUAL(int iid, int mid, String owner, String name, String desc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKESPECIAL(int iid, int mid, String owner, String name, String desc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKESTATIC(int iid, int mid, String owner, String name, String desc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEINTERFACE(int iid, int mid, String owner, String name, String desc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETSTATIC(int iid, int mid, String owner, String name, String desc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void PUTSTATIC(int iid, int mid, String owner, String name, String desc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELD(int iid, int mid, String owner, String name, String desc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void PUTFIELD(int iid, int mid, String owner, String name, String desc) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NEW(int iid, int mid, String type) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ANEWARRAY(int iid, int mid, String type) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void CHECKCAST(int iid, int mid, String type) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INSTANCEOF(int iid, int mid, String type) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void BIPUSH(int iid, int mid, int value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void SIPUSH(int iid, int mid, int value) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NEWARRAY_INT(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NEWARRAY_BYTE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NEWARRAY_CHAR(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NEWARRAY_LONG(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NEWARRAY_BOOLEAN(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NEWARRAY_DOUBLE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NEWARRAY_FLOAT(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NEWARRAY_SHORT(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ILOAD(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LLOAD(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FLOAD(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DLOAD(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ALOAD(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ISTORE(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LSTORE(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FSTORE(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DSTORE(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ASTORE(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void RET(int iid, int mid, int var) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void NOP(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ACONST_NULL(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ICONST_M1(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ICONST_0(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ICONST_1(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ICONST_2(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ICONST_3(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ICONST_4(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ICONST_5(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LCONST_0(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LCONST_1(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FCONST_0(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FCONST_1(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FCONST_2(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DCONST_0(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DCONST_1(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IALOAD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LALOAD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FALOAD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DALOAD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void AALOAD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void BALOAD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void CALOAD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void SALOAD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IASTORE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LASTORE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FASTORE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DASTORE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void AASTORE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void BASTORE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void CASTORE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void SASTORE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void POP(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void POP2(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DUP(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DUP_X1(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DUP_X2(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DUP2(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DUP2_X1(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DUP2_X2(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void SWAP(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IADD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LADD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FADD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DADD(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ISUB(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LSUB(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FSUB(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DSUB(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IMUL(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LMUL(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FMUL(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DMUL(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IDIV(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LDIV(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FDIV(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DDIV(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IREM(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LREM(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FREM(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DREM(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INEG(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LNEG(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FNEG(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DNEG(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ISHL(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LSHL(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ISHR(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LSHR(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IUSHR(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LUSHR(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IAND(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LAND(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IOR(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LOR(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IXOR(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LXOR(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void I2L(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void I2F(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void I2D(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void L2I(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void L2F(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void L2D(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void F2I(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void F2L(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void F2D(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void D2I(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void D2L(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void D2F(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void I2B(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void I2C(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void I2S(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LCMP(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FCMPL(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FCMPG(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DCMPL(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DCMPG(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void IRETURN(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void LRETURN(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void FRETURN(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void DRETURN(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ARETURN(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void RETURN(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ARRAYLENGTH(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void ATHROW(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void MONITORENTER(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void MONITOREXIT(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELDORSTATIC_VALUE(int iid, int mid, double v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELDORSTATIC_VALUE(int iid, int mid, long v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELDORSTATIC_VALUE(int iid, int mid, Object v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELDORSTATIC_VALUE(int iid, int mid, boolean v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELDORSTATIC_VALUE(int iid, int mid, byte v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELDORSTATIC_VALUE(int iid, int mid, char v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELDORSTATIC_VALUE(int iid, int mid, float v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELDORSTATIC_VALUE(int iid, int mid, int v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void GETFIELDORSTATIC_VALUE(int iid, int mid, short v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid, double v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid, long v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid, Object v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid, boolean v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid, byte v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid, char v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid, float v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid, int v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid, short v) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_VALUE(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void INVOKEMETHOD_EXCEPTION(int iid, int mid) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
