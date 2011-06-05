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
public class DoNothingInterpreter implements Interpreter {
    public void LDC(int iid, int c) {
         
    }

    public void LDC(int iid, long c) {
         
    }

    public void LDC(int iid, float c) {
         
    }

    public void LDC(int iid, double c) {
         
    }

    public void LDC(int iid, String c) {
         
    }

    public void IINC(int iid, int var, int increment) {
         
    }

    public void MULTIANEWARRAY(int iid, String desc, int dims) {
         
    }

    public void LOOKUPSWITCH(int iid, int dflt, int[] keys, int[] labels) {
         
    }

    public void TABLESWITCH(int iid, int min, int max, int dflt, int[] labels) {
         
    }

    public void IFEQ(int iid, int label) {
         
    }

    public void IFNE(int iid, int label) {
         
    }

    public void IFLT(int iid, int label) {
         
    }

    public void IFGE(int iid, int label) {
         
    }

    public void IFGT(int iid, int label) {
         
    }

    public void IFLE(int iid, int label) {
         
    }

    public void IF_ICMPEQ(int iid, int label) {
         
    }

    public void IF_ICMPNE(int iid, int label) {
         
    }

    public void IF_ICMPLT(int iid, int label) {
         
    }

    public void IF_ICMPGE(int iid, int label) {
         
    }

    public void IF_ICMPGT(int iid, int label) {
         
    }

    public void IF_ICMPLE(int iid, int label) {
         
    }

    public void IF_ACMPEQ(int iid, int label) {
         
    }

    public void IF_ACMPNE(int iid, int label) {
         
    }

    public void GOTO(int iid, int label) {
         
    }

    public void JSR(int iid, int label) {
         
    }

    public void IFNULL(int iid, int label) {
         
    }

    public void IFNONNULL(int iid, int label) {
         
    }

    public void INVOKEVIRTUAL(int iid, String owner, String name, String desc) {
         
    }

    public void INVOKESPECIAL(int iid, String owner, String name, String desc) {
         
    }

    public void INVOKESTATIC(int iid, String owner, String name, String desc) {
         
    }

    public void INVOKEINTERFACE(int iid, String owner, String name, String desc) {
         
    }

    public void GETSTATIC(int iid, String owner, String name, String desc) {
         
    }

    public void PUTSTATIC(int iid, String owner, String name, String desc) {
         
    }

    public void GETFIELD(int iid, String owner, String name, String desc) {
         
    }

    public void PUTFIELD(int iid, String owner, String name, String desc) {
         
    }

    public void NEW(int iid, String type) {
         
    }

    public void ANEWARRAY(int iid, String type) {
         
    }

    public void CHECKCAST(int iid, String type) {
         
    }

    public void INSTANCEOF(int iid, String type) {
         
    }

    public void BIPUSH(int iid, int value) {
         
    }

    public void SIPUSH(int iid, int value) {
         
    }

    public void NEWARRAY_INT(int iid) {
         
    }

    public void NEWARRAY_BYTE(int iid) {
         
    }

    public void NEWARRAY_CHAR(int iid) {
         
    }

    public void NEWARRAY_LONG(int iid) {
         
    }

    public void NEWARRAY_BOOLEAN(int iid) {
         
    }

    public void NEWARRAY_DOUBLE(int iid) {
         
    }

    public void NEWARRAY_FLOAT(int iid) {
         
    }

    public void NEWARRAY_SHORT(int iid) {
         
    }

    public void ILOAD(int iid, int var) {
         
    }

    public void LLOAD(int iid, int var) {
         
    }

    public void FLOAD(int iid, int var) {
         
    }

    public void DLOAD(int iid, int var) {
         
    }

    public void ALOAD(int iid, int var) {
         
    }

    public void ISTORE(int iid, int var) {
         
    }

    public void LSTORE(int iid, int var) {
         
    }

    public void FSTORE(int iid, int var) {
         
    }

    public void DSTORE(int iid, int var) {
         
    }

    public void ASTORE(int iid, int var) {
         
    }

    public void RET(int iid, int var) {
         
    }

    public void NOP(int iid) {
         
    }

    public void ACONST_NULL(int iid) {
         
    }

    public void ICONST_M1(int iid) {
         
    }

    public void ICONST_0(int iid) {
         
    }

    public void ICONST_1(int iid) {
         
    }

    public void ICONST_2(int iid) {
         
    }

    public void ICONST_3(int iid) {
         
    }

    public void ICONST_4(int iid) {
         
    }

    public void ICONST_5(int iid) {
         
    }

    public void LCONST_0(int iid) {
         
    }

    public void LCONST_1(int iid) {
         
    }

