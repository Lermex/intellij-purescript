package net.kenro.ji.jin.purescript.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import net.kenro.ji.jin.purescript.psi.PSProperName;
import net.kenro.ji.jin.purescript.psi.PSVisitor;
import org.jetbrains.annotations.NotNull;

public class PSProperNameImpl extends PSNamedElementImpl implements PSProperName {

    public PSProperNameImpl(ASTNode node){
        super(node);
//        System.out.print("IN THE PSPROPERNAME IMPL");
    }

    public void accept(@NotNull PSVisitor visitor) {
        visitor.visitPSProperName(this);
    }

    public void accept(@NotNull PsiElementVisitor visitor) {
        if (visitor instanceof PSVisitor) accept((PSVisitor)visitor);
        else super.accept(visitor);
    }

    public String getName() {
        return PSPsiImplUtil.getName(this);
    }

    public PsiElement getNameIdentifier() {
        return PSPsiImplUtil.getNameIdentifier(this);
    }

    @Override
    public PsiElement setName(@NotNull String name) {
        return null;
    }
}
