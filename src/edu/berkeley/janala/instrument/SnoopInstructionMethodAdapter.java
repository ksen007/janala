package edu.berkeley.janala.instrument;

import edu.berkeley.janala.config.Config;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodAdapter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

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
public class SnoopInstructionMethodAdapter extends MethodAdapter implements Opcodes{
    private int iid = 0;

    public SnoopInstructionMethodAdapter(MethodVisitor mv) {
        super(mv);
    }

    private void addBipushInsn(MethodVisitor mv, int val) {
        switch (val) {
            case 0:
                mv.visitInsn(ICONST_0);
                break;
            case 1:
                mv.visitInsn(ICONST_1);
                break;
            case 2:
                mv.visitInsn(ICONST_2);
                break;
            case 3:
                mv.visitInsn(ICONST_3);
                break;
            case 4:
                mv.visitInsn(ICONST_4);
                break;
            case 5:
                mv.visitInsn(ICONST_5);
                break;
            default:
                mv.visitIntInsn(BIPUSH,val);
        }

    }

    @Override
    public void visitInsn(int opcode) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, opcode);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookInsn", "(II)V");
        mv.visitInsn(opcode);
    }

    @Override
    public void visitVarInsn(int opcode, int var) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, opcode);
        addBipushInsn(mv, var);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookVarInsn", "(III)V");
        mv.visitVarInsn(opcode, var);
    }

    @Override
    public void visitIntInsn(int opcode, int operand) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, opcode);
        addBipushInsn(mv, operand);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookIntInsn", "(III)V");
        mv.visitIntInsn(opcode, operand);
    }

    @Override
    public void visitTypeInsn(int opcode, String type) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, opcode);
        mv.visitLdcInsn(type);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookTypeInsn", "(IILjava/lang/String;)V");
        mv.visitTypeInsn(opcode, type);
    }

    @Override
    public void visitFieldInsn(int opcode, String owner, String name, String desc) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, opcode);
        mv.visitLdcInsn(owner);
        mv.visitLdcInsn(name);
        mv.visitLdcInsn(desc);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookFieldInsn",
                "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        mv.visitFieldInsn(opcode, owner, name, desc);
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String desc) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, opcode);
        mv.visitLdcInsn(owner);
        mv.visitLdcInsn(name);
        mv.visitLdcInsn(desc);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookMethodInsn",
                "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
        mv.visitMethodInsn(opcode, owner, name, desc);
    }

    @Override
    public void visitJumpInsn(int opcode, Label label) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, opcode);
        addBipushInsn(mv, label.getOffset());
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookJumpInsn", "(III)V");
        mv.visitJumpInsn(opcode, label);
    }

    @Override
    public void visitLdcInsn(Object cst) {
        mv.visitLdcInsn(cst);
    }

    @Override
    public void visitIincInsn(int var, int increment) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, var);
        addBipushInsn(mv, increment);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookIincInsn", "(III)V");
        mv.visitIincInsn(var, increment);
    }

    @Override
    public void visitTableSwitchInsn(int min, int max, Label dflt, Label[] labels) {
        mv.visitTableSwitchInsn(min, max, dflt, labels);
    }

    @Override
    public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
        mv.visitLookupSwitchInsn(dflt, keys, labels);
    }

    @Override
    public void visitMultiANewArrayInsn(String desc, int dims) {
        addBipushInsn(mv, iid++);
        mv.visitLdcInsn(desc);
        addBipushInsn(mv, dims);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookMultiNewArrayInsn", "(ILjava/lang/String;I)V");
        mv.visitMultiANewArrayInsn(desc, dims);
    }


}
