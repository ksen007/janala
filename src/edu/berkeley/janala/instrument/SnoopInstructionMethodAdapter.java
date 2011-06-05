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
        switch (opcode) {
            case NOP:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NOP", "(I)V");
                break;
            case ACONST_NULL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ACONST_NULL",
                        "(I)V");
                break;
            case ICONST_M1:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ICONST_M1",
                        "(I)V");
                break;
            case ICONST_0:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ICONST_0",
                        "(I)V");
                break;
            case ICONST_1:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ICONST_1",
                        "(I)V");
                break;
            case ICONST_2:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ICONST_2",
                        "(I)V");
                break;
            case ICONST_3:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ICONST_3",
                        "(I)V");
                break;
            case ICONST_4:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ICONST_4",
                        "(I)V");
                break;
            case ICONST_5:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ICONST_5",
                        "(I)V");
                break;
            case LCONST_0:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LCONST_0",
                        "(I)V");
                break;
            case LCONST_1:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LCONST_1",
                        "(I)V");
                break;
            case FCONST_0:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FCONST_0",
                        "(I)V");
                break;
            case FCONST_1:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FCONST_1",
                        "(I)V");
                break;
            case FCONST_2:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FCONST_2",
                        "(I)V");
                break;
            case DCONST_0:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DCONST_0",
                        "(I)V");
                break;
            case DCONST_1:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DCONST_1",
                        "(I)V");
                break;
            case IALOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IALOAD",
                        "(I)V");
                break;
            case LALOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LALOAD",
                        "(I)V");
                break;
            case FALOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FALOAD",
                        "(I)V");
                break;
            case DALOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DALOAD",
                        "(I)V");
                break;
            case AALOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "AALOAD",
                        "(I)V");
                break;
            case BALOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "BALOAD",
                        "(I)V");
                break;
            case CALOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "CALOAD",
                        "(I)V");
                break;
            case SALOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "SALOAD",
                        "(I)V");
                break;
            case IASTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IASTORE",
                        "(I)V");
                break;
            case LASTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LASTORE",
                        "(I)V");
                break;
            case FASTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FASTORE",
                        "(I)V");
                break;
            case DASTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DASTORE",
                        "(I)V");
                break;
            case AASTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "AASTORE",
                        "(I)V");
                break;
            case BASTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "BASTORE",
                        "(I)V");
                break;
            case CASTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "CASTORE",
                        "(I)V");
                break;
            case SASTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "SASTORE",
                        "(I)V");
                break;
            case POP:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "POP", "(I)V");
                break;
            case POP2:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "POP2",
                        "(I)V");
                break;
            case DUP:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DUP", "(I)V");
                break;
            case DUP_X1:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DUP_X1",
                        "(I)V");
                break;
            case DUP_X2:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DUP_X2",
                        "(I)V");
                break;
            case DUP2:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DUP2",
                        "(I)V");
                break;
            case DUP2_X1:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DUP2_X1",
                        "(I)V");
                break;
            case DUP2_X2:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DUP2_X2",
                        "(I)V");
                break;
            case SWAP:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "SWAP",
                        "(I)V");
                break;
            case IADD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IADD",
                        "(I)V");
                break;
            case LADD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LADD",
                        "(I)V");
                break;
            case FADD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FADD",
                        "(I)V");
                break;
            case DADD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DADD",
                        "(I)V");
                break;
            case ISUB:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ISUB",
                        "(I)V");
                break;
            case LSUB:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LSUB",
                        "(I)V");
                break;
            case FSUB:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FSUB",
                        "(I)V");
                break;
            case DSUB:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DSUB",
                        "(I)V");
                break;
            case IMUL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IMUL",
                        "(I)V");
                break;
            case LMUL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LMUL",
                        "(I)V");
                break;
            case FMUL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FMUL",
                        "(I)V");
                break;
            case DMUL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DMUL",
                        "(I)V");
                break;
            case IDIV:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IDIV",
                        "(I)V");
                break;
            case LDIV:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LDIV",
                        "(I)V");
                break;
            case FDIV:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FDIV",
                        "(I)V");
                break;
            case DDIV:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DDIV",
                        "(I)V");
                break;
            case IREM:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IREM",
                        "(I)V");
                break;
            case LREM:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LREM",
                        "(I)V");
                break;
            case FREM:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FREM",
                        "(I)V");
                break;
            case DREM:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DREM",
                        "(I)V");
                break;
            case INEG:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "INEG",
                        "(I)V");
                break;
            case LNEG:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LNEG",
                        "(I)V");
                break;
            case FNEG:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FNEG",
                        "(I)V");
                break;
            case DNEG:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DNEG",
                        "(I)V");
                break;
            case ISHL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ISHL",
                        "(I)V");
                break;
            case LSHL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LSHL",
                        "(I)V");
                break;
            case ISHR:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ISHR",
                        "(I)V");
                break;
            case LSHR:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LSHR",
                        "(I)V");
                break;
            case IUSHR:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IUSHR",
                        "(I)V");
                break;
            case LUSHR:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LUSHR",
                        "(I)V");
                break;
            case IAND:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IAND",
                        "(I)V");
                break;
            case LAND:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LAND",
                        "(I)V");
                break;
            case IOR:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IOR", "(I)V");
                break;
            case LOR:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LOR", "(I)V");
                break;
            case IXOR:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IXOR",
                        "(I)V");
                break;
            case LXOR:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LXOR",
                        "(I)V");
                break;
            case I2L:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "I2L", "(I)V");
                break;
            case I2F:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "I2F", "(I)V");
                break;
            case I2D:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "I2D", "(I)V");
                break;
            case L2I:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "L2I", "(I)V");
                break;
            case L2F:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "L2F", "(I)V");
                break;
            case L2D:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "L2D", "(I)V");
                break;
            case F2I:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "F2I", "(I)V");
                break;
            case F2L:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "F2L", "(I)V");
                break;
            case F2D:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "F2D", "(I)V");
                break;
            case D2I:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "D2I", "(I)V");
                break;
            case D2L:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "D2L", "(I)V");
                break;
            case D2F:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "D2F", "(I)V");
                break;
            case I2B:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "I2B", "(I)V");
                break;
            case I2C:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "I2C", "(I)V");
                break;
            case I2S:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "I2S", "(I)V");
                break;
            case LCMP:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LCMP",
                        "(I)V");
                break;
            case FCMPL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FCMPL",
                        "(I)V");
                break;
            case FCMPG:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FCMPG",
                        "(I)V");
                break;
            case DCMPL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DCMPL",
                        "(I)V");
                break;
            case DCMPG:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DCMPG",
                        "(I)V");
                break;
            case IRETURN:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IRETURN",
                        "(I)V");
                break;
            case LRETURN:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LRETURN",
                        "(I)V");
                break;
            case FRETURN:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FRETURN",
                        "(I)V");
                break;
            case DRETURN:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DRETURN",
                        "(I)V");
                break;
            case ARETURN:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ARETURN",
                        "(I)V");
                break;
            case RETURN:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "RETURN",
                        "(I)V");
                break;
            case ARRAYLENGTH:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ARRAYLENGTH",
                        "(I)V");
                break;
            case ATHROW:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ATHROW",
                        "(I)V");
                break;
            case MONITORENTER:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "MONITORENTER",
                        "(I)V");
                break;
            case MONITOREXIT:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "MONITOREXIT",
                        "(I)V");
                break;
            default:
                System.err.println("Unknown instruction opcode "+opcode);
                System.exit(1);
        }
        mv.visitInsn(opcode);
    }

    @Override
    public void visitVarInsn(int opcode, int var) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, var);
        switch (opcode) {
            case ILOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ILOAD",
                        "(II)V");
                break;
            case LLOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LLOAD",
                        "(II)V");
                break;
            case FLOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FLOAD",
                        "(II)V");
                break;
            case DLOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DLOAD",
                        "(II)V");
                break;
            case ALOAD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ALOAD",
                        "(II)V");
                break;
            case ISTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ISTORE",
                        "(II)V");
                break;
            case LSTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LSTORE",
                        "(II)V");
                break;
            case FSTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "FSTORE",
                        "(II)V");
                break;
            case DSTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "DSTORE",
                        "(II)V");
                break;
            case ASTORE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ASTORE",
                        "(II)V");
                break;
            case RET:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "RET",
                        "(II)V");
                break;
            default:
                System.err.println("Unknown var instruction opcode "+opcode);
                System.exit(1);
        }
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "hookVarInsn", "(III)V");
        mv.visitVarInsn(opcode, var);
    }

    @Override
    public void visitIntInsn(int opcode, int operand) {
        addBipushInsn(mv, iid++);
        switch (opcode) {
            case BIPUSH:
                addBipushInsn(mv, operand);
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "BIPUSH", "(II)V");
                break;
            case SIPUSH:
                addBipushInsn(mv, operand);
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "SIPUSH", "(II)V");
                break;
            case NEWARRAY:
                switch (operand) {
                    case T_INT:
                        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NEWARRAY_INT", "(I)V");
                        break;
                    case T_BYTE:
                        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NEWARRAY_BYTE", "(I)V");
                        break;
                    case T_CHAR:
                        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NEWARRAY_CHAR", "(I)V");
                        break;
                    case T_LONG:
                        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NEWARRAY_LONG", "(I)V");
                        break;
                    case T_BOOLEAN:
                        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NEWARRAY_BOOLEAN", "(I)V");
                        break;
                    case T_DOUBLE:
                        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NEWARRAY_DOUBLE", "(I)V");
                        break;
                    case T_FLOAT:
                        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NEWARRAY_FLOAT", "(I)V");
                        break;
                    case T_SHORT:
                        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NEWARRAY_SHORT", "(I)V");
                        break;
                    default:
                        System.err.println("Unknown new array primitive type "+operand);
                        System.exit(1);

                }
                break;
            default:
                System.err.println("Unknown int instruction opcode "+opcode);
                System.exit(1);
        }
        mv.visitIntInsn(opcode, operand);
    }

    @Override
    public void visitTypeInsn(int opcode, String type) {
        addBipushInsn(mv, iid++);
        mv.visitLdcInsn(type);
        switch (opcode) {
            case NEW:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "NEW", "(ILjava/lang/String;)V");
                break;
            case ANEWARRAY:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "ANEWARRAY", "(ILjava/lang/String;)V");
                break;
            case CHECKCAST:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "CHECKCAST", "(ILjava/lang/String;)V");
                break;
            case INSTANCEOF:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "INSTANCEOF", "(ILjava/lang/String;)V");
                break;
            default:
                System.err.println("Unknown type instruction opcode "+opcode);
                System.exit(1);
        }
        mv.visitTypeInsn(opcode, type);
    }

    @Override
    public void visitFieldInsn(int opcode, String owner, String name, String desc) {
        addBipushInsn(mv, iid++);
        mv.visitLdcInsn(owner);
        mv.visitLdcInsn(name);
        mv.visitLdcInsn(desc);
        switch (opcode) {
            case GETSTATIC:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "GETSTATIC",
                        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
                break;
            case PUTSTATIC:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "PUTSTATIC",
                        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
                break;
            case GETFIELD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "GETFIELD",
                        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
                break;
            case PUTFIELD:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "PUTFIELD",
                        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
                break;
            default:
                System.err.println("Unknown field access opcode "+opcode);
                System.exit(1);
        }
        mv.visitFieldInsn(opcode, owner, name, desc);
    }

    @Override
    public void visitMethodInsn(int opcode, String owner, String name, String desc) {
        addBipushInsn(mv, iid++);
        mv.visitLdcInsn(owner);
        mv.visitLdcInsn(name);
        mv.visitLdcInsn(desc);
        switch (opcode) {
            case INVOKEVIRTUAL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "INVOKEVIRTUAL",
                        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
                break;
            case INVOKESPECIAL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "INVOKESPECIAL",
                        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
                break;
            case INVOKESTATIC:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "INVOKESTATIC",
                        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
                break;
            case INVOKEINTERFACE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "INVOKEINTERFACE",
                        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V");
                break;
            default:
                System.err.println("Unknown method invocation opcode "+opcode);
                System.exit(1);
        }
        mv.visitMethodInsn(opcode, owner, name, desc);
    }

    @Override
    public void visitJumpInsn(int opcode, Label label) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, label.getOffset());
        switch (opcode) {
            case IFEQ:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IFEQ", "(II)V");
                break;
            case IFNE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IFNE", "(II)V");
                break;
            case IFLT:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IFLT", "(II)V");
                break;
            case IFGE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IFGE", "(II)V");
                break;
            case IFGT:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IFGT", "(II)V");
                break;
            case IFLE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IFLE", "(II)V");
                break;
            case IF_ICMPEQ:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IF_ICMPEQ", "(II)V");
                break;
            case IF_ICMPNE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IF_ICMPNE", "(II)V");
                break;
            case IF_ICMPLT:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IF_ICMPLT", "(II)V");
                break;
            case IF_ICMPGE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IF_ICMPGE", "(II)V");
                break;
            case IF_ICMPGT:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IF_ICMPGT", "(II)V");
                break;
            case IF_ICMPLE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IF_ICMPLE", "(II)V");
                break;
            case IF_ACMPEQ:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IF_ACMPEQ", "(II)V");
                break;
            case IF_ACMPNE:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IF_ACMPNE", "(II)V");
                break;
            case GOTO:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "GOTO", "(II)V");
                break;
            case JSR:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "JSR", "(II)V");
                break;
            case IFNULL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IFNULL", "(II)V");
                break;
            case IFNONNULL:
                mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IFNONNULL", "(II)V");
                break;
            default:
                System.err.println("Unknown jump opcode "+opcode);
                System.exit(1);
        }

        mv.visitJumpInsn(opcode, label);
    }

    @Override
    public void visitLdcInsn(Object cst) {
        addBipushInsn(mv, iid++);
        mv.visitLdcInsn(cst);
        if (cst instanceof Integer) {
            mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LDC", "(II)V");
        } else if (cst instanceof Long) {
            mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LDC", "(IJ)V");
        } else if (cst instanceof Float) {
            mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LDC", "(IF)V");
        } else if (cst instanceof Double) {
            mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LDC", "(ID)V");
        } else if (cst instanceof String) {
            mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LDC", "(ILjava/lang/String;)V");
        } else {
            System.err.println("Cannot instrument LDC for constant "+cst);
            System.exit(1);
        }
        mv.visitLdcInsn(cst);
    }

    @Override
    public void visitIincInsn(int var, int increment) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, var);
        addBipushInsn(mv, increment);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "IINC", "(III)V");
        mv.visitIincInsn(var, increment);
    }

    @Override
    public void visitTableSwitchInsn(int min, int max, Label dflt, Label[] labels) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv, min);
        addBipushInsn(mv, max);
        addBipushInsn(mv,dflt.getOffset());

        addBipushInsn(mv,labels.length);
        mv.visitIntInsn(NEWARRAY, T_INT);
        for (int i=0; i<labels.length; i++) {
            mv.visitInsn(DUP);
            addBipushInsn(mv,i);
            addBipushInsn(mv,labels[i].getOffset());
            mv.visitInsn(IASTORE);
        }

        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "TABLESWITCH", "(IIII[I)V");
        mv.visitTableSwitchInsn(min, max, dflt, labels);
    }

    @Override
    public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
        addBipushInsn(mv, iid++);
        addBipushInsn(mv,dflt.getOffset());

        addBipushInsn(mv,keys.length);
        mv.visitIntInsn(NEWARRAY, T_INT);
        for (int i=0; i<keys.length; i++) {
            mv.visitInsn(DUP);
            addBipushInsn(mv,i);
            addBipushInsn(mv,keys[i]);
            mv.visitInsn(IASTORE);
        }

        addBipushInsn(mv,labels.length);
        mv.visitIntInsn(NEWARRAY, T_INT);
        for (int i=0; i<labels.length; i++) {
            mv.visitInsn(DUP);
            addBipushInsn(mv,i);
            addBipushInsn(mv,labels[i].getOffset());
            mv.visitInsn(IASTORE);
        }

        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "LOOKUPSWITCH", "(II[I[I)V");
        mv.visitLookupSwitchInsn(dflt, keys, labels);
    }

    @Override
    public void visitMultiANewArrayInsn(String desc, int dims) {
        addBipushInsn(mv, iid++);
        mv.visitLdcInsn(desc);
        addBipushInsn(mv, dims);
        mv.visitMethodInsn(INVOKESTATIC, Config.analysisClass, "MULTIANEWARRAY", "(ILjava/lang/String;I)V");
        mv.visitMultiANewArrayInsn(desc, dims);
    }


}