    public void FCONST_0(int iid) {
         
    }

    public void FCONST_1(int iid) {
         
    }

    public void FCONST_2(int iid) {
         
    }

    public void DCONST_0(int iid) {
         
    }

    public void DCONST_1(int iid) {
         
    }

    public void IALOAD(int iid) {
         
    }

    public void LALOAD(int iid) {
         
    }

    public void FALOAD(int iid) {
         
    }

    public void DALOAD(int iid) {
         
    }

    public void AALOAD(int iid) {
         
    }

    public void BALOAD(int iid) {
         
    }

    public void CALOAD(int iid) {
         
    }

    public void SALOAD(int iid) {
         
    }

    public void IASTORE(int iid) {
         
    }

    public void LASTORE(int iid) {
         
    }

    public void FASTORE(int iid) {
         
    }

    public void DASTORE(int iid) {
         
    }

    public void AASTORE(int iid) {
         
    }

    public void BASTORE(int iid) {
         
    }

    public void CASTORE(int iid) {
         
    }

    public void SASTORE(int iid) {
         
    }

    public void POP(int iid) {
         
    }

    public void POP2(int iid) {
         
    }

    public void DUP(int iid) {
         
    }

    public void DUP_X1(int iid) {
         
    }

    public void DUP_X2(int iid) {
         
    }

    public void DUP2(int iid) {
         
    }

    public void DUP2_X1(int iid) {
         
    }

    public void DUP2_X2(int iid) {
         
    }

    public void SWAP(int iid) {
         
    }

    public void IADD(int iid) {
         
    }

    public void LADD(int iid) {
         
    }

    public void FADD(int iid) {
         
    }

    public void DADD(int iid) {
         
    }

    public void ISUB(int iid) {
         
    }

    public void LSUB(int iid) {
         
    }

    public void FSUB(int iid) {
         
    }

    public void DSUB(int iid) {
         
    }

    public void IMUL(int iid) {
         
    }

    public void LMUL(int iid) {
         
    }

    public void FMUL(int iid) {
         
    }

    public void DMUL(int iid) {
         
    }

    public void IDIV(int iid) {
         
    }

    public void LDIV(int iid) {
         
    }

    public void FDIV(int iid) {
         
    }

    public void DDIV(int iid) {
         
    }

    public void IREM(int iid) {
         
    }

    public void LREM(int iid) {
         
    }

    public void FREM(int iid) {
         
    }

    public void DREM(int iid) {
         
    }

    public void INEG(int iid) {
         
    }

    public void LNEG(int iid) {
         
    }

    public void FNEG(int iid) {
         
    }

    public void DNEG(int iid) {
         
    }

    public void ISHL(int iid) {
         
    }

    public void LSHL(int iid) {
         
    }

    public void ISHR(int iid) {
         
    }

    public void LSHR(int iid) {
         
    }

    public void IUSHR(int iid) {
         
    }

    public void LUSHR(int iid) {
         
    }

    public void IAND(int iid) {
         
    }

    public void LAND(int iid) {
         
    }

    public void IOR(int iid) {
         
    }

    public void LOR(int iid) {
         
    }

    public void IXOR(int iid) {
         
    }

    public void LXOR(int iid) {
         
    }

    public void I2L(int iid) {
         
    }

    public void I2F(int iid) {
         
    }

    public void I2D(int iid) {
         
    }

    public void L2I(int iid) {
         
    }

    public void L2F(int iid) {
         
    }

    public void L2D(int iid) {
         
    }

    public void F2I(int iid) {
         
    }

    public void F2L(int iid) {
         
    }

    public void F2D(int iid) {
         
    }

    public void D2I(int iid) {
         
    }

    public void D2L(int iid) {
         
    }

    public void D2F(int iid) {
         
    }

    public void I2B(int iid) {
         
    }

    public void I2C(int iid) {
         
    }

    public void I2S(int iid) {
         
    }

    public void LCMP(int iid) {
         
    }

    public void FCMPL(int iid) {
         
    }

    public void FCMPG(int iid) {
         
    }

    public void DCMPL(int iid) {
         
    }

    public void DCMPG(int iid) {
         
    }

    public void IRETURN(int iid) {
         
    }

    public void LRETURN(int iid) {
         
    }

    public void FRETURN(int iid) {
         
    }

    public void DRETURN(int iid) {
         
    }

    public void ARETURN(int iid) {
         
    }

    public void RETURN(int iid) {
         
    }

    public void ARRAYLENGTH(int iid) {
         
    }

    public void ATHROW(int iid) {
         
    }

    public void MONITORENTER(int iid) {
         
    }

    public void MONITOREXIT(int iid) {
         
    }
}
